package classExer;

public class Student {
	
	String name; //학생 이름
	int score; //학생 점수
	
	
	public Student() { //기본 생성자
		
	}
	
	public Student(String name, int score) {
		
		this.name = name;
		this.score = score;
	}



	public void introduce() { //이름과 점수 출력
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + score);
	}
	
	public boolean isPass() { //score가 60이상이면 true 반환
		
		if(score >= 60) {
			return true;
		}
		
		return false;
	}
	
	public String getGrade() { //점수에 따라 A/B/C/F 반환
		
		String result;
		
		if(score >= 90) {
			result = "A";
		} else if(score >= 80) {
			result = "B";
		} else if(score >= 70) {
			result = "C";
		} else {
			result = "F";
		}
		
		return result;
	}
	
	//가산점을 전달받아 학생의 점수(score)+가산점을 출력하시오
	public void weightScore(int score) {
		System.out.println(this.score + score);
	}
	
	
	
	
	
	
	
	

}
