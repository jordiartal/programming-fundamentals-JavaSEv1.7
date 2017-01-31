package rmiCliente;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class Principal {

	public static void main(String[] args) throws RemoteException, NotBoundException {
		if(System.getSecurityManager()==null){
			System.setSecurityManager(new SecurityManager());
			}
			RmiCliente c = new RmiCliente();
			c.sumaRemota(7, 5);
	}
}