package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		//key, value를 가지고 배열을 만듦.
		Map<String, Object> dataMap = new HashMap<>();
		//object로 key는 객체, object는 list object를 쓴이유: 자유롭게 값을 담기 위해서.
		dataMap.put("username", "aaa");
		dataMap.put("password", "bbb");
		dataMap.put("name", "김준일");
		dataMap.put("email", "aaa@gmail.com");
		
		List<String> hobby = new ArrayList<>();
		hobby.add("골프");
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("음악감상");
	
		dataMap.put("hobbys", hobby);
		
		System.out.println(dataMap);
		
		//list로 다운캐스팅해서씀.
		List<String> list = (List<String>)dataMap.get("hobbys");//object로 인해 업캐스팅되어있는 value값을 다운캐스팅해서 꺼냄
		System.out.println(list.get(0));
	}
	
	
}
