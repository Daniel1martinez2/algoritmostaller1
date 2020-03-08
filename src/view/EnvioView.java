package view;
import controlP5.ControlP5;
import controlP5.Textfield;
import controller.EnvioControl;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class EnvioView {
	private PApplet app; 
	private PImage fondo; 
	private ControlP5 cp5;
	private String inputs2;
	private PFont font1;
	EnvioControl enviocontroller; 
	public EnvioView(PApplet app) {
		enviocontroller = new EnvioControl(app); 
		this.app= app; 
		inputs2 = "ola";
		fondo = app.loadImage("img/credi.png"); 
		cp5 = new ControlP5(app);
		font1 = app.createFont("fonts/font1.ttf", 18);
		
		//-----------------------------
	


		

			cp5.addTextfield(inputs2).setPosition((app.width / 2) - 120, 328 ).setSize(235, 30)
					.setAutoClear(true).setColor(100).setColorActive(app.color(255, 0, 0))
					.setColorBackground(app.color(255, 255, 255)).setColorForeground(app.color(255, 0, 0))
					.setFont(font1)
					.getCaptionLabel()
					.hide()
					;

		//-------------------------------
	}
	
	public void drawScreen() {
		app.image(fondo, 0, 0);
		
		
	}
	
	public void hidein() {
		cp5.get(Textfield.class, inputs2).hide();
	}
	public void showin() {
		cp5.get(Textfield.class, inputs2).show();
	}
	
	

	
	

}
