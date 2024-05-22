/*
 * 작성일 : 2024년 4월 5일

 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 전체 구구단 작성하기 
 * 
 * 문제분석 : 
 * 단은 2~9까지 
 * 곱하는 수는 1~9까지 
 * 2단 출력하고, 3단 출력하고,... 9단 출력한다. 
 * 
 * 알고리즘 : 
 * ----for----
 * 1. 단은 2부터 9까지 반복한다.
 * =0단 = 출력 
 * 1-1. 곱하는 수는 1부터 9까지 반복한다. 
 * 1-1-1. 
 *---while---- 
 * 1. 단은 2단부터 
 * 2. 단은 9단까지 
 * 2-1 수는 1부터 
 * 2-2 수는 9까지 반복  
 * 2-2-1 구구단 출력한다. 
 * 2-2-2 수를 1증가시킨다.
 * 2-3 단을 1증가 시킨다 
 * 
 * 
 * 
  */
public class nestedLoopTest1 {

	public static void main(String[] args) {
		 // for 반복문으로 구구단 출력
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // 한 줄 띄우기
        }
        // while 반복문으로 
        int i = 2;
        while (i <= 9) {
        	System.out.println(i + "단");
        int j = 1;
        while (j <= 9) {
        System.out.println(i + " x " + j + " = " + (i * j));
        j++;
    }
    System.out.println(); // 한 줄 띄우기
    i++;
}
}
}
