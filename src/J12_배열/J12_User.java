package J12_배열;

// 정보를 담는 객체 Entity 객체. main 실행을 담당하는 서비스 객체
public class J12_User {	
	private String username;	//사용자이름(ID)
	private String password;	//비밀번호
	private String name;		//성명
	private String email;		//이메일
	
	public J12_User() {	}		//ctrl + space
		
	//alt + shift + s
	public J12_User(String username, String password, String name, String email) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//toString Entity객체에 어떤 값이 들어갔는지 알수임.
	@Override
	public String toString() {
		return "J12_User [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email
				+ "]";
	}
	
	
	
}
