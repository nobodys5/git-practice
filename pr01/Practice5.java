package Practice.pr01;

public class Practice5 {

	// 메인 메소드 안에서는 메소드 작성 불가
	// 반환도 없고 매개변수도없는 메소드
	public static void test1() {
		System.out.println("test 메소드 호출");
	}
	
	// 반환도 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("num" + num);
		System.out.println("test2 메소드 호출");
	}
	
		// 반환도 없고 매개변수가 두개인 메소드
		public static void test3(String num1, int num2) {
			System.out.println("num" + num1);
			System.out.println("num" + num2);
			System.out.println("test2 메소드 호출");
	}
		public static int test4() {
			System.out.println("test4 메소드 호출");
			return 100;
		}
		public static boolean test5(int num) {
			System.out.println("num" + 	num);
			return true;
		}
		
	public static void main(String[] args) {
		//메소드 종류
		
		//반환(리턴)도 없고 매개변수도 없는 메소드
		test1();
		test2(100);
		test3("가",100);
		test4();
		System.out.println();
		System.out.println(test5(100));
	}

}
