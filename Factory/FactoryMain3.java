package practice.pr.Factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		SamsungFactory samsungFactory = new SamsungFactory(1);
		Factory s = samsungFactory;
		SamsungFactory samsung = (SamsungFactory)s;
		
		LGFactory lgFactory = new LGFactory(1);
		Factory f = lgFactory;
		LGFactory lg = (LGFactory)f;
		
		
		Factory[] factory2 = new Factory[6];
	
		factory2[0] = new SamsungFactory(1);
		factory2[1] = new SamsungFactory(2);
		factory2[2]	= new LGFactory(1);
		factory2[3] = new SamsungFactory(3);
		factory2[4]	= new LGFactory(2);
		factory2[5]	= new LGFactory(3);
		
		System.out.println("가동 - 생산 - 중지");
		
		for(int i = 0; i < factory2.length; i++) {
			factory2[i].start();
			samsung.produceSmartPhone();
			factory2[i].stop();
			lgFactory.produceSmartTV();
			
		}
				
	
		
		
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
