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
	//--
	private PImage[] p;
	private int mostrar;
	//--
	private PImage[] a;
	private int mostrar2;

	public CarCharView(PApplet app) {
		this.app = app;
		carcharcontrol = new CarCharControl();
		fondo = app.loadImage("img/caracteristicas.jpg");
		fondoComparo = app.loadImage("img/compara.png");
		//--------------------
		p = new PImage[50];
		int cargadas = 0;
		while (cargadas < 49) {

			p[cargadas] = app.loadImage("img/ani1/p" + cargadas + ".png");
			cargadas++;
		}
		mostrar = 1;
		//--------------------
		a = new PImage[50];
		int cargadas2 = 0;
		while (cargadas2 < 47) {

			a[cargadas2] = app.loadImage("img/ani2/a" + cargadas2 + ".png");
			cargadas2++;
		}
		mostrar2 = 1;
	}

	public void drawScreen1() {
		app.image(fondo, 0, 0);
		app.fill(0);
		app.text("panta 1", app.width / 2 - 10, 20);

		if (comparo) {
			comparo1();
		}

		animation2();
		

	}

	public void drawScreen2() {
		app.image(fondo, 0, 0);
		app.fill(0);

		if (comparo) {
			comparo2();
		}
		app.text("panta 2", app.width / 2 - 10, 20);
		animation2();
	}

	public void drawScreen3() {
		app.image(fondo, 0, 0);
		app.fill(0);

		if (comparo) {
			comparo3();
		}
		app.text("panta 3", app.width / 2 - 10, 20);
		animation2();
	}

	// -----------------------------------------------------COMPARA PANTALLAS
	public void comparo1() {
		app.image(fondoComparo, app.width / 2 + 2, 0);
		app.fill(0);
		app.text("compa 1", app.width / 2 - 10, 100);
		animation2Compara(); 
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
	public void animation2() {

		app.image(p[mostrar], 0, 295, 170, 170);
		if (app.frameCount % 2 == 0) {

			mostrar++;
			if (mostrar > 48) {

				mostrar = 0;
			}
		}
	}
	public void animation2Compara() {

		app.image(a[mostrar2], app.width/2+10, 317, 170, 130);
		if (app.frameCount % 2 == 0) {

			mostrar2++;
			if (mostrar2 > 46) {

				mostrar2 = 0;

			}

		}

	}

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
