package j10_배열;

import Practice.pr02.Computer;

public class Array1 {

	public static void main(String[] args) {
		int[] a = new int[5];//배열 초기화
		int[] b = new int[10];
		int[] c = new int[15];
		String[] strArray = new String[4];
		
		a[0] = 10;// 배열은 0번부터시작 index번호
		b[0] = 10;
		c[0] = 10;
		
		System.out.println(a[0]);//출력
		System.out.println(b.length);//출력
		System.out.println(c.length);//출력
		System.out.println(a.length);// 배열의길이를 5로정해놨기때문에 5가출력됨
		
		strArray[2] = "김영필";// 스트링 배열 2번에 이름값저장
		System.out.println(strArray[2]);//출력
		
		Computer[] computers = new Computer[4];
		computers[1] = new Computer();
		System.out.println(computers[1]);
		
	}

}
