package J12_배열.di;

public class Test_A {
	
	private final Test_B tb;//값을 무조건 하나 대입해줘야하는 상수.
	
	public Test_A(Test_B tb) {//생성자의 매개변수를 통해서 호출.
		this.tb = tb;//final 리콰아이 아규먼트컨서트로 반듯이 써줘야함.
	}

//	public void setTb(Test_B tb) {
//		this.tb = tb;//final 상수를 의미 변치않는 값으로 setter를 통해 값을 변화시킬 수 없음.
//	}
	
	public void testA1() {
		System.out.println("테스트A1 메소드 호출!!" );
//		Test_B tb = new Test_B();
		
		tb.testB1();
	}
	
	public void testA2 () {
		System.out.println("테스트A2 메소드 호출!!");
//		Test_B tb = new Test_B();
		
		tb.testB1();
		
	}
	
	
}
