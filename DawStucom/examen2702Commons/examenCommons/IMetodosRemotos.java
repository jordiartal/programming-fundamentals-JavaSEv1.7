package examenCommons;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


public interface IMetodosRemotos extends Remote {
	public void guardaPersona(String nombre,int edad)throws RemoteException;
	public void modificaPersona(int id, String nombre, int edad)throws RemoteException;
	public void eliminaPersona(int id)throws RemoteException;
	public ArrayList<String> muestraPersonas()throws RemoteException;
}
