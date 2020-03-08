package model;
import processing.core.PApplet;
import processing.core.PImage;

abstract class Auto {
	PApplet app; 
	int modelo; 
	public Auto(PApplet app) {
		this.app= app; 
		
		
	}
	
	abstract void pintar( ); 
	
	

}
