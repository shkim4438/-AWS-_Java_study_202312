package j_exam.pratice;


public class Order {

	int orderNumber;
	String ID;
	String Date;
	String name;
	String productNumber;
	String address;
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProductNumber() {
		return productNumber;
	}
	
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	void printOrderInfo() {
		
		System.out.println("주문번호: " + orderNumber);
		System.out.println("아이디: " + ID);
		System.out.println("주문자: " + name);
		System.out.println("제품번호 " + productNumber);
		System.out.println("주소: " + address);
	}
	
}
