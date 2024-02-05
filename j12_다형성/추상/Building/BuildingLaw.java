package j12_다형성.추상.Building;

public abstract class BuildingLaw {

	public abstract void Elevetor();
	
	public abstract void fire();

	public abstract void Exit();
	
	public void Toliet() {
		System.out.println("화장실 입니다.");
	}
	
}
