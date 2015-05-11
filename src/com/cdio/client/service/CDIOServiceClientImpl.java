package com.cdio.client.service;

import com.cdio.client.gui.*;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class CDIOServiceClientImpl implements CDIOServiceClientInt {
	private CDIOServiceAsync service;
	private MainView mainview;
	
	public CDIOServiceClientImpl(String url) {
		System.out.println(url);
		this.service = GWT.create(CDIOService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget)this.service;
		endpoint.setServiceEntryPoint(url);
		
		mainview = new MainView(this);
	}
	
	@Override
	public void createUser(int id, String name, String ini, String cpr,
			String pass) {
		this.service.createUser(id, name, ini, cpr, pass, new CreateUserCallback());
	}

	@Override
	public void deleteUser(int id, String pass) {
		this.service.deleteUser(id, pass, new DeleteUserCallback());
	}

	@Override
	public void listUsers() {
		this.service.listUsers(new ListUserCallback());
	}
	
	public MainView getMainView() {
		return this.mainview;
	}

	/**
	 * 
	 * @author olivier
	 *Ingen anelse om hvordan det virker
	 */
	
	public class CreateUserCallback implements AsyncCallback {
		@Override
		public void onFailure(Throwable caught) {
			System.out.println("Error");
		}

		@Override
		public void onSuccess(Object result) {
			
		}
	}
	
	public class DeleteUserCallback implements AsyncCallback {
		@Override
		public void onFailure(Throwable caught) {
			System.out.println("Error");
		}

		@Override
		public void onSuccess(Object result) {
			
		}
	}
	
	public class ListUserCallback implements AsyncCallback {
		@Override
		public void onFailure(Throwable caught) {
			System.out.println("Error");
		}

		@Override
		public void onSuccess(Object result) {
			
		}
	}
}
