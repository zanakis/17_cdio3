package com.cdio.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CDIOServiceAsync {
	void createUser(int id, String name, String ini, String cpr, String pass, AsyncCallback callback);
	void deleteUser(int id, String pass, AsyncCallback callback);
	void listUsers(AsyncCallback callback);
}
