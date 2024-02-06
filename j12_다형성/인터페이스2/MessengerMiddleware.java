package j12_다형성.인터페이스2;

public class MessengerMiddleware {

	private Messenger messenger;
	
	public MessengerMiddleware(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void sendMessage() {
		messenger.send();
	}
	
	public void receiveMessage() {
		messenger.receive();
	}
	
	
	// instanceof를 활용하여 카카오톡,인스타그램 일반메소드 호출하는방법
	public void runAddOns() { // 1. 런애드온 메소드 생성
		
		// 2. 아래와 같이 if문을 작성하여 instanceof로 참인지 거짓인지 확인하고
		// 3. 다운캐스팅하여 카카오톡 과 인스타그램의 일반메소드를 호출
		if(messenger instanceof kakaoTalk) {
			((kakaoTalk)messenger).sendPresent();
		} else if (messenger instanceof Instagram) {
			((Instagram)messenger).sendStory();
		}
	}
	
}
