package practice;



public class Practice2 {

	public static void main(String[] args) {
		
//	삼항연산자 코드연습
		
		// 몸무게가 120이상이면 4급, 아니면 3급을 삼항연산자로 나타내시오
		int kg = 130;// 반대로 110을 입력하면 120이상이 아니기때문에 3급이 출력된다.
		String result;
		
		
		// 아래와같이 int 변수에 비교할값을 작성한뒤 ?로 true, false를 물어보고 큰따옴표""안에
		// , 맞다 아니다를 작성하여 논리값을 나타내는 방식으로 출력시 결과값이 출력된다.
		result = kg > 120 ? "4급" : "3급";
		
		System.out.println(result);
		
		}
	
}
