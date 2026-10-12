package classExer;

public class MainStudent {

	public static void main(String[] args) {
		
		int a;
		a =10;
		int b=10; //변수의 선언과 동시에 초기화
		
		Student student = new Student();
		Student student2 = new Student();
		Student student3 = new Student("이순신", 65);
		
		student.name = "홍길동";
		student.score = 80;
		
		student2.name = "김유신";
		student2.score = 75;
		
		
		student.introduce();
		boolean pass = student.isPass();
		System.out.println(pass);
		
		if(pass) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		String grade = student.getGrade();
		
		System.out.println(grade);
		
		student.weightScore(100);
		
	}

}
