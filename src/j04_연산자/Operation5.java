package j04_연산자;

public class Operation5 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int result = num1 > num2 ? num1 * -1 : num2 * -1;
		
		System.out.println(result);
		
		int num = 79;
		
		int result2 = num / 90 == 1 ? 90 //줄바꿈은 항상 연산자 앞에서 줄바꿈을 한다.
				: num / 80 == 1 ? 80 
				: num / 70 == 1 ? 70: 0;//단, 삼항연산자의 경우  : 콜론 앞에서 끊어주면된다. 연산이 끝나지 않았을땐 두칸을 들여쓰기.
		
		System.out.println(result2);
		
	}
}
