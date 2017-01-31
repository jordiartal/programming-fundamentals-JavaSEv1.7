package rmiServidor;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import examenServidor.Servidor;


public class Principal {

	public static void main(String[] args) throws RemoteException {
		Registry registro = LocateRegistry.createRegistry(7779);
		registro.rebind("rmiRemoto", new RmiServidor());
	}

}
