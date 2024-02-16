package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {

	public static void main(String[] args) {

		// Gson 객체 생성하는 방법
		
		//1) Gson() 생성자를 통해 생성
		Gson gson1 = new Gson();
		
		//2) GsonBuilder() 생성자를 통해 생성
		Gson gson2 = new GsonBuilder().create();
		
		//3) GsonBuilder()를 통해 예쁘게 출력
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("username", "gildong");
		map.put("password", "1234");
		map.put("name", "길동");
		map.put("email", "gildong@gmail.com");
		
		String json1 = gson1.toJson(map);
		System.out.println(json1);
		System.out.println();
		String json2 = gson2.toJson(map);
		System.out.println(json2);
		System.out.println();
		String json3 = gson3.toJson(map);
		System.out.println(json3);
	}

}
