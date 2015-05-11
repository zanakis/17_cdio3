package com.cdio.client.service;

public interface CDIOServiceClientInt {
	void createUser(int id, String name, String ini, String cpr, String pass);
	void deleteUser(int id, String pass);
	void listUsers();
}
