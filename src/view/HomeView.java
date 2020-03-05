package view;
import controller.HomeControl;
import processing.core.PApplet;
import processing.core.PImage;
import controlP5.*;
import processing.core.PFont;

public class HomeView {
	
	private PApplet app; 
	private ControlP5 cp5; 
	private PImage homeimg; 
	private HomeControl homecontrol; 
	public HomeView(PApplet app) {
		homecontrol = new HomeControl(); 
		this.app = app; 
		cp5 = new ControlP5(app); 
		homeimg = app.loadImage("img/home.png"); 
		
				
	}
	
	
	public void drawpantalla() {
		app.image(homeimg,0,0); 
		
	}

}
