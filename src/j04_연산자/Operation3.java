package j04_연산자;
/*
 * 논리 연산자
 * 참과 거짓은 중간이 없이 옳고 그름만 있다는점.
 * 
 * AND(곱): T && T, T && F 조건중 하나라도 0(f)이면 0(f)이다.  
 * 
 * OR(합): T || F 많은 조건중 하나만 참이여도 참이된다.
 * 
 * NOT(부정): !T 참이아니다.
 * 
 */
public class Operation3 {
	public static void main(String[] args) {
		int num = 11;
		
		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = false;
		boolean flag3_1 = num % 2 > 0;
		
		
		System.out.println(flag1 && flag2);
		System.out.println(flag1 && flag3);
		System.out.println(flag1 && flag3_1);
		System.out.println(!(flag2 || flag3_1 && flag1));
	}
}
