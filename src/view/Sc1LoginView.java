package view;

import controller.Sc1LoginControl;
import model.Usuario;
import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;

import controlP5.*;
import processing.core.PFont;

public class Sc1LoginView {
	private String username, password, confirmPassword, email;
	private PApplet app;
	private ControlP5 cp5;
	private String[] inputs;
	private Sc1LoginControl sc1logincontrol;
	private PImage img1;
	private PFont font1;
	private boolean cambio;

	Sc1LoginControl sc1login;

	public Sc1LoginView(PApplet app) {
		cambio = true;

		sc1login = new Sc1LoginControl(app);

		this.app = app;
		cp5 = new ControlP5(app);
		img1 = app.loadImage("img/login.png");
		inputs = new String[4];
		font1 = app.createFont("fonts/font1.ttf", 18);
		sc1logincontrol = new Sc1LoginControl(app);

		inputs[0] = "username";
		inputs[2] = "password";
		inputs[3] = "confirmPassword";
		inputs[1] = "email";

		for (int i = 0; i < inputs.length; i++) {

			cp5.addTextfield(inputs[i]).setPosition((app.width / 2) - 120, 328 + (i * 62)).setSize(235, 30)
					.setAutoClear(true).setColor(100).setColorActive(app.color(255, 0, 0, 1))
					.setColorBackground(app.color(255, 255, 255, 1)).setColorForeground(app.color(255, 0, 0, 1))
					.setFont(font1).getCaptionLabel().hide();

		}

	}
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void drawScreen() {
		app.image(img1, 0, 0);
		drawButton();
	

	}
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	private void drawButton() {
		app.fill(255, 0, 0, 1);
		app.noStroke();
		app.rect((app.width / 2) - 40, 700, 80, 35);
	}
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public void getInfoForm() {
		if (app.mouseX > (app.width / 2) - 40 && app.mouseX < (app.width / 2) - 4 + 80 && app.mouseY > 700
				&& app.mouseY < 700 + 30) {
			username = cp5.get(Textfield.class, "username").getText();
			password = cp5.get(Textfield.class, "password").getText();
			confirmPassword = cp5.get(Textfield.class, "confirmPassword").getText();
			email = cp5.get(Textfield.class, "email").getText();

			// Esto valida que un string sea igual a otro
			String Str1 = new String("");
			boolean confirmo1;
			boolean confirmo2;
			boolean confirmo3;

			confirmo3 = Str1.equals(password);
			confirmo2 = Str1.equals(email);
			confirmo1 = Str1.equals(username);
			if (!confirmo1 && !confirmo2 && !confirmo3) {
				if (password.equals(confirmPassword)) {
					sc1logincontrol.getInfoForm(username, password, confirmPassword, email);
					cambio = false;
					for (int i = 0; i < inputs.length; i++) {
						cp5.get(Textfield.class, inputs[i]).hide();

					}

				}
			}

		}
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean getCambio() {
		return cambio;
	}

	public void setCambio(boolean cambio) {
		this.cambio = cambio;
	}
	public String intento() {
		return cp5.get(Textfield.class, "username").getText();
	}

	
	

}
