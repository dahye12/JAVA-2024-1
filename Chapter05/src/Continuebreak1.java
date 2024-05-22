/*
 * 작성일 : 2024년 4월 12일



 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 :점수를 입력 받아 합계와 평균을 출력하시오.
 * 음수가 입력되면 점수 입력이 종료됩니다.
 * 100점 초과의 점수는 계산에 포함되지 않습니다.
 *       
 *문제분석 :계속해서 점수를 입력 받는다 => 무한반복
 *알고리즘 :
 */

import java.util.Scanner;

public class Continuebreak1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner (System.in);
		int sum = 0;
		int num = 0;
		
		while (true) {
			System.out.println("점수를 입력하세요");
			int input  = stdIn.nextInt();
			if (input < 0) {
				break;
				
			}
			if (input > 100 ) {
				continue;
				
			}
			sum = sum + input;
			num ++;
			
		}
		
		System.out.printf("합계 : %d 평균 : %.2f", sum,(double)sum/num);
		
		
		
		
		
		

	}

}
