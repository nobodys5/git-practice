package j12_다형성.추상.Building;

public class  Building63 extends BuildingLaw{

	@Override
	public void Elevetor() {
		System.out.println("63빌딩 엘리베이터");
	}

	@Override
	public void fire() {
		System.out.println("63빌딩 화재경보");
	}

	@Override
	public void Exit() {
		System.out.println("63빌딩 비상계단");
	}

	@Override
	public void Toliet() {
		System.out.println("63빌딩 화장실");
	}
	
	public void Aqarium() {
		System.out.println("63빌딩 아쿠아리움");
	}

}
