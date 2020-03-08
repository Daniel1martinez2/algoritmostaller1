package model;

import processing.core.PApplet;
import processing.core.PImage;

public class ModelX extends Auto {
	PImage car; 

	public ModelX(PApplet app) {
		super( app);
		car = app.loadImage("img/objetoComprado.jpg"); 
	}

	@Override
	void pintar() {
		app.image(car, 0, 300);
		 
	}

}
