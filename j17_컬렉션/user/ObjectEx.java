package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectEx {

	public static void main(String[] args) {

		/*
		 * {중괄호는 map 이고 [대괄호는 ArrayList이다
		 * {apple=[사과, apple회사, 동그랗고 빨간 과일]}
		 */
		Map<String, Object> map = new HashMap<String, Object>();
		// 1. ArrayList string 으로 생성
		List<String> strList = new ArrayList<String>();
		
		// 2. ArrayList에 요소 추가
		strList.add("사과");
		strList.add("apple회사");
		strList.add("동그랗고 빨간 과일");
		
		map.put("apple", strList);
		
		System.out.println(map);
	}

}
