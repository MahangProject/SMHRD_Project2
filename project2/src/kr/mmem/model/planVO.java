package kr.mmem.model;

public class planVO {
	private String id;
	private String do_date; //?
	private String alarm;
	private String do_list1;
	private int success1;//do_list1 성공여부 
	private String book_name;
	private int page;// 도서 페이지
	private int success; //책 읽었는지?
	private int mission_score;//점수??

	
	//생성자 생성

	

	public planVO(String do_list1, int success1, int mission_score) {
		this.do_list1 = do_list1;
		this.success1 = success1;
		this.mission_score = mission_score;
	}



	public planVO(String id, String do_date, String alarm, String do_list1, int success1, String book_name, int page,
			int success, int mission_score) {
		super();
		this.id = id;
		this.do_date = do_date;
		this.alarm = alarm;
		this.do_list1 = do_list1;
		this.success1 = success1;
		this.book_name = book_name;
		this.page = page;
		this.success = success;
		this.mission_score = mission_score;
	}




	public planVO(String do_list1, int success1) {
		this.do_list1 = do_list1;
		this.success1 = success1;
	}



	//getter setter 생성.
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getDo_date() {
		return do_date;
	}


	public void setDo_date(String do_date) {
		this.do_date = do_date;
	}


	public String getAlarm() {
		return alarm;
	}


	public void setAlarm(String alarm) {
		this.alarm = alarm;
	}


	public String getDo_list1() {
		return do_list1;
	}


	public void setDo_list1(String do_list1) {
		this.do_list1 = do_list1;
	}





	public String getBook_name() {
		return book_name;
	}


	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}


	public int getSuccess() {
		return success;
	}


	public void setSuccess(int success) {
		this.success = success;
	}


	public int getSuccess1() {
		return success1;
	}


	public void setSuccess1(int success1) {
		this.success1 = success1;
	}





	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}


	public int getMission_score() {
		return mission_score;
	}


	public void setMission_score(int mission_score) {
		this.mission_score = mission_score;
	}
	
	

	
	
	
	
}
