package kr.ac.kopo.day18;

public class Member {
	
	private String id;
	private String password;
	
	public Member() {
		
	}
	public Member(String id) {
		this.id = id;
	}
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
	
	
