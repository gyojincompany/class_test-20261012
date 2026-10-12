package privateTest;

public class Member {
	
	//멤버변수, 생성자 2개, getter, setter
	String id;
	String pass;
	String name;
	int age;
	String address;
	String email;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String pass, String name, int age, String address, String email) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
