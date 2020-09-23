package kr.mmem.controller;

import java.util.HashMap;

import kr.mmem.pojo.Controller;
import kr.mmem.pojo.MMemberContentController;
import kr.mmem.pojo.MMemberDeleteController;
import kr.mmem.pojo.MMemberInsertController;
import kr.mmem.pojo.MMemberInsertFormController;
import kr.mmem.pojo.MMemberListController;
import kr.mmem.pojo.MMemberUpdateController;

public class HandlerMapping {
//                 < key  , value> 
	private HashMap<String, Controller> mappings;

	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		initMap(); // ���Ƿ� ���� �Լ�
	}
	// �ڡھơ��֡��ߡڿ�!!!!!!�ڡ�
	private void initMap() {
		//    key   -->     value         : Ű�� ��� ���·� �� �� ����
		// /list.do --> MemberListController
		// /insert.do --> MemberInsertController
		// /insertForm.do --> MemberInsertFormController
		// /delete.do --> MemberDeleteController
		
		//POJO�� �ִ� ���� ���¸� ��ü�� ��  
		try {  //����ó���� ���� Ʈ����,ĳġ
			mappings.put("/list.do", new MMemberListController());
			mappings.put("/insert.do", new MMemberInsertController());
			mappings.put("/insertForm.do", new MMemberInsertFormController());
			mappings.put("/delete.do", new MMemberDeleteController());
			mappings.put("/content.do", new MMemberContentController());
			mappings.put("/update.do", new MMemberUpdateController());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Controller getController(String key) {
		return mappings.get(key);
	}

}
