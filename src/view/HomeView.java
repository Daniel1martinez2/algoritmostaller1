package view;

import controller.HomeControl;
import processing.core.PApplet;
import processing.core.PImage;
import controlP5.*;
import processing.core.PFont;

public class HomeView {

	private PApplet app;
	private ControlP5 cp5;
	private PImage homeimg;
	private HomeControl homecontrol;
	private PFont font1;

	private String username;
	private int sisa;

	public HomeView(PApplet app) {

		this.app = app;
		homecontrol = new HomeControl(app);
		cp5 = new ControlP5(app);
		homeimg = app.loadImage("img/home.png");
		font1 = app.createFont("fonts/font1.ttf", 12);
		sisa = 0;

	}

	public void drawpantalla() {
		app.image(homeimg, 0, 0);
		app.textFont(font1);
		app.fill(0);

	}

	public void car1() {
		if (app.mouseX > 245 && app.mouseX < 245 + 92 && app.mouseY > 342 && app.mouseY < 342 + 25) {
			sisa = 1;
		}
	}

	public void car2() {
		if (app.mouseX > 245 && app.mouseX < 245 + 92 && app.mouseY > 515 && app.mouseY < 515 + 25) {
			sisa = 2;
		}
	}

	public void car3() {
		if (app.mouseX > 245 && app.mouseX < 245 + 92 && app.mouseY > 515 + (515 - 342)
				&& app.mouseY < 515 + (515 - 342) + 25) {
			sisa = 3;
		}
	}
	
	
	

	public int isSisa() {
		return sisa;
	}

	public void setSisa(int sisa) {
		this.sisa = sisa;
	}
	
	

}
