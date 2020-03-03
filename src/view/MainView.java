package view;

import processing.core.PApplet;
import controlP5.*; 

public class MainView extends PApplet {
	private ControlP5 cp5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.MainView");

	}
	
	public void settings() {
		size(500, 500);

	}

	public void setup() {
		cp5 = new ControlP5(this);
		// ahora un ejemplo
		cp5.addButton("boo")
		.setValue(0)
		.setPosition(200, 200)
		.setSize(400, 200);

	}

	public void draw() {

	}

}
