package j12_다형성.추상.Building;

public class BuildingMain {

	public static void main(String[] args) {
		
			BuildingLaw lotteTower = new LotteTower();
			BuildingLaw Lct = new LctLow();
			
			
			lotteTower.Elevetor();
			lotteTower.Exit();
			lotteTower.fire();
			((LotteTower) lotteTower).observatory();
			lotteTower.Toliet();
			Lct.Elevetor();
		
	}

}
