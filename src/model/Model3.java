package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Model3 extends Auto {
	PImage car;

	public Model3(PApplet app) {
		super(app);
		car = app.loadImage("img/objetoComprado.jpg");

	}

	void pintar() {
		app.image(car, 0, 100);

	}

}
