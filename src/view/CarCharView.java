package view;
import processing.core.PApplet;
import controller.CarCharControl;


public class CarCharView {
	private PApplet app; 
	private CarCharControl carcharcontrol; 
	
	public CarCharView(PApplet app) {
		this.app= app; 
		carcharcontrol = new CarCharControl(); 
		
	}

}
