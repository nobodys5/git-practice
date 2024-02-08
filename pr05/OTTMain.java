package Practice.pr05;

import java.util.Scanner;

public class OTTMain {

	
	private static String ott;


	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("아이디를 입력해주세요");
	ott = sc.nextLine();
	
	System.out.println();
	System.out.println("비밀번호를 입력해주세요");
	ott = sc.nextLine();
	System.out.println();
	System.out.println("영화제목을 검색해주세요");
	ott = sc.nextLine();
	
		OTT ott = new Netflix();
		OTT ott2 = new Tving();
		OTT ott3 = new Watcha();
		
		OTT[] ott4 = new OTT[3];
		ott4[0] = ott;
		ott4[1] = ott2;
		ott4[2] = ott3;
		
		
		for(int i = 0; i < ott4.length; i++) {
			ott4[i].animation();
			
			
		}
		
		OTTMiddleware ottMiddleware = new OTTMiddleware(ott);
		ott.signin();
		ott.password();
		ott.movietitle();
		ott.drama();
		ott.animation();
		ott.movie();
		
		ott2.animation();
		
		ottMiddleware.option();
		
	}

}