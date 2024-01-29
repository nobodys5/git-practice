package j08_메소드;

public class Method4 {

		public static void test1(String name) {
			System.out.println("이름 :" + name);
		}
		public static void test1(int age) {
			System.out.println("나이 : " + age);
			
		}
		public static void test1(String name, int age) {
		System.out.println("이름은"  +  name  +  "이고" + "나이는"  + age +  "세 "
				+ "입니다.");
		}
		
					public static void test2(String name2) {
						System.out.println("이름 :" + name2);
					}
						public static void test2( int age2) {
							System.out.println("나이 :" + "엔터");
							
						}
							public static void test2(String name2, int age2) {
								System.out.println("이름은"  +  name2  +  "이고" + "나이는"  + age2 +  "세 "
										+ "입니다.");
								
							}
	public static void main(String[] args) {
		/*
		 * 설문
		 * 이름 : 홍길동
		 * 나이 : 18
		 * 
		 *  이름은 홍길동이고 나이는 18세 입니다.
		 *  
		 *  이름 : 홍길동
		 *  나이 : 엔터
		 *  이름은 홍길동입니다.
		 *  나이는 미입력입니다.
		 *  
		 *  이름 : 엔터
		 *  나이 : 20
		 *  나이는 20세입니다.
		 *  이름은 미입력입니다.
		 *  *오버로딩 무조건 사용하여 푸시오.
		 */
	test1("홍길동");
	test1(18);
	test1("홍길동", 18);
	
	test2("홍길동");
	test2("미입력");
	test2("홍길동", 0);
	
	}

}
