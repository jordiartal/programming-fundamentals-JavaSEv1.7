package txt_empleados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws Exception{
		ArrayList<Empleado> misEmpleados=new ArrayList<Empleado>();
		misEmpleados.add(new Empleado("Antonio",40,800));
		misEmpleados.add(new Empleado("Pepe Billy",30,1800));
		
		File archivo = new File("empleados.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
		oos.writeObject(misEmpleados);
		oos.close();
			
		ArrayList<Empleado>misEmpleados2=null;
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(archivo));
		misEmpleados2 = (ArrayList<Empleado>) ois.readObject();
		
		for(Empleado e: misEmpleados2){
			System.out.println(e);
		}
		
		
		File archi2 = new File("emplea2.txt");
		ObjectOutputStream oo2 = new ObjectOutputStream(new FileOutputStream(archi2));
		oo2.writeChars("Això és una proba d'escriptura en arxiu");
		oo2.close();
		if(archivo.exists()){
			RandomAccessFile raf = new RandomAccessFile (archi2,"r");
			String linea = raf.readLine();
			//Cuando lleguemos al final del archivo linea será igual a null
			while(linea!=null){ 
				System.out.println(linea);
				linea = raf.readLine();
			}
			raf.close();
		}else{
			System.out.println("El archivo no existe.");
		}
	}
}