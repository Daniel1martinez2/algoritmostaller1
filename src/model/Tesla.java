package model;

import model.Auto;
import model.Pedido;
import model.Tarjeta;
import model.Usuario;

public class Tesla {

	private Auto auto;
	private Pedido pedido;
	private Tarjeta tarjeta;
	private Usuario usuario;

	public Tesla() {
	 auto = new Model3(); 
	 pedido = new Pedido(); 
	 tarjeta = new Tarjeta(); 
	 usuario = new Usuario(); 
	 

	}

}
