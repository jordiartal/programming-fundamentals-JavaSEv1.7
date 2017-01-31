package herencia_series;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calendario {
	public static void main (String[]argas){
		BufferedReader teclado= new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println();
			int contador=0;
			Fecha _1= new Fecha();
			
			int d2=0;int m2=0; int a2=0;String lector="";
			System.out.println("Dame un nuevo dia para Fecha2");
			d2=(Integer.parseInt(teclado.readLine()));
			System.out.println("Dame un mes");
			m2=(Integer.parseInt(teclado.readLine()));
			System.out.println("y el anyo");
			while(contador==0){
			lector=teclado.readLine();
			if((lector.length()<1)||(lector.length()>4)){System.out.println("entre 1 y 4 digitos gracias");}
			else{a2=Integer.parseInt(lector);contador++;}
			}
			contador=0;
			Fecha _2=new Fecha(d2,m2,a2);
			
			char k=1;
			char l=2;
			int t=k+l;
			System.out.println(_1.muestraFecha(_1));
			


			System.out.println("Hoy es día "+_1.getDia()+" de "+_1.getMes()+" del año "+_1.getAnyo()+": "+_1.muestraFecha(_1));
			System.out.println("Dame un nuevo dia para Fecha1");
			_1.setDia(Integer.parseInt(teclado.readLine()));
			System.out.println("Dame un mes");
			_1.setMes(Integer.parseInt(teclado.readLine()));
			System.out.println("y el anyo");
			while(contador==0){
				lector=teclado.readLine();
				if((lector.length()<1)||(lector.length()>4)){System.out.println("entre 1 y 4 digitos gracias");}
				else{_1.setAnyo(Integer.parseInt(lector));contador++;}
				}
				contador=0;
			
			System.out.println("Hoy es día "+_1.getDia()+" de "+_1.getMes()+" del año "+_1.getAnyo()+": "+_1.muestraFecha(_1));

			System.out.println();
			System.out.println("////////////////////////  FECHA 2  //////////////////////////");
			System.out.println();


			System.out.println("Hoy es día "+_2.getDia()+" de "+_2.getMes()+" del año "+_2.getAnyo()+": "+_2.muestraFecha(_2));
			
			System.out.println("Semana actual del mes: "+_2.calculaSemanaMes(_2));
			System.out.println("Semana actual del año: "+_2.calculaSemanaAnyo(_2));
			System.out.print("¿Es un año extraordinario?");
			if (_2.esAnyoExtraordinario(_2)==true){System.out.println("Si");}else{System.out.println("No");}
			System.out.println("Día de la semana : "+_2.calculaDiaSemana(_2));
			System.out.print("¿Es festivo o laborable? ");
			if(_2.esFestivo(_2)==true){System.out.print("Festivo");}
			else if(_2.esLaborable(_2)==true){System.out.print("Laborable");}
			else{System.out.println("Miratelo bien anda");}

			

		}
		catch(Exception e){
			System.out.print(e);
		}
	}
		

}
