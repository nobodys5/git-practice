package j07_반복.랜덤;

import java.util.Scanner;
import java.util.UUID;

public class UUID1 {
	public static void main(String[] args) {
		/*
		 * UUID
		 * 토큰()
		 * 시리얼 번호 등록 - OTP()
		 */
		Scanner scanner = new Scanner(System.in);
		String savePhoto = null;
		String savePhoto2 = null;
		System.out.println(UUID.randomUUID().toString());
		
		System.out.print("유저1 이미지 첨부:");
		savePhoto = scanner.next();

		System.out.print("유저2 이미지 첨부:");
		savePhoto2 = scanner.next();
		
		System.out.print("유저1 저장된 이미지 :");
		System.out.println(savePhoto);
		System.out.print("유저2 저장된 이미지 :");
		System.out.println(savePhoto2);
	}

}
