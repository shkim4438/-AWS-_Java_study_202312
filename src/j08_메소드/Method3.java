package j08_메소드;

public class Method3 {
	
	public static void ov1() {
		System.out.println("매개변수 없음");
	}
	
	public static void ov1(int a) {
		System.out.println("int 매개변수 하나");
	}
	// 반환값(자료형)과는 상관없이 매개변수가 같은면 사용을 못한다.
//	public static int ov1(int a) {
//		System.out.println("int 매개변수 하나");
//		return a;
//	}
	
	public static void ov1(int a, String b) {
		System.out.println("int 먼저 그다음 String");
	}
	
	public static void ov1(String a, int b) {
		System.out.println("String 먼저 그다음 int");
	}
	
	public static void main(String[] args) {
		ov1();
		ov1(10);
	}

}
