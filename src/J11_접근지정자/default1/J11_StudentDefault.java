package J11_접근지정자.default1;

public class J11_StudentDefault { //class에 public이 쓰이는 이유는 다른 페키지에서 임폴트를 하기위함임.

	private String name;
	private int age;
	
	public J11_StudentDefault(){
		
	}
	
	public J11_StudentDefault(String name, int age){
		this.name = name;
		this.age = age;	
	}
	
	void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
}
