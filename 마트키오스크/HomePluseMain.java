package 마트키오스크;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HomePluseMain {

	public static void main(String[] args) throws InterruptedException {

		Map<String, Object> map = new HashMap<String, Object>();
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		
		
		map.put("불고기", "12000원");
		map.put("콩나물", "12000원");
		map.put("안약", "12000원");
		map.put("카레", "12000원");
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
		String select = null;
		while(true) {
			System.out.println("계산도와드리겠습니다.");
			select = scanner.nextLine();
			
				if(select.equals("1")) 	
					System.out.println("1.상품을 입력합니다.");
					System.out.println("삐빅");
					select = scanner.nextLine();
					Thread.sleep(1000);
					beefConer.cowbeef();
					select = scanner.nextLine();
					Thread.sleep(1000);
					beefConer.seosoningpigbeef();
					select = scanner.nextLine();
					Thread.sleep(1000);
					beefConer.pigbeef();
					
		}
	}
	
}
