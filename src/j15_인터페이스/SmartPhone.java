package j15_인터페이스;

public class SmartPhone extends Equipment implements Calculator{

	@Override
	public void powerOn() {
		System.out.println("스마트폰 전원켬");
		
	}

	@Override
	public void powerOff() {
		System.out.println("스마트폰 전원끔");
		
	}

	@Override
	public double plus(double x, double y) {
		System.out.println("스마트폰에서 더하기실행");
		return x + y;
	}

	@Override
	public double minus(double x, double y) {
		System.out.println("스마트폰에서 빼기실행");
		return x - y;
	}

	@Override
	public double division(double x, double y) {
		System.out.println("스마트폰에서 나누기실행");
		
		if(x == 0 || y == 0) {
			return ERROR;
		}
		return x / y;
	}
	
	
	
}
