package j17_스태틱.싱글톤;

public class C {
	
//	private A a;
	private B b;
	
	public C() {
//		this.b = b;
//		this.a = a;
	}
	
	public void showAll() {
//		A a = b.getA();
		
		A.getInstance().showStudents();
	}
	
	
}
