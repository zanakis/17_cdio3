package com.cdio.client.gui;

import com.cdio.client.service.CDIOServiceClientImpl;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private VerticalPanel contentPanel;
	private Composite currentLandscape;
	private CDIOServiceClientImpl serviceImpl;

	public MainView(CDIOServiceClientImpl serviceImpl){
		initWidget(this.vPanel);
		this.currentLandscape = this;
		this.serviceImpl = serviceImpl;
		
		this.vPanel.setBorderWidth(1);
		
		MenuView menu = new MenuView(this);
		this.vPanel.add(menu);
		
		this.contentPanel = new VerticalPanel();
		this.vPanel.add(contentPanel);
		
		Label textLbl = new Label("Press a button to see a nice landscape");
		this.contentPanel.add(textLbl);
	}
	
	public Composite getLandscape() {
		return currentLandscape;
	}
	
	public void openLandscape1(){
		this.contentPanel.clear();
		CreateOperatoer page1 = new CreateOperatoer(serviceImpl);
		this.currentLandscape = page1;
		this.contentPanel.add(page1);
	}
	public void openLandscape2(){
		this.contentPanel.clear();
		DeleteOperatoer page2 = new DeleteOperatoer(serviceImpl);
		this.currentLandscape = page2;
		this.contentPanel.add(page2);
	}
	public void openLandscape3(){
		this.contentPanel.clear();
		ShowOperatoers page3 = new ShowOperatoers(serviceImpl);
		this.currentLandscape = page3;
		this.contentPanel.add(page3);
	}
}
