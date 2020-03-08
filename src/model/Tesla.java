package model;

import java.util.ArrayList;
import processing.core.PApplet;

public class Tesla {
	private PApplet app;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Auto> carritos;
	private int mo3;
	private int mos;
	private int mox;

	public Tesla(PApplet app) {
		usuarios = new ArrayList<Usuario>();
		carritos = new ArrayList<Auto>();
		this.app = app;
		mo3 = 0;
		mos = 0;
		mox = 0;
	}

	public void registerUser(String username, String password, String email) {
		usuarios.add(new Usuario(username, password, email));
		imprimo();

	}

	public void creoCarro3() {
		carritos.add(new Model3(app));
		mo3++;
		System.out.println(carritos.size() + "model 3");

	}

	public void eliminoCarro3() {
		for (int j = 0; j < carritos.size(); j++) {
			if (carritos.get(j) != null) {

				carritos.remove(j);
				mo3--;

				System.out.println("elimine" + carritos.size());
			}

		}

	}

	public void creoCarroS() {
		carritos.add(new ModelS(app));
		mos++;
		System.out.println(carritos.size() + "  model S");

	}

	public void creoCarroX() {
		carritos.add(new ModelX(app));
		mox++;
		System.out.println(carritos.size() + "model X");

	}

	public void pintocrro3() {
		for (int i = 0; i < carritos.size(); i++) {

			app.fill(0);

			if (carritos.get(i) instanceof Model3) {
				carritos.get(i).pintar();
				app.text("Model 3", 30, 175);
				app.text(mo3, 160, 175);
			}

			if (carritos.get(i) instanceof ModelS) {
				carritos.get(i).pintar();
				app.text("Model s", 30, 175 + 196);
				app.text(mos, 160, 175 + 196);
			}

			if (carritos.get(i) instanceof ModelX) {
				carritos.get(i).pintar();
				app.text("Model X", 30, 175 + 196 + 200);
				app.text(mox, 160, 175 + 196 + 200);
			}
		}
	}

	public void imprimo() {
		for (Usuario i : usuarios) {
			System.out.println(usuarios.size());
			System.out.println(i.getUsername());
			System.out.println(i.getPassword());
			System.out.println(i.getEmail());
			System.out.println("====================");
		}
	}
}
