package Practice.pr01;

public class Practice2 {

	public static void main(String[] args) {

		/*
		 * 0부터 9까지 출력하는 반복문 작성
		 * 
		 * 짝수0
		 * 1
		 * 
		 * 짝수2
		 * 3
		 * 짝수4
		 */
	for(int i = 0; i < 10; i++) {
		if(i % 2 == 0) { // if문을 사용하여 2의 배수를 조건으로 설정하여 조건식 작성
			
			continue;// continue를 사용하면 continue 전까지만 실행 
			// ,다시 위로올라가서 위에서부터 조건을 실행 한뒤 무한반복
		}
		System.out.println(i);
	}
	}

}
