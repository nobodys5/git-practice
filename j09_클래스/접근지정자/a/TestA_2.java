package j09_클래스.접근지정자.a;

public class TestA_2 {

	int ta2;
	
	public void testA2() {
		System.out.println("testA2 메소드 호출");
		TestA testA = new TestA();
		
		testA.ta1 = "TestA_2에서 값 주입";
		testA.testA1();
		System.out.println(testA.ta1);
	}
	
	
	}

