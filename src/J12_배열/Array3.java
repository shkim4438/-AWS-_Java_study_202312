package J12_배열;

import java.util.Random;

public class Array3 {
	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			while(true) {
				boolean findFlag = true;
				
				int randomNums = random.nextInt(nums.length) + 1;
			
				for(int j = 0; j < nums.length; j++) {
				
					if(nums[j] == randomNums) {
						findFlag = false;
						break;
					}
				
				}
				if(findFlag) {
					nums[i] = randomNums;
					break;
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println();
		
//		System.out.println(random.nextInt(10));
//		System.out.println(random.nextInt(10) + 10); // 10~19까지 번호를 뽑는법 
		
		
		
		
	}
}
