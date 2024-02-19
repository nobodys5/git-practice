package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Gson4 {

	public static void main(String[] args) {
		
		Gson gson = new GsonBuilder().serializeNulls().create();
		
		//Map 객체없이 Json 사용하는방법
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "홍길동");
		jsonObject.addProperty("address", "부산광역시 진구");
		jsonObject.addProperty("phone", "010-3300-4698");
		
		String json = gson.toJson(jsonObject);
		
		System.out.println(json);
		
		JsonObject jsonObject2 = gson.fromJson(json, JsonObject.class);
		System.out.println(jsonObject2);
		
		System.out.println();
		User user = UserService.createUser();
		String userjson = gson.toJson(user);
		System.out.println(userjson);
	}

}
