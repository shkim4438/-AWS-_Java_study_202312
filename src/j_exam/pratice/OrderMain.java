package j_exam.pratice;

public class OrderMain {

	public static void main(String[] args) {
		Order or = new Order();
		
		or.orderNumber = 777777;
		System.out.println(or.getOrderNumber());
		
//		o.ID = "aaa555";
		or.setID("ewe123");
		System.out.println(or.getID());
		
		or.address = "무슨시 무슨구 무슨동";
		System.out.println(or.address);
		
		or.setAddress("부산시 부산진구 부전동");
		System.out.println(or.getAddress());
		System.out.println();
		
		
//		or.setProductNumber("AD-314-990");
//		or.setAddress("양산시 물금읍 가촌리");
//		or.setID("ttt751");
//		or.setName("이사문");
//		or.setOrderNumber(93482300);
		
		or.orderNumber = 23451;
		or.address = "서울특별시 강남구 이전동";
		or.ID = "gaga4142";
		or.name = "이지노";
		or.productNumber = "AG-9121-003";
		
		or.printOrderInfo();
		
		
		
		
	}
	
}
