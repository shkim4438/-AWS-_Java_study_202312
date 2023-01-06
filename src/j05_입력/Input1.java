package j05_입력;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		//임폴트 생성: 컨트롤 + 쉬프트 + O 명확하게 작성이되어야 사용가능.
		// 미완성일땐 컨트롤 스페이스바
	
		Scanner scanner = new Scanner(System.in);
		int inputNum = 0; //변수선언은 위에다 몰아쓰기.
		int inputNum2 = 0;
		int inputNum3 = 0;
		int inputNum4 = 0;
		int inputNum5 = 0;
		
		System.out.print("입력1: ");//입력을 출력 개당 하나씩.
		inputNum = scanner.nextInt();//변수에 담기.
		System.out.print("입력2: ");
		inputNum2 = scanner.nextInt();
		System.out.print("입력3: ");
		inputNum3= scanner.nextInt();
		System.out.print("입력4: ");
		inputNum4 = scanner.nextInt();
		System.out.print("입력5: ");
		inputNum5 = scanner.nextInt();
		
		
		//System.out.println("입력 값: " + scanner.nextInt());
		System.out.println("입력 값: " + (inputNum + inputNum2 + inputNum3 + inputNum4 + inputNum5));
		
		
		

	}

}
