package j07_반복;

public class For3 {
	public static void main(String[] args) {

		/*
		 * str = abcdefghijk
		 * 반복문을 돌려 출력
		 */
		String str = "abcdefghijk";
		
		for(int i = 0; i < 11; i++) {
			String subStr = str.substring(i, i + 1);
			System.out.println(subStr);
		}
		
			
			
			
		
	}

}
