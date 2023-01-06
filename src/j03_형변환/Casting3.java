package j03_형변환;

public class Casting3 {
// 국영수 토탈점수 낼때 소주점 다 버리고 토탈은 내고 이 토탈에다 평균을 내라.
	public static void main(String[] args) {
		double kor = 87.5;
		double eng = 95.7;
		double math = 80.5;
		
		int total = ((int) kor + (int) eng + (int) math);
		//(int) (kor + eng + math); 로 값을 넣으면 3개의 과목이 모두 더해지고 int인 total점수로 변환 되어 263으로 출력됨.
		double avg = (double) total / 3;
		//double avg = total / 3; 업캐스팅 과정으로 묵시적 형변환이됨 고로 소수점 단위의 값은 출력되지 않음. 
		//87.0이 나오는 이유는 avg가 double인 자료형으로 선언해서임.
		
		
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
		
		
		
	}

}
