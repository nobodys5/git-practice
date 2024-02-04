package practice;



public class Practice2 {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		String strinBuilder2 = stringBuilder.toString();//Stringbuilder 객체생성한뒤에는
		// 변수명.tostring을 써야 초기화(주소참조) 가능 
		
		stringBuilder.append("이름은홍길동");
//		stringBuilder.append("홍길동");
		stringBuilder.delete(1, 3);
		System.out.println(stringBuilder.toString());
		
		
		}
	
}
