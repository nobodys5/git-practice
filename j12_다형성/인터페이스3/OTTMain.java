package j12_다형성.인터페이스3;

public class OTTMain {

	public static void main(String[] args) {
		OTT ott = new Netflix();
		OTT ott2 = new Tving();
		OTT ott3 = new Watcha();
		
		OTTMiddleware ottMiddleware = new OTTMiddleware(ott);
		
		ott.drama();
		ott.animation();
		ott.movie();
		ottMiddleware.option();
		
	}

}
