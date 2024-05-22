/*
 * 
 * 작성일 : 2024.04.19
 * 작성자 : 202213015 컴퓨터공학과 박다혜
 * 
 * 
 * 설명 : 배열의 복사 
 * 
 * 		배열의 복사는 값이 복사되는 것이 아닌 주소를 복사한다.
 * 		배열을 복사하면 같은 주소를 가리키게 된다.
 */

import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		int num1[] = {10,20,30};
		int num2[] = {40,50,60};
		
		System.out.println("num1에 저장된 값 : ");
	
		//Arrays.tostring 배열의 내용을 문자열의 형태로 반환하는 메소드.
		// 배열의 내용을 쉽게 확인하고 디버깅하는데 사용.
		System.out.println(Arrays.toString(num1));
		System.out.println("num2에 저장된 값 : ");
		System.out.println(Arrays.toString(num2));
		
		System.out.println("--------------");
		
		// 배열명을 이용하여 배열복사
		// 같은 주소를 가리킨다. 주소가 복사된다.
		System.out.println("배열 복사 후");
		System.out.println("num1에 저장된 값 : ");
		System.out.println(Arrays.toString(num1));
		System.out.println("num2에 저장된 값 : ");
		System.out.println(Arrays.toString(num2));
		
		System.out.println("--------------");
		
		int num[] = {1, 2, 3, 4, 5};
		
		num2[2] = 200; // num[2] 요소의 값을 200으로 변경
		System.out.println("num[2] = 200");
		System.out.println("num1에 저장된 값 : ");
		System.out.println(Arrays.toString(num1));
		System.out.println("num2에 저장된 값 : ");
		System.out.println(Arrays.toString(num2));
		// 같은 주소를 가리키기 때문에 num1[2]와 num2[2]의 요소가 모두 200된다.
		

		System.out.println("--------------");
		int num3 [] = { 100,200,300 } ;
		int num4 [] = { 400,500,600 } ;
		System.out.println("배열 원본 값");
		System.out.println("num3에 저장된 값 : ");
		System.out.println(Arrays.toString(num3));
		System.out.println("num4에 저장된 값 : ");
		System.out.println(Arrays.toString(num4));
		
		
		System.out.println("--------------");
		//배열 걊 복사 
		for(int i = 0; i < num3.length; i++) {
			num4[i] = num3[i]; //배열의 값을 각각 복사
			
		}
		
		System.out.println("배열값 복사후");
		System.out.println("num3에 저장된 값 : ");
		System.out.println(Arrays.toString(num3));
		System.out.println("num4에 저장된 값 : ");
		System.out.println(Arrays.toString(num4));
		
		System.out.println("--------------");
		num4[2] = 999;
		System.out.println("num4[2] = 999");
		System.out.println("num3에 저장된 값 : ");
		System.out.println(Arrays.toString(num3));
		System.out.println("num4에 저장된 값 : ");
		System.out.println(Arrays.toString(num4));
		// num4[2] = 999만 바뀐다.
		
	}

}
