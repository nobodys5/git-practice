package j07_반복.랜덤;

import java.util.Random;

public class Random2 {
	public static void main(String[] args) {
		Random random = new Random();
		int rNum = random.nextInt(5); // 0부터 안의 숫자 전까지 랜덤으로 나옴
		System.out.println(rNum);
		
		int count = 0;
		while(true) {
			int rNum2 = (int)(Math.random() * 100);
			if(rNum2 < 46) {
				System.out.println("번호" + rNum2);
				count++;
			}
			if(count == 6) break;
		}
		System.out.println("추천끝");
	}

}
