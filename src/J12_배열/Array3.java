package J12_배열;

import java.util.Random;

public class Array3 {
	//배열을 랜덤으로 출력한다 단, 동일한 숫자는 출력되지 않게한다.
	
	public static void main(String[] args) {
		
		//Random 자료형
		Random random = new Random();
		
		int[] nums = new int[10];//int 배열을 생성한다.
		
		for(int i = 0; i < nums.length; i++) {//먼저 배열을 출력시킬 for문으로 반복시켜준다.
			while(true) {//for문은 차례를 반복할때 써주며 while은 조건을 반복시킬때 쓴다.
				//true가 뜨면 무한 반복을 한다.
				boolean findFlag = true;// boolean으로 findFlag 변수에 true를 대입시켜
				
				int randomNums = random.nextInt(nums.length) + 1;
				// randomNums에 일단 +1을 넣어 인덱스값 0에서 시작하는걸 1에서 부터 시작하게 만들어준다.
//				random.nextInt(nums.length)를 왜쓰는지 모르겠음.?
				// random인 변수는 생성자 Random()을 대입해 져있음. Random 자료형을 가져와 nextInt(nums의 length)를 입력 받게함.
				for(int j = 0; j < nums.length; j++) {
				//for문을 하나 더만들어 배열 반복을 한번 더 만들어 주게끔 해준다.
					if(nums[j] == randomNums) {//if 조건문으로 for문의 j가 반복해서 차례대로 값이 들어 왔을때 
						//for문의 i 인 randomNums의 숫자와 == 같을땐 true로 한번더 반복시켜준다. (같은 숫자가 뜨면 
						//안되는 문제) false가 뜨면 break를 걸게되고 다음문장을 실행시킨다.
						//를 걸어 
						findFlag = false;//findFlag를 true와 false 둘다 대입하는데 어떻게 된 구조일까?
						break;
					}
				
				}
				if(findFlag) {
					nums[i] = randomNums; //여기서 randomNums를 nums로 넘겨 큰for문에 넘겨 브레이크를 걸고 다음
					//반복을 실행 시켜준다. 어떻게 큰for문으로 넘어가게된 걸까??
					break;
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {//nums를 출력시킬 프린트.
			System.out.println(nums[i]);
		}
		System.out.println();
		
//		System.out.println(random.nextInt(10));
//		System.out.println(random.nextInt(10) + 10); // 10~19까지 번호를 뽑는법 
		
		
		
		
	}
}
