package view;

import controller.HistorialControl;
import processing.core.PApplet;
import processing.core.PImage;


public class HistorialView {
	private PApplet app; 
	private PImage fondo;
	private CompraView compraview; 


	HistorialControl historiacontroller;

	public HistorialView(PApplet app) {
		
		this.app= app; 
		fondo = app.loadImage("img/histo.jpg"); 
		compraview= new CompraView(app); 

		historiacontroller = new HistorialControl();

	}
	
	public void drawScreen() {
		app.image(fondo, 0, 0);
		
	
	}

}
