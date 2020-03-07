package view;

import controller.CarCharControl;
import processing.core.PApplet;
import processing.core.PImage;

public class CarCharView {
	private CarCharControl carcharcontrol;
	PApplet app;
	PImage fondo;
	

	public CarCharView(PApplet app) {
		this.app = app;
		carcharcontrol = new CarCharControl();
		fondo = app.loadImage("img/caracteristicas.jpg");
		

	}

	public void drawScreen1() {
		app.image(fondo, 0, 0);
		app.fill(0);
		app.text("panta 1", app.width / 2 - 10, 100);

	}

	public void drawScreen2() {
		app.image(fondo, 0, 0);
		app.fill(0);
		app.text("panta 2", app.width / 2 - 10, 100);
	}

	public void drawScreen3() {
		app.image(fondo, 0, 0);
		app.fill(0);
		app.text("panta 3", app.width / 2 - 10, 100);
	}

	
	
	public void comparo1() {
		if(app.mouseX >0&&app.mouseX<100) {
			
			
			
		}
	}

	

}
