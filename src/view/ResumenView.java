package view;

import controller.ResumeControl;
import processing.core.PApplet;
import processing.core.PImage;

public class ResumenView {
	private PApplet app;
	private PImage fondo;

	ResumeControl resumecontroller;

	public ResumenView(PApplet app) {
		resumecontroller = new ResumeControl();
		this.app = app;
		fondo = app.loadImage("img/resume.jpg");
	}

	public void drawScreen() {
		app.image(fondo, 0, 0);
	}

}
