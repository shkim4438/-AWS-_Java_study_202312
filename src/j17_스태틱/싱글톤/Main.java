package j17_스태틱.싱글톤;

public class Main {

	public static void main(String[] args) {
		
//		A a = new A();
//		A a = a.getInstance(); 로 쓸 수도 있지만 이렇게 쓸 필요는 없다 
		B b = new B();
		C c = new C();
		
		for(int i = 0; i < 4; i++) {
			b.insertStudent();
		}
		
		System.out.println("C에서 학생 전부 출력");
		c.showAll();
	}
	
}
