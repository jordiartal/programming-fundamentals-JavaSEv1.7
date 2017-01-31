package examenCliente;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

import examenCommons.IMetodosRemotos;


public class Cliente implements IMetodosRemotos{
	Registry registro;
	IMetodosRemotos rmiInterfaz;
	public Cliente() throws RemoteException, NotBoundException {
		super();
		registro = LocateRegistry.getRegistry("127.0.0.1", 7779);
		rmiInterfaz=(IMetodosRemotos) registro.lookup("rmiServidor");
	}

	public void guardaPersona(String nombre, int edad) throws RemoteException {
		rmiInterfaz.guardaPersona(nombre, edad);
	}

	
	public void modificaPersona(int id, String nombre, int edad) throws RemoteException {
		rmiInterfaz.modificaPersona(id, nombre, edad);
	}

	
	public void eliminaPersona(int id) throws RemoteException {
		rmiInterfaz.eliminaPersona(id);
	}

	
	public ArrayList<String> muestraPersonas() throws RemoteException {
		return rmiInterfaz.muestraPersonas();
	}
	
}
