package j06_조건;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		/*
		 *  사분면
		 *  
		 *  x값을 입력하시오 : 3
		 *  y값을 입력하시오 : -2
		 *  *x 또는  y중에 하나라도 0이 있으면 4사분면으로 보내시오
		 *  출력
		 *  x : 3
		 *  y : -2
		 *  결과 : 4사분면입니다.
		 */
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		String result = null;
		System.out.println("x값을 입력하시오:");
		x = scanner.nextInt();
		System.out.println("y값을 입력하시오:");
		y = scanner.nextInt();
		
		if(x > 0 && y > 0) {
			result = "1";
		} else if (x < 0 && y > 0) {
			result = "2";
		} else if (x < 0 && y < 0) {
			result = "3";
		} else {
			result = "4";
		}
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println(result + "사분면입니다.");
	}

}
