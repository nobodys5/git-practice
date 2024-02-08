package Practice.pr05;

public class Watcha implements OTT{

	@Override
	public void drama() {
		System.out.println("왓챠 드라마");
	}

	@Override
	public void movie() {
		System.out.println("왓챠 영화");
	}

	@Override
	public void animation() {
		System.out.println("왓챠 애니메이션");
	}

	public void freetier() {
		System.out.println("2주 무료 시청입니다.");
	}

	@Override
	public void signin() {
		System.out.println("samudi300");
	}

	@Override
	public void password() {
		System.out.println("1234asdfQ!");
	}

	@Override
	public void movietitle() {
		System.out.println("왓챠 영화 제목 검색");
	}
	
}