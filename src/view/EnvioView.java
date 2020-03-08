package view;
import controller.EnvioControl;
import processing.core.PApplet;
import processing.core.PImage;

public class EnvioView {
	private PApplet app; 
	private PImage fondo; 
	EnvioControl enviocontroller; 
	public EnvioView(PApplet app) {
		enviocontroller = new EnvioControl(); 
		this.app= app; 
		fondo = app.loadImage("img/credi.png"); 
	}
	
	public void drawScreen() {
		app.image(fondo, 0, 0);
		
	}
	
	

}
