package j12_다형성.추상.company;

public class CompanyMain {

	public static void main(String[] args) {
		
		Boss boss = new HardHuman();//추상 클래스 생성
		boss.work1();//추상 실행문 실행
		boss.work2();
		boss.work3();
		boss.snack();
	}

}
