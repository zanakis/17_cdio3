package com.cdio.client.gui;

import com.cdio.client.service.CDIOServiceClientImpl;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class DeleteOperatoer extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private TextBox tbox1;
	private TextBox tbox2;
	CDIOServiceClientImpl serviceImpl;
	
	public DeleteOperatoer(CDIOServiceClientImpl serviceImpl) {
		initWidget(this.vPanel);
		this.serviceImpl = serviceImpl;
		
		Label l1 = new Label("Id");
		tbox1 = new TextBox();
		Button btn1 = new Button("Click");
		
		
		Label l2 = new Label("Password");
		tbox2 = new TextBox();
		
		this.vPanel.add(l1);
		this.vPanel.add(tbox1);
		
		this.vPanel.add(l2);
		this.vPanel.add(tbox2);
		
		this.vPanel.add(btn1);
		
		btn1.addClickHandler(new txt1click());
	}
	private class txt1click implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			String Text1 = new DeleteOperatoer().tbox1.getText();
			String Text2 = new DeleteOperatoer().tbox1.getText();
			String Text3 = new DeleteOperatoer().tbox1.getText();
			String Text4 = new DeleteOperatoer().tbox1.getText();
			String Text5 = new DeleteOperatoer().tbox1.getText();
			System.out.println(Text1);
		}
	}
}
