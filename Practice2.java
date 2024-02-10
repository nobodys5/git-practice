package practice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException  {

		/*
		 * <인생네컷>
		 * 
		 * 1. 하루필름 (2인)
		 * 2. 포토그레이 (3인)
		 * 3. 항공필름 (4인)
		 * 원하는 인생네컷을 고르시오 : 1
		 * 인원수를 입력하시오 : 2 (3)
		 * 
		 * 하루필름을 선택하셨습니다.
		 * (인원을 초과하였습니다.)
		 * 
		 * 찰칵!
		 * (2초 대기)
		 * 찰칵!
		 * (2초 대기)
		 * 찰칵!
		 * (2초 대기)
		 * 찰칵!
		 * 
		 * 원하는 사진 수를 입력하시오(짝수만 입력가능): 4
		 * 
		 * 사진1 나왔습니다.
		 * 사진2 나왔습니다.
		 * 사진3 나왔습니다.
		 * 사진4 나왔습니다.
		 * 
		 * (올바르지 않은 입력입니다.)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("하루필름(2인)");
		System.out.println("포토그레이(3인)");
		System.out.println("항공필름(4인)");
		System.out.println();
		
		while(true) {
			int photo = 0;
			System.out.println("원하는 인생네컷을 고르시오");
			photo = sc.nextInt();
			
			if (photo == 1) {
				System.out.println("하루필름");
			} else if (photo == 2) {
				System.out.println("포토그레이");
			} else {
				System.out.println("항공필름");
			}
			
			int people = 0;
			System.out.println();
			System.out.println("인원수를 입력하시오");
			people = sc.nextInt();
			
			if(people == 1) {
				System.out.println("1명");
			} else if(people == 2) {
				System.out.println("2명");
			} else if(people == 3) {
				System.out.println("3명");
			} else {
				System.out.println("인원을 초과하였습니다.");
			}
			
			System.out.println("사진을 찍습니다.");
			int picture = 4;
			for(int i = 0; i < picture; i++) {
				System.out.println("찰칵");
				Thread.sleep(1000);
			}
			System.out.println();
			System.out.println("원하는 사진수를 입력하시오(짝수)");
			int photonum = 0; // 입력받을 변수 선언
			photonum = sc.nextInt(); // 입력받아야하는 변수를 스캐너로 입력받을 준비
			int num = 0; // while문 반복을 위한 조건 변수 선언
			// num이 photonum만큼 더해져야 하기때문에 아래와같이 조건을 작성
			// photonum이 입력을받은 정수에 숫자만큼 결과값이 실행되기때문임
			while(num < photonum) { 
				// num 의값이 0이기때문에 4를 입력받으면 num + 1이 결과값인
				// num 1, 2, 3, 4 까지 출력됨
				System.out.println("사진" + (num + 1) + "나왔습니다.");
				System.out.println();
				num++; // 후처리문 작성 입력숫자만큼 실행되야 하기때문에 num이 더해져야됨
				
			}
			System.out.println("올바르지 않은 선택입니다.\n");
			
		}
		
			
	}
	
}
