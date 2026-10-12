package privateTest;

public class Board {
	
	private int boardNum; //게시판 글번호
	private String writer; //글쓴이
	private String title; //글제목
	private String content; //글내용
	private String date; //글쓴일자
	private int hit; //조회수
	
	
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Board(int boardNum, String writer, String title, String content, String date, int hit) {
		super();
		this.boardNum = boardNum;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.date = date;
		this.hit = hit;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	public int addHit() {
		return this.hit + 2;
	}

}
