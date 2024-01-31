package j09_클래스;



public class CarMain {

	public static void main(String[] args) {
		
		System.out.println("주행거리를 입력하시오");
		int km;
		
		Car c1 = new Car();
		c1.company = "HYUNDAI";
		c1.model = "쏘나타";
		c1.color = "White";
		
		Car c2 = new Car();
		c2.company = "KIA";
		c2.model = "K5";
		c2.color = "Black";
		
		
		c1.showCarInfo();
		System.out.println();
		c2.showCarInfo();
		c1.changeEngineOil();
		
		/*
		 * Car클래스
		 * 변수
		 * company
		 * model
		 * color
		 * 
		 * 메소드
		 * showCarInfo()
		 * 		회사명 : OOO
		 * 		모델명 : OOO
		 * 		색상 : OOO
		 * 
		 * changeEngineOil()
		 * 교체 후 주행거리 : 8000
		 * 희망주입량(L) : 10
		 * 교체 한 후 9천 키로가 안되었으면.
		 * 9,000km 주행 후 교체 하십시오.
		 * 
		 * 교체 한후 9천 키로가 되었으면.
		 * 주입량을 주입합니다.
		 * * 희망주입량이 5L 이상일 시 최대 5L 만 주입
		 * 
		 * 2대
		 * 현대자동차
		 * 쏘나타
		 * 화이트
		 * 
		 * 기아
		 * k5
		 * 블랙
		 * 
		 */
		
		
	}

}
