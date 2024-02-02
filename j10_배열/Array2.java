package j10_배열;

public class Array2 {
// int[] a = new int[0]; 1번
//	int [] a = new int[] {...};2 번
//	int[] a = {...}3번
	public static void main(String[] args) {
		//배열 값 주입 1
		int[] numbers = new int[10];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		numbers[5] = 6;
		numbers[6] = 7;
		numbers[7] = 8;
		numbers[8] = 9;
		numbers[9] = 10;
		
		//배열 값 주입2
		int[] numbers2 = new int[] {1,2,3,4,5};
		
		
		// 배열 값 주입3
		int[] numbers3 = {5,4,3,2,1};
		
		for(int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}// 만약에 length를 출력하게되면 길이값만큼 모두출력되서 5개길이인 5만출력됨
		for(int i = 0; i < numbers3.length; i++) {
			System.out.println(numbers3[i]);
		}
		
		
	}

}