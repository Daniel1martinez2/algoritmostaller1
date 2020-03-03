package view;


import processing.core.PApplet;
import controlP5.*; 


import view.CarCharView;
import view.CarCompareView;
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
	private CarCompareView carcompareview;
	private CompraView compraview; 
	private EnvioView envioview; 
	private HistorialView historialview; 
	private HomeView homeview; 
	private ResumenView resumeview; 
	private Sc1LoginView sc1loginview; 
	private Sc1SigninView sc1signinview; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.MainView");

	}
	
	public void settings() {
		size(300, 600);

	}

	public void setup() {
		cp5 = new ControlP5(this);
		carcharview = new CarCharView(this); 
		carcompareview = new CarCompareView(this);
		compraview = new CompraView(this); 
		envioview = new EnvioView(); 
		historialview = new HistorialView(); 
		homeview = new HomeView(); 
		resumeview = new ResumenView(); 
		sc1loginview = new Sc1LoginView(); 
		sc1signinview = new Sc1SigninView(); 
		
		

	}

	public void draw() {

	}

}
 