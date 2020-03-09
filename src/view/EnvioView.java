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
	private String inputpais;
	private String ciudad;
	private String direccion;
	private PFont font1;
	EnvioControl enviocontroller; 
	public EnvioView(PApplet app) {
		enviocontroller = new EnvioControl(app); 
		this.app= app; 
		inputs2 = "id";
		inputpais = "pais";
		ciudad = "ciudad";
		direccion = "dir";
		
		fondo = app.loadImage("img/credi.png"); 
		cp5 = new ControlP5(app);
		font1 = app.createFont("fonts/font1.ttf", 18);
		
		//-----------------------------
	


		

			cp5.addTextfield(inputs2).setPosition((app.width / 2) - 120, 300 ).setSize(235, 30)
					.setAutoClear(true).setColor(100).setColorActive(app.color(255, 0, 0))
					.setColorBackground(app.color(255, 255, 255)).setColorForeground(app.color(255, 0, 0))
					.setFont(font1)
					.getCaptionLabel()
					.hide()
					;
			
			cp5.addTextfield(inputpais).setPosition( 55, 374 ).setSize(100, 40)
			.setAutoClear(true).setColor(100).setColorActive(app.color(255, 0, 0))
			.setColorBackground(app.color(255, 255, 255)).setColorForeground(app.color(255, 0, 0))
			.setFont(font1)
			.getCaptionLabel()
			.hide()
			;
			cp5.addTextfield(ciudad).setPosition( 228, 374 ).setSize(100, 40)
			.setAutoClear(true).setColor(100).setColorActive(app.color(255, 0, 0))
			.setColorBackground(app.color(255, 255, 255)).setColorForeground(app.color(255, 0, 0))
			.setFont(font1)
			.getCaptionLabel()
			.hide()
			;
			cp5.addTextfield(direccion).setPosition((app.width / 2) - 120, 468 ).setSize(235, 30)
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
		cp5.get(Textfield.class, inputpais).hide();
		cp5.get(Textfield.class, ciudad).hide();
		cp5.get(Textfield.class, direccion).hide();
	}
	public void showin() {
		cp5.get(Textfield.class, inputs2).show();
		cp5.get(Textfield.class, inputpais).show();
		cp5.get(Textfield.class, ciudad).show();
		cp5.get(Textfield.class, direccion).show();
	}
	
	

	
	

}
