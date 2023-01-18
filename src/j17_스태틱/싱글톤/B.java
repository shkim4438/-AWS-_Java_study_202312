package j17_스태틱.싱글톤;

import java.util.Scanner;

public class B {
	//이렇게 넘겨 대입해서 해줄 필요없이 원할때 A.getInstance()를 생성해 호출해주면 된다.
//	private A a;
//	
//	public B(A a) {
//		this.a = a;
//	}
//	
//	public A getA() {
//		return a;
//	}
	
	
	public void insertStudent() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생 이름: ");
		String name = scanner.nextLine();
		
		Student student = new Student(name);
		A.getInstance().addStudent(student);
		A.getInstance().showStudents();;
	}
	
	
}
