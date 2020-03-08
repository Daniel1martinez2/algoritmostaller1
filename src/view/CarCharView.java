package view;

import controller.CarCharControl;
import processing.core.PApplet;
import processing.core.PImage;

public class CarCharView {
	private CarCharControl carcharcontrol;
	private PApplet app;
	private PImage fondo;
	private PImage fondoComparo;
	private boolean comparo;
	private CompraView compraview;

	public CarCharView(PApplet app) {
		this.app = app;
		carcharcontrol = new CarCharControl();
		fondo = app.loadImage("img/caracteristicas.jpg");
		fondoComparo = app.loadImage("img/compara.png");
		compraview = new CompraView(app);

	}

	public void drawScreen1() {
		app.image(fondo, 0, 0);
		app.fill(0);

		if (comparo) {
			comparo1();
			// compraview.drawScreen();
		}
		app.text("panta 1", app.width / 2 - 10, 20);

	}

	public void drawScreen2() {
		app.image(fondo, 0, 0);
		app.fill(0);

		if (comparo) {
			comparo2();
		}
		app.text("panta 2", app.width / 2 - 10, 20);
	}

	public void drawScreen3() {
		app.image(fondo, 0, 0);
		app.fill(0);

		if (comparo) {
			comparo3();
		}
		app.text("panta 3", app.width / 2 - 10, 20);
	}

	// -----------------------------------------------------COMPARA PANTALLAS
	public void comparo1() {
		app.image(fondoComparo, app.width / 2 + 2, 0);
		app.fill(0);
		app.text("compa 1", app.width / 2 - 10, 100);
	}

	public void comparo2() {
		app.image(fondoComparo, app.width / 2 + 2, 0);
		app.fill(0);
		app.text("compa 2", app.width / 2 - 10, 100);
	}

	public void comparo3() {
		app.image(fondoComparo, app.width / 2 + 2, 0);
		app.fill(0);
		app.text("compa 3", app.width / 2 - 10, 100);
	}
	// -----------------------------------------------------

	public void comparar() {
		if (app.mouseX > 252 && app.mouseX < 338 && app.mouseY > 740) {
			comparo = !comparo;
			System.out.println(comparo);
		}
	}

	public boolean isComparo() {
		return comparo;
	}

	public void setComparo(boolean comparo) {
		this.comparo = comparo;
	}

}
