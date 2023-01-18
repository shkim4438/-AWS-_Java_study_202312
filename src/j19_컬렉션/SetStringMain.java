package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetStringMain {
	
	public static void main(String[] args) {
		Set<String> setStr = new HashSet<>();
		List<String> listStr = new ArrayList<>();
		
		listStr.add("임땡땡");
		listStr.add("이기철");
		listStr.add("임땡땡");
		listStr.add("임땡땡");
		
		System.out.println(listStr);
		
		setStr.add("김상현");
		setStr.add("이상민");
		setStr.add("이호철");
		setStr.add("김진호");
		setStr.add("김진호");//add값이 중복이된다해도 값의 출력은 오로지 하나만
		setStr.addAll(listStr);//list또한 set에다 넣을 수 있음. 이또한 list의 중복을 제거함.
		
		System.out.println(setStr);
		String searchName = "이상민";
		
		for(String name : setStr) {
			if(name.equals(searchName)) {
				System.out.println(name);
			}
			//get을 쓸수없어서 직접 foreach문으로 찾고자하는 값을 꺼냄.
			
			Iterator<String> iterator = setStr.iterator();
			while(iterator.hasNext()) {
				String n = iterator.next();
				if(n.equals(searchName)) {
					System.out.println(n);
				}
			}
		}
	}
	
}
