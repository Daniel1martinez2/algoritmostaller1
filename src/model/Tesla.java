package model;

import java.util.ArrayList;
import processing.core.PApplet;

public class Tesla {
	private PApplet app;
	private ArrayList<Usuario> usuarios;

	public Tesla(PApplet app) {
		usuarios = new ArrayList<Usuario>();
         this.app= app;
	}

	public void registerUser(String username, String password, String email) {
		usuarios.add(new Usuario(username, password, email));
		imprimo();
		

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
