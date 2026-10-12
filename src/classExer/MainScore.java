package classExer;

public class MainScore {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.name = "홍길동";
		student1.score = 75;
		
		student1.introduce();
		
		boolean pass = student1.isPass();
		System.out.println(pass);
		String res = student1.getGrade();
		System.out.println(res);
		student1.weightScore(10);

	}

}
