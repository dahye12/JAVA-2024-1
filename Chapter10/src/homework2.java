

class Car{
	String name, color;
    int speed;

    public Car(String name){
       this.name = name;
    }

    public Car(String name, String color){
       this.name = name;
       this.color = color;
    }

    public Car(String name, String color, int speed){
       this.name = name;
       this.color = color;
       this.speed = speed;
    }
    public void printCar(){
       System.out.println("이름 = "+name+", 색깔 = "+color+", 속도 = "+speed);
    }
}

public class homework2 {
    public static void main(String args[]){
       Car so = new Car("제네시스","검정",240); 
       so.printCar();
       Car ti = new Car("BMW","빨강",200);
       ti.printCar();
    }
}