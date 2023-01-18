package j15_인터페이스;

public class GeneralCalculator extends Equipment implements Calculator {
	
	@Override
	public void powerOn() {
		System.out.println("일반 계산기 on");
		
	}@Override
	public void powerOff() {
		System.out.println("일반 계산기 off");	 
	}
	@Override
	public double plus(double x, double y) {
		System.out.println("일반계산기에서 더하기 실행");
		return 0;
	}
	@Override
	public double minus(double x, double y) {
		System.out.println("일반계산기에서 빼기 실행");
		return 0;
	}
	@Override
	public double division(double x, double y) {

		if(x == 0 || y == 0) {
		return ERROR;
		}
		return x / y;
	}
	
	
	
}
