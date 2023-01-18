package j16_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectGetClass {
	
	public static void main(String[] args) {
		Student student = new Student("김재영", 29);
		
		//getClass: 객체들의 정보들을 가지고 있다.
		System.out.println(student.getClass());
		System.out.println(Student.class);
		//instanceof는 다운캐스팅을 하지 않아도 비교가가능한데 
		// 좀더 명확하게 getClass를 활용하여 비교 하게 되면 상속관계의 영향을 받아서 까지 비교해 명확하다는 것이다.
		// 생성된 class는 .getClass를 반면 생성되니 않은Class를 비교할때 .Class로 비교한다. student.getClass// Student.Class
		// 비교를 하게 될경우 굳이 생성할 필요가 없기에 이렇게 나뉜다. Ex) if(obj.getClass == pp.getClass) x // Ex) if(obj.getClass == person.Class) O
		//데이터안에 어떤 자료를 가지고 있는지
		
		
		
		System.out.println(student.getClass().getName());
		
		Class studentClass = student.getClass();
		
		 String className= studentClass.getName();
		System.out.println("클래스 이름: " + className);
		
		String simpleName = studentClass.getSimpleName();
		System.out.println("클래스 이름만: " + simpleName);
		
		Field[] fields = studentClass.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field);
		}
		
		Method[] methods = studentClass.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
	}
	/* 
	 * 			 p = new person();
	 * 상속관계
	 * Object
	 *	 |										p			
	 * person									|
	 *	 |							<- object abj
	 * student						if(obj insanof Student)
	 */
}
