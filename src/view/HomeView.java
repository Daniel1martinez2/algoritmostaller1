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
	private PFont font1; 

	public HomeView(PApplet app) {
		homecontrol = new HomeControl(); 
		this.app = app; 
		cp5 = new ControlP5(app); 
		homeimg = app.loadImage("img/home.png"); 
		font1 = app.createFont("fonts/font1.ttf", 12); 
				
	}
	
	
	public void drawpantalla() {
		app.image(homeimg,0,0); 
		app.textFont(font1);
		app.fill(0);
		app.text("hello", 35, 195);
		
	}

}
