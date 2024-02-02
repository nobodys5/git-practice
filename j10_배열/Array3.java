package j10_배열;

import Practice.pr02.Student;
import j09_클래스.student;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * 배열들을 통해서 값을 받아올거임.
		 * 배열			크기
		 * names		5
		 * studentYears	5
		 * age 		5
		 * 
		 * 홍길동 3 19
		 * 홍길서 2 18
		 * 홍길남 3 19
		 * 홍길북 1 17
		 * 홍길중 2 18
		 * 
		 * 이름은 홍길동이고 학년은 3학년 19세입니다.
		 */
		String[] names = {"홍길동","홍길서","홍길남","홍길북","홍길중"};
		int[] StudentYears = {3, 2, 3, 1, 2};
		int[] age = {19, 18, 19, 17, 18};
		
		//아래와 같이 작성할 경우엔 위의 배열내용이 나오는게 아니고 students 배열에있는 배열들만 출력됨
//		String[] students = {"names","StudentYears","age"};
//		for(int i = 0; i < students.length; i++) {
//			
//			System.out.println(students[i]);
//		}
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("이름은" + names[i] + "이고 학년은" + StudentYears[i] + "학년" + age[i]+ "세 입니다.");
			
		}
		//2
		/*
		 * names,studentYears,age 배열을 활용하여
		 * students 라는 배열(크기:5)에 값 주입
		 * 
		 * 이름 : 홍길동		학년 : 3		나이: 19
		 */
		
	
		Student[] students = new Student[5];
		
		for(int i = 0; i < students.length; i ++) {
			students[i] = new Student(names[i],StudentYears[i],age[i]);
			
		}
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("이름:" + students[i].getName() + "\t" + "학년" + students[i].getStudentYear() + "\t나이:" + students[i].getAge());
		}
	}

}
