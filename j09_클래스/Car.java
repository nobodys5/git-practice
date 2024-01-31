package j09_클래스;

import java.util.Scanner;

public class Car {
	Scanner scanner = new Scanner(System.in);
	/*
	 * Car클래스
	 * 변수
	 * company
	 * model
	 * color
	 * 
	 * 메소드
	 * showCarInfo()
	 * 		회사명 : OOO
	 * 		모델명 : OOO
	 * 		색상 : OOO
	 * 
	 * changeEngineOil()
	 * 교체 후 주행거리 : 8000
	 * 희망주입량(L) : 10
	 * 교체 한 후 9천 키로가 안되었으면.
	 * 9,000km 주행 후 교체 하십시오.
	 * 
	 * 교체 한후 9천 키로가 되었으면.
	 * 주입량을 주입합니다.
	 * * 희망주입량이 5L 이상일 시 최대 5L 만 주입
	 * 
	 * 2대
	 * 현대자동차
	 * 쏘나타
	 * 화이트
	 * 
	 * 기아
	 * k5
	 * 블랙
	 * 
	 */
	
	String company;
	String model;
	String color;
	
	int changekm;
	int wishL;
	
	/*
	 * 생성자의 특징
	 * 1.  주소값을 리턴한다.
	 * 2. 클래스명과 동일하다.
	 * * 기본생성자는 생략이 가능하다.
	 */
	Car() {
		
	}
	void showCarInfo() {
		System.out.println("회사명:" + company);
		System.out.println("모델명:" + model);
		System.out.println("색상:" +company);
	}
		
	void changeEngineOil() {
		System.out.println("교체 후 주행거리:");
		changekm = scanner.nextInt();
		scanner.nextLine();
		System.out.println("희망 주입량:");
		wishL = scanner.nextInt();
		
		System.out.println(changekm);
		System.out.println(wishL);
		
		if(changekm < 9000) {
			System.out.println("9,000km 주행 후 교체 하십시오");
		}else {
			if(wishL > 5) {
				System.out.println("5L 초과시 엔진손상될수 있음");
			}
			System.out.println(wishL +"L 를 교체합니다.");
			System.out.println("희망주입량이 5L 이상일 시 최대 5L만 주입");
		}
		
		
	}
	
	
	
}
