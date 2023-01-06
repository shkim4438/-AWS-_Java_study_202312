package J11_접근지정자;

import javax.print.attribute.standard.PrinterInfo;

import J11_접근지정자.default1.J11_StudentDefault;//임폴트된건 다른 패키지안에 있기 때문이다. 

public class J11_StudentMain {

	public static void main(String[] args) {
		J11_Student s1 = new J11_Student();
		s1.name = "김준일";
//		s1.age = 11;
		
		s1.printInfo();
		
		J11_StudentDefault s2 = new J11_StudentDefault();
		
//		s2.name = "김준이";//private으로 인한 접근불가.
		
		//System.out.println("이름: " + s2.name);
		System.out.println("이름: " + s2.getName());
	}

}
