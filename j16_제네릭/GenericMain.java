package j16_제네릭;

public class GenericMain {

	public static void main(String[] args) {

//		GenericTest genericTest = new GenericTest();
//		
//		genericTest.setNumber(100);
//		genericTest.setData("200");
//		
//		System.out.println(genericTest.getNumber() + genericTest.getData());
		
		GenericTest<String> genericTest = new GenericTest<String>();
		genericTest.setData("안녕");
		genericTest.setNumber(10);
		System.out.println(genericTest.getData());
		System.out.println(genericTest.getNumber());
		
		// 제네릭에서는 클래스자료형만 사용가능 일반자료형 사용불가
		GenericTest<Integer> genericTest2 = new GenericTest<Integer>();
		genericTest2.setData(10);
		genericTest2.setNumber(20);
		System.out.println(genericTest2.getNumber() + genericTest2.getData());
	}

}
