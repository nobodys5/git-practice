package j07_반복;

import java.util.Scanner;

public class Kiosk {
	public static void main(String[] args) throws Throwable {
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
		int select;
		int people;
		int photoCount;
		while(true) {
			
			while(true) {
				
				System.out.println("1. 하루필름 (2인)");
				System.out.println("2. 포토그레이 (3인)");
				System.out.println("3. 항공필름 (4인)");
				System.out.println("원하는 인생네컷을 고르시오: ");
				select = scanner.nextInt();
				System.out.println("인원수를 입력하시오: ");
				people = scanner.nextInt();
				
				System.out.println("select:" + select);
				System.out.println("people:" + people);
				
				if(select == 1 && people < 3) {
					System.out.println("하루필름이 선택되었습니다.");
					break;
				} else if(select == 1 && people > 2) {
					System.out.println("인원이 초과하였습니다.");
				} else if(select == 1 && people < 4) {
					System.out.println("포토그레이가 선택되었습니다.");
					break;
				} else if(select == 1 && people > 3) {
					System.out.println("인원이 초과 하였습니다.");
				} else if(select == 1 && people < 5) {
					System.out.println("항공필름이 선택되었습니다.");
					break;
				}else if(select == 1 && people > 4) {
					System.out.println("인원이 초과하였습니다.");
				}
			}
			
			int i = 0;
			while(i < 4) {
				System.out.println("찰칵");
				Thread.sleep(2000);
				i++;
			}
			
			System.out.println("원하는 사진 수를 입력하시오(짝수만 입력가능):");
			photoCount = scanner.nextInt();
			
			if(photoCount % 2 == 1) {
				System.out.println("올바르지 않은 입력입니다.");
			}else {
				int j = 0;
				while(j < photoCount) {
					System.out.println("사진" + (j + 1)+ "이 출력되었습니다.");
					j++;
				}
			}
			
		}
			
		
			
		
		
	}

}
