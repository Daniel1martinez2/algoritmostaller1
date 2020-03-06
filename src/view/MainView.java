package view;


import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PFont;
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
	
	private int screen; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.MainView");

	}
	
	
	public void settings() {
		size(375,812);

	}

	public void setup() {
		
		cp5 = new ControlP5(this);
		carcharview = new CarCharView(); 
		carcompareview = new CarCompareView();
		compraview = new CompraView(); 
		envioview = new EnvioView(); 
		historialview = new HistorialView(); 
		homeview = new HomeView(this); 
		resumeview = new ResumenView(); 
		sc1loginview = new Sc1LoginView(this); 
		sc1signinview = new Sc1SigninView(this); 
		
		screen = 0;
		
		
		

		
		

	}

	public void draw() {
		background(0); 
		
	
	    
		
		
	   switch (screen) {
	case 0:
		sc1loginview.drawScreen();
		
		break;
	case 1: 
		homeview.drawpantalla();
		break; 

	default:
		break;
	}
	 
	   //fill(255,0,0); 
		//text("mousex:"+mouseX+"mouseY:"+mouseY,mouseX,mouseY);

	}
	public void mousePressed() {
		   switch (screen) {
			case 0:
				sc1loginview.getInfoForm();
				if(sc1loginview.getCambio()==false) {
					
					screen=1;
				}
				
				break;
			case 1: 
				
				break; 

			default:
				break;
			}
		
	}



	
	
	
	
	

}
 