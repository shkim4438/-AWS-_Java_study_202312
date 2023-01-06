package j07_반복;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if(i % 2 != 0) { //홀수를 구하는 조건
				continue;//
			}
			
			System.out.println("i: " + i);
			
		}
		
		int i = 0;
		
		while(i < 10) {
			
			if(i % 2 != 0) { //인덱스 증가 혹은 증가를 시키는 조건이 포인트인 것은 while문을 쓰지 않음.
				i++;
				continue;
			}
			
			System.out.println("i: " + i );
			i++;
		}
		
	}

}
