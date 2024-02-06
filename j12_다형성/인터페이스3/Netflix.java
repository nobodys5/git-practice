package j12_다형성.인터페이스3;

public class Netflix implements OTT{

	@Override
	public void drama() {
		System.out.println("넷플릭스 드라마");
	}

	@Override
	public void movie() {
		System.out.println("넷플릭스 영화");
	}

	@Override
	public void animation() {
		System.out.println("넷플릭스 애니메이션");
	}

	public void sale() {
		System.out.println("20프로 세일합니다.");
	}
	
}
