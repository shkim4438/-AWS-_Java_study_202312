package J12_배열;

public class Array1 {

	public static void main(String[] args) {
//	배열이 없이 작성된 코드.		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
//	배열로 작성된 코드
		int[] nums = new int[5]; // new 생성은 동적 메모리 할당. index 메모리에 할당된 데이터 공간의 순서.
		nums[0] = 10;			// nums는 배열에 할당된 메모리를 전부 대입되었다고 볼 수 있다.
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(nums[i]);
			
			//[] 배열자료형으로 int들을 묶는 4byte짜리 메모리 공간이다.
		}
		
		
		
		
	}

}
