package j15_인터페이스;

public interface Calculator {
	
	public int ERROR = -999999; //일반변수를 선언 하지못하기 때문에 상수를 선언할때 final생략할 수있고 대문자 입력해야 선언이가능함.
	//final을 생략하고 사용한다 인터페이스는 변수를 받지 않기때문이다.
	
	public double plus(double x, double y);
	
	public double minus(double x, double y);
	//인터페이스 는 abstract이 없어도 무조건 추상메소드로 쓰인다. 중괄호를 받지 않는다.
	
	public default double multiplication(double x, double y) {//일반 메소드를 사용하기위해서는 default를 생성 해주어야한다.
		
		return x * y;
		
	}	
	//일반변수를 가질 수 없다 즉, 맴버변수를 받지 못하는 대신 상수는 받을 수 있다.
		public double division(double x, double y);
	
}
