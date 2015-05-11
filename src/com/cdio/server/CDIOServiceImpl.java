package com.cdio.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import com.cdio.client.model.*;
import com.cdio.client.service.CDIOService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class CDIOServiceImpl extends RemoteServiceServlet implements CDIOService {
	private static final long serialVersionUID = 1L;
	private static ArrayList<Integer> ids = new ArrayList<Integer>();
	private static HashMap<Integer, OperatorDTO> ops = new HashMap<Integer, OperatorDTO>();
	
	@Override
	public void createUser(int id, String name, String ini, String cpr,
			String pass) {
		this.id = id;
		if(!idIsValid()) {
//			print not valid message
			return;
		}
		if(!((name.length() >= 2) && (name.length() <= 20))) {
//			print not valid message
			return;
		}
		if(!((ini.length() >= 2) && (ini.length() <= 20))) {
//			print not valid message
			return;
		}
		if(!(cpr.length() == 10)) {
//			print not valid message
			return;
		}
		if(!((pass.length() >= 7) && (pass.length() <= 8))) {
//			print not valid message
			return;
		}
		operator = new OperatorDTO(id, name, ini, cpr, pass);
		ops.put(id, operator);
		ids.add(id);
	}

	@Override
	public void deleteUser(int id, String pass) {
		if(!ops.containsKey(id)) {
//			error message
			return;
		}
		if(ops.get(id).getPassword().equals(pass)) {
//			error message
			return;
		}
		ops.remove(id);
	}

	@Override
	public void listUsers() {
		Collections.sort(ids);
		for(int i = 0; i < ids.size(); i++) {
//			print det på en måde
			System.out.println(ops.get(ids.get(i)));
		}
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
	private OperatorDTO operator;
}
