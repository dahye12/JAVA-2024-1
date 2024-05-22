class Box10 {
	private int width;   // private 으로 객체변수 선언
	private int height;
	private int depth;
	private int vol;
	private long idNum;		
	private static long boxID = 0;  // 클래스 변수. static 으로 정의 
	
	// 생성자.
	public Box10(int width, int height, int depth)	{
		this.width = width;
		this.height = height;
		this.depth = depth;
		idNum = ++boxID;
		volume();   // 메소드 호출.
	}
	
	// 리턴 값이 없는 메소드
	private void volume() {
		vol = width * height * depth;		
	}
	
	// 리턴 값이 있는 메소드
	public String getvolume() {
		return idNum +"번 박스의 부피 : "+ vol;
	}
	
	// 클래스 메소드. - 클래스 변수와 지역 변수만 사용 가능.
	public static long getCurrentID() {  
		// return idNum;    // 객체 변수 사용하면 오류 발생.
		return boxID;       // 클래스 변수 사용.
	}   
}

public class Box10Test1 {
	public static void main(String args[]) {
		Box10 mybox1;  // 객체 선언.
		
		// 반복하면서 객체 생성하고 생성자 호출.
		for(int i=1 ; i <= 5 ; i++) {
			mybox1 = new Box10(i, i+1, i+2);
			System.out.println(mybox1.getvolume());
		}
												// 클래스 명으로 메소드 호출.
		System.out.println("마지막 생성된 박스 번호는 "+ Box10.getCurrentID() + "번입니다");
		
		// 클래스 변수 접근. 하지만, private 로 선언되어서 오류..
		//System.out.println(Box10.boxID);	 
	}
}