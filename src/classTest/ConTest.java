package classTest;

public class ConTest {
	
	int number;
	String name;
	double score;
	
	public ConTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConTest(int number, String name, double score) {
		super();
		this.number = number;
		this.name = name;
		this.score = score;
	}

	public ConTest(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public ConTest(String name) {
		super();
		this.name = name;
	}
	
	public ConTest(int number) {
		super();
		this.number = number;
	}
	
	public ConTest(double score) {
		super();
		this.score = score;
	}
	
	
	
	
	
	
	
	
	
//	public ConTest() { //기본 생성자 -> 표시 생략 가능
//		
//	}
	
	
	
//	public ConTest(int number, String name, double score) {
//		this.number = number;
//		this.name = name;
//		this.score = score;
//	}
//	
//	//number와 name 만 초기값으로 받는 생성자를 메소드 오버로딩 하시오
//	public ConTest(int number, String name) {
//		this.number = number;
//		this.name = name;		
//	}
//	
//	public ConTest(String name) {		
//		this.name = name;		
//	}

}
