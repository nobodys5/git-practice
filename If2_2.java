package j06_조건;

import java.util.Scanner;

public class If2_2 {
	public static void main(String[] args) {
		/*
		 *  학점 판독기
		 *  점수(score)
		 *  
		 *  점수가 89점 초과 -> A학점 입니다.
		 *  점수가 79점 초과 -> B학점 입니다.
		 *  점수가 69점 초과 -> C학점 입니다.
		 *  점수가 59점 초과 -> D학점 입니다.
		 *  점수가 59점 이하 -> F학점 입니다.
		 *  * 점수가 0점 이하이거나 100점 초과이면 -> 계산불가 입니다.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		
		int score;
		String result;
		score = scanner.nextInt();
		if (score < 0 || score > 100) {
			result = "계산불가";
		} else {
			if (score > 89) {
				System.out.println("A학점 입니다.");

			} else {
				if (score > 79) {
					System.out.println("B학점 입니다.");
				} else {
					if (score > 69) {
						System.out.println("C학점 입니다.");
					} else {
						if (score > 59) {
							System.out.println("D학점 입니다.");
						} else {
							if (score < 59) {
								System.out.println("F학점 입니다.");
							} else {

							}
						}
					}
				}
			}

		}
	}
}
