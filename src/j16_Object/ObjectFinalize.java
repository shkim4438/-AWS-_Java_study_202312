package j16_Object;

import javax.swing.plaf.basic.BasicTableHeaderUI;

class Test {//만들어진 class는 public 할 수 없으며 동일패키지에서 만쓰임.
	private int num;

	public Test(int num) {
		super();
		this.num = num;
		System.out.println("생성");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(num + "객체 소멸");
	}//생성된 객체가 소멸될때 finalize가 호출되어지면 new를 해주는 작업이 필요하다.
	//. java는 강제로 소멸할 수 없어서 가비지컬랙터가 알아서 소멸이되었을때 생성되는 클래스가 finalize.
	//
	
	
}

public class ObjectFinalize {
	
	public static void main(String[] args) {
		Test test = null;
		
		for(int i = 0; i < 30; i++) {
//			try{
//				Thread.sleep(500);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
			
			test = new Test(i); // 깊은 복사를 해두어 (새로운 메모리공간을 만듦) 살아 지더라도 다시 생성함.
			
			test = null;//test는 비워져있어 쓸모없이 힘메모리에 있음.
			
			System.gc();//가비지컬렉터 실행문. 
		}
	}
}
