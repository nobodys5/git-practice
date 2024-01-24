package j06_조건;

public class If1 {
	public static void main(String[] args) {

		// 돈이 있으면 택시를 타고 돈이 없으면 걸어가라
		
		boolean money = false;
		if(money) {
			System.out.println("택시를 타고가라");
		}
		if(!money) {
			System.out.println("걸어가라");
			System.out.println("걸어가다가 빨리 뛰어라");
		}
		
		boolean money2 = false;
		if(money2) System.out.println("탕후루를 먹어라");
		
		if(!money2) System.out.println("감귤 먹어라");
		// 조건문 안의 실행문이 하나일때는 중괄호 생략가능
					System.out.println("제주 한라산 굿");
					
					
		if (money2) {
			System.out.println("탕후루를 먹어라");
			System.out.println("탕후루 짱짱!");
		} else {
			System.out.println("감귤먹어라2");
		}
		// 자동정렬 단축키 -> ctrl + shift + F
		
		/*
		 * <if문의 기본구조>
		 * if(조건식) {
		 * 		실행문1;
		 * 		실행문2;
		 * 		...
		 * }else {
		 * 		실행문a;
		 * 		실행문a;
		 * 		...		
		 * 
		 * }
		 * 
		 */		

		 
		 	
	}

}
