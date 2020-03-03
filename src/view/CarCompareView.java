package view;
import processing.core.PApplet;
import controller.CarCompareControl;

public class CarCompareView {
	private PApplet app; 
	private CarCompareControl carcomparecontrol; 
	public CarCompareView(PApplet app) {
		this.app= app; 
		carcomparecontrol = new CarCompareControl(); 
		
	}

}
