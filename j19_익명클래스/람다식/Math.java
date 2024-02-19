package j19_익명클래스.람다식;

@FunctionalInterface
public interface Math<T1, T2> {
	
	//람다식 메소드는 무조건 하나만 실행가능하다.
	public double calc(T1 value1, T2 value2);
//	public double minus(T1 value,T2 value2);
	
	/*
	 * 람다식 패키지안에
	 * MathTest라는 인터페이스 만들기
	 * test메소드 만들기
	 * 
	 * 테스트메소드에 정수인 점수 던지기
	 * A학점 or
	 * B학점 or
	 * 계산불가를 리턴
	 */
	
	
}
