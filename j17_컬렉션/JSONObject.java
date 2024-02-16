package j17_컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONObject {

	public static void main(String[] args) {

		/*
		 * {
		 * "no":1
		 * "message" : "1page list",
		 * "data" : [
		 * 				{
		 * 					"name"	: "홍길동",
		 * 					"주소" 	  : "부산광역시 서구",
		 * 					"연락처"	:	"010-1234-5678",
		 * 					"성별"		:	0
		 * 				},
		 * 				{
		 * 					"name"	: "홍길서",
		 * 					"주소" 	  : "부산광역시 진구",
		 * 					"연락처"	:	"010-1111-2222",
		 * 					"성별"		:	1
		 * 				}
		 * 			]
		 * 
		 * }					
		 */
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map3 = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		//생성된 map1,2에 아래와 같이 key값과 value 값 입력
		map2.put("name", "홍길동");
		map2.put("주소", "부산광역시 서구");
		map2.put("연락처", "010-1234-5678");
		map2.put("성별", 0);
		
		map.put("name", "홍길서");
		map.put("주소", "부산광역시 진구");
		map.put("연락처", "010-1111-2222");
		map.put("성별", 1);

		//ArrayList에 map에 입력한 요소들 추가
		list.add(map2);
		list.add(map);
		
		//제일 바깥쪽 map
		map3.put("no", 1);
		map3.put("message", "1page list");
		map3.put("data", list);
		
		System.out.println(map3);
		
		
		
		
	}

}
