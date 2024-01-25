package j07_반복;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * 입장인원 : 7
		 * 
		 * 익명1이 입장하셨습니다.
		 * 익명2이 입장하셨습니다.
		 * 익명3이 입장하셨습니다.
		 * 익명4이 입장하셨습니다.
		 * 익명5이 입장하셨습니다.
		 * 익명6이 입장하셨습니다.
		 * 익명7이 입장하셨습니다.
		 */
		Scanner scanner = new Scanner(System.in);
		int people;
		System.out.println("입장인원:");
		people = scanner.nextInt();
		
		int num = 0;
		while(num < people ) { // 반복 횟수를 적고 그 이후에 변수에 대해 맞춰줌
			System.out.println("익명" + (num +1) + "이 입장하셨습니다");
			num++;
			
		}
		Thread.sleep(1000);
		System.out.println();
		System.out.println("익명7이 퇴장했습니다.1");
		
		int num2 = 0;
		while(num2 < people) {
			System.out.println("익명" + (people - num2) + "이 퇴장하셨습니다");
			num2++;
		}
	}

}
