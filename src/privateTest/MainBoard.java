package privateTest;

public class MainBoard {

	public static void main(String[] args) {
		
		int a = 10;
		
		Board board = new Board();
		
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		
//		board.boardNum = 1;
//		board.writer = "홍길동";
//		board.title = "안녕하세요";
//		board.content = "오늘 날씨좋아요";
//		board.date = "2026-10-01";
//		board.hit = 0;
		
		board.setBoardNum(1); //메서드를 통해서 board 객체의 boardNum 멤버변수값을 1로 초기화
//		System.out.println(board.boardNum); // ->private 접근제어자 이므로 실패!
		System.out.println(board.getBoardNum()); // ->boardNum값인 1을 반환
		
		System.out.println(board);
		
	}

}
