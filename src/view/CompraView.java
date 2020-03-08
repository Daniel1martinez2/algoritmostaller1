package view;

import controller.CompraControl;
import processing.core.PApplet;
import processing.core.PImage;

public class CompraView {

	private CompraControl compracontrol;
	private PApplet app;
	private PImage purchase;
	private boolean comprando;

	public CompraView(PApplet app) {

		this.app = app;
		compracontrol = new CompraControl(app);
		purchase = app.loadImage("img/purchase.jpg");
		comprando = false;

	}

	public void drawScreen() {

		app.image(purchase, 0, 0);
		compracontrol.pintocarro();

	}

	public void aComprar3() {
		if (app.mouseX > 45 && app.mouseX < 145 && app.mouseY > 745) {
			comprando = true;
			System.out.println("hola");
			compracontrol.creocarro3();

		}
	}
	
	public void aComprarS() {
		if (app.mouseX > 45 && app.mouseX < 145 && app.mouseY > 745) {
			comprando = true;
			System.out.println("holaqq");
			compracontrol.creocarroS();

		}
	}
	public void aComprarX() {
		if (app.mouseX > 45 && app.mouseX < 145 && app.mouseY > 745) {
			comprando = true;
			System.out.println("holymary");
			compracontrol.creocarroX();

		}
	}
	
	
	

	public boolean isComprando() {
		return comprando;
	}

	public void setComprando(boolean comprando) {
		this.comprando = comprando;
	}

}
