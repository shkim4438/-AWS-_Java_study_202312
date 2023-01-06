package J12_배열;

import java.util.Iterator;

public class Array2 {
	
	public static void printNames(String[] names) {
		
		for(int i = 0; i < names.length; i++) {//i < names.length: 여기서(i)부터 여기(names.length)전까지 로 이해한다.
			System.out.println("이름[" + (i + 1) + "]: " + names[i]);
		}
		System.out.println();
		//names.length length를 써주면 동적인 메모리라서 크기에 구애받지 않고 값을 초과 할 수가 있다.
	}
	
	public static void main(String[] args) {
		// 배열을 선언하고 값을 넣는 3가지 방법
		
		String[] names = new String[3]; //크기는 매번 생성자를 선언과 초기화를 할때만 넣어준다!
		
		// 1. 들어갈 값이 정해 져있지 않았을때 혹은 들어갈 공간이 확실할때.
		names[0] = "김상현"; 
		names[1] = "임나영";
		names[2] = "김종환";
		
		// 2. 들어갈 값이 확실 할때
		//new String[] 안에 값을 넣지 않으며 중괄호 안에 대입한 갯수를 자바가 알아서 인식한다.
		String[] names2 = new String[] {"이상현", "손지호", "이강용"};
		
		//3. 배열을 선언과 초기화를 할때만 중괄호를 쓰고 앞의 String[] 인 자료형만보고 배열인지 인식해서
		//중괄호만 쓰고도 초기화가 가능한거임.
		String[] names3 = {"김두영", "강대현", "이현수", "김재영"}; //김재영은 배열이 [3]이라서 컴파일안됨.
		
//		for(int i = 0; i < 3; i++) {
//			System.out.println("이름[" + (i + 1) + "]: " + names[i]);
//		}
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println("이름[" + (i + 1) + "]: " + names2[i]);
//		}
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println("이름[" + (i + 1) + "]: " + names3[i]);
//		}
//		System.out.println();
		
		printNames(names);
		printNames(new String[] {"이상현", "손지호", "이강용"});
		printNames(names3);
		
	}
}
