package j09_클래스.접근지정자.b;

public class TestB {

	private String tb = "홍길동";
	
	public String getTb() {
		return tb;
	}
	
	//값 주입방법 3
	public void setTb(String tb) {
		this.tb = tb;
	}
	
}
