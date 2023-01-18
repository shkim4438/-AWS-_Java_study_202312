package j14_추상;
// 추상 클래스 공통된 것들을 묶어 모아둔것을 추상이라하는데
public abstract class Transpotation {//abstract class는 구현 할 수 있는 설계도만 있지 틀이없다는 특징을 가지고있어 생성이 불가능하다는점을 유의할 필요가있다.
	
	
	//추상클래스는 중괄호없이 생성하며 실행할 명령문이 없다는 것을 말한다. 딱 설계까지만 만들어 놓은 형태이다.
	//설계가 어떤 자료형의 매개변수인지 return값은 어떤걸 쓸지만 만들어놓음. 이런코드를 추상 메소드라한다.
	public abstract void go(); 
	
	public abstract void stop();
	
	
}
