package j09_클래스.생성자;

public class Constructor2 {

	String name;
	int age;
	boolean wishwindow;
	
	// 가능한 생성자 다 만들기
	
	/*
	 * 생성자 오버로딩했을 경우
	 * 기본생성자는 생략이 안됨.
	 * 기본생성자를 사용하고 싶을경우 무조건 명시해야함.
	 */
	public Constructor2() {
		
	}
	public Constructor2(String name) {
		System.out.println(name);
		this.name = name;
	}
	public Constructor2(int age) {
		System.out.println(age);
		
		
		this.age = age;
	}
	public Constructor2(boolean wishwindow) {
		System.out.println(wishwindow);
		
		this.wishwindow = wishwindow;
	
		
	}
}
