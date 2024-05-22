/*
 * 작성일 : 2024년 3월 19일


 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 다중 if실습. 
 *       점수를 입력받아 학점을 출력하시오.
 *       
 *문제분석 : 90점 이상이면 A학점
 		   80점 이상이면 B학점
 		   70점 이상이면 C학점
 		   60점 이상이면 D학점
 		   50점 이상이면 F학점
 	       점수는 정수로 입력 받는다.
 *         
 *알고리즘 : 1.정수를 입력받는다.
 *         2.점수가 90점 이상인가?
 *           2-1. A학점입니다. 출력
 *         3. 아니면 점수가 80점 이상인가?
 *          // 90점미만이라고 설정안해도 어차피 2번의 나머지라서 안걸림 //80점 이상 90점 미만조건식 : Score >= 80 && score<90
 *           3-1.B학점입니다. 출력 
 *         4. 아니고 점수가 70점 이상인가? // 또 걸림 나머지 중에서니까 ...
 *         	 4-1 C학점입니다. 출력 
 *         5. 아니고 점수가 60점 이상인가?
 *         	 5-1. D학점입니다.출력 
 *         6. 아니면 (즉 나머지는) 
 *           6-1. F입니다.
 *         
 */

import java.util.Scanner;

public class MultiIfTest02 {

	public static void main(String[] args) {
		// 	// // Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		//1. 정수를 입력받는다.
		System.out.print("점수 입력 : ");
		int score = stdIn.nextInt();
			
	
		
		if(score >= 90) {
		System.out.println("A");
		}
		

		else if(score >= 80) {
		System.out.println("B");
		}
		
		
		else if(score >= 70) {
		System.out.println("c");
		}
		

		else if(score >= 60) {
		System.out.println("D");
		}
		
		else {
			System.out.println("F");
			
		}
		
	}

}
