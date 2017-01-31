package rmiServidor;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class RmiServidor extends UnicastRemoteObject implements IMetodosRemotos{

	
	public RmiServidor() throws RemoteException {
		super();
		
	}

	public int sumaRemota(int a, int b) throws RemoteException {
		int resultat=a+b;
		return resultat;
	}
	
}
