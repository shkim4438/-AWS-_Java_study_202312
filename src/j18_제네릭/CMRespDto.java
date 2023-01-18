package j18_제네릭;
	
//Commit Message Response Data Transfer Object
//	클라가 서버에게 요청을 날리면 동일한 형식으로 응답해주는 응답 인터페이스.
public class CMRespDto<T> {
	
	private int code;
	private String message;
	private T data;//배열로도 가능함.
	
	public CMRespDto(int code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "CMRespDto [code=" + code + ", message=" + message + ", data=" + data + "]";
	}
	
	
	
}
