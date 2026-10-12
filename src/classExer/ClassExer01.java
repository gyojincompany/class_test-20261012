package classExer;

public class ClassExer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("소나타", "흰색", 0);
		Car car2 = new Car("아반떼", "검정색", 30);
		
		car1.showInfo();
		car2.showInfo();
		
		car1.pass(65);
	}

}
