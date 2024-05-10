//this 시험문제 어디로 따라가서 결과가 나오는지 
//메소드랑 생성자 같은 점 다른 점 : 1. 둘다 기능을 정의 하는 거고 2. 다른 점은 생성자는 클래스이름이고 메소드는 이름을 그에따라 정해주면되는 거고 

class Box4{
	// 다른생성자 호출한다
	// 반드시 첫번째 라인에 위치해야한다. 
	int width,height,depth; //객체변수 
	
	// 생성자. 
	public Box4() {
		this(1,1,1); //-> 다른 생성자 호출 
		System.out.println("매개변수 없는 생성자 수행");
	}
	
	// 생성자 오버로딩 - 정수변수가 3개인거 만들어 
	public Box4(int width, int height, int depth) {
		System.out.println("매개변수 3개 생성자 수행");
		this.width = width;
		this.height = height;
		this.depth = depth;
		
	}
}
public class thisTest04 {

	public static void main(String[] args) {
		Box4 mybox1 = new Box4();
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개변수없음) : " + vol);
		
		 mybox1 = new Box4(10,20,30);
		 vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개변수3개) : " + vol);
		
		
	}

}
