package j17_스태틱;

public class CarMain {
	
	public static void main(String[] args) {
		
		Car[] cars = new Car[5];
		
		cars[0] = new Car("K-3");
		cars[1] = new Car("K-5");
		cars[2] = new Car("K-7");
		cars[3] = new Car("K-8");
		cars[4] = new Car("K-9");
		
		for(Car c : cars) {
			System.out.println(c);
		}
		
	}
	
}
