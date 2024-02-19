package j20_예외처리;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int[] numArray = {1,2,3,4,5};
		
		for(int i = 0; i < numArray.length; i++) {
			try {
				//오류가 날수도있는 실행문
				System.out.println(numArray[i]);
				throw new NullPointerException();
			} catch (Exception e) {
				// 오류가 난뒤에 처리되는 실행문
				e.printStackTrace();
				System.out.println("배열 갯수 초과");
			} finally {
				System.out.println("무조건 실행");
			}
		}
		System.out.println("반복후");
	}
}
