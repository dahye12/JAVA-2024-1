/*
 * 작성일 : 2024년 4월 30일




 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 2차원 배열을 생성하고, 랜덤수를 배열의 초기값으로 설정합니다
 */


import java.util.Random;
import java.util.Arrays;

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
		System.out.println(""); // 줄바꿈 
		// 2처원 배열의 내용을 문자열로 출력 
		System.out.println(Arrays.deepToString(num)); 
		
	
	}

}

/* 각 줄의 칸의 값들을 합하여 출력하시오.
// 0번 줄의 1,2,3칸의 합을 계산한다.
// 1번 줄의 1,2,3칸의 합을 계산한다.
// 2번 줄의 1,2,3칸의 합을 계산한다.
// 3번 줄의 1,2,3칸의 합을 계산한다.
// 줄을 기준으로 각 칸의 합을 계산하고, 각 줄에 합을 출력한다.
// 한 줄의 합이 계산되어 출력되면 다음 줄의 합을 계산하기 위해 
// sum = 0 으로 다시 초기화된다. */
for (jul = 0; jul <num.length; jul++) {
	sum =0;// 다시 초기화 
}
	for(kan = 0; kan < 4; kan++) {
		sum = sum + num[jul].length; // 합계 계산
	System.out.print(num[jul][kan] + " ");

	}
	System.out.println("합 : " + sum); // 줄바꿈 
	}
	
	}
	
	


// 각 줄과 각 칸의 합을 구하는 걸 해보시오 
