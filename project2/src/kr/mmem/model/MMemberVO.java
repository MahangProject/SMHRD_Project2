package kr.mmem.model;

public class MMemberVO {
	private String id;
	private String pw;
	private String name;
	private String email;
	private int age;
	private String gender;
	private int rses;
	
	public MMemberVO(String id, String pw, String name, String email, int age, String gender) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}

	public MMemberVO(String id, String pw, String name, String email, int age, String gender, int rses) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.rses = rses;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getRses() {
		return rses;
	}

	public void setRses(int rses) {
		this.rses = rses;
	}
}
