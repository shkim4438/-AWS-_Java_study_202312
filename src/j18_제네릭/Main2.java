package j18_제네릭;

public class Main2 {
	
	public CMRespDto<?> reponse(CMRespDto<?> cmRespDto){
		System.out.println("[응답데이터]");
		System.out.println(cmRespDto);
		return cmRespDto;
	}
	
	public static void main(String[] args) {
		Main2 main = new Main2();
// CMRespDto를 메인에 생성을 했는데 호출되지 않은 이유는 CMRespDto가 스태틱이 아닌 메소드라서 반드시 메인에
// 생성을 해줘야만이 호출이되기에 Main2를 생성해준것이다.
	
		CMRespDto<String> hello 
			= new CMRespDto<String>(200, "성공", "안녕하세요");
		
		CMRespDto<Integer> score 
			= new CMRespDto<Integer>(200, "성공", 85);
		
//		CMRespDto<?> data = null;
//		data = main.reponse(hello);
//		data = main.reponse(score);
		//CMRespDto메소드의 제네릭의 자료형이 한개로만 (여기선String) 잡혀 있어 생성되지 않는것.
//		System.out.println(data);
		//안녕하세요. 출력
		
		//이렇게 ?를 활용해 어떤한 형태로 쓸 수 있는 것이 와이드카드라 한다. 아니면 최상위 클래스인 Object
		//가 오도 쓸수있다. 와이드카들를 쓰는 이유는 "? extands person" 과 같은 문법을 쓰기위해서임.
		//이 뜻은 와이드카드로 자료형을 유연하게 쓸 수 있는데 단 person의 클래스만! 할 수있다. 이는 하위객체
		//로만 생성을 한다. 단, extands를 super Student의 객체만 호출이 가능해지게 된다. 즉 상위만로만 받겠다
		//는 제약을 걸어 주는 것이다. 이런것이 와이드카드의 제약이다.
		System.out.println("hello");
		System.out.println(main.reponse(hello));
		System.out.println("score");
		System.out.println(main.reponse(score));
	}
}
