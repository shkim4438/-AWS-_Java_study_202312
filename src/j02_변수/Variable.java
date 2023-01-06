package j02_변수;

public class Variable {
//정수
	public static void main(String[] args) {
		int num = 10;// 선언과 초기화를 동시에 명시.
		int num1 = -10;
		int num2; // 4byte의 메모리 공간으 할당할 것이고 그 공간의 이름을 num2라고 하겠다! 선언
		num2 = 10; // num2 변수명을 가지 메모리 공간의 데이터를 비우고 값을 대입하겠다! 초기화 
		
		System.out.println(num);
		System.out.println(num1 + 1);
		System.out.println(num2);

	}

}
