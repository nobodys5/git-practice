package j05_입력;

import java.util.Scanner;

public class Input4 {
	public static void main(String[] args) {
		//replace : 문자 반환
		//replaceAll : 문자열 반환

			Scanner scanner = new Scanner(System.in);
			
			String name;
			int age;
			String address;
			String phone;
			
			System.out.print("사용자의 이름은");
			name = scanner.next();
			System.out.println("이고");
			
			System.out.print("나이는");
			age = scanner.nextInt();
			System.out.println("세 입니다.");
			
			System.out.print("주소는");
			scanner.nextLine();
			address = scanner.nextLine();
			System.out.println("입니다.");
			
			System.out.print("연락처는");
			phone = scanner.next();
			System.out.println("입니다.");
			
			
			}
		
		/*
		 * <자기소개 프로그램>
		 * 이름 : 홍길동	next()		name	
		 * 나이 : 18		nextint()	age
		 * 주소 : 부산 진구 가야동	nextLine()	address
		 * 연락처 : 010-3300-4698	next()	phone
		 * 
		 * 
		 * 출력
		 * 사용자의 이름은 홍길동이고 나이는 18세입니다.
		 * 주소는 부산 진구 가야동입니다.
		 * 연락처는 010-3300-4698입니다.
		 */
		
		
	

}
