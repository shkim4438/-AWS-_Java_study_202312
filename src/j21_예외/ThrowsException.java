package j21_예외;

import java.util.Arrays;
import java.util.List;

public class ThrowsException {

	public static void printList(List<String> list, int size) throws Exception {//강제적으로 예외를 일으켜주는 throws
		
		for(int i = 0; i < size; i++) {
			System.out.println("[" + i + "]" + list.get(i));
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) throws Exception {
		String[] names = {"김수현", "이종현", "박성진", "김동민"};
	
		try {
			throw new ClassCastException();//강제적으로 예외를 일으켜주는 throw
//			printList(Arrays.asList(names), 5);
		} catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {//try, catch가 실행되어도 실행됨. 명확하다고 판단을하고 Exception 처리를 해도 또는 예상치못한 예외가 일어나도 실행
			// 임시저장을 할때씀.
			System.out.println("무조건 실행");
		}
		System.out.println("프로그램 정상 종료.");
		
	}
	
	
}
