/* 클래스 속성알기 ? 클래스는 형틀
 * 작성일 : 2024년 4월 30일
 * 작성자 : 202213015 컴퓨터공학과 박다혜
 * 설명 : PlusMinus 클래스 생성,
 * 		더하기, 빼기 계산하는 기능이 있다. 
 */
public class PlusMinus {
	//속성 정의
	// 변수 생성.
	int plus, minus;
	
	// 기능(메서드) 정의 
	// plus 기능 
	// 2개의 정수형 값을 전달 받아 합계를 구한 값을 돌려준다.
	
	public String plus(int x, int y) {
		plus = x + y; //plus 파랑(변수,for처럼)검은(메소드 이름,public 에서 선언한 거랑 다른거임 둘다 다른 거임  
		return " 두수의 합은" + plus; 
	}
			
	//minus 기능 
	public String minus(int x, int y) {
		plus = x - y;
		return " 두수의 차는" + minus;

}
}
