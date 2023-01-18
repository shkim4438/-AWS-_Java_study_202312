package j19_컬렉션;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class MapStringMain {
	
	public static void main(String[] args) {
		Map<String, String> strMap = new HashMap<>();
		
		strMap.put("이순심", "a");
		strMap.put("이제동", "b");
		strMap.put("이영호", "c");
		strMap.put("이영웅", "d");
		
		System.out.println(strMap);
		
		System.out.println(strMap.get("a"));
		System.out.println(strMap.get("e"));
		
		//map은 for i문과 foreach문으로 꺼낼수없음. entrySet() (key와 value의 합친 값을 entry라함.)
		//or keySet()키를 셋으로 바꿈. 이렇게 두개가능.
		for(String k : strMap.keySet()) {
			System.out.println(strMap.get(k));
			System.out.println(k);
		}
		for(String v : strMap.values()) {
			System.out.println("value: " + v);
		}
		
//		System.out.println(strMap.entrySet());
//		Set<Entry<String, String>> s = null;		
		for(Entry<String, String> entry : strMap.entrySet()) {
			System.out.println(entry);
			System.out.println("key:" + entry.getKey());
			System.out.println("value:" + entry.getValue());
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		//lamda식을으로 키와 벨류값을 하나씩 빼는방법
		strMap.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
		
	}
}
