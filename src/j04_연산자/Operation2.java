package j04_연산자;

public class Operation2 {
	public static void main(String[] args) {
		int num = 10;
		
		num = num + 1; // 대입의 개념 : num은 10인데 num + 1은 11이다 고로 =은 '같다'의 의미가 아니다.
		
		//후증가
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num);
	}
}
