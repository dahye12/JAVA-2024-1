// 1부터 5까지 숫자를 출력하는데 숫자가 3일때는 출력을 건너뛰어야함
public class Practice2 {

	public static void main(String[] args) {
		
		
		int i = 1;
		while (i <=5) {
			if(i==3) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
			
		}
		
	}

}
