package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {

		// user에 입력한 값들을 호출
		User user = UserService.createUser();
		
		// gson 에 예쁘게 출력
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String userjson = gson.toJson(user);
		System.out.println(userjson);
		
		//주소를 확인할수없기 때문에 다시 객체로 바꿔준뒤 출력
		User userObj = gson.fromJson(userjson, User.class);
		System.out.println(userObj);
		System.out.println(userObj.getAddress());
	}

}
