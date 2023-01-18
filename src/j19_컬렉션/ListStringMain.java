package j19_컬렉션;

import java.util.ArrayList;

public class ListStringMain {
	
	public static void main(String[] args) {
		String[] strArray = new String[] {"java", "python", "C++"};
		
		String[] newStrArray = new String[strArray.length + 1];
		
		for(int i = 0; i < strArray.length; i++) {
			newStrArray[i] = strArray[i];
		}
		newStrArray[strArray.length] = "html";
		
		System.out.println("[]");
		for(String str : strArray) {
			System.out.println(str);
		}
		System.out.println();
		
		System.out.println("[newStrArray]");
		for(String str : newStrArray) {
			System.out.println(str);
		}
		System.out.println();
		////////////////////////////////////////////////////////////////////
		
		new ArrayList<>().add("test"); 
		//자료형과 변수를 잡아 준것이 아니라 출력이 불가능해지고 다른 클래스 즉 공간에서 add되어준것임.
		ArrayList<String> strList = new ArrayList<>();
		//앞에서 String이 잡혀있어 생성자에 블랭크가능 단, 와이드카드는 object타이이되어 잡는것이 애매해짐
		//((ArrayList<String>)strList).add(java)로 다운캐스팅하여 써야한다.
		strList.add("java");
		strList.add("python");
		strList.add("python");
		strList.add("python");
		strList.add("python");
		strList.remove("java"); //add에서 하나 빼줌.
		strList.add(1, "java");
		strList.remove(1);//remove로 인덱스를 지울 수 있음.
		
//		System.out.println(strList);
		
		for(int i = 0; i < strList.size(); i++) {//list는 배열과 달리 길이가 없어 length대신 size를 씀.
			//넣는 만큼 생성이됨
			System.out.print("[" + i + "]: ");
			System.out.println(strList.get(i));
		}//컬렉션은 리스트를 잘활용 할 수 있겠끔 
		
		for(String str : strList) {
			System.out.println(str);
		}
	}
}
