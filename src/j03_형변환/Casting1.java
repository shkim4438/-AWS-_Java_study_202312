package j03_형변환;

public class Casting1 {

	public static void main(String[] args) {
		char a = 'a'; //문자
		int num1 = a; //정수 문자를 정수로 변환 자료형이 char에서 int로 바뀐것으로 num1은 숫자 아스키코드가 뜸. (자동으로 형변환됨)
		
		System.out.println(num1);
		
		// 실질적으로 형변환을 하는 방법.
		System.out.println((int) a);
		System.out.println((double) a);
		System.out.println((char) 97);
		
		System.out.println((byte) 300);// byte는 256가지 양수론 -257까지 쓸 수있고 

	}

}
