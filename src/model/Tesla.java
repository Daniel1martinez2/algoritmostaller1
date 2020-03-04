package model;

import java.util.ArrayList;


public class Tesla {
	private ArrayList<Usuario> usuarios;

	

	public Tesla() {
		usuarios = new ArrayList<Usuario>();
	
	 

	}
	public void registerUser(String username, String password, String email) {
		usuarios.add(new Usuario(username, password, email));
		
		for (Usuario nuevo : usuarios) {
			System.out.println(usuarios.size());
			System.out.println(nuevo.getUsername());
			System.out.println(nuevo.getPassword());
			System.out.println(nuevo.getEmail());
			System.out.println("====================");
		}
		
		/*
		 * Es lo mismo que arriba pero con indice
		 * for (int i = 0; i < listUsers.size(); i++) {
			System.out.println(listUsers.get(i).getUsername());
			System.out.println(listUsers.get(i).getPassword());
			System.out.println(listUsers.get(i).getEmail());
			System.out.println("====================");
		}*/
	}

}
