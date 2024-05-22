/*
 * 작성일 : 2024년 3월 22
일


 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 90점 이상 100점 이하라고 설정안하면 200점은 어쩔거냐구.
 *       
 */

import java.util.Scanner;

public class MultiIfTest2 {

	public static void main(String[] args) {
		// 	// // Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		//1. 정수를 입력받는다.
		System.out.print("점수 입력 : ");
		int score = stdIn.nextInt();
			
	
		
		if(score >= 90 && score <= 100) { // 90점이상이고, 100점이하
		System.out.println("A");
		}
		

		else if(score >= 80 && score <90) {
		System.out.println("B");
		}
		
		
		else if(score >= 70 && score <80) {
		System.out.println("c");
		}
		

		else if(score >= 60 && score <70) {
		System.out.println("D");
		}
		
		else if(score >= 0 && score <60) {
			System.out.println("F");
			}
			
		else {
			System.out.println("잘못된 점수 입력입니다.");
			
		}
		
	}

}
