package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {

	public static void main(String[] args) {

		Student student1 = new Student("홍길동");
		Student student2 = new Student("홍길서");
		Student student3 = new Student("홍길남");
		Student student4 = new Student("홍길북");
		Student student5 = new Student("홍길중");
		
		/*
		 * student1, 2, 3, 4, 5를 가지는 students라는 배열을 만드시오
		 * 
		 * 그리고 studentList라는 리스트를 만들고
		 * 이 리스트에 students를 추가하시오
		 * 
		 * foreach를 활용해서 
		 * 학번: 20240001 이름: 홍길동
		 * 학번: 20240002 이름: 홍길서
		 * 
		 */
		
		// 1. ArrayList 제네릭에 Student 자료형 입력하여 studentLIst 생성
		ArrayList<Student> studentList = new ArrayList<Student>();
		// 3. Student 배열에 student 1,2,3,4,5 배열만들기
		Student[] students2 = {student1,student2,student3,student4,student5};
		
		// 2. aslist를 통해 배열을 list로 바꾸어준다.
		studentList.addAll(Arrays.asList(students2));
		
		// 5. 출력
		System.out.println(studentList);
		
		// 4. for each 반복문을 통해 반복문 실행
		for(Student student : studentList) {
			System.out.println("학번:" + student.getStudentCode());
		}
		
		
		/*
		 * 이름이 홍길북인 객체를 찾아서
		 * 학번: 이름 : 출력하고
		 * 객체 삭제
		 */
		
		for(Student student : studentList) {
			if(student.getName().equals("홍길북")) {
				System.out.println("학번:" + student.getStudentCode());
				studentList.remove(student);
				
			}
		}
	
		System.out.println(studentList);
		
		
	}

}
