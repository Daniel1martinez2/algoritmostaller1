package controller;

import model.Tesla;
import processing.core.PApplet;

public class EnvioControl {
	PApplet app; 
	Tesla tesla; 
	
	public EnvioControl(PApplet app) {
		this.app= app; 
		tesla = new Tesla(app); 
		
	}
	
	public void creoCard(String ID, String pais, String ciudad, String dir) {
		tesla.creoCard(ID);
	}
	
	

}
