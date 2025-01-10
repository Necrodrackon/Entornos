package Herencia_multiple;

public class Perro extends Omnivoro implements Vigilante {

	public Perro(String id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vigilante() {
			System.out.println("vigilo como un perro");
	}



}
