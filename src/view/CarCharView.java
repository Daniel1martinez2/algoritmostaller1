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
	//--
	private PImage[] b;
	private int mostrar3;
	//--
	private PImage[] c;
	private int mostrar4;
	//--
	private PImage[] d;
	private int mostrar5;
	//--
	private PImage[] e;
	private int mostrar6;

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
		//--------------------
		b = new PImage[50];
		int cargadas3 = 0;
		while (cargadas3 < 47) {

			b[cargadas3] = app.loadImage("img/ani3/b" + cargadas3 + ".png");
			cargadas3++;
		}
		mostrar3 = 1;
		//--------------------
		c = new PImage[50];
		int cargadas4 = 0;
		while (cargadas4 < 47) {

			c[cargadas4] = app.loadImage("img/ani4/c" + cargadas4 + ".png");
			cargadas4++;
		}
		mostrar4 = 1;
		//--------------------
		d = new PImage[50];
		int cargadas5 = 0;
		while (cargadas5 < 47) {

			d[cargadas5] = app.loadImage("img/ani5/d" + cargadas5 + ".png");
			cargadas5++;
		}
		mostrar5 = 1;
		//--------------------
		e = new PImage[50];
		int cargadas6 = 0;
		while (cargadas6 < 47) {

			e[cargadas6] = app.loadImage("img/ani6/e" + cargadas6 + ".png");
			cargadas6++;
		}
		mostrar6 = 1;
		
	}


	public void drawScreen1() {
		app.image(fondo, 0, 0);
		app.fill(0);
		app.text("panta 1", app.width / 2 - 10, 20);

		if (comparo) {
			comparo1();
		}

		animation2();
		animation1();
		animation3(); 
		

	}

	public void drawScreen2() {
		app.image(fondo, 0, 0);
		app.fill(0);

		if (comparo) {
			comparo2();
		}
		app.text("panta 2", app.width / 2 - 10, 20);
		animation2();
		animation1();
		animation3(); 
	}

	public void drawScreen3() {
		app.image(fondo, 0, 0);
		app.fill(0);

		if (comparo) {
			comparo3();
		}
		app.text("panta 3", app.width / 2 - 10, 20);
		animation2();
		animation1();
		animation3(); 
	}

	// -----------------------------------------------------COMPARA PANTALLAS
	public void comparo1() {
		app.image(fondoComparo, app.width / 2 + 2, 0);
		app.fill(0);
		app.text("compa 1", app.width / 2 - 10, 100);
		animation2Compara(); 
		animation1Compara();
		animation3compara(); 
	}

	public void comparo2() {
		app.image(fondoComparo, app.width / 2 + 2, 0);
		app.fill(0);
		app.text("compa 2", app.width / 2 - 10, 100);
		animation2Compara(); 
		animation1Compara();
		animation3compara(); 
		
	}

	public void comparo3() {
		app.image(fondoComparo, app.width / 2 + 2, 0);
		app.fill(0);
		app.text("compa 3", app.width / 2 - 10, 100);
		animation2Compara(); 
		animation1Compara();
		animation3compara(); 
	}

	// -----------------------------------------------------
	public void animation2() {

		app.image(p[mostrar], 0, 285, 170, 170);
		if (app.frameCount % 2 == 0) {

			mostrar++;
			if (mostrar > 48) {

				mostrar = 0;
			}
		}
	}
	public void animation2Compara() {

		app.image(a[mostrar2], app.width/2+10, 305, 170, 130);
		if (app.frameCount % 7 == 0) {

			mostrar2++;
			if (mostrar2 > 46) {

				mostrar2 = 0;

			}

		}

	}
	public void animation1Compara() {

		app.image(b[mostrar3], app.width/2+10, 75, 150, 130);
		if (app.frameCount % 23 == 0) {

			mostrar3++;
			if (mostrar3 > 46) {

				mostrar3 = 0;

			}

		}

	}
	public void animation1() {

		app.image(c[mostrar4], 0, 75, 150, 130);
		if (app.frameCount % 2 == 0) {

			mostrar4++;
			if (mostrar4 > 46) {

				mostrar4= 0;

			}

		}

	}
	public void animation3() {

		app.image(d[mostrar5], 0, 540, 150, 130);
		if (app.frameCount % 2 == 0) {

			mostrar5++;
			if (mostrar5 > 46) {

				mostrar5= 0;

			}

		}

	}
	
	public void animation3compara() {

		app.image(e[mostrar5], app.width/2+60, 540+45, 90, 90);
		if (app.frameCount % 17 == 0) {

			mostrar6++;
			if (mostrar6 > 46) {

				mostrar6= 0;

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
