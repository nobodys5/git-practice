package j14_lombok;

import lombok.Data;

// 5. 추상클래스 생성

public abstract class CarBuilder {
	
	// 3. 프로텍티드 car 변수선언하여 빌더 클래스에 상속시킴
	protected Car car;
	
	public Car build() {
		return car;
	}
	
	public CarBuilder builder() {
		// car 변수안에 new Car 생성
		car = new Car();
		return this;
		
	}
	
	// 4. 추상메소드 생성
	public abstract CarBuilder company(String company);
	public abstract CarBuilder model(String model);
	public abstract CarBuilder color(String color);
}
