package j14_추상;

public class Subway extends Transpotation {

	@Override // @시작은 어노테이션이라 부름.
	public void go() {
		System.out.println("subway 타고 출발");
	}
	
	@Override // 생략해도 되지만 상속을 했다는 의미로 명시를 해줄 필요가있음.
	public void stop() {
		System.out.println("subway 타고 도착");
	}
	
	public void checkRoute() {
		System.out.println("지하철 노선 확인");
	}
	
}
