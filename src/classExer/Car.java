package classExer;

public class Car {
	
	//model, color, speed
	String model; //자동차 모델
	String color; //자동차 색깔
	int speed; //자동차 속도
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(String model, String color, int speed) {
		super();
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public void showInfo() {
//		System.out.println("모델 : " + model + "\n" + "색상 : " + color + "\n" + "속도 : " + speed);
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("속도 : " + speed);
		System.out.println(); //빈줄 삽입
	}
	
	public String getGrade(int score) {
//	    if (score >= 90) return "A";
//	    if (score >= 80) return "B";
//	    if (score >= 70) return "C";
//	    return "F";
		
		String result;
		if(score >= 90) {
			result = "A";
		} else if(score >= 80) {
			result = "B";
		} else if(score >= 70) {
			result = "C";
		} else {
			result = "F";
		}
		
		return result;
	}
	
	public void pass(int score) {		
		
		String pass = getGrade(score);
		System.out.println("당신의 등급은 " + pass + "등급 입니다");
		
	}
	
	public int pass(int score, int age) {		
		
		String pass = getGrade(score);
		System.out.println("당신의 등급은 " + pass + "등급 입니다");
		
		return 0;
		
	}
	

}
