package 마트;

import java.util.Scanner;

public class HomeplusMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("어서오세요");
		String buy;
		buy = scanner.next();
		System.out.println(buy);
		
		Homeplus homeplus = new Homeplus();
		Casher casher = new Casher();
		BeefConer beefConer = new BeefConer();
		Ingredient ingredient = new Ingredient();
		
		int total = 0;
		total = scanner.nextInt();
		System.out.println("계산도와드리겠습니다.");
		for(int i = 0; i < total; i++) {
			
			beefConer.cowbeef();
			beefConer.seosoningpigbeef();
			beefConer.pigbeef();
		}
		
	}

}
