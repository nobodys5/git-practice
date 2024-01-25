package j07_반복;

import java.util.Scanner;

public class Kiosk {
	public static void main(String[] args) {
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
		
		
		Scanner scanner = new Scanner(System.in);
		int PictureNumber;
		PictureNumber = scanner.nextInt();
		PictureNumber = 0;
		System.out.println("원하는 인생네컷을 고르시오");
		
		while(PictureNumber > 0) {
		switch (PictureNumber) {
		case 2: 
			System.out.println("하루필름");
		case 3:
			System.out.println("포토그레이");
		case 4:
			System.out.println("항공필름");
			default:
				System.out.println("올바르지 않은 입력입니다.");
		}
			
		}
			
		
			
		
		
	}

}
