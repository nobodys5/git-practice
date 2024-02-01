package Practice.pr01;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("빵종류를 선택하세요");
		int bread = 0;
		bread = scanner.nextInt();
//		System.out.println("플랫화이트");
//		System.out.println("허니");
//		System.out.println("오트");
//		System.out.println("파마산오레가노");
		
		while(true) {
			if(bread == 1) {
				System.out.println("플랫화이트");
			} else if(bread == 2) {
				System.out.println("허니");
			} else if(bread == 3) {
				System.out.println("오트");
				
			} else {
				System.out.println("파마산오레가노");
			}
			
			
			break;
			
		}
		
		
		System.out.println("치즈를 선택하세요");
		int cheeze = 0;
		cheeze = scanner.nextInt();
		switch(cheeze) {
		case 1:
			System.out.println("모짜렐라");
			break;
		case 2:
			System.out.println("아메리칸 슈레드");
			break;
		}
		
		System.out.println("빵을 구워드릴까요?");
		int tosting = 0;
		tosting = scanner.nextInt();
		String result;
		
		result = tosting > 0 ? "O" :"X";
				System.out.println(result);
				
				
			System.out.println("야채를 선택해주세요");
		int fresh = 0;
		fresh = scanner.nextInt();
		String result2;
		result2 = fresh == 1 ? "양상추를 넣어주세요" 
				: fresh == 2 ? "양파를 넣어주세요" 
				: fresh == 3 ? "피클을 넣어주세요"
				: "야채를 빼주세요";		
				
			System.out.println(result2);
		
			System.out.println();
		
		
		/*
		 * 서브웨이(결제api)
		 * 1. 빵(플랫화이트, 허니,오트, 파마산오레가노)
		 * 2. 치즈(모짜렐라,아메리칸 슈레드)
		 * 3. 토스팅(O/X)
		 * 4. 야채(뺄거)
		 * 5. 소스(1.렌치,2. 어니언, 3. 후추)
		 * 6. 세트/ 단품
		 * 
		 * 플랫화이트 모짜렐라 토스팅 된 어떤 소스의 세트를 주문 받습니다.
		 */

	}

}
