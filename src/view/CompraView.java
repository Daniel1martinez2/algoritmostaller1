package view;
import processing.core.PApplet;
import controller.CompraControl;

public class CompraView {
	private PApplet app; 
	private CompraControl compracontrol; 
	public CompraView (PApplet app) {
		this.app= app; 
		compracontrol = new CompraControl(); 
		
	}

}
