package kr.mmem.model;

public class BookVO {
	private int b_number;
	private String b_name;
	private String b_category;
	private String b_url;
	
	public BookVO(int b_number, String b_name, String b_category, String b_url) {
		this.b_number = b_number;
		this.b_name = b_name;
		this.b_category = b_category;
		this.b_url = b_url;
	}
	
	public int getB_number() {
		return b_number;
	}
	public void setB_number(int b_number) {
		this.b_number = b_number;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_category() {
		return b_category;
	}
	public void setB_category(String b_category) {
		this.b_category = b_category;
	}
	public String getB_url() {
		return b_url;
	}
	public void setB_url(String b_url) {
		this.b_url = b_url;
	}
}
