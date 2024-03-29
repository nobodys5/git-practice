package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		//중복 안됨
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");

		//순서대로 요소입력안된다.
		set.add("python");
		set.add("2");
		set.add("1");
		set.add("html");
		set.add("react");
		set.add("C");
		
	System.out.println(set);
	
	Iterator<String> ir = set.iterator();
	
//	System.out.println(ir.hasNext()); 
//	System.out.println(ir.next()); 
//	System.out.println(ir.hasNext()); 
//	System.out.println(ir.next()); 
//	System.out.println(ir.hasNext()); 
//	System.out.println(ir.next()); 
//	System.out.println(ir.hasNext()); 
//	System.out.println(ir.next()); 
//	System.out.println(ir.hasNext()); 
//	System.out.println(ir.next()); 
//	System.out.println(ir.hasNext()); 
//	System.out.println(ir.next()); 
	
	/*
	 * 반복문을 활용하여
	 * set안에 2가 있는지 확인하고
	 * 있으면 2를 출력
	 * 
	 */
	System.out.println();
	while(ir.hasNext()) {
		// next를 한번 호출했기때문에 String 변수를 초기화 하여 next를 다시담는다.
		String str = ir.next();
		if(str.equals("2")) {
			
			System.out.println(str);
		}
			
	}
	System.out.println();
	for(String str : set) {
		if(str.equals("C")) {
			System.out.println(str);
			set.remove(str);
			set.add("C++");
			break;
		}
	}
	System.out.println(set);
	
	/*
	 * C를 찾아서 있으면 출력하고
	 * 있는거를 지우고
	 * C++을 넣으시오
	 */
	

	}

}
