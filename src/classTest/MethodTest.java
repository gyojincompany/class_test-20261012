package classTest;

public class MethodTest {
	
	int value=10; //전역변수
	
//	for(int i=0;i<=5;i++) { //i->지역변수
//		
//	}
	
	// 전역변수와 지역변수의 이름이 같을 때는 지역변수가 우선한다.
	public int test01() {
//		int i=0;
		int num = 100; //지역변수
		return num + value + 100; //200
	}
	
	public int test02() {
		int num = 100; //지역변수
		return num + 200; //300
	}

}
