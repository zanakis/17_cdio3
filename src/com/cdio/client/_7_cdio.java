package com.cdio.client;

import com.cdio.client.service.CDIOServiceClientImpl;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class _7_cdio implements EntryPoint {
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		CDIOServiceClientImpl clientImpl = new CDIOServiceClientImpl(GWT.getModuleBaseURL() + "cdioservice");
		RootPanel.get().add(clientImpl.getMainView());
	}
}
