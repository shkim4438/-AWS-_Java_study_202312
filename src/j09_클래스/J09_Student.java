package j09_클래스;

public class J09_Student {
	String name = "김";
	int age = 100 ;
	
	//기본생성자
	J09_Student(){
		
	}
	//이게 생성자로 호출했는데 주소값 덕분에 생략되어도 호출가능하며 자료형을 정의해줄 필요도없다. 
	void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}
