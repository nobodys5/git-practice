package j17_컬렉션.HashMap;

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
		strMap.put("soccer", "축구");
		strMap.put("baseball", "야구");
		strMap.put("basketball", "농구");
		strMap.put("golf", "골프");
		strMap.put("bowling", "볼링");
		strMap.put("volleyball", "배구");
		
		Iterator<String> irKey = strMap.keySet().iterator();
		
		
		System.out.println(strMap);
		
		
		
		
		while(true) {
			System.out.println("사전");
			System.out.println("1. 검색기능(종료q)");
			System.out.println("2. 추가기능(종료q)");
			System.out.println("3. 전체 조회");
			System.out.println("#프로그램 종료(exit)");
			System.out.println("입력:");
			select = scanner.nextLine();
			
			
			if(select.equals("1")) {
				
				String searchText = null;
				while(true) {
					System.out.println("검색어:");
					searchText = scanner.nextLine();
					
					if(searchText.equals("q")) break;
						
					
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
					
					strMap.put(plusText, plusEnglish);
			}
//				System.out.println(strMap);
			}else if(select.equals("3")) {
				
				for(String key : strMap.keySet()) {
					System.out.println(key + "("+ strMap.get(key) + ")");
				}
				
			}else if(select.equals("exit")) {
				break;
			}
		}
			System.out.println("프로그램이 종료되었습니다.");
				
			
			
			
			
				
			
			
			
			
		
	}

}
