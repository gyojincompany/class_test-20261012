package classTest;

public class MethodOverloadTest {
	
	public int add() {
		return 100;
	}
	
	public int add(int a) {
		return a + 100;
	}
	
	public int add(int a, int b) {
		return a + 100;
	}
	
	public int add(double a) {
		return (int) a + 100;
	}
	
	public int add1(int a, int b) {
		return a+b;
	}
	
	public int add1(int a, int b, int c) {
		return a+b+c;
	}
	
	public int add1(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
//	add(100); //-> 이름이 같은 메서드가 존재하므로 호출 불가 에러 발생
//	add(100) -> 에러 안남
//	add(100,200) -> 에러 안남
//	add(10.7) -> 에러 안남
	
}
