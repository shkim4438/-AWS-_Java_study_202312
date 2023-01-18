package j17_스태틱;


public class Student {
	
	private static final int CODE = 20230000;//final상수란의미
	private static int ai = 1; // auto_increment 자동증가
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = CODE + ai;
		ai++;
		this.name = name;
	}
	
	public static int getAutoIncrement() {
		System.out.println("현재 AI: " + ai);
//		System.out.println("학생이름: " + name); static이 아닌 변수가 static의 메소드에서 호출되니 될리가없음.
		return ai;//단 지역변수인 매개변수는 쓸수가 있다.
	}
	
	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
	
	
	
}
