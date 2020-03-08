package controller;

import model.Tesla;
import processing.core.PApplet;
import processing.core.PImage;

public class CompraControl {
	PApplet app;
	Tesla tesla;

	public CompraControl(PApplet app) {
		this.app = app;
		tesla = new Tesla(app);

	}
	public void creocarro3() {
		tesla.creoCarro3();
	}
	public void creocarroS() {
		tesla.creoCarroS();
	}
	public void creocarroX() {
		tesla.creoCarroX();
	}
	
	public void pintocarro() {
		tesla.pintocrro3();
	}
	public void elimino3() {
		tesla.eliminoCarro3();
		
	}
	
	

}
