package j15_스태틱.싱글톤;

import java.util.Arrays;
import java.util.Objects;

import lombok.Builder;

/*
 *  싱글톤(Singleton)
 *  :유일한 객체를 만들어서 공유하는 생성패턴
 *  1. 생성자의 접근지정자는 private이다.
 *  2. 자기 자신의 유일한 객체를 담을 수 있는 instance라는 변수명을
 *     가진 스태틱 변수가 필요하다.
 *  3. instance라는 변수를 리턴(공유)해줄 getInstance라는 스태틱 메소드가
 *     필요하다.
 *     		   
 */
public class KIA {

//	private KIA() {
//		
//	}
	
	private static KIA instance; // 1. private static 변수를가진 instance 선언
	private Car[] carArray;
	private int autoCode;
	
	private KIA() {
		carArray = new Car[10];
		autoCode = 20240000;
	}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car produceCar(String model) {
		int carNumber = ++autoCode;
		String company = getClass().getSimpleName();
		
		
		Car car = Car.builder()
				.carNumber(carNumber)
				.company(company)
				.model(model)
				.build();
		
		if(addCar(car)) {
			return car;
		}
				return null;
	}
	
		private boolean addCar(Car car)	{
			for(int i = 0; i < carArray.length; i++) {
				if(carArray[i] == null) {
					carArray[i] = car;
					System.out.println("주차완료");
					return true;
				}
			}
		System.out.println("만차입니다");
		return false;
	}
}

//		Car car = new Car(carNumber, company, model);
		
	