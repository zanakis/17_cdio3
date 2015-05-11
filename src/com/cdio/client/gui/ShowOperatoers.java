package com.cdio.client.gui;

import com.cdio.client.service.CDIOServiceClientImpl;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ShowOperatoers extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private Label lbl;
	private CDIOServiceClientImpl serviceImpl;
	
	public ShowOperatoers(CDIOServiceClientImpl serviceImpl){
		initWidget(this.vPanel);
		this.serviceImpl = serviceImpl;
		this.vPanel.add(lbl);
	}
	
	public void updateOperators(String text) {
		lbl.setText(text);
	}
}