package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 2. 어노테이션으로 전체생성자 생성한뒤 get,set 가져옴
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {

	// 1. 변수 선언 
	private String compnay;
	private String model;
	private String color;
}
