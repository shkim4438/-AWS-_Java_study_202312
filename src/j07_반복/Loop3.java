package j07_반복;

import java.util.Scanner;

public class Loop3 {
// 매번 반복때마다 새로운 a와 b를 받아 출력을받고 다 출력을 받은후에 모든 값을 더하라.
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int total = 0;
		
		System.out.print("반복횟수: ");
		count = scanner.nextInt();
		
		
		
		
		for(int i = 0; i < count; i++) {
			int a = 0;
			int b = 0;
			
			System.out.println();
			System.out.println((i+1) + "번 반복");
			System.out.print("a: ");
			a = scanner.nextInt();
			System.out.print("b: ");
			b = scanner.nextInt();
			System.out.print((i+1) + "번 합: " + (a + b));
			
			total += a + b;
			System.out.println(i + 1 + "번 합: " + (a + b) + "\n");
			System.out.println();
		}
		
		System.out.println("총합: " + total);
		
	}

}
