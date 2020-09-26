package kr.mmem.model;

public class planVO {
	private String id;
	private String do_date; //?
	private String alarm;
	private String do_list1;
	private int success1;//do_list1 己傍咯何 
	private int mission_score;//痢荐??

	
	//积己磊 积己

	

	public planVO(String do_list1, int success1, int mission_score) {
		this.do_list1 = do_list1;
		this.success1 = success1;
		this.mission_score = mission_score;
	}

	public planVO(String id, String do_date, String alarm, String do_list1, int success1, int mission_score) {
		super();
		this.id = id;
		this.do_date = do_date;
		this.alarm = alarm;
		this.do_list1 = do_list1;
		this.success1 = success1;
		this.mission_score = mission_score;
	}

	public planVO(String do_list1, int success1) {
		this.do_list1 = do_list1;
		this.success1 = success1;
	}

	//getter setter 积己.
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

	public int getSuccess1() {
		return success1;
	}

	public void setSuccess1(int success1) {
		this.success1 = success1;
	}

	public int getMission_score() {
		return mission_score;
	}

	public void setMission_score(int mission_score) {
		this.mission_score = mission_score;
	}
}
