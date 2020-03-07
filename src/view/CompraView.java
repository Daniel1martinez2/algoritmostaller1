package view;

import controller.CompraControl;
import processing.core.PApplet;
import processing.core.PImage;

public class CompraView {

	private CompraControl compracontrol;
	PApplet app;


	public CompraView(PApplet app) {

		this.app = app;
		compracontrol = new CompraControl(app);
		

	}

	
}
