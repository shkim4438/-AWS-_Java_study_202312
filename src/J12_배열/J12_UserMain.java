package J12_배열;

public class J12_UserMain {
	
	public static void main(String[] args) {
		J12_User[] users = new J12_User[0];
		
		
		J12_UserRepository userRepository = new J12_UserRepository(users);
	
		
		J12_UserService service = new J12_UserService(userRepository);
		
		service.run();
		service.stop();
		
		System.out.println("코드를 수정하였습니다.");
		System.out.println("코드를 수정하였습니다.");
	}	
	
}
