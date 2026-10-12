package classExer;

public class MethodTest {
	
	//문제 1번 메서드
	public void printStar(int count) {
		for(int i=1;i<=count;i++) {
			System.out.printf("*");			
		}
		System.out.println(); //*를 전부 출력한 이후에 한줄 띄기
	}
	
	//문제 2번 메서드
	public int max(int a, int b) {
		
		if(a > b) {
			return a;
		}
		
		return b;
	}
	
	//문제 3번 메서드
}
