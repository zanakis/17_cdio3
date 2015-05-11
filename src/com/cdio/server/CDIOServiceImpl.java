package com.cdio.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import com.cdio.client.model.*;
import com.cdio.client.service.CDIOService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class CDIOServiceImpl extends RemoteServiceServlet implements CDIOService {
	private static final long serialVersionUID = 1L;
	private static ArrayList<Integer> ids = new ArrayList<Integer>();
	private static HashMap<Integer, OperatorDTO> ops = new HashMap<Integer, OperatorDTO>();
	
	@Override
	public String createUser(int id, String name, String ini, String cpr,
			String pass) {
		this.id = id;
		if(!idIsValid()) {
			return "Invalid ID";
		}
		if(!((name.length() >= 2) && (name.length() <= 20))) {
			return "Please enter a name between 2 and 20 characters";
		}
		if(!((ini.length() >= 2) && (ini.length() <= 20))) {
			return "Please enter between 2 and 3 initials";
		}
		if(!(cpr.length() == 10)) {
			return "Please enter a CPR nr of 10 characters";
		}
		if(!((pass.length() >= 7) && (pass.length() <= 8))) {
			return "Please enter a password between 7 and 8 characters";
		}
		OperatorDTO operator = new OperatorDTO(id, name, ini, cpr, pass);
		ops.put(id, operator);
		ids.add(id);
		return "Operator added";
	}

	@Override
	public String deleteUser(int id, String pass) {
		if(!ops.containsKey(id)) {
			return "Operator doesn't exist";
		}
		if(ops.get(id).getPassword().equals(pass)) {
			return "Wrong password";
		}
		ops.remove(id);
		return "Operator removes";
	}

	@Override
	public String listUsers() {
		String str = "";
		Collections.sort(ids);
		for(int i = 0; i < ids.size(); i++) {
			str += ops.get(ids.get(i)).toString();
			str += "\n";
		}
		return str;
	}
	
	public boolean idIsValid() {
		if((id >= 1) && (id <= 99999999)) {
			if(!checkIfExists(id)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkIfExists(int id) {
		if(ids.contains(id))
			return true;
		return false;
	}
	
	private int id;
}
