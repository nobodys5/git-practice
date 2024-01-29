package j07_반복;

public class Continue1 {
	public static void main(String[] args) {

		// 0부터 9까지 출력하는 반복문 작성
		
		
//		for(int i = 0; i < 10; i++) {
//			if(i % 2 == 0) {
//				System.out.println("continue 전");
//				continue;
//			//	System.out.println("continue 후"); continue 뒤에코드는 출력되지않아서 에러뜸
//			}
//			System.out.println(i);
//		}
//		
//		System.out.println();
//		
		// continue를 사용하여 1부터 129 까지의 수 중 홀수의 합을 구하시오
//		int total = 0;
//		
//		for(int i = 0; i < 129; i++) {
//			int j = i + 1;
//			if(j % 2 == 0  ) {
//				continue;
//			}
//			total += j;
//			//System.out.println(j);
//		}
//		System.out.println("홀수의 합:" + total);
		
		
		int i = 0;
		int total2 = 0;
		while(i < 129) {
			int j = i + 1;
			if(j % 2 == 0) {
				i++;
				continue;
			}
			total2 += j;
//			System.out.println(j);
			i++;
		}
		System.out.println("홀수의 합:" + total2);
	}

}
