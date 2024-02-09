package practice;



import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("추첨을 통해서 10%할인 이벤트중입니다.");
		System.out.println();
		
		
		int count = 0;
		count = scanner.nextInt();
		while(true) {
			int rNum = (int)(Math.random() * 100);
				System.out.println("번호" + rNum);
				count++;
			
			if(count == 10) break;
		
				
		
		}
		System.out.println("당첨되신 분들 축하드립니다.");
		System.out.println();
		
		while(true) {
			System.out.println("빵종류를 선택하세요");
			int bread = 0;
			bread = scanner.nextInt();
			
			if(bread == 1) {
				System.out.println("플랫화이트");
			} else if(bread == 2) {
				System.out.println("허니");
			} else if(bread == 3) {
				System.out.println("오트");
				
			} else {
				System.out.println("파마산오레가노");
				
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
			result2 = fresh == 1 ? "양상추" 
					: fresh == 2 ? "양파" 
							: fresh == 3 ? "피클"
									: "야채를 빼주세요";		
			
			System.out.println(result2);
			System.out.println();
			
			System.out.println("세트메뉴와 단품 메뉴중에 선택해주세요");
			int setMenu = 0;
			setMenu = scanner.nextInt();
			
				
				switch(setMenu) {
				case 1:
					System.out.println("불고기샌드위치 세트");
					System.out.println("9500원입니다.");
					break;
				case 2:
					System.out.println("새우샌드위치 세트");
					System.out.println("9000원입니다.");
					break;
				case 3:
					System.out.println("치킨샌드위치 세트");
					System.out.println("8500원입니다.");
					break;
				case 4:
					System.out.println("불고기샌드위치");
					System.out.println("3500원입니다.");
					break;
				case 5:
					System.out.println("새우샌드위치");
					System.out.println("4500원입니다.");
					break;
				case 6:
					System.out.println("치킨샌드위치");
					System.out.println("4000원입니다.");
					
					
				}
				System.out.println("주문이 완료되었습니다.");
				System.out.println();
			}
	
			
			
			
			
			
		}
		
}
