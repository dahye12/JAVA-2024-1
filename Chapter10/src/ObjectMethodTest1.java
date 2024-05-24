class AAA {
	public int a;
	public int b;
	public double c;
}

public class ObjectMethodTest1 {
	public static void main(String args[]) {
		AAA aa = new AAA();
		System.out.println(aa);  // toString()메소드 자동 호출.  
		System.out.println(aa.toString()); // toString()메소드 명시적 호출.
		
		AAA bb = new AAA();
		System.out.println(bb);
		System.out.println(bb.toString());
		
		AAA cc = new AAA();
		System.out.println(cc);
		System.out.println(cc.toString());
		
		Integer ii = Integer.valueOf(99);  // Integer.valueOf(int) 메서드 사용.
		System.out.println(ii);   // 가진 정수값 출력.
		System.out.println(ii.toString());
	}
}