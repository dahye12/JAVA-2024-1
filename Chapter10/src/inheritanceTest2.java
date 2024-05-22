/* 
 * 작성일 : 2024년 5월 21일 
 * 작성자 : 202213015 컴퓨터공학과 박다혜 
 * 설명 : 상속과 우선순위 
 * 
 */
class B1 {
	public int x = 500;
	public int y = 1000;
}
class B2 extends B1 {
	public String x = "오늘은 화요일입니다.";
	// 이 클래스에는 y,x가있다. 
}
public class inheritanceTest2 {

	public static void main(String[] args) {
		B1 b1 = new B1();
		System.out.println("객체 b1에 들어있는 x,y 값 : " + b1.x + " ," + b1.y);
		B2 b2 = new B2();
		System.out.println("객체 b2에 들어있는 x,y 값 : " + b2.x + " ," + b2.y);
	}
}
/* 같은 이름으로 선언된 멤버변수의 경우 
* 상위 클래스의 멤버변수는 가려진다.
* 하위 클래스의 멤버변수가 우선순위다.
*/


