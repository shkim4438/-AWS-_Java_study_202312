package j06_조건;

public class Switch1 {

	public static void main(String[] args) {
		//어디서 부터 어디까지 선택 할것인가? case는 switch에 있는 값을 찾아가며 그이후 값을 그래로 출력
		//끊어 주기 위해서는 break를 사용. sWitch문은 only java.
		String select = "B선택";
		
		switch (select) {
			case "A선택": 
				System.out.println("PC(A)를 연결합니다.");
				break;
			case "B선택": 
				System.out.println("PC(B)를 연결합니다.");
				break;
			case "C선택": 
				System.out.println("PC(C)를 연결합니다.");
				break;
			case "D선택": 
				System.out.println("PC(D)를 연결합니다.");
				break;
			default : 
				System.out.println("else와 같은 역할");
		}

	}

}
