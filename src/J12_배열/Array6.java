package J12_배열;

public class Array6 {

	public static void main(String[] args) {
		
		String[] names = {"박성진", "조병철", "황창욱"};
		for(String name : names) {
			System.out.println(name);
			name = "김준일";
		}
		// 포이치문의 경우 인덱스 의 복사본 (a : b중 b가 복사본)을 한개 더만들어 그 값이 변치않는다.
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			names[i] = "김준일";
		}
		// 포문의 경우 인덱스 그자체를 활용해 값을 돌려 반복시키므로 값을 동적으로 변화가 가능하다.
		
		System.out.println("=============<forEach>=============");
		
		int[] nums = {1,2,3,4,5};
		
		for(int i : nums) {
			System.out.println("i: " + i);
		}
		
		
	}
}
