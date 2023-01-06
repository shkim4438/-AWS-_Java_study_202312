package j02_변수;

public class Variable3 {
//상수
	public static void main(String[] args) {
		
		int age = 20;
		age = 30;
		System.out.println(age);
		
		//상수: 자료형 앞에 final이 붙는다. 
		//상수의 특징: 상수는 상수명을 무조건 대문자로 사용.
		final int AGE = 0;
		final int NOW_AGE = 0;//두개의 변수명을 쓸때 상수는 스네이크표기법으로!
		
		
		final int age1;
		age1 = 30; // 상수는 첫번째만 값을 초기화 해주고 그이후부턴 값이 초기화 되지 않음.
		//age1 = 59; 
		System.out.println(age1);
		
		
		
	}

}
