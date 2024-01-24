package practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("사용자의 이름은");
	String name = scanner.next();
	System.out.println("이고");
	
	System.out.print("나이는");
	int age = scanner.nextInt();
	System.out.println("세 입니다.");
	
	System.out.print("주소는");
	String address = scanner.nextLine();
	System.out.println("부산 진구 가야동 입니다.");
	
	System.out.print("연락처는");
	String phone = scanner.next();
	System.out.println("입니다.");
	
	
	}
}
