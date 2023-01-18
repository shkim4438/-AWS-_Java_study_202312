package J12_배열;

//저장소
public class J12_UserRepository {
	
	private J12_User[] userTable;
	
	//전체생성자
	public J12_UserRepository(J12_User[] userTable) {
		
		this.userTable = userTable;
	}
	
	public J12_User[] getUserTable() {
		return userTable;
	}
	
	public void saveUser(J12_User user) {
		extendArrayOne();
		userTable[userTable.length - 1] = user;
	}
	
	private void extendArray(int length) {
		J12_User[] newArray = new J12_User[userTable.length + length];
		transferDataToNewArray(userTable, newArray);
		userTable = newArray;
	}
	
	private void extendArrayOne() {
		J12_User[] newArray = new J12_User[userTable.length + 1];
		transferDataToNewArray(userTable, newArray);
		userTable = newArray;
	}
	
	private void transferDataToNewArray(J12_User[] oldArray, J12_User[] newArray) {
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] =oldArray[i];
		}
	}
	
	public J12_User findByUsername(String username) {
		
		J12_User user = null;
		
		for(J12_User u : userTable) {
			if(u == null) {
				continue;
			}
			if(u.getUsername().equals(username)) {
				user = u;
				break;
			}
		}
		
		return user;
	}
	
	/*
	 * 1. 사용자이름으로 회원 조회
	 * 
	 * 2. 회원 정보 수정
	 * 	1.비번 변경
	 * 	2.이름 변경
	 * 	3.이메일 변경
	 * 
	 * 	b.뒤로가기
	 */
	
}
