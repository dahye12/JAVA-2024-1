/* 
 * 작성일 : 2024년 5월 21일 
 * 작성자 : 202213015 컴퓨터공학과 박다혜 
 * 설명 : 상속과 한정자
 * 
 */
class A {
	public int aa = 1;  // 멤버변수. 모두 접근 가능.
	
}
// A 클래스 상속
class B extends  A {
	private int bb = 2; // 멤버변수. 모두 접근 가능.
	public int bb() { //메소드.모두 접근 가능
		return bb; // 이 메소드를 이용하여 외부에서는 접근이 불가능한 bb를 사용할수있다
	// 이 클래스에는 aa, bb, bb()가있다. aa에 접근가능한가요? 하면 접근가능함 
	}
}
class C extends B {
	// 이 클래스에는 aa, bb, cc, bb()가 있다. 
	int cc = 3; // 한정자 없음. 같은 패키지 내에서만 접근 가능. 
}
public class inheritanceTest1 {

	public static void main(String[] args) {
		C objc = new C();
		System.out.println("cc의 값은 ? " + objc.cc); //3
		System.out.println("bb의 값은 ? " + objc.bb); //오류발생 bb는 private변수로 선언돼있으니까 오류
		// 그럼 bb 값 출력 받으려면? -> 메소드로 접근하면 됨 ->System.out.println("bb의 값은 ? " + objc.bb());
		System.out.println("aa의 값은 ? " + objc.aa);
	}

}
