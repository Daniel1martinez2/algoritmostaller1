package model;
import processing.core.PApplet;
import processing.core.PImage;

abstract class Auto {
	PApplet app; 
	int modelo; 
	public Auto(int modelo,PApplet app) {
		this.app= app; 
		this.modelo = modelo; 
		
	}
	
	abstract void pintar( ); 
	
	

}
