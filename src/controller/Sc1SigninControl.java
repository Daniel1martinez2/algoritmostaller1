package controller;
import model.Tesla;
import processing.core.PApplet;
public class Sc1SigninControl {
	
	PApplet app; 
	private Tesla tesla; 
	public Sc1SigninControl(PApplet app) {
		this.app= app;  
		tesla = new Tesla(app); 
		
	}
	

}


