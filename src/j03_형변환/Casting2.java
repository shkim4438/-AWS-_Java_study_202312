package j03_형변환;

public class Casting2 {
//업캐스팅, 다운캐스팅
	public static void main(String[] args) {
		char char_a = 'a';
		int num = (int) char_a;
		// 상위의 자료형으로 즉,문자에서 정수로 형변환된것 업캐스팅 묵시적형변환
		
		//char char_b = num;
		char char_b = (char) (num + 1);// 연산보다 형변환이 우선순위라는점
		//다운캐스팅 명시적 형변환 다운캐스팅을 할땐 반드시 명시를 해줘야함.
		System.out.println(char_b);
	}

}
