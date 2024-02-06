package j12_다형성.인터페이스.ex;

import j12_다형성.인터페이스.Bluetooth;
import j12_다형성.인터페이스.Mouse;

public class ComputerMain {

	public static void main(String[] args) {
		Bluetooth bluetooth	= new Mouse();
		Moniter moniter = new Moniter();
		Computer computer = new Computer(moniter);
		computer.setBluetooth(bluetooth);
		
		
		computer.poweron();
		System.out.println();
		computer.poweroff();
	}

}
