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

		if (app.mouseX > 150 && app.mouseX < 170 && app.mouseY > 190 && app.mouseY < 200) {
			tesla.eliminoCarro3();

		}

	}

	public void eliminoS() {
		if (app.mouseX > 153 && app.mouseX < 176 && app.mouseY > 391 && app.mouseY < 399) {
			tesla.eliminoCarroS(); 
			
		}

	}

	public void eliminoX() {

	}

}
