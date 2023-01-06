package j09_클래스;

public class J09_StudentMain {
	
	public static void main(String[] args) {
		// 스택에 할당해주는영역 = 힙에 할당해주는 영역(생성)
		J09_Student student1 = new J09_Student();
		J09_Student student2 = new J09_Student();
		
		//스택영역(method)은 자동으로 초기화되지않음. class에서는 자동으로 할당해줌.
		student1.name = "김수현";
		student1.age = 30;
		
		student1.printInfo();
		student2.printInfo();
		
		System.out.println(student1);
		System.out.println(student2);
	}
}
