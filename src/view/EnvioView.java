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

	private PFont font1;
	private int cambio; 
	private String ID, ciudad, pais, dir;
	private boolean panta; 
	
	private String[] inputs2; 
	EnvioControl enviocontroller; 
	public EnvioView(PApplet app) {
		panta = false; 
		cambio = 50; 
		enviocontroller = new EnvioControl(app); 
		inputs2 = new String[4]; //
		this.app= app; 
		inputs2[0] = "id";
		inputs2[1] = "pais";
		inputs2[2] = "ciudad";
		inputs2[3] = "dir";
		
		fondo = app.loadImage("img/credi.png"); 
		cp5 = new ControlP5(app);
		font1 = app.createFont("fonts/font1.ttf", 18);
		
		//-----------------------------
			cp5.addTextfield(inputs2[0]).setPosition((app.width / 2) - 120, 300-cambio ).setSize(235, 30)
					.setAutoClear(true).setColor(255).setColorActive(app.color(255, 0, 0,1))
					.setColorBackground(app.color(255, 255, 255,1)).setColorForeground(app.color(255, 0, 0,1))
					.setFont(font1)
					.getCaptionLabel()
					.hide()
					;
			cp5.addTextfield(inputs2[1]).setPosition( 55, 388-cambio/2 ).setSize(100, 40)
			.setAutoClear(true).setColor(255).setColorActive(app.color(255, 0, 0,1))
			.setColorBackground(app.color(255, 255, 255,1)).setColorForeground(app.color(255, 0, 0,1))
			.setFont(font1)
			.getCaptionLabel()
			.hide()
			;
			cp5.addTextfield(inputs2[2]).setPosition( 228, 388-cambio/2 ).setSize(100, 40)
			.setAutoClear(true).setColor(255).setColorActive(app.color(255, 0, 0,1))
			.setColorBackground(app.color(255, 255, 255,1)).setColorForeground(app.color(255, 0, 0,1))
			.setFont(font1)
			.getCaptionLabel()
			.hide()
			;
			cp5.addTextfield(inputs2[3]).setPosition((app.width / 2) - 120, 505-cambio/2 ).setSize(235, 30)
			.setAutoClear(true).setColor(255).setColorActive(app.color(255, 0, 0,1))
			.setColorBackground(app.color(255, 255, 255,1)).setColorForeground(app.color(255, 0, 0,1))
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
		cp5.get(Textfield.class, inputs2[0]).hide();
		cp5.get(Textfield.class, inputs2[1]).hide();
		cp5.get(Textfield.class, inputs2[2]).hide();
		cp5.get(Textfield.class, inputs2[3]).hide();
		//------
		cp5.get(Textfield.class, inputs2[0]).clear();
		cp5.get(Textfield.class, inputs2[1]).clear();
		cp5.get(Textfield.class, inputs2[2]).clear();
		cp5.get(Textfield.class, inputs2[3]).clear();
		
		
	}
	public void showin() {
		cp5.get(Textfield.class, inputs2[0]).show();
		cp5.get(Textfield.class, inputs2[1]).show();
		cp5.get(Textfield.class, inputs2[2]).show();
		cp5.get(Textfield.class, inputs2[3]).show();
	}
	public void getInfo() {
		if (app.mouseX > 242 && app.mouseX <330 && app.mouseY > 750
				&& app.mouseY < 780) {
			ID = cp5.get(Textfield.class, "id").getText();
			pais = cp5.get(Textfield.class, "pais").getText();
			ciudad = cp5.get(Textfield.class, "ciudad").getText();
			dir = cp5.get(Textfield.class, "dir").getText();
			
			enviocontroller.creoCard(ID, pais, ciudad, dir); 
			panta = true; 
			System.out.println(ID);
			System.out.println("---------------------------------");
			for (int i = 0; i < inputs2.length; i++) {
				cp5.get(Textfield.class, inputs2[i]).hide();
				

			}
		}
		
	}

	public boolean isPanta() {
		return panta;
	}

	public void setPanta(boolean panta) {
		this.panta = panta;
	}
	

}
