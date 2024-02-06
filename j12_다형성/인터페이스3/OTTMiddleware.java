package j12_다형성.인터페이스3;

public class OTTMiddleware {
	private OTT ott;
	
	public OTTMiddleware(OTT ott) {
		this.ott = ott;
	}
	
	public void dramaOTT() {
		ott.drama();
	}
	public void movieOTT() {
		ott.movie();
	}
	public void animationOTT() {
		ott.animation();
	}
	
	public void option() {
		if(ott instanceof Netflix) {
			((Netflix)ott).sale();
		} else if (ott instanceof Tving) {
			((Tving)ott).bundle();
		} else if (ott instanceof Watcha) {
			((Watcha)ott).freetier();
		}
	}
	
}
