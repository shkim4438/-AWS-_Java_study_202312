package j_exam.pratice;

public class ManMain {

	public static void main(String[] args) {
		
		Man m = new Man(30, null, false, 0);
		
		System.out.println(m.getAge());
		System.out.println(m.isMarried());
//		Man st = m.setName("John");
		m.setName("kdjal");
		System.out.println(m.getName());
		
//		m.age = 40;
//		m.isMarried = true;
//		m.name = "john";
//		m.numberOfChildren = 3;
//		
//		System.out.println("이남자의 나이: " + m.age);
//		System.out.println("결혼여부: " + m.isMarried);
//		System.out.println("이름: " + m.name);
//		System.out.println("자녀수: " + m.numberOfChildren);
		
	}
}
