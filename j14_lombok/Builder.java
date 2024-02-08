package j14_lombok;

// 6. carbuilder로 부터 상속받음
public class Builder extends CarBuilder {

	// 7. 추상클래스에서 상속받아서 오버라이딩 시켜야함
	@Override
	public CarBuilder company(String company) {
		car.setCompnay(company);
		return this;
	}

	@Override
	public CarBuilder model(String model) {
		car.setModel(model);
		return this;
	}

	@Override
	public CarBuilder color(String color) {
		car.setColor(color);
		return this;
	}

}
