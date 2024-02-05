package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		
		SamsungFactory samsungFactory = new SamsungFactory(1);
		Factory sfacFactory = samsungFactory;
		SamsungFactory samsungFactory2 = (SamsungFactory)sfacFactory;
		
//		Factory factory = new factory(1);
//		LGFactory lgFactory = (LGFactory)factory;
		// 근본 주소로 내려오는건 가능, 부모주소에서 자식주소 못내려옴
	}

}
