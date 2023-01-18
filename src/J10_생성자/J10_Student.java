package J10_생성자;

public class J10_Student {
	
	//참조변수 혹은 래퍼런스 변수, 맴버변수로 불림. 
	//클래스안에서 쓰이는 전역변수로 
	String name;
	int age;
	
	
//	J10_Student(){// 기본생성자는 기본적으로 생략되어있음.
//		System.out.println("기본 생성자 호출");
//	}
	
//	J10_Student(int age){//오버로딩은 생략되어 있는 기본 생성자를 덮어버림. 기본생성자를 출력하려면 입력해야함.
//		System.out.println("학생의 나이: " + age);
//	}
//	
//	J10_Student(String name){
//		System.out.println("학생의 이름: " + name);
//	}
	
	J10_Student(String name, int age){
		this.name = name;
		this.age = age;	
	}
	
	
	void printInfo(){
		System.out.println("학생의 이름: " + name);
		System.out.println("학생의 나이: " + age);
	}
	
	//각 메소드안에 지역변수가 있는데 클래스에서 선언한 전역인 맴버변수와 변수명이 같다 허나 이들은
	//오류가 뜨지 않고 (본래 오류가 떠야함) 변수명이 같아 구별 하기가 어렵다. 이를 구별할수 있는것이 바로 
	//this. 이다. this.을 활용하여 이 클래스 즉, 주소의  맴버변수이다라는 의미로 변수를 명확히 해준다. 
	//this.를 사용해주므로써 main에서 생성할때 접근이 용이하여 사용하고 싶은 기능의 메소드에 값을 넣어
	//줄수 있게된다.
}
