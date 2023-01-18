package j18_제네릭;

public class Main {
	public static void main(String[] args) //{<?, ?>로 선언 하고 생성할때 자료형을 넣지 않아도 된다.
		TestData<String, Integer> td = new TestData<String, Integer>("김준일", 30);
		TestData<String, Double> td2 = new TestData<String, Double>("junil", 110.03);// 자료형을 바꿔야 할때 동적으로 해주는것이 제네릭
		//생성을할때 그 즉시 자료형을 바꿔서 생성. 원하는 자료형을 자유롭게 사용가능
		System.out.println(td);
		System.out.println(td2);
		
		CMRespDto<TestData<String, Integer>> cm =
				new CMRespDto<TestData<String, Integer>>(200, "성공", td);
		
		// ?로 어떤 자료형을 쓸수 있는 지 다양하게 선언하는 방식.
//		TestData<?, ?> td = new TestData<>("김준일", 30);
//		CMRespDto<TestData<?, ?>> cm =
//				new CMRespDto<TestData<>>(200, "성공", td);
		
		System.out.println(cm);
	}
	
	
}
