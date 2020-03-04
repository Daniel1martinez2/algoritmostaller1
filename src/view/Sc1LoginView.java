package view;
import controller.Sc1LoginControl;
import processing.core.PApplet;
import controlP5.*; 
import processing.core.PFont;




public class Sc1LoginView {
	private ControlP5 cp5;
	private PApplet app; 
	
	//private PFont font = createFont("arial",20);
	Sc1LoginControl sc1login;
	String textValue = "";

	public Sc1LoginView(PApplet app) {
		this.app = app; 
		
		sc1login = new Sc1LoginControl(); 
		cp5.addTextfield("input")
	     .setPosition(20,100)
	     .setSize(200,40)
	     .setFont(font)
	     .setFocus(true)
	     //.setColor(color(255,0,0))
	     ;
		
	}
	
	public void drawScreen1() {
		
		
		
	}

}
