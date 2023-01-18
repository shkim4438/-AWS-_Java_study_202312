package j19_컬렉션;


import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

	@AllArgsConstructor
	@Data
	class User{
		private String username;
		private String name;
	}

	public class ArrayUserMain {

		public static void main(String[] args) {
			
			User[] userArray = {
					new User("aaa", "김종환"),
					new User("bbb", "홍길동"),
					new User("ccc", "아무개"),
					new User("ddd", "김철수")
					
			};
			
			List<User> userList = Arrays.asList(userArray);
			
			String searchUsername = "aaa";
			User user = searchUser(userList, searchUsername);
			if(user == null) {
				System.out.println("검색실패");
				System.out.println("존재하지 않는 계정입니다.");
			}else {
				System.out.println("검색성공");
				System.out.println(searchUsername + "계정의 회원 이름은" + user.getName() + "입니다.");
			}
			
		
//			
//			boolean flag = true;
//			
//			for(int i = 0; i < userList.size(); i++) {
//				User user = userList.get(i);
//				if(user.searchUsername().)
				
			}
		
			private static User searchUser(List<User> userList, String username) {
				User user = null;
					for(User u : userList) {
						if(u.getUsername().equals(username)) {
							user = u;
							break;
					}
				}
				return user;
			}
		
		
}

