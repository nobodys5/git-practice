package j07_반복.랜덤;

public class Random1 {
	public static void main(String[] args) {

//		System.out.println(Math.random());
		
		/*
		 * 반복문을 통하여 로또 번호 7개 출력
		 * 1~45
		 * 
		 */
		int i = 0;
		
		while(i < 5) {
			double rNum = Math.random();
			System.out.println((int)(rNum * 100));
			i++;
		}
		
		
	}

}
