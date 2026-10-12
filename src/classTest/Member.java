package classTest;

public class Member {
	
	
	//아이디, 비밀번호, 회원이름, 회원나이, 회원주소
	String memberId; //회원 아이디
	String memberPw; //회원 비밀번호
	String memberName; //회원 이름
	int memberAge; //회원 나이
	String memberAddr; //회원 주소
	
	
	
	
	public Member() {
		
	}

	public Member(String memberId, String memberPw, String memberName, int memberAge, String memberAddr) {
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberAddr = memberAddr;
	}



	public String adultPass() { //"성년" or "미성년" 문자열 반환
		
		if(this.memberAge <= 19) { //참이면 미성년
			return "미성년";
		}
		
		return "성년";
	}
	
//	public void adultPass() { //"성년" or "미성년" 문자열 반환
//		
//		if(this.memberAge <= 19) { //참이면 미성년
//			System.out.println("미성년");
//		} else {
//			System.out.println("성년");
//		}		
//		
//	}
	
}
