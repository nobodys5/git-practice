package Practice.pr01;

public class Practice3 {

	public static void main(String[] args) {

//		//continue를 사용하여 1부터 129까지의 수중 홀수의합을 구하시오
//		int sum = 0;
//		for(int i = 0; i < 129; i++) {
//			int j = i + 1;
//			if(j % 2 == 0) {
//				
//				continue;
//				
//			}
//			sum += j;
//		}
//		System.out.println("홀수의 합" + sum);
		
		
		
		//while문 풀이
		int i = 0;
		int sum2 = 0;
		while(i < 129) {
			int j = i + 1;
			if(j % 2 == 0) {
				i++;
				continue;
			}
			sum2 += j;
			i++;
		}
		System.out.println(sum2);
	}

}
