package usermanagement.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.mindrot.jbcrypt.BCrypt;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import usermanagement.entity.User;
import usermanagement.repository.UserRepository;

public class UserService {
	
	private UserRepository userRepository;
	private Gson gson;
	
	private static UserService instance;
	
	public static UserService getInstance() {
		if(instance == null) {
			instance = new UserService();
		}
		return instance;
	}
	
	private UserService() {
		userRepository = UserRepository.getInstance();
		gson = new GsonBuilder().setPrettyPrinting().create();//맴버변수에 선언이된 변수를 지역변수에 생성할땐 자료형없이 쓴다.
	}
	
	public Map<String, String> register(String userJson) {
			//response: 응답
		Map<String, String> response = new HashMap<>();
		
		Map<String, String> userMap = gson.fromJson(userJson, Map.class);
		for(Map.Entry<String, String> userEntry : userMap.entrySet()) {//Entry는 하나의 키와 벨류값을 묶어 이루는말.
			//맴을 엔트리에 꺼내었을때 유저네임의 벨류는 빈값인데 스페이스바를 공백으로 볼것인가?를 isBlank가 공백으로 여긴다는 명령.
			if(userEntry.getValue().isBlank()) {
				response.put("error", userEntry.getKey() + "은(는) 공백일 수 없습니다.");
				return response;
			}
		}
		
		User user = gson.fromJson(userJson, User.class);
		System.out.println("서비스에 넘어옴! User 객체로 변환");
		System.out.println(user);
		
		if(duplicatedUsername(user.getUsername())) {
			response.put("error", "이미 사용중인 사용자 이름입니다.");
			return response;
		}
		
		if(duplicatedEmail(user.getEmail())) {
			response.put("error", "이미 가입된 이메일 입니다.");
			return response;
		}
		//BCrypt 암호화를 시킴
//		String pw = BCrypt.hashpw("1234", BCrypt.gensalt());
//		System.out.println(pw);
//		System.out.println(BCrypt.checkpw("1234", pw));
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
		System.out.println("암호화 후");
		System.out.println(user);
		
		userRepository.saveUser(user);
		
		response.put("ok", "회원가입 성공.");
		
		return response;
		
	}
	
	//duplicated: 중복확인
	private boolean duplicatedUsername(String username) {
		return userRepository.findUserByUsername(username) != null;
	}
	
	private boolean duplicatedEmail(String email) {
		return userRepository.findUserByEmail(email) != null;
	}
	
	private boolean isBlank(User user) {
		return true;
		
	}
	
}
