package classTest;

public class Student {
	
	//멤버변수 선언(속성, 필드)
	String name; //학생 이름
	String hakbun; //학생 학번
	int grade; //학생 학년
	int age; //학생 나이
	int score; //입학 성적
	
	public void hello() { //반환값(리턴값)이 없는 메서드 -> 반환타입을 void로 선언
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		System.out.println("감사합니다");
	}
	
	public int add(int num1, int num2, int num3) { //외부로부터 두개의 수를 입력받아 그 두 수의 합을 반환하는 메서드
		
		return num1 + num2 + num3; //반환값
	}
	
	public double average(int num1, int num2, int num3) { //외부로부터 두개의 수를 입력받아 그 두 수의 합을 반환하는 메서드
		
		double result;
		
		result = add(num1, num2, num3)/3.0;
		
		return result; //반환값
	}
	
	public void greeting(String str) { //매개변수는 존재하고 반환값은 없는 메서드
		System.out.println(str + "님 안녕하세요!!");
//		return str;
	}
	
	public int numout() { //매개변수는 없고 반환값만 존재하는 메서드
		int sum;
		int result;
		sum = 100+200;
		result = 1000+2000;
//		return sum, result; //->자바에서 메서드는 오직 1개의 반환값만을 가질 수 있다!
		return sum;
//		return result;
	}
	
	public static void hello2() {
		System.out.println("helloworld!!");
	}
	
	public String pass(int score) {
		if(score >=80) {
			return "A";
		} else {
			return "b";
		}
		
//		return "c";
	}
	
	
	
}
