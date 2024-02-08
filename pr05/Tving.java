package Practice.pr05;

public class Tving implements OTT {

	@Override
	public void drama() {
		System.out.println("티빙 드라마");
	}

	@Override
	public void movie() {
		System.out.println("티빙 영화");
	}

	@Override
	public void animation() {
		System.out.println("티빙 애니메이션");
	}

	public void bundle() {
		System.out.println("1 + 1 입니다.");
	}

	@Override
	public void signin() {
		System.out.println("samudi200");
	}

	@Override
	public void password() {
		System.out.println("qwer1234!Q");
	}

	@Override
	public void movietitle() {
		System.out.println("티빙 영화제목 검색");
	}
	
}