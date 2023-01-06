package j07_반복;

public class While2 {

	public static void main(String[] args) {
		
		int i = 0;
		
		
		while(i < 10) {
			int j = 0;// while밖에 있을때 j는 1씩 증가 i도 같이 올라가 별이 하나씩 찍힘. 
			//이를 해결하기위해 while문 안에가져와 0으로 초기화를 해줌.
			
			while (j < i + 1) {
			System.out.print("*");
			
			j++;
			}
			
			System.out.println();
			i++;
		}

	}

}
