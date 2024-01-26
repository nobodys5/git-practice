package j07_반복.랜덤;

import java.util.Random;

public class Random3 {
	public static void main(String[] args) {
		Random random = new Random();
		int rNum2 = random.nextInt(5);
		System.out.println(rNum2);
		/*
		 * 1 ~ 45까지의 수 중 5개를 랜덤으로 뽑고 그중 가장 큰 수를 출력하시오
		 */
		int count = 0;
		int maxNum = 0;
		while(count < 5) {
			
			int rNum = random.nextInt(45);
			int tempNum = maxNum + 1;
				System.out.println("번호" + rNum);
				if(count == 0) {
					maxNum = tempNum;
					
			} else {
				if(maxNum < tempNum) {
					maxNum = tempNum;
				}
			}
				count++;
			
		}
		System.out.println("최댓값:	" + maxNum);
	}

}
