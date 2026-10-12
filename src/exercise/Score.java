package exercise;

public class Score {
	int kor;
	int eng;
	int math;
	
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Score(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	public void printScore() {
		System.out.println("총점 : " + (kor + eng + math) + "점"); //총점출력
		System.out.println("평균 : "+((kor+eng+math)/3.0)+"점"); //평균출력
	}
	
	public void printPass() {
		
		double avg = (kor+eng+math)/3.0; //평균점수
		
		if(avg >= 90) {
			System.out.println("우수");
		} else if(avg < 60) {
			System.out.println("재시험");
		} else {
			System.out.println("보통");
		}
	}
}
