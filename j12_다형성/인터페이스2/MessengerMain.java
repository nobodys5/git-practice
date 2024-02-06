package j12_다형성.인터페이스2;

public class MessengerMain {

	public static void main(String[] args) {
		
		kakaoTalk kakaoTalk = new kakaoTalk();
		Instagram instagram	= new Instagram();
		
		MessengerMiddleware messengerMiddleware = new MessengerMiddleware(instagram);
		
		messengerMiddleware.sendMessage();
		System.out.println();
		messengerMiddleware.receiveMessage();
		
		// 4. 메인에서 호출하여 실행
		messengerMiddleware.runAddOns();
	}

}
