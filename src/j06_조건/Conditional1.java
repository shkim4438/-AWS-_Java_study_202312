package j06_조건;



public class Conditional1 {

	public static void main(String[] args) {
		
		int num = 10;
		int num2 = 10;
		
		if(num > num2) {
			System.out.println("num이 num2보다 큽니다.");
			System.out.println("num: " + num);
		}else if(num == num2) {
				System.out.println("num과 num2가 같습니다.");
		}else {
				System.out.println("num이 num2부다 크지 않습니다."); //참일경우 if가 거짓일 경우 else가 출력이됨.
		}
	}

}
