/*
 * 작성일 : 2024년 4월 23일



 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 정수 10개를 입력받아 배열에 저장하여 출력하고, 배열에 저장된 데이터의 짝수 개수와 짝수의 합을 출력하는 
 * 프로그램을 분석, 설계하고 코딩
 * 
 * 
 *       
 *문제분석 : 1부터 입력받은 수까지 각 수의 약수룰 구하고 구별하도록 작성 
 *소수 : 어떤 수를 나누어 떨어지게 하는 수 
 	
 
 *
 *알고리즘 :
 *1. 정수입력scanner로 입력받기 
 *2.  소수인지 알기 위해서 
 *3. 소수이면 소수이다와 함께 출력
 */
package exam;

import java.util.Scanner;

public class Java_Middle03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		//입력받기
		System.out.println("정수를 입력하세요.");
		int num = stdIn.nextInt();
		if (num==1) {
		System.out.println("1의 약수 : 1");
		if (num==2) {
			System.out.println("2의 약수 : 1 2 " + "소수이다");
			if (num==3) {
				System.out.println("3의 약수 : 1 3 " + "소수이다");
				
				if (num==4) {
					System.out.println("4의 약수 : 1 2 4 ");
					if (num==5) {
						System.out.println("5의 약수 : 1 5 " + "소수이다");
						if (num==6) {
							System.out.println("6의 약수 : 1 2 3 6");
	}

}
}
}
		}
		}
	}
}
