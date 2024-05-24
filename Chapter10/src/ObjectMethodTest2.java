class AAA1 {
	public int a=10;
	public String toString() {  //toString 메소드 오버라이딩하여 사용.
		return "AAA1 클래스 객체, 속성 a의 값은 : " + a;
	}
}
public class ObjectMethodTest2 {
	public static void main(String args[]) {
		AAA1 aa = new AAA1();
		System.out.println(aa);  // 오버라이딩 된 toString()메소드 호출.  
		System.out.println(aa.toString());
	}
}