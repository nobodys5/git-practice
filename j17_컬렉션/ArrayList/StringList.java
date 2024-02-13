package j17_컬렉션.ArrayList;

import java.util.ArrayList;

public class StringList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		//값 추가
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("html");
		
		//원하는 위치에 값 추가
		list.add(1, "css");
		
		//리스트의 크기
		System.out.println(list.size());
		
		System.out.println(list);
		
		// 리스트에 해당 인덱스로 값 찾기
		String subject = list.get(2);
		
		System.out.println(subject);
		
		// 리스트에서 값을 통해 인덱스 찾기
		int findIndex = list.indexOf("python");
		System.out.println("pythonc 위치:" + findIndex);
		
		// 값 수정
		list.set(1, "java");
		System.out.println(list);
		
		// 해당 리스트가 값을 포함하고 있는지 확인
		ArrayList<String> temList = new ArrayList<String>();
		temList.add("python");
		temList.add("html");
		
		boolean contains = list.contains("java");
		System.out.println(contains);
		
		boolean containsAll = list.containsAll(temList);
		System.out.println(containsAll);
		
		// 다른 컬렉션 데이터 추가(요소) 추가
		list.addAll(temList);
		System.out.println(list);
		
		
	}

}
