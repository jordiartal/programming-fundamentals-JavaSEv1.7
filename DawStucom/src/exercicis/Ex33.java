package exercicis;
//Escriure un programa en llenguatge Java on es demani una paraula per 
//teclat i es mostri per pantalla només la primera lletra de la paraula 
//que ha introduït l’usuari.

import java.io.*;
public class Ex33 {
	public static void main (String[] args){
try{
	BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("digues una paraula");
	String text=teclado.readLine();
	//per a extreure el carater en una determinada posició
	System.out.println("la primera lletra es..."+(text.substring(0,6)));
}
catch(Exception e){
	System.out.println("hi ha un error");
}
	}
}
