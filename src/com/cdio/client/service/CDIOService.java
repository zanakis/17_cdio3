package com.cdio.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("cdioservice")
public interface CDIOService extends RemoteService {
	void createUser(int id, String name, String ini, String cpr, String pass);
	void deleteUser(int id, String pass);
	void listUsers();
}
