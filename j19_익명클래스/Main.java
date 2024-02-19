package j19_익명클래스;

public class Main {

	public static void main(String[] args) {

		AbstractTest abstractTest = new AbstractTestImpl();
		
		abstractTest.showData("홍길동");
		abstractTest.add(10, 20);
		
		AbstractTest abstractTest2 = new AbstractTest() {
			
			@Override
			public void showData(String data) {
				System.out.println("여기서만 실행");
			}
			
			@Override
			public void add(int num1, int num2) {
				System.out.println("여기서만 실행");
			}
		};
		abstractTest2.showData("홍길동");
		abstractTest2.add(10, 10);
		/*
		 * 추상 생성해서
		 * data에 "홍길동" 전달
		 * num1, num2에 10, 20 전달해서 실행
		 */
	}

}
