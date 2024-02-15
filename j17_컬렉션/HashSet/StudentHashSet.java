package j17_컬렉션.HashSet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


import j15_스태틱.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;
		String name = null;
		int code = 0;
		
		Student student1 = new Student("홍길동");
		Student student2 = new Student("홍길서");
		Student student3 = new Student("홍길남");
		Student student4 = new Student("홍길북");
		Student student5 = new Student("홍길중");
		
		HashSet<Student> StudentSet = new HashSet<Student>();
		
		Student[] students2 = {student1,student2,student3,student4,student5};
		StudentSet.addAll(Arrays.asList(students2));
		
//		System.out.println(StudentSet);
		System.out.println("1. 학생조회");
		System.out.println("2. 삭제");
		System.out.println("원하시는 메뉴를 입력하시오");
		
		select = sc.nextInt();
		
		while(true) {
			
			if(select == 1) {
				for(Student student : StudentSet) {
					System.out.println("학번:" + student.getStudentCode() + "이름:" + student.getName());
				}
			} else if(select == 2) {
				System.out.println("삭제할 학생의 이름을 입력하시오:");
				sc.nextLine();
				name = sc.nextLine();
				
				for(Student student : StudentSet) {
					if(student.getName().equals(name)) {
						System.out.println("학번 입력하시오:");
						code = sc.nextInt();
						
						if(student.getStudentCode() == code) {
							StudentSet.remove(student);
						}else {
							System.out.println("학번이 올바르지 않습니다.");
						}
		}
				
				}
			}
		}
		
				
		
		/*
		 * student1, 2, 3, 4, 5를 students라는 배열에 넣고
		 * 
		 * students배열을 studentSet이라는 Set에 넣기
		 * 
		 * 원하시는 메뉴를 선택하시오
		 * 1. 학생 전체 조회
		 * 2. 삭제
		 * 
		 * 1. 선택
		 * 학번 : ~ 이름 : ~
		 * 학번 : ~ 이름 : ~
		 * ...
		 * 
		 * 2 . 선택
		 * 삭제할 학생의 이름을 입력하시오: 홍길서
		 * 학번을 입력하시오: 20240002
		 * 삭제되었습니다.
		 * 
		 * 2 . 선택
		 * 삭제할 학생의 이름을 입력하시오: 홍길서
		 * 학번을 입력하시오: 20240004
		 * 학번이 올바르지 않습니다.
		 * 
		 */
	}

}
