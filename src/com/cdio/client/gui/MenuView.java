package com.cdio.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class MenuView extends Composite {
	private HorizontalPanel hPanel = new HorizontalPanel();
	private MainView main;


	public MenuView(MainView main) {
		initWidget(this.hPanel);
		this.main = main;


		Button btn1 = new Button("Create Operatoer");
		btn1.addClickHandler(new COClickhandler());
		this.hPanel.add(btn1);

		Button btn2 = new Button("Delete Operatoer");
		btn2.addClickHandler(new DOClickhandler());
		this.hPanel.add(btn2);

		Button btn3 = new Button("Show Operatoers");
		btn3.addClickHandler(new SOClickhandler());
		this.hPanel.add(btn3);
	}
	private class COClickhandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			main.openLandscape1();
		}
	}
	private class DOClickhandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			main.openLandscape2();
		}
	}
	private class SOClickhandler implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			main.openLandscape3();
		}
	}
}
