package j_exam;

public interface MakeFurniture {
	
	public default void Make(String make) {
		System.out.println("을 만들다");
	}  //가구를 만드는 메소드
	
	public default void Pave(String pave) {
		System.out.println("을 포장하다");
	}; //가구를 포장하는 메소드                    
	
	public default void Deliver(String deliver) {
		System.out.println("을 배송하다");
	}; //가구를 배달하는 메소드
	
}
