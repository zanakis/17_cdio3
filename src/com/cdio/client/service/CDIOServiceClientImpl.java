package com.cdio.client.service;

import com.cdio.client.gui.MainView;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int id, String pass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listUsers() {
		// TODO Auto-generated method stub
		
	}
	
	public MainView getMainView() {
		return this.mainview;
	}

	public class DefaultCallback implements AsyncCallback {

		@Override
		public void onFailure(Throwable caught) {
			System.out.println("Error");
		}

		@Override
		public void onSuccess(Object result) {
			
		}
		
	}
}
