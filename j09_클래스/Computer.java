package j09_클래스;

//객체지향언어
//1 : 세상에 존재하는 모든것을 의미(OOP)
//프로그래밍 관점에서는 객체들의 관계성을 사용하여
//순차적으로 수행되는 프로그램내에서 객체들 간에
//관계를 형성하여 프로그램을 동작하게함
//
//장점 : 
//재사용성 - 상속을 통해 코드 재사용 높임
//생산성 향상 - 클래스 단위의 부품 조립
//유지보수의 우수성 - 구조화 된 소스코드
//클래스 단위로 소스코드를 관리할수 있음
//
//단점 :
// 1 - 객체를 세분화하여 설계해야한다
// 2 - 실행 속도가 절챠지향 언어 대비 느리다.
// 3 - 상속으로 인해 관계가 많아지면 코딩
//난이도가 높아진다.
//
//2 : 예시
//객체는 = 데이터 + 기능
//객체 + 컴퓨터
//데이터(변수) = 모니터,본체,키보드,마우스 등
//기능(메소드)= 화면출력,프로그램 실행,입력 출력등
//
//3. 특징
//
//1 - 상속 : 상위 클래스의 모든것을 상속받아 사용
//부모와 자식관계
//
//2 - 캡슐화
//
//- 데이터와 기능을 외부로부터 접근차단하고
//권한또는 절차없이 데이터를 변경 또는기능 수행
//할수없게 캡슐처럼 보호(데이터의 은닉성)
//
//3 - 추상화
//
//- 추상적인 요소들을 묶어서 분류하는 것
//학생,선생,학부모 등 사람을 추상적인 요소로 분류
//(데이터의 구조화)
//
//4 - 다형성
//
//- 객체의 기능이 다양한 형태를 가짐 상속과 깊은 관계
//부모 클래스로부터 상속받은 데이터와 기능을
//자식 클래스에서 재정의하여 사용 가능

public class Computer {
	
	int year;
	String company;
	String cpu;
	int ram;
	String graphic;
	
	void showInfo() {
		System.out.println("제조년:" + year + "년");
		System.out.println("제조사:" + company);
		System.out.println("CPU:" + cpu );
		System.out.println("RAM:" + ram);
		System.out.println("GraphicCard" + graphic);
		System.out.println();
	}
	
	void addRam(int gigaByte) {
		int overRam = ram;
		if(ram < 32) {
			ram += gigaByte;
			if(ram > 32) {
				overRam = ram - 32;
				System.out.println("램은 최대 32기가 바이트만 장착할 수 있습니다.");
				System.out.println(overRam + "초과");
				ram = 32;
				
			} else {
				System.out.println("더 이상 램을 추가 할 수 없습니다.");
			}
		}
	}
	
	void removeRam(int gigaByte) {
		if(ram > 1) {
			ram -= gigaByte;
			if (ram < 1) {
				System.out.println("램은 최소 1기가바이트 이상은 장착하여야 합니다");
				ram = 1;
			}
		}else {
			System.out.println("램을 제거할 수 없습니다.");
		}
	}
}
