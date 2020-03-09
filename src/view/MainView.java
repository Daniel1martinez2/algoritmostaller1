package view;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PFont;
import controlP5.*;

import view.CarCharView;
import view.CompraView;
import view.EnvioView;
import view.HistorialView;
import view.HomeView;
import view.ResumenView;

import view.Sc1LoginView;
import view.Sc1SigninView;

public class MainView extends PApplet {
	private ControlP5 cp5;
	private CarCharView carcharview;

	private CompraView compraview;
	private EnvioView envioview;
	private HistorialView historialview;
	private HomeView homeview;
	private ResumenView resumeview;
	private Sc1LoginView sc1loginview;
	private Sc1SigninView sc1signinview;

	private int screen;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.MainView");

	}

	public void settings() {
		size(375, 812);

	}

	public void setup() {

		cp5 = new ControlP5(this);
		carcharview = new CarCharView(this);
		compraview = new CompraView(this);
		envioview = new EnvioView(this);
		historialview = new HistorialView();
		homeview = new HomeView(this);
		resumeview = new ResumenView(this);
		sc1loginview = new Sc1LoginView(this);
		sc1signinview = new Sc1SigninView(this);

		screen = 0;

	}

	public void draw() {
		background(0);

		switch (screen) {
		case 0:
			envioview.hidein();
			sc1loginview.drawScreen();

			break;
		case 1:
			envioview.hidein();
			homeview.drawpantalla();
			fill(0);
			textSize(18);
			text(sc1loginview.intento(), 45, 193);

			break;

		case 2:
			envioview.hidein();

			// ------------------------------------------------
			switch (homeview.isSisa()) {
			case 1:
				carcharview.drawScreen1();
				break;
			case 2:
				carcharview.drawScreen2();
				break;
			case 3:
				carcharview.drawScreen3();
				break;

			default:
				break;
			}
			// ------------------------------------------------

			break;
		case 3:
			envioview.hidein();
			compraview.drawScreen();

			break;
		case 4:
			envioview.drawScreen();
			compraview.total();
			envioview.showin();
			break;
		case 5: 
			envioview.hidein();
			resumeview.drawScreen();
			 
			break; 

		default:
			break;
		}

		 fill(255);
		text(mouseX, mouseX, mouseY);
		text(mouseY, mouseX, mouseY+20);

	}

	public void mousePressed() {
		switch (screen) {
		case 0:
			sc1loginview.getInfoForm();
			if (sc1loginview.getCambio() == false) {
				screen = 1;
			}
			break;
		case 1:
			f(); 

			homeview.car1();
			homeview.car2();
			homeview.car3();
			

			// ------------------------------------------------
			switch (homeview.isSisa()) {
			case 1:
				screen = 2;

				break;
			case 2:
				screen = 2;

				break;
			case 3:
				screen = 2;

				break;
			default:
				break;
			}
			// ------------------------------------------------
			break;
		case 2:

			ledi();
			carcharview.comparar();
			// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			switch (homeview.isSisa()) {
			case 1:
				compraview.aComprar3();
				break;
			case 2:
				compraview.aComprarX();

				break;
			case 3:
				compraview.aComprarS();

				break;
			default:
				break;
			}
			// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

			if (compraview.isComprando()) {
				screen = 3;
			}

			break;
		case 3:
			compraview.agrego(); // agrego al modelo 3
			compraview.agregox();
			compraview.agregoS();

			compraview.elimino3();
			compraview.eliminox();
			compraview.eliminos();

			ledi();
			credicard();
			break;
		case 4:
			atrasCompra();
			envioview.getInfo(); 
			if(envioview.isPanta()) {
				screen = 5; 
			}

			break;
		case 5:
			ledi(); 
			break; 
		default:
			break;
		}
	}

	// metodos
	// chafa---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void ledi() {

		if (mouseX > 0 && mouseX < 100 && mouseY > 0 && mouseY < 25) {
			System.out.println("k");
			screen = 1;
			homeview.setSisa(0);
			carcharview.setComparo(false);
			compraview.setComprando(false);

		}
	}

	public void atrasCompra() {

		if (mouseX > 0 && mouseX < 100 && mouseY > 0 && mouseY < 25) {
			screen = 3;
		}
	}

	public void credicard() {
		if (mouseX > 252 && mouseX < 338 && mouseY > 740) {
			screen = 4;
			System.out.println(screen);
		}
	}
	public void f() {
		if(mouseX>340&&mouseX<360&&mouseY>5&&mouseY<252 ) {
			screen = 3; 
			System.out.println("fffffff");
			
		}
		
	}

}
