package j07_반복;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		String name = "김준일";
//		System.out.println(name.charAt(0));
		
		boolean loopFlag1 = true;
		
		while(loopFlag1) {
			char select = '\0';
			boolean loopFlag2 = true;	
			
			System.out.println("========<<식당 메뉴>>========");
			System.out.println("1. 김밥천국");
			System.out.println("2. 탄탄면");
			System.out.println("3. 홍대개미");
			System.out.println("4. 밥앤밥");
			System.out.println("=======================");
			System.out.println("q. 프로그램 종료");		
			System.out.println("=======================");
			
			System.out.print("식당 선택: ");
			select = scanner.next().charAt(0); // next()로 문자열을 입력 받고
			//chaAt(0)으로 첫번째 입력 받는 건 문자로 받는다. 그래서 앞의 번호만으로도 입력이 가능해짐.
			
			if(select == 'q' || select == 'Q') {
				loopFlag1 = false;
				
			}else if (select == '1') {
				
				while (loopFlag2) { //Flag를 준 이유 2번째 loop에 들어 왔을때 
					//프로그램 종료가 안쪽과 밖아쪽 while을 같이 멈춤을 걸어주기 위해서이다.
					System.out.println("========<<김밥 천국>>========");
					System.out.println("1. 라면");
					System.out.println("2. 돌솥비빔밥");
					System.out.println("3. 오므라이스");
					System.out.println("4. 김치볶음밥");
					System.out.println("=======================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");		
					System.out.println("=======================");
				
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
				
					if (select == 'b' || select == 'B') {
						loopFlag2 = false;
					}else if(select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					}else if (select == '1') {
						System.out.println("라면을 선택했습니다.");
					}else if (select == '2') {
						System.out.println("돌솥비빔밥을 선택했습니다.");
					}else {
						System.out.println();
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
				
					System.out.println();
				}

			
			}else if (select == '2') {
				while(loopFlag2) {
					System.out.println("========<<탄탄면>>========");
					System.out.println("1. ");
					System.out.println("2. 돌솥비빔밥");
					System.out.println("3. 오므라이스");
					System.out.println("4. 김치볶음밥");
					System.out.println("=======================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");		
					System.out.println("=======================");
				
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if (select == 'b' || select == 'B') {
						loopFlag2 = false;
					}else if(select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					}else if (select == '1') {
						System.out.println("라면을 선택했습니다.");
					}else if (select == '2') {
						System.out.println("돌솥비빔밥을 선택했습니다.");
					}else {
						System.out.println();
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
				
					System.out.println();
				}
				
			}else if (select == '3') {
				while(loopFlag2) {
					System.out.println("========<<홍대개미>>========");
					System.out.println("1. 라면");
					System.out.println("2. 돌솥비빔밥");
					System.out.println("3. 오므라이스");
					System.out.println("4. 김치볶음밥");
					System.out.println("=======================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");		
					System.out.println("=======================");
				
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if (select == 'b' || select == 'B') {
						loopFlag2 = false;
					}else if(select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					}else if (select == '1') {
						System.out.println("라면을 선택했습니다.");
					}else if (select == '2') {
						System.out.println("돌솥비빔밥을 선택했습니다.");
					}else {
						System.out.println();
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
				
					System.out.println();
				}
			}else if (select == '4') {
				while(loopFlag2) {
					System.out.println("========<<밥앤밥>>========");
					System.out.println("1. 라면");
					System.out.println("2. 돌솥비빔밥");
					System.out.println("3. 오므라이스");
					System.out.println("4. 김치볶음밥");
					System.out.println("=======================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");		
					System.out.println("=======================");
				
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if (select == 'b' || select == 'B') {
						loopFlag2 = false;
					}else if(select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					}else if (select == '1') {
						System.out.println("라면을 선택했습니다.");
					}else if (select == '2') {
						System.out.println("돌솥비빔밥을 선택했습니다.");
					}else {
						System.out.println();
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
				
					System.out.println();
				}
				
			}else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
			
			System.out.println();
			
		}
		
		System.out.println("프로그램 정상 종료!");
	}
	
}
