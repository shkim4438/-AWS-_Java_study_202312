package J10_생성자;

public class TestTest {
	
	public static void playerList(String[] player) {
		for(int i = 0; i < player.length; i++) {
			System.out.println("선수번호 [" + (i + 1) + "] 선수이름: " + player[i]);
		}
	}
	
	public static void main(String[] args) {
		
		String[] player = {"강백호", "최치수", "정대만", "송태섭", "서태웅"};
		
		playerList(player);
		
	}

}
