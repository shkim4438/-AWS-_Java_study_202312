package j_exam;

public class Bed extends Furniture implements MakeFurniture {
	
	@Override
	public void ingredient() {
		System.out.println("상품재료: ");
		
	}

	@Override
	public void color() {
		System.out.println("상품컬러: ");
		
	}

	@Override
	public void productName() {
		System.out.println("상품명: ");
		
	}

	@Override
	public void Make(String make) {
		// TODO Auto-generated method stub
		MakeFurniture.super.Make(make);
	}

	@Override
	public void Pave(String pave) {
		// TODO Auto-generated method stub
		MakeFurniture.super.Pave(pave);
	}

	@Override
	public void Deliver(String deliver) {
		// TODO Auto-generated method stub
		MakeFurniture.super.Deliver(deliver);
	}
	
	
	
	
	
}
