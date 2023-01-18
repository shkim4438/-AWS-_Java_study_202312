package j16_Object;

public class ObjectEquals {
	
	public static void main(String[] args) {
		String name1 = "김준일";
		String name2 = "김준일";
		String name3 = new String("김준일"); // name1,2와 서로 다른 주소값
//		즉 new를 하게되면 새로운 주소값을 가지 메모리공간이 생성된다고 보면된다.
		
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name3));
		//문자열 비교는 equals를 사용해야 하는데 비교 연산자로 비교했는데 이들은 주소값을 비교한것임.
		// .equals();를 활용해 비교를 하게될 경우 안에 있는 값을 비교함.
		
		///////////////////////////////////////////////////////////////
		
//		Student s1 = new Student("박은빈", 24);
//		Student s2 = new Student("박은빈", 24);
//		
//		System.out.println(s1 == s2);
//		서로 주소가 다름 
		
//		//위의 방식을 주소 하나로 잡아주는 방법
//		Student s = new Student("박은빈", 24);
//		Student s1 = s;
//		Student s2 = s;
		
		Student s1 = new Student("박은빈", 24);
		Student s2 = new Student("박은빈", 24);
		SubStudent s3 = new SubStudent("박은빈", 24);
		
		System.out.println(s1.equals(s3));
		//equals는 같은 값인데 왜 false가 출력되는가?
		//기본적으로 objectclass는 equals를 사용해도 주소값을 비교해주게 되어있다.
		//값을 비교하려면 equals를 오버라이드 해서 사용해주면된다.

	}
}
