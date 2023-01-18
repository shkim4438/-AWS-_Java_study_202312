package j21_예외;

public class CustomErrorException extends RuntimeException {
	
	public CustomErrorException(String string) {
		System.out.println("내가 만든 예외 생성");
	
	
	}
}
