package j17_스태틱.싱글톤;

public class A {
	
	private Student[] students;
	private static A instance = null; //instance는 자기 자신의 클래스를 가지는 변수
	
	private A(){
		students = new Student[3];
	}
	
	public void addStudent(Student student) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = student;
				return;
			}
		}
		
		System.out.println("더 이상 학생을 추가 할 수 없습니다.");
		System.out.println();
	}
	/*
	 * addStudent메소드가 void인데 리턴을 쓸 수 있던 이유는 반복이 멈출때 break를 걸어주면 더 이상... 인 프린트문을 
	 * 출력시킨다 그 이유는 break가 반복 자체를 멈춰 주기때문에 다음 실행문을 출력되기 때문이다. void에 return값을 주지 
	 * 않은 상태로 실행되면 반복을 멈추는게 아니라 빠져나가 다시 반복을 시켜주기 때문이다.
	 */
	
	
	public static A getInstance() {
		if(instance == null) {
			instance = new A();
		}
		return instance;
	}
	
	public void showStudents() {
		for(Student student : students) {
			System.out.println(student);
		}
		System.out.println();
	}
	
}
