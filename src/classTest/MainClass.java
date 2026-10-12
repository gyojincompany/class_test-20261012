package classTest;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		
		Student student1 = new Student();
		student1.name = "홍길동";
		student1.hakbun = "20261001";
		student1.grade = 3;
		student1.age = 17;
		student1.score = 90;
		
		Student student2 = new Student();
		
		System.out.println(student1.name);
		
		student1.hello();
		student2.hello();
		
		sum = student1.add(10, 20, 30); // 60을 반환해주는 메서드 호출 -> sum = 60
		
		student1.greeting("김유신");
		
		Student.hello2(); //static 메서드는 객체가 선언되지 않아도 호출가능
		
		student1.average(10, 20, 30);
		
		
		
	}

}
