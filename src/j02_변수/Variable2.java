package j02_변수;

public class Variable2 {
//문자
	public static void main(String[] args) {
		char firstName1 = '준';
		//char firstName1 = "준"; 캐릭터 자료형에서 큰따움표를 쓸 수 없으며 이는 문자열이다.
		char firstName2 = '일';
		
		char alphabetA ='A';
		
		System.out.println("김" + firstName1 + firstName2);
		System.out.println("알파벳A" + alphabetA);
		
		System.out.println(alphabetA + 'B');
		//문자란 것은 실질적으론 숫자로 표현되어 있는데 이는 아스키코드를 따르기 때문이다.
		System.out.println(alphabetA);
		System.out.println("\uAC00"); //유니코드
		System.out.println(firstName1 + 0); // 문자와 숫자를 더한 값이 출력 
		

	}

}
