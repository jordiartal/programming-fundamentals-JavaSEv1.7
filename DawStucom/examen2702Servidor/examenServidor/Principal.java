package examenServidor;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RemoteObject;

import examenServidor.Servidor;

public class Principal extends RemoteObject {

	private static final long serialVersionUID = 8390849717731066438L;

	public static void main(String[] args) throws RemoteException{
		Registry registro = LocateRegistry.createRegistry(7779);
		registro.rebind("rmiServidor", new Servidor());
	}
}