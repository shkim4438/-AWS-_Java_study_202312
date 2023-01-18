package j13_상속;

public class ExtendsMain {
/*
 * Car라는 클래스에서 Hyundai와 KiaCar 클래스를 포함하는데 이들 상속관계로 Car는 부모 Hyundai와 KiaCar 자식 클래스
 * 라고 생각하면된다.
 */
	public static void main(String[] args) {
		KiaCar kiaCar = new KiaCar();
		
		System.out.println(kiaCar);
		
		kiaCar.setPrice(30000000);
		
		System.out.println(kiaCar);
		
		System.out.println(kiaCar.getPrice());
		
		System.out.println(kiaCar.getPrice());
		System.out.println(kiaCar.discountPrice(20));//kiaCar. 으로 되어있지만 discountPrice는 Car의 클래스에
		//서 호출 할고 있다.
		// 즉, kiaCar라는 클래스를 쓰고 있지만 Car라는 클래스의 상속을 받아 쓸 수 도있다.
		
	}

}
