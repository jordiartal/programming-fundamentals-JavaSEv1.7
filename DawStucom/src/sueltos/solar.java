package sueltos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class solar {
	public static void main (String[] args){
		try{
			String[][]planetes=new String[9][4];	
			planetes[0][0]="Mercuri";	planetes[1][0]="Venus";	planetes[2][0]="Terra";	planetes[3][0]="Mart";	planetes[4][0]="Jupiter";	planetes[5][0]="Saturn";	planetes[6][0]="Urà";	planetes[7][0]="Neptú";	planetes[8][0]="Plutó";
			planetes[0][1]="0,056";		planetes[1][1]="0,816";	planetes[2][1]="1";		planetes[3][1]="0,108";	planetes[4][1]="318";		planetes[5][1]="95";		planetes[6][1]="14,5";	planetes[7][1]="17,1";	planetes[8][1]="";
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}