package Practice.pr11.Map;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {

	public static void main(String[] args) {

		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		// key코드는 중복이 안되고 값만 중복가능하다
		// 똑같은 값은 중복안됨
		// 값은 값이 제일큰값만 요소에 추가됨 예)) 같은 key코드 일때java1,java2,java3 이면 java3만 출력됨
		strMap.put(1, "java");
		strMap.put(1, "java");
		strMap.put(1, "java");
		strMap.put(1, "java");
		strMap.put(1, "java");
		
		//각자 다른키에 각자 다른값을 입력하면 요소 추가됨
		strMap.put(10, "java2");
		strMap.put(100, "java3");


		//Map에있는 key코드만 출력됨
		System.out.println(strMap.keySet());
		
		// 아이터레이터로 Map에 key들을 정렬한다.
		Iterator<Integer>irkey = strMap.keySet().iterator();
		
		//while반복문을 통해 요소에 값들을 확인가능
		while(irkey.hasNext()) {
			System.out.println(strMap.get(irkey.next()));
		}
		
				//키값중에 해당하는 key값이 있는지 확인
				//10은 key가 존재하기 때문에 true 20은 존재하지않으므로 false
				System.out.println(strMap.containsKey(10));
				System.out.println(strMap.containsKey(20));
				
				//value값중에 해당하는 value값이 있는지 확인
				// java3는 존재하기 때문에 true java7은 존재하지않으므로 false
				System.out.println(strMap.containsValue("java3"));
				System.out.println(strMap.containsValue("java7"));
	}

}
