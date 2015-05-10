package com.cdio.server;

import java.util.ArrayList;
import java.util.HashMap;

import com.cdio.client.model.*;;

public class CDIOServiceImpl {

	public void checkValidity() {
//		getid fra operator textbox
		if(!idInput()) {
//			forfra
		}
//		
	}
	
	public boolean idInput() {
		if(id >= 1 && id <= 99999999) {
			if(checkIfExists(id)) {
				oprId = id;
				return true;
			}
		}
		return false;
	}
	
	public boolean checkIfExists(int id) {
		if(ops.containsKey(id))
			return false;
		operator = new OperatorDTO(id, name, ini, cpr, password);
		ops.put(id, operator);
		return true;
	}
	
	private HashMap<Integer, OperatorDTO> ops;
	int id;
	private int oprId;
	private String name;
	private String ini;
	private String cpr;
	private String password;
	private OperatorDTO operator;
}
