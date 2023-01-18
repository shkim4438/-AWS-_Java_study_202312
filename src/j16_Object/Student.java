package j16_Object;

import java.util.Objects;

public class Student {
	
	private String name;
	private int age;
	

	public Student(String name, int age) {
		super();//object클래스에 상속되어 있음. 
		this.name = name;
		this.age = age;
	}


	@Override
	public int hashCode() {//원하는 주소값을 배열을 돌려서 하니씩꺼내는것이아니라 둘의 값의 주소를 가지고 비교하여 판단.
		return Objects.hash(name, age);
	}


	@Override
	public boolean equals(Object obj) {
	
		if(this == obj) {
			return true;
		}
		
		if(!(obj.getClass() == Student.class)) {
			return false;
		}
		
		if(obj == null) {//null값이 호출했될 상황
			return false;
		}
		
		Student s = (Student) obj;//name은 업캐스팅되어있어 다운캐스팅해 접근하면 가능하다.
		
		boolean result = name.equals(s.name) && age == s.age;// and연산자를 활용해 두가지 값을 비교했음.
		
		return result;
	}



	@Override
	public String toString() {
		return "이름: " + name + "\n나이" + age;
	}
	
	
	
	
	/*
	 * object class는 최상의 클래스이며 항상 모든 클래스는 최상위 클래스를 받는다.
	 * class생성시 super class에 java.lang.Object로 잡혀 있으며 생략되어져 있음.
	 * 허나 상속시 다중상속이 불가능한데 어떻게 가능한가?
	 * object class는 모든 class에 생성되어 있는데 extends로 생성하게되면 생성된것으로
	 * 바뀌고 objectClass는 사라지게 된다. extends의 상위클래스 역시도 object를 가지고 
	 * 있음.
	 */
}
