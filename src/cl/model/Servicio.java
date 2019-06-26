package cl.model;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class Servicio
 */
@Singleton
@LocalBean
public class Servicio implements ServicioLocal {

	private ArrayList<Cliente> lista = new ArrayList<Cliente>();

	
    /**
     * Default constructor. 
     */
    public Servicio() {
        lista.add(new Cliente("Juan","Perez"));
        lista.add(new Cliente("Diego","Fuentes"));
    }



	@Override
	public void addCliente(Cliente c) {
		lista.add(c);
	}



	@Override
	public ArrayList<Cliente> getClientes() {
		return lista;
	}

}
