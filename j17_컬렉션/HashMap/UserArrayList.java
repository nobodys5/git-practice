package j17_컬렉션.HashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Data;

@Data
public class UserArrayList {
	
	private List<User> userList;
	private Scanner scanner;
	
	public UserArrayList() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}

	private void addUser() {
		String signname = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("아이디:");
		signname = scanner.nextLine();
		System.out.println("비밀번호:");
		password = scanner.nextLine();
		System.out.println("이름:");
		name = scanner.nextLine();
		System.out.println("이메일:");
		email = scanner.nextLine();
		
		User user = User.builder()
				.signName(signname)
				.name(name)
				.password(password)
				.email(email)
				.build();
		
		userList.add(user);
				
				
				
				
	}
	
	private void printUserList() {

		for(User user : userList) {
			System.out.println("아이디 \t\t >" + user.getSignName());
			System.out.println("비밀번호 \t >" + user.getPassword());
			System.out.println("이름 \t\t >" + user.getName());
			System.out.println("이메일 \t\t >" + user.getEmail());
		}
	}
	
	private void printUserremove() {
		
		String username = null;
		String password = null;
		
		System.out.println("아이디를 입력하시오");
		username = scanner.nextLine();
			
		for(User user : userList) {
			
			if(user.getSignName().equals(username)) {
				System.out.println("비밀번호를 입력하시오:");
				password = scanner.nextLine();
				if(user.getPassword().equals(password)) {
					userList.remove(user);
					System.out.println("삭제완료");
				}else {
					System.out.println("비밀번호가 올바르지않습니다.");
				}
				return;
			}else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
		}
	
	
		
		
		/*
		 * [사용자 관리 프로그램]
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력
		 * 3. 사용자 삭제
		 * q. 프로그램 종료
		 * 메뉴선택 > 1
		 * 
		 * 아이디: gildong
		 * 비밀번호: 1234
		 * 이름: 홍길동
		 * 이메일: gildong@gmail.com
		 * 
		 * [사용자 관리 프로그램]
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력
		 * 3. 사용자 삭제
		 * q. 프로그램 종료
		 * 메뉴선택 > 2
		 * 
		 * 
		 * 아이디	> gildong2
		 * 비밀번호 > 1234
		 * 이름		> 홍길동2
		 * 이메일	> gildong2@gmail.com
		 * 
		 * 
		 * [사용자 관리 프로그램]
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력
		 * 3. 사용자 삭제
		 * q. 프로그램 종료
		 * 메뉴선택 > 3
		 * 
		 * 아이디를 입력하시오: gildong
		 * 비밀번호를 입력하시오 : 12345
		 * 비밀번호가 올바르지 않습니다.
		 * 
		 * 아이디를 입력하시오: gildong2
		 * 존재하지 않는 아이디입니다.
		 * 
		 */
		public static void main(String[] args) {
			UserArrayList userArrayList = new UserArrayList();
			
			while(true) {
				String select = null;
				System.out.println("[사용자 관리 프로그램]");
				System.out.println("1. 사용자 추가");
				System.out.println("2. 사용자 리스트 출력");
				System.out.println("3. 사용자 삭제");
				System.out.println("q. 프로그램 종료");
				System.out.println("메뉴선택 >");
				
				select = userArrayList.getScanner().nextLine();
				
				if(select.equals("1")) {
					userArrayList.addUser();
				} else if(select.equals("2")) {
					userArrayList.printUserList();
				} else if(select.equals("3")) {
					userArrayList.printUserremove();
				}
			}
		}
	
	}


