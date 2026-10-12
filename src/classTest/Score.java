package classTest;

public class Score {
	
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	
	public Score() { //기본 생성자
		
	}

	public Score(int kor, int eng, int math) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Score(int kor, int eng) {
		super();
		this.kor = kor;
		this.eng = eng;
	}

	public Score(int kor) {
		super();
		this.kor = kor;
	}
	
//	public Score(int eng) {
//		super();
//		this.eng = eng;
//	}
//	
//	public Score(int math) {
//		super();
//		this.math = math;
//	}
	
	
	
	
	

}
