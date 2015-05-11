package com.cdio.client.gui;

import com.cdio.client.service.CDIOServiceClientImpl;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CreateOperatoer extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();

	private TextBox tbox1;
	private TextBox tbox2;
	private TextBox tbox3;
	private TextBox tbox4;
	private TextBox tbox5;
	private CDIOServiceClientImpl serviceImpl;
	
	public CreateOperatoer(CDIOServiceClientImpl serviceImpl){
		initWidget(this.vPanel);
		this.serviceImpl = serviceImpl;
		
		Button btn1 = new Button("Click");
		Label l1 = new Label("Id");
		tbox1 = new TextBox();

		Label l2 = new Label("Navn");
		tbox2 = new TextBox();

		Label l3 = new Label("Initialer");
		tbox3 = new TextBox();

		Label l4 = new Label("Cpr");
		tbox4 = new TextBox();

		Label l5 = new Label("Password");
		tbox5 = new TextBox();


		this.vPanel.add(l1);
		this.vPanel.add(tbox1);
		this.vPanel.add(l2);
		this.vPanel.add(tbox2);
		this.vPanel.add(l3);
		this.vPanel.add(tbox3);
		this.vPanel.add(l4);
		this.vPanel.add(tbox4);
		this.vPanel.add(l5);
		this.vPanel.add(tbox5);
		this.vPanel.add(btn1);



		btn1.addClickHandler(new txt1click());
	}
	private class txt1click implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			String Text1 = new CreateOperatoer().tbox1.getText();
			String Text2 = new CreateOperatoer().tbox2.getText();
			String Text3 = new CreateOperatoer().tbox3.getText();
			String Text4 = new CreateOperatoer().tbox4.getText();
			String Text5 = new CreateOperatoer().tbox5.getText();
			System.out.println(Text1);
		}
	}
}
