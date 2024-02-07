package j13_최상위클래스;

public class HashMain {

	public static void main(String[] args) {

		Student s1 = new Student(20230001, "홍길동");
		Student s2 = new Student(20230002, "홍길동");
		Student s3 = new Student(20230003, "최연호");
		Student s4 = new Student(20230001, "홍길동");
		
//		10진수로 주소값을 보여줌
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()); 
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
