package j08_메소드;

import java.util.Scanner;

public class Method4 {

	/*
	 * 설문
	 * 이름 : 홍길동
	 * 나이 : 18
	 * 
	 *  이름은 홍길동이고 나이는 18세 입니다.
	 *  
	 *  이름 : 홍길동
	 *  나이 : 엔터
	 *  이름은 홍길동입니다.
	 *  나이는 미입력입니다.
	 *  
	 *  이름 : 엔터
	 *  나이 : 20
	 *  나이는 20세입니다.
	 *  이름은 미입력입니다.
	 *  *오버로딩 무조건 사용하여 푸시오.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = null;
		String age = null;
		
		System.out.println("이름:");
		name = scanner.nextLine();
		System.out.println("나이:");
		age = scanner.nextLine();
		
		if(name.equals("") && age.equals("")) {
			//함수 1 호출
		} else if (name.equals("") || age.equals("")) {
			if(name.equals("")) {
				surveyNameAge2 (age);
			}else {
				surveyNameAge2 (age);
			}
			
		} else {
			surveyNameAge3();
		}
		
	
	}

	public static void surveyNameAge(String name, String age) {
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는" + age + "입니다.");
	}
	
	public static void surveyNameAge2(String nameAge) {
		if(nameAge.length() == 3) {
			System.out.println("이름은 " + nameAge + "입니다.");
			System.out.println("나이는 미입력입니다.");
			
		}else if(nameAge.length() == 1 || nameAge.length() == 2) {
			
			System.out.println("이름은 미입력입니다.");
			System.out.println("나이는 " + nameAge + "입니다.");
		}
	}
		public static void surveyNameAge3() {
			
			System.out.println("이름은 미입력입니다.");
			System.out.println("나이는 미입력입니다.");
		
	}
	
}
