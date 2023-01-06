package j07_반복;

import java.util.Scanner;

public class Loop2test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startNumber = 0;
		int endNumber = 0;
		
		System.out.println("시작: ");
		startNumber = scanner.nextInt();
		
		System.out.println("끝: ");
		endNumber = scanner.nextInt();
		
		int total = 0;
		
		for (int i = 0; i < endNumber - startNumber + 1; i++) { //endNumber - startNumber +1 반복에대한 횟수
			total += i + startNumber;
		}// 끝에서 시작을 빼고 + 1을 해주면 반복에 대한 횟수가 되며
		
		System.out.println("총합: " + total);
		
	}

}
