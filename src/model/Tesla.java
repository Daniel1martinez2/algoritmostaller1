package model;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

public class Tesla {
	private PApplet app;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Auto> carritos;
	private ArrayList<Tarjeta> card;
	private ArrayList<Pedido> pedido;
	private int mo3;
	private int mos;
	private int mox;


	

	public Tesla(PApplet app) {
		usuarios = new ArrayList<Usuario>();
		carritos = new ArrayList<Auto>();
		card = new ArrayList<Tarjeta>();
		pedido = new ArrayList<Pedido>();
		
		this.app = app;
		mo3 = 0;
		mos = 0;
		mox = 0;
	
	}

	public void registerUser(String username, String password, String email) {
		usuarios.add(new Usuario(username, password, email));
		imprimo();
	}

	public void creoCard(String ID) {
		card.add(new Tarjeta(ID));
		System.out.println("NUEVA TARJETAAA");
	}

	public void creoPedido1() {
		pedido.add(new Pedido(app));
		System.out.println("nuevo PEDIDOOOOOOOOOOOOOOO");
		
	
	}



	public void creoCarro3() {
		carritos.add(new Model3(app));
		mo3++;
		System.out.println(carritos.size() + "model 3");
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

	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void eliminoCarro3() {

		for (int i = 0; i < carritos.size(); i++) {
			if (carritos.get(i) != null && carritos.get(i) instanceof Model3) {

				carritos.remove(i);
				mo3--;
			}
		}
	}

	public void eliminoCarroS() {

		for (int i = 0; i < carritos.size(); i++) {
			if (carritos.get(i) != null && carritos.get(i) instanceof ModelS) {

				carritos.remove(i);
				mos--;
			}
		}
	}

	public void eliminoCarroX() {

		for (int i = 0; i < carritos.size(); i++) {
			if (carritos.get(i) != null && carritos.get(i) instanceof ModelX) {

				carritos.remove(i);
				mox--;
			}
		}
	}
	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	public void pintocrro3() {
		for (int i = 0; i < carritos.size(); i++) {
			app.fill(0);
			if (carritos.get(i) instanceof Model3) {
				carritos.get(i).pintar();
				app.text("Model 3", 30, 175);
				app.text(mo3, 160, 175);
				app.text("$" + (mo3 * 58190), 250, 175);
			}
			if (carritos.get(i) instanceof ModelX) {
				carritos.get(i).pintar();
				app.text("Model X", 30, 175 + 196);
				app.text(mox, 160, 175 + 196);
				app.text("$" + (mox * 104990), 250, 175 + 196);
			}
			if (carritos.get(i) instanceof ModelS) {
				carritos.get(i).pintar();
				app.text("Model S", 30, 175 + 196 + 200);
				app.text(mos, 160, 175 + 196 + 200);
				app.text("$" + (mos * 124000), 250, 175 + 196 + 200);
			}
		}
	}

	public void total() {
		int total = ((mo3 * 58190) + (mox * 104990) + (mos * 124000));
		app.textSize(15);
		app.text("$" + total, 270, 700);
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
	public void encero() {
		for (int i = 0; i < carritos.size(); i++) {
			carritos.remove(i);
		}
		setMo3(0);
		setMos(0);
		setMox(0);
	}

	public int getMo3() {
		return mo3;
	}

	public void setMo3(int mo3) {
		this.mo3 = mo3;
	}

	public int getMos() {
		return mos;
	}

	public void setMos(int mos) {
		this.mos = mos;
	}

	public int getMox() {
		return mox;
	}

	public void setMox(int mox) {
		this.mox = mox;
	}

	public ArrayList<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(ArrayList<Pedido> pedido) {
		this.pedido = pedido;
	}
	
	public int pedidoSize() {
	return pedido.size(); 
	}


	
	
	
	
}
