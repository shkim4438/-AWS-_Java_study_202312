package j17_스태틱;

import java.time.LocalDateTime;

public class Car {
	
	private final static int NOW_YEAR = LocalDateTime.now().getYear();
	private static final String CODE = "KIA-" + NOW_YEAR + "-";	
	private static int ai = 1;
	
	private String serialCode;//KIA-2023-0000
	private String modelName;
	
	public Car(String modelName) {
		serialCode = CODE + String.format("%04d", ai);//String안에 있는 format메소드
		ai++;//d는 데쉬멀 영으로 채우겠다 %는 공간을 만들겠단 의미로 0자리를 4개로 채우겠단뜻.
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Car [serialCode = " + serialCode + ", modelName = " + modelName + "]";
	}
	
	
	
	
}
