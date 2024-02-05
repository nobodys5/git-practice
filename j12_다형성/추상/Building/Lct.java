package j12_다형성.추상.Building;

public abstract class Lct extends BuildingLaw {

	
	@Override
	public void Exit() {
		System.out.println("엘시티 비상계단");
	}
	@Override
	public void fire() {
		System.out.println("엘시티 화재경보");
	}
	@Override
	public void Toliet() {
		System.out.println("엘시티 화장실입니다.");
	}
	public void WaterPark() {
		System.out.println("엘시티 워터파크");
	}
	

}
