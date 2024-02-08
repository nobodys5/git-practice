package Practice.pr05;

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

	@Override
	public void signin() {
		System.out.println("samudi2");
	}

	@Override
	public void password() {
		System.out.println("1234Qwer!");
	}

	@Override
	public void movietitle() {
		System.out.println("넷플릭스 영화 제목 검색");
	}
	
	
	
	
	
}