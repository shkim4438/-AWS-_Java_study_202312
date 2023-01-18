package j20_JSON;

import com.google.gson.Gson;

public class Json3 {
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		//내가 쓰고 싶은 기능을 쓰고 싶을때 객체를 생성을하는것.
		System.out.println(Integer.valueOf("100") + 50);
		System.out.println(Integer.parseInt("100") + 50);
		
		
		gson.toJson(null);				 //object 	-> 	json
		gson.fromJson("", Object.class);//json 		-> 	Object
	}
}
