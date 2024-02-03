package practice.pr.Factory;

public class FactoryMain4 {

	public static void main(String[] args) {

		Factory factory = new SamsungFactory(1);
		Factory factory2 = new LGFactory(1);
		
		System.out.println(factory instanceof SamsungFactory);
		System.out.println(factory2 instanceof SamsungFactory);
	
	/*
	 * 공장 6개(팩토리 배열)
	 * 삼성1
	 * 삼성2
	 * 엘지1
	 * 삼성3
	 * 엘지2
	 * 엘지3
	 * 
	 * 가동-생산-중지
	 * 삼성1공장을 가동합니다.
	 * 스마트폰 생산
	 * 삼성1공장을 중지합니다.
	 * 
	 * 삼성1공장을 가동합니다.
	 * 스마트폰 생산
	 * 삼성1공장을 중지합니다.
	 * 
	 * 엘지1공장을 가동합니다.
	 * 스마트TV 생산
	 * 엘지1공장을 가동합니다.
	 * 
	 * 
	 */
	
	
	
	
	
	
	}

}
