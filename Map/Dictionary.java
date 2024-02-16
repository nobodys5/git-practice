package Practice.pr11.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {

		/*
		 * 축구(soccer)
		 * 야구(baseball)
		 * 농구(basketball)
		 * 골프(golf)
		 * 
		 * 
		 * 
		 * [사전]
		 * 1. 검색기능(종료 q)
		 * 2. 추가기능(종료 q)
		 * 3. 전체 조회
		 * # 프로그램 종료(exit)
		 * 
		 * 1.선택
		 * 검색어: 축구
		 * soccer
		 * 
		 * 검색어: 농구
		 * basketball
		 * q
		 * 
		 * 2.선택
		 * 한글: 볼링
		 * 영어: bowling
		 * 
		 * 한글: 배구
		 * 영어: volleyball
		 * q
		 * 
		 * [사전]
		 * 1. 검색기능(종료 q)
		 * 2. 추가기능(종료 q)
		 * 3. 전체 조회
		 * # 프로그램 종료(exit)
		 * 
		 * 3.선택
		 * 축구(soccer)
		 * 야구(baseball)
		 * 농구(basketball)
		 * 골프(golf)
		 * 볼링(bowling)
		 * 배구(volleyball)
		 */
		
		Scanner scanner = new Scanner(System.in);
		String select = null;
		
		
		
		HashMap<String, String> strMap = new HashMap<String, String>();
		
		strMap.put("축구", "soccer");
		strMap.put("야구", "baseball");
		strMap.put("농구", "basketball");
		strMap.put("골프", "golf");
		strMap.put("볼링", "bowling");
		strMap.put("배구", "volleyball");
		Iterator<String> irKey = strMap.keySet().iterator();
		
		String searchText = null;
		
		while(true) {
			System.out.println("사전");
			System.out.println("1. 검색기능(종료q)");
			System.out.println("2. 추가기능(종료q)");
			System.out.println("3. 전체조회");
			System.out.println("# 프로그램 종료");
			System.out.println("입력");
			select = scanner.nextLine();
			
			//String 스캐너변수 선언하였기때문에 주소참조사용
			if(select.equals("1")) {
				while(true) {
					
					System.out.println("검색어:");
					searchText = scanner.nextLine();
					
					if(searchText.equals("q"))break;
					// strMap변수명.get을 주소참조하여 searchText에 key값들을 입력하면 값과 같이 출력된다.
					System.out.println(strMap.get(searchText));
				}
			
			}else if(select.equals("2")) {
				String plusText = null;
				String plusEnglish = null;
				while(true) {
					System.out.println("한글:");
					plusText = scanner.nextLine();
					
					if(plusText.equals("q")) break;
					System.out.println("영어:" );
					plusEnglish = scanner.nextLine();
					
					//한글과 영어를 출력하면 strMap에 key와 value값이 추가된다.
					strMap.put(plusText, plusEnglish);
				
			}
			System.out.println(strMap);
			
		}else if(select.equals("3")) {
			for(String key : strMap.keySet()) {
				//key만 출력하게되면 strMap.ketset에 있는 key값만 출력된다
				//그래서 아래와 같이 strMap.get(key)를하여 key와 값을 같이 출력하게한다.
				System.out.println(key + strMap.get(key)
				);
			}
			//else를 사용하여 바로 종료시킬수도있지만
			// exit를 입력해야하기 때문에 아래와 같이 else if로 조건식 사용
		}else if (select.equals("exit")) {
			break;
		}
			
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
