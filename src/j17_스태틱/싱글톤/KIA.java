package j17_스태틱.싱글톤;

public class KIA {
//유일한 하나의 객체이며 모든영역에서 가져올수 있지만 중복하여 생성하지못함.
//언제 쓰는가? 
/*
 * 유일하게 하나만 존재해야하는 객체가 필요함. 여러 객체에 데이터가 담기면 객체의 정보를 여러군데에서 확인해야 하는데
 * 이를 방지하는 목적으로 쓰이며 데이터를 한군데에서만 집약시키는 역할을 하고 있음.
 */
	private static KIA instance = null;
	
	private KIA() {
		
	}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	//instance가 KIA라는 클래스를 하나만 생성해 대입하고있으며 더이상 중복된 객체를 생성하지 못하게 한다. 
	//KIA()가 private으로 설정되어있어서이다.
	public void printCompanyName() {
		System.out.println(getClass().getSimpleName());
	}
	
}
