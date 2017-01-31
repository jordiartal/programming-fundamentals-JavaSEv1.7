package rmiCliente;
import java.rmi.RemoteException;
import java.rmi.Remote;

public interface IMetodosRemotos extends Remote{
	
	public int sumaRemota(int a,int b) throws RemoteException;
	
}
