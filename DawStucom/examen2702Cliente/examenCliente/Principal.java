package examenCliente;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;



public class Principal {
	public static Cliente interconexion;
	
	public static void main(String[] args) throws RemoteException, NotBoundException {
        new MenuPrincipal();
        interconexion = new Cliente();
	}
}
