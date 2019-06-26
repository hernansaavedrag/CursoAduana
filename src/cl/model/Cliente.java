package cl.model;

public class Cliente {

	private String nombre;
	private String apellido;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	
	
	public void mensaje() {
		System.out.println("Hola mundo");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}

