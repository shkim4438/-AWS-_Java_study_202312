package j21_예외;

public class ArrayException {
	
	public static void main(String[] args) {
		
		Integer[] nums = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < 6; i++) {
			System.out.println(nums[i]);
		}
			
		try {		
			throw new NullPointerException();//강제로 예외를 불러일으킴.
		} catch (IndexOutOfBoundsException e) {
			System.out.println("예외 처리를함");
		} catch (NullPointerException e) { 
			System.out.println("공백을 예외처리함");
		} catch (Exception e) {
			System.out.println("예상 못한 예외 처리를함");
		}
		
			System.out.println("프로그램 정상 종료");
			
	}
}
	
	
	/*
	 * program의 error를 예외라고 한다.
	 * 예외가 일어났을때 임시저장 혹은 정상적인 종료를 해야하는데 이를 예외처리를 해줘야됨.
	 * try{
	 * 
	 * }catch (예외처리할 에러){
	 * 
	 * }
	 */

