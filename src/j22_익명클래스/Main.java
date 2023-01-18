package j22_익명클래스;

public class Main {
	
	public static void main(String[] args) {
		Calculater c1 = new Addition();
		System.out.println(c1.calc(10,20));
		
////////////////////////////////////////////////////////////
		//한번만 쓰게될경우 클래스를 구현할 필요없이 일회성으로 구현해놓은 클래스를 익명클래스라고 한다.
		Calculater c2 = new Calculater() {
			
			@Override
			public int calc(int x, int y) {//class에 생성한게 아닌 임시적으로 객체를 구현해둠. 인터페이스 밖에 안되있으며 
				return x - y;
			}
		};
		System.out.println(c2.calc(200, 100));
	}
}
