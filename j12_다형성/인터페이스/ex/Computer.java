package j12_다형성.인터페이스.ex;

import j12_다형성.인터페이스.Bluetooth;

public class Computer {

	private HDMI hdmi; // 7 hdmi 변수 선언
	private Bluetooth bluetooth;
	
	public Computer(HDMI hdmi) {// 8 hdmi 변수를 컴퓨터 메소드에 매개변수로 받아 MAin에서 호출할수 있도록 메소드 선언
		this.hdmi = hdmi;
	}
	public void setBluetooth(Bluetooth bluetooth) {
		this.bluetooth = bluetooth;
	}

	public void poweron() {// 5. 전원 온 오프 메소드 생성
		System.out.println("컴퓨터의 전원을 켭니다.");
		this.connectedDisplay();
		bluetooth.wireless();
	}
	

	public void poweroff() {
		this.disconnectedDisplay();
		System.out.println("컴퓨터의 전원을 끕니다.");
	}
	
	private void connectedDisplay() {// 6. 위와 같이 전원 온오프 메소드에만 호출할수있도록 private로 메소드 설정하여 사용
		System.out.println("출력장치를 연결합니다.");
		hdmi.connect();
	}
	private void disconnectedDisplay() {
		System.out.println("출력장치를 연결을 해제합니다.");
		hdmi.disconnect();
	}
}
