package j12_다형성.인터페이스;

public class ComputerMain {

	public static void main(String[] args) {
		Moniter moniter = new Moniter();
		Computer computer = new Computer(moniter);
//		HDMI hdmi = new HDMI();
		
		
		
		computer.poweron();
		System.out.println();
		computer.poweroff();
	}

}
