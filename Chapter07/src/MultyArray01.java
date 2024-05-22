/*
 * 작성일 : 2024년 4월 12일



 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 2차원 배열을 생성하고, 랜덤수를 배열의 초기값으로 설정합니다
 */

import java.util.Scanner;

public class MultyArray01 {

	public static void main(String[] args) {
		// 2차원 배열 생성.
		// 줄,칸
		int [][] num = new int [4][4];
		int jul,kan; //i.j
		
		//랜덤으로 값 초기화 위해 랜덤 객체 생성.
		Random random = new Random();
		
		// 랜덤으로 2차원 배열에 값 저장.
		for (jul = 0; jul < 4; jul++) {
			for(kan = 0; kan < 4; kan++) {
				num [jul][kan]= random.nextInt(10); // 0~9까지
				
				
			}
			
		}
		// 2차원 배열 값 출력
		for (jul = 0; jul < 4; jul++) {
			for(kan = 0; kan < 4; kan++) {
			System.out.print(num[jul][kan] + " ");
				
				
			}
			System.out.println(""); // 줄바꿈 
		}
		
		

		
		

	}

}
