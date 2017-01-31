package rmiCliente;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class RmiCliente {
	public void sumaRemota(int a,int b) throws RemoteException, NotBoundException{	
		Registry registro = LocateRegistry.getRegistry("127.0.0.1", 7779);
		IMetodosRemotos rmiInterfaz=(IMetodosRemotos) registro.lookup("rmiRemoto");
		int suma = rmiInterfaz.sumaRemota(a, b);
		System.out.println("La suma es " + suma);
	}
}
