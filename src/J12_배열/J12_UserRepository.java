package J12_배열;

//저장소
public class J12_UserRepository {
	
	private J12_User[] userTable;
	
	//전체생성자
	public J12_UserRepository(J12_User[] userTable) {
		extendArrayOne();
		this.userTable = userTable;
	}
	
	public J12_User[] getUserTable() {
		return userTable;
	}
	
	private void saveUser(J12_User user) {
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
	
}
