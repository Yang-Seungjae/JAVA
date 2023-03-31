package kr.ac.kopo.day19;

public class Member {
//	
//	// alt + shift + s  누른후 
//	c 선택시 디폴트 생성자 
//	o 누를시 매개변수를 가진 생성자 
//	r누를시 get , set 메소드 생성
//  s누를시 toString 메소드 생성 
//  v누를시 override 메소드 생성	

	private String id;
	private String password;
	
	
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Member(String id) {
		super();
		this.id = id;
	}


	public Member(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}


	@Override
	public String toString() {
		return "HomeworkAnswer [id=" + id + ", password=" + password + "]"; // toString 메소드가 뭔지 공부하기 
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
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
