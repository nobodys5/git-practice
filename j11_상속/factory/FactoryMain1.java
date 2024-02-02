package j11_상속.factory;

public class FactoryMain1 {

	public static void main(String[] args) {

		/*
		 * 삼성팩토리 배열(크기:5)
		 * 1공장 ~ 5공장
		 * 
		 * 엘지팩토리 배열(크기:3)
		 * 1공장 ~ 3공장
		 * 
		 * 삼성 공장가동
		 * 1공장을 가동합니다.
		 * ...
		 * 5공장을 가동합니다.
		 * 
		 * 삼성공장중지
		 * 1공장을 중지합니다.
		 * ...
		 * 5공장을 중지합니다.
		 * 
		 * 엘지공장가동
		 * ...
		 * 
		 * 엘지공장중지
		 * ...
		 */
		
		SamsungFactory[] samsungfactorys = new SamsungFactory[5];
		samsungfactorys[0] = new SamsungFactory(1);
		samsungfactorys[1] = new SamsungFactory(2);
		samsungfactorys[2] = new SamsungFactory(3);
		samsungfactorys[3] = new SamsungFactory(4);
		samsungfactorys[4] = new SamsungFactory(5);
		
		
		
		
		
		LGFactory[] lgfactory = new LGFactory[3];
		lgfactory[0] = new LGFactory(1);
		lgfactory[1] = new LGFactory(2);
		lgfactory[2] = new LGFactory(3);
		
		for(int i = 0; i < samsungfactorys.length; i++) {
			samsungfactorys[i].start();
		}
		for(int i = 0; i < samsungfactorys.length; i++) {
			samsungfactorys[i].stop();
		}
		for(int i = 0; i < lgfactory.length; i++) {
			lgfactory[i].start();
		}
		for(int i = 0; i < lgfactory.length; i++) {
			lgfactory[i].stop();
		}
		
		
	}

}
