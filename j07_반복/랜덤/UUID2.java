package j07_반복.랜덤;

import java.util.Scanner;
import java.util.UUID;

public class UUID2 {
	public static void main(String[] args) {

		/*
		 * 이미지 첨부 : 강아지1.jpg
		 * 저장된 이미지 : 강아지1_UUID.jpg
		 * 다운시 이미지명: 강아지1.jpg
		 */
		Scanner scanner = new Scanner(System.in);
		String savePhoto;
		String savePhoto2;
		String downImage;
		System.out.println(UUID.randomUUID().toString());
		
		System.out.print("이미지 첨부:");
		savePhoto = scanner.next();
		
		savePhoto2 = savePhoto.substring(0, savePhoto.indexOf("."))
					+ "_"
					+ UUID.randomUUID().toString()
					+ savePhoto.substring(savePhoto.indexOf("."),savePhoto.length());
		
		System.out.println("저장된 이미지:" + savePhoto2);
		downImage = savePhoto2.substring(0, savePhoto2.lastIndexOf("_"))
				   + savePhoto2.substring(savePhoto2.indexOf("."),savePhoto2.length());
				   
				   System.out.println("다운시 이미지:" + downImage);
		
		
		
		
	}

}
