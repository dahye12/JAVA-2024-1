/*
 * 작성일 : 2024년 4월 5일

 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 정수를 입력받아 그 수의 약수를 출력하시오. (for랑 while 둘다 해보시오)
 * 
 * 문제분석 : (for 기준) 
 * 약수는 어떤 수를 나누어 딱 떨어지는 수이다. 나머지가 0인 수 
 * 1부터 입력받은 수까지 반복하면서 
 * 0으로 나누어 나머지가 0이 되는지 판단한다
 * 1은 수로 나누어 나머지가 0인가?
 * 2는 수로 나누어 나머지가 0인가?
 * 3은 수로 나누어 나머지가 0인가?
 *  : 
 *   23은 수로 나누어 나머지가 0인가?
 * 
 * 알고리즘 : 1. 정수를 입력받는다
 * 2. 1부터 입력받은 수 까지 1씩 증가하면서 반복한다.
 * 2-1 입력받은 수를 수로 나누어 나머지가 0이면 
 * (1) 그 수를 출력한다
 * 
 */
import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		// 키보드로부터 입력 받기 위해 Scanner 객체 생성.


		Scanner stdIn = new Scanner(System.in);
		//1. 단을 입력받는다.
		System.out.print("정수 입력 : ");
        int number = stdIn.nextInt();
        System.out.println(number + "의 약수는:");
        
        // 약수 출력
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
	}
}
           
                
   


