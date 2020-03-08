package model;

import processing.core.PApplet;
import processing.core.PImage;

public class ModelS extends Auto{
	PImage car; 

	public ModelS( PApplet app) {
		super( app);
		car = app.loadImage("img/objetoComprado.jpg"); 
	}

	@Override
	void pintar() {
		app.image(car, 0, 300);
		 
	}
	
	

}
