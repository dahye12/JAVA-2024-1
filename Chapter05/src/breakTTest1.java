 /*작성일 : 2024년 4월 12일

 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 :1부터 입력받은 수까지 합계
 * 
 *
*/
import java.util.Scanner;

public class breakTTest1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println("수를 입력하세요 ");
		int input = stdIn.nextInt();
		int sum=0, num = 1;
		
	while(true) { 
		
		sum = num + sum;
		if ( input <= num) 
			break;
		num++;
		
	}
	System.out.println("1~10까지 합은 " + sum + "입니다."); 
	}

}
