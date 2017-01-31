package examenServidor;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;

import examenCommons.IMetodosRemotos;


public class Servidor extends UnicastRemoteObject implements IMetodosRemotos {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5807164005202269133L;
	ArrayList<String> llista;

	protected Servidor() throws RemoteException {
		super();
	}

	public void guardaPersona(String nombre,int edad)throws RemoteException{
		try {
			gestionBBDD.insertar(nombre, edad);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void modificaPersona(int id, String nombre, int edad)throws RemoteException{
		try {
			gestionBBDD.modificar(id, nombre, edad);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void eliminaPersona(int id)throws RemoteException{
		try {
			gestionBBDD.eliminar(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public ArrayList<String> muestraPersonas() throws RemoteException {
		try {
			llista = gestionBBDD.consulta();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return llista;
	}
}
