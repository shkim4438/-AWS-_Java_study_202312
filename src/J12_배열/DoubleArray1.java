package J12_배열;

public class DoubleArray1 {
//2차원 배열
	public static void main(String[] args) {
		
		int num = 0;
		
		int[] nums = new int [2];
		
		int[][] d_nums = new int[3][2];//첫번째 3은 두개짜리 배열이 3개로 묶여있고 하위배열이다.  2개식 3개가 들어간다는 의미.
		// 밖에 있는게 안쪽에있는 크기 밖에서 안쪽으로 해석하면된다.
		//int자료형의 배열에 배열을 담을수 있는 더블배열
		
		//잘못된 접근방식
//		d_nums[0][0] = 1;
//		d_nums[1][0] = 2;
//		d_nums[2][0] = 3;
//		
//		d_nums[0][1] = 4;
//		d_nums[1][1] = 5;
//		d_nums[2][1] = 6;
		
		d_nums[0][0] = 1;
		d_nums[0][1] = 4;
		
		d_nums[1][0] = 2;
		d_nums[1][1] = 5;
		
		d_nums[2][0] = 3;
		d_nums[2][1] = 6;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(d_nums[j][i]);
			}
		}

		int[][] d_nums2 = new int[][] {{1, 2, 3}, {5, 6}};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(d_nums2[i][j]);
			}
		}
		
		System.out.println(d_nums2[1].length);
		
		for(int i = 0; i < d_nums2.length; i++) {
			for(int j = 0; j < d_nums2[i].length; j++) {
				System.out.println(d_nums2[i][j]);
			};
			
		} 
		
	}

}
