package j18_제네릭;

public class TestData<T, E> {
	
	private T data1;
	private E data2;
	//Integer: 래퍼클래스(Wrapper Class) int는 일반 자료형, 클래스를 받는것이 Integer.
	//제너릭은 일반자료형을 못받음.
	public TestData(T data1, E data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "TestData [data1=" + data1 + ", data2=" + data2 + "]";
	}
	
	
	
}
