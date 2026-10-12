package classTest;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score score1 = new Score(90); //국어점수 90점		
		
		
		System.out.println(score1.kor);
		
		//영어점수 85점으로 객체의 선언과 동시에 초기화시오. -> 불가능
		Score score2 = new Score();
		score2.eng = 85;
		
		//국어 90, 영어 70, 수학 100 점을 객체의 선언과 동시에 초기화하시오.
		Score score3 = new Score(90, 70, 100);
	}

}
