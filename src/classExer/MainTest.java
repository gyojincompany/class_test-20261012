package classExer;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		
		MethodTest method = new MethodTest(); //객체 생성
		MethodTest method2 = new MethodTest(); //객체 생성
		MethodTest method3 = new MethodTest(); //객체 생성
		
		method.printStar(5);
		
		int result = method.max(10, 25);
		
		System.out.println(result);
		
		
	}

}
