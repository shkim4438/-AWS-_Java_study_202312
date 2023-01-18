package j20_JSON.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	
	private String username;
	private String password;
	private String name;
	private String email;
	
	// builder페턴을 쓰면 중복된 매개변수를 사용할 수 가 있음.
//	public User(String username) {
//		this.username = username;
//	}
//	
//	public User(String password) {
//		this.password = password;
//	}
	
	// 내부클래스가 static이 없을 경우 생성 방법
	// 내부클래스의 static에 영향을 받음 UserBuilder();(내부클래스)를 생성해주니깐.
//	public static UserBuilder builder() {
//		return new User(). new UserBuilder();
//	}
	
	// 내부클래스의 static 존재할 경우 return값으로 new class명();
//	public static UserBuilder builder() {
//		return new UserBuilder();
//	}
//	
//	//class안의 class 내부클래스
//	@Data
//	
//	public static class UserBuilder{
//		private String username;
//		private String password;
//		private String name;
//		private String email;
//		
//		public UserBuilder username(String username) {
//			this.username = username;
//			return this;
//		}
//		
//		public UserBuilder password(String password) {
//			this.password = password;
//			return this;
//		}
//		
//		public UserBuilder name(String name) {
//			this.name = name;
//			return this;
//		}
//		
//		public UserBuilder email(String email) {
//			this.email = email;
//			return this;
//		}
//		
//		public User build() {
//			return new User(username, password, name, email);
//		}
//		
//	}
	
}
