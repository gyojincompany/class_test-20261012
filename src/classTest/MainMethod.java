package classTest;

public class MainMethod {

	public static void main(String[] args) {
		
//		String pass;
		
		Member member1 = new Member(); //member1 객체 선언
		
		member1.memberId = "tiger";
		member1.memberPw = "12345";
		member1.memberName = "홍길동";
		member1.memberAge = 17;
		member1.memberAddr = "서울특별시 강남구";
		
		Member member2 = new Member("lion", "8888", "이순신", 30, "서울특별시 용산구");
		
		//adultPass 메서드를 호출
		//매개변수가 없는 메서드 이므로 인수를 넣지 않고 호출함
		String pass = member1.adultPass(); //미성년 반환 -> pass 문자열 변수로 받음
		
		System.out.println(pass);
		
		pass = member2.adultPass(); //성년 반환 -> pass 문자열 변수로 받음
		
		System.out.println(pass);

	}

}
