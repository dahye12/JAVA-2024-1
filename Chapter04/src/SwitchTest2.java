/*
 * 작성일 : 2024년 3월 26일





 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 
 */

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// 	// // Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
	
		//1. 정수를 입력받는다.
		System.out.print("월을 입력하세요(영문자) : ");
	
		String month = stdIn.next();
		String MtoS=null; //=null로 값을 주기 
		switch (month)
		{
		case "Desember":
		case "Febuary":
			MtoS = "겨울입니다";
			break;
		case "March":
		case "April":
		case"May":
			MtoS = "봄입니다.";
			break;
		case "June":
		case "July":
		case "Agust":
			MtoS = "여름입니다.";
			break;
		case "September":
			System.out.print("멋진 9월과");
		case"October":
		System.out.print("낙엽의 11월은");
		MtoS = "가을입니다.";
		break;
		
		}
		System.out.println(MtoS);
	}
		
		
	}


			
