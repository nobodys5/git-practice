package Practice.pr01;

public class Practice6 {	
	//매서드명이 같고 형태가 다른것을 오버로딩이라고함
	//형태 : 매개변수의 종류,갯수
//public static void test1() {
//	System.out.println("매개변수가 없는 test1");
//}
//public static void test2(int num) {
//	System.out.println("매개변수가 하나이고 int인 test2");
//}
//public static void test3(int num,int num2) {
//	System.out.println("매개변수가 두개이고 int인 test2");
//}
	
	public static void test1(String name) {
		System.out.println("이름 :" + name);
	}
	public static void test2(int num) {
		System.out.println("나이:" + num);
	}
	public static void test3(String name,String num ) {
		System.out.println("이름은"+ name +"이고" +num +"는 18세 입니다.");
	}
	public static void test4(String name2) {
		System.out.println("이름:" + name2);
	}
	public static void test5(String num2) {
		System.out.println("나이:" + num2);
	}
	public static void test6(String name, String num2) {
		System.out.println("이름은" + name+ " 입니다.");
		System.out.println("나이는" + num2+ " 미입력입니다.");
	}
	public static void test7(String name3) {
		System.out.println("이름:" + name3);
	}
	public static void test8(String num3) {
		System.out.println("나이:" + num3);
	}
	public static void test9(String num3, String name3) {
		System.out.println("나이는" + num3+ " 입니다.");
		System.out.println("이름은"  + name3 + "미입력입니다.");
	}
	public static void main(String[] args) {
		test1("홍길동");
		test2(18);
		test3("홍길동","나이");
		test4("홍길동");
		test5("엔터");
		test6("홍길동", "");
		test7("엔터");
		test8("20");
		test9("20세","미입력");
		
	}

}
