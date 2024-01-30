package Practice.pr01;

public class Practice1 {

	public static void main(String[] args) {
String str = "abcdefghijklmnop"; // 결과값의 길이가 a ~ k이기 때문에 i 가 1씩 증가되어 k 까지출력
		
		for(int i = 0; i < str.length();  i++) { // (초기화;, 조건식;, 증감)
			String subStr = str.substring(i, i+1); // i = 0 , i = 1 까지 슬라이스한뒤 i가 str.length 길이만큼 증가
			System.out.println(subStr); // String 변수명으로 출력 하면 결과값이나옴
			
			//*** 응집도는 높아야되고 결합도는 낮아야함
			//*** 응집도: 비슷한 유형이 모여있는 것
			//*** 결합도: 어떠한 유형을 바꿔야할때 다른 유형들을 다시 바꾸지 않아도 될수있도록 전체적으로 호환이 잘되도록 만드는것
			//*** 예를 들면 변수를 초기화한뒤 변수값에 13자리의 문자열을 넣고 15자리로 바꾸면 조건식을 바꿔야하는데 ex) i < 13 ,  i < 15
			//*** 이러한 과정이 필요없이 length라는 함수명을 사용하여 변수값이 몇자리가되어도 길이만큼 값이 반환되기 때문에 코딩시 용이하게 쓰인다.
	}
	}
}
