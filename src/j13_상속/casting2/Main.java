package j13_상속.casting2;

public class Main {
	
	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		Subway subway = new Subway();
		
		Transpotation transpotation = new Transpotation();
		//Taxi t1 = (Taxi) transpotation;
		
		Transpotation transpotation1 = taxi;
		//Subway s1 = (Subway) transpotation1; 
		// 즉, 원래의 형태로 돌아가는것만 다운캐스팅이 가능하다
		
		Transpotation transpotation2 = subway;
		//transpotation1 을 생성하게되면 go, stop메소드 기능은 있지만 Taxi의 checkNumber
		//는 쓰지못한다. 상위는 하위를 생성할 수 없다.
		
		Transpotation[] transpotations = new Transpotation[6];
		
		transpotations[0] = taxi;
		transpotations[1] = subway;
		transpotations[2] = taxi;
		transpotations[3] = subway;
		transpotations[4] = taxi;
		transpotations[5] = subway;
		
		for(int i = 0; i < transpotations.length; i++) {
			if(transpotations[i] instanceof Taxi) {//조건문을 통한 해결방법
				Taxi tx = (Taxi) transpotations[i];
				tx.checkTaxiNumber();
				
			}else if(transpotations[i] instanceof Subway) {//왼쪽항이 오른쪽항과 같으면 참 아니면 거짓, 참이면 생성 거짓이면 생성이없음. 
				Subway sw = (Subway) transpotations[i];
				sw.checkRoute();
			}
			
			//Taxi tx = (Taxi) transpotations[i];
			//다운캐스팅 Transpotation에 Taxi의 메소드가 없기때문에 다운 캐스팅 될수 가 없다.
			//여기서 tx의 첫 반복은 생성됨 같은 taxi자식클래스 두번째 반복은 subway라 서로다른
			//클래스로 생성되지 않음. 
			
			
			
			
			transpotations[i].go();
		}
		
		for(Transpotation t : transpotations) {
			t.stop();
		}
		
	}
}
