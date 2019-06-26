package cl.model;

import java.util.ArrayList;

import javax.ejb.Local;

@Local
public interface ServicioLocal {
	
void addCliente(Cliente c);
	
	ArrayList<Cliente> getClientes();

}
