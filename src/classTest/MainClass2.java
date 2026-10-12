package classTest;

public class MainClass2 {

	public static void main(String[] args) {
		
		ConTest cont2 = new ConTest(); //객체 선언
		ConTest cont = new ConTest(10, "이순신", 85.5); //객체 선언
		ConTest cont3 = new ConTest(15, "김유신");
		ConTest cont4 = new ConTest("강감찬");
		
		
		//number에는 10, name은 이순신, score=85.5 으로 cont 객체를 초기화시오
		
		cont.number = 11;
		cont.name = "김순신";
		cont.score = 89.5;
		
		System.out.println(cont3.name);
		
		System.out.println(cont4.name);
		
		
//		int a = 10;
//		a = 100;
//		int b;
//		b = 10;
		
	}

}
