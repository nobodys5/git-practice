package j12_다형성.추상.Building;

public class LotteTower extends BuildingLaw {

	@Override
	public void Elevetor() {
		System.out.println("롯데타워 엘리베이터");
	}

	@Override
	public void fire() {
		System.out.println("롯데타워 화재경보");
	}

	@Override
	public void Exit() {
		System.out.println("롯데타워 비상계단");
	}

	@Override
	public void Toliet() {
		System.out.println("롯데타워 화장실");
	}
	
	public void observatory() {
		System.out.println("롯데타워 전망대");
	}

}
