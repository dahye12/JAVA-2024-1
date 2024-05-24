class ST3a {
	public int inum;
	public double dnum;
	
	public ST3a(int inum) {    // 생성자
		System.out.println("ST3a(int inum) 생성자 수행");
		
		this.inum = inum * inum ;
		System.out.println("ST3a의 this.inum : "+ this.inum + "\n");
	}
	
	public ST3a(double dnum) {  // 생성자 오버로딩
		System.out.println("ST3a(double dnum) 생성자 수행");
		
		this.dnum = dnum * dnum ;
		System.out.println("ST3a의 this.dnum : "+ this.dnum + "\n");
	}
}	

class ST3b extends ST3a {
	public ST3b(int inum) {  // 생성자
		super(inum);    // 상위 클래스의 명시적 생성자 호출
		System.out.println("ST3b(int inum) 생성자 수행");
		
		this.inum = this.inum * inum ;   
		System.out.println("ST3b의 this.inum : " + this.inum + "\n\n");
	}
	
	public ST3b(double dnum) {  // 생성자 오버로딩
		super(dnum);      // 상위 클래스의 명시적 생성자 호출
		System.out.println("ST3b(double dnum) 생성자 수행");
		
		this.dnum = this.dnum * dnum ;  
		System.out.println("ST3b의 this.dnum : "+ this.dnum + "\n");
	}
}

public class SuperTest3 {
	public static void main(String args[]) {
		ST3b sub1 = new ST3b(10);
		ST3b sub2 = new ST3b(10.5);
	}
}