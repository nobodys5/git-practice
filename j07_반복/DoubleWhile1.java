package j07_반복;

public class DoubleWhile1 {
	public static void main(String[] args) {
		/*
		 * 2단
		 * 2 x 1 = 2
		 */
		int i = 0;
		while(i < 5) {
			System.out.println("i: " + i);
			int j = 0;
			while(j < 3) {
				System.out.println("\tj:" +j);
				if(j == 1) {
					System.out.println("j 는 1이다.");
					break; // break는 멈추고 하나만 빠져나감
				}
				j++;
			}
			i++;
		}
	}

}
