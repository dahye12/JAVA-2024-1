/*
 * 
 * 작성일 : 2024.04.19
 * 작성자 : 202213015 컴퓨터공학과 박다혜
 * 
 * 
 * 설명 : Arrays 클래스와 system 클래스에서 제공하는 메소드 연습
 */

import java.util.Arrays;

public class ArrayMethodTest01 {
	public static void main(String[] args) {
		
			    int[] num1 = {9, 1, 7, 3, 5, 4, 6, 2, 8, 0};
				
			    System.out.println("초기배열 : " + Arrays.toString(num1));
				
			    // Arrays.fill()는 배열의 3번지부터 4번지까지 요소를 33으로 채운다.
			    Arrays.fill(num1, 3, 5, 33);
			    System.out.println("fill() 수행 후 : " + Arrays.toString(num1));
			    
			    // Arrays.sort()는 오름차순 정렬한다.
			    Arrays.sort(num1);
			    System.out.println("sort() 수행 후 : " + Arrays.toString(num1));

			    // Arrays.binarySearch() 배열에서 33의 위치를 찾는다.
			    // 이 메소드는 배열의 요소들이 정렬되어 있는 상태에서 사용해야 한다.
			    System.out.println("33은 배열의 " + Arrays.binarySearch(num1,33) + "번째 요소");

			    int[] num2 = {5,4,3,2,1};
			    System.out.println("두 번째 배열 : " + Arrays.toString(num2));
			    // Arrays.equals() 두 배열을 비교하여 결과를 반환.
			    System.out.println("두 개의 배열이 같은가? " + Arrays.equals(num1, num2));
			    
			    int[] num3 = new int[5];
			    // arraycopy()는 num2 배열의 0번지부터 num3배열의 0번지 위치로 3개 복사한다. 
			    // 남은 공간은 디폴트 값으로 저장된다. 0
			    System.arraycopy(num2, 0, num3, 0, 3);
			    System.out.println("복사된 배열 num3 : " + Arrays.toString(num3));
			}
		}