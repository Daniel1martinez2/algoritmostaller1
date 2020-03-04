package view;

import controller.Sc1LoginControl;
import processing.core.PApplet;
import controlP5.*;
import processing.core.PFont;

public class Sc1LoginView {
	private ControlP5 cp5;
	private PApplet app;

	//private PFont font = app.createFont("arial", 20);
	Sc1LoginControl sc1login;
	String textValue = "";

	public Sc1LoginView(PApplet app) {
		this.app = app;
		cp5 = new ControlP5(app);

		sc1login = new Sc1LoginControl();
		
		cp5.addTextfield("input")
		.setPosition(20, 100)
		.setSize(200, 40)
		//.setFont(font)
		.setFocus(true)
		.setColor(app.color(255, 0, 0));
		//app.textFont(font);

	}

	public void drawScreen1() {
		app.background(0);
		app.fill(255);
		app.text(cp5.get(Textfield.class, "input").getText(), 360, 130);
		//app.text(textValue, 360, 180);

	}
	void controlEvent(ControlEvent theEvent) {
		  if(theEvent.isAssignableFrom(Textfield.class)) {
			  System.out.println("controlEvent: accessing a string from controller '"
		            +theEvent.getName()+"': "
		            +theEvent.getStringValue()
		            );
		  }
		}
	public void input(String theText) {
		  // automatically receives results from controller input
		  System.out.println("a textfield event for controller 'input' : "+theText);
		}

}
