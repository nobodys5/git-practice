package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {

	
	
	public static User createUser() {
		
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(new String[] {"축구", "농구", "야구", "골프", "탁구"}));
		
		User user = User.builder()
				.username("gildong")
				.userCode(0)
				.password("1234")
				.name("길동")
				.email("gildong@gamil.com")
				.address("부산광역시 진구")
				.phone("010-1234-5678")
				.hobby(list)
				.build();
		return user;
		// user 객체(내 정보) 만들고 리턴
	}
}
