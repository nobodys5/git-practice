package j12_다형성.인터페이스.ex;

public class Moniter implements HDMI {// 3. 모니터에서 HDMI를 구현하여 야함

	@Override
	public void connect() {// 4. HDMI 메소드에서 구현받은 메소드 오버라이딩 해서 실행문 작성
		System.out.println("HDMI를통해 모니터를 연결합니다.");
	}

	@Override
	public void disconnect() {
		System.out.println("HDMI를 통해 모니터연결을 해제합니다.");
	}


	
}
