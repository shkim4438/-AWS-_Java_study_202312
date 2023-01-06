package j09_클래스;

public class J09_UserMain {

	public static void main(String[] args) {
		// 호출 즉, J09_User class를 new를 통해 생성하고 변수명 data1에 담아줘 초기화해줌.
		//왜 변수에 초기화 하는가? 주소값을 외울수 없기때문!, 
		//이렇게 초기화된 변수가 인스턴스라함.
		J09_User data1 = new J09_User();
		
		//사용할 메소드에 값을 할당하는 과정.
		//J09_User class에 method를 불러 거기안에 있는 값을 초기화 시켜줌.
		//클래스를 담은 변수 >> data1 참조자료형 을 부르는>> . 
		//메소드printUserInfo를 가져와 대입시켜줌 >> username = "shkim4438";
		data1.username = "shkim4438";
		data1.password = 123123;
		data1.name = "김수현";
		data1.email = "shkim12@gmail.com";
		
		// 할당된 메소드 printUserInfo();를 불러옴. data1의 printUserInfo()를 생성
		data1.printUserInfo();
		
		

	}

}
