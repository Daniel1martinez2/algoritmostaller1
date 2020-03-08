package model;

import java.util.ArrayList;
import processing.core.PApplet;

public class Tesla {
	private PApplet app;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Auto> carritos;

	public Tesla(PApplet app) {
		usuarios = new ArrayList<Usuario>();
		carritos = new ArrayList<Auto>();
         this.app= app;
	}

	public void registerUser(String username, String password, String email) {
		usuarios.add(new Usuario(username, password, email));
		imprimo();
		

	}
	public void creoCarro3(int model) {
		carritos.add(new Model3(model,app)); 
		System.out.println(carritos.size());
		
		
	}
	
	public void pintocrro3() {
		for (int i = 0; i < carritos.size(); i++) {
			carritos.get(i).pintar();
			app.fill(0);
			app.text(carritos.size(), 160, 175);
		    if (carritos.get(i) instanceof Model3) {
		    	app.text("Model 3", 30, 175);
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
	
	

	
	
	

	/*
	 * for (int i = 0; i < listUsers.size(); i++) {
	 * 
	 * System.out.println(listUsers.get(i).getUsername());
	 * System.out.println(listUsers.get(i).getPassword());
	 * System.out.println(listUsers.get(i).getEmail());
	 * System.out.println("===================="); }
	 */

}
