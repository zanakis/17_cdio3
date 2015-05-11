package com.cdio.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("cdioservice")
public interface CDIOService extends RemoteService {
	String createUser(int id, String name, String ini, String cpr, String pass);
	String deleteUser(int id, String pass);
	String listUsers();
}
