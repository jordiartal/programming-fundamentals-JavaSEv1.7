package examens;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Examen00 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int mitja=0,millor=0;
			int x=0,y=0,option=0,count=0,ok=1;
			int[][]sport=new int[5][6];
			
			for(y=0;y<6;y++){
				for(x=0;x<5;x++){
					while(ok==1){
						System.out.println("per a l'esportista "+(y+1));
						System.out.println("digues el resultat de la prova "+(x+1));
						String Sproba=teclado.readLine();
						int proba=Integer.parseInt(Sproba);
						if(proba<1 || proba>5 ){
							System.out.println("la xifra es incorrecta");
						}
						if(proba>0 && proba<6 ){
							sport[x][y]=proba;
							ok=2;
						}
					}
				ok=1;
				}
			}
			
			while(option!=4){
				System.out.println("1.Valoració mitja de cada esportista");
				System.out.println("2.Millor esportista en cada proba");
				System.out.println("3.Nous Valors");
				System.out.println("4.sortir");
				String Soption=teclado.readLine();
				option=Integer.parseInt(Soption);
				
				if(option==1){
					for(y=0;y<6;y++){
						mitja=0;
						for(x=0;x<5;x++){
							mitja=mitja+sport[x][y];
						}
						mitja=mitja/2;
						System.out.println("La mitja de l'esportista "+(y+1));
						System.out.println("és "+mitja);
					}
				}
				if(option==2){
					for(x=0;x<5;x++){
						millor=0;
						for(y=0;y<6;y++){
							if(millor<sport[x][y]){
								millor=sport[x][y];
								count=y;
							}
						}
						System.out.println("l'esportista "+(count+1));
						System.out.println("és el millor de la prova "+(x+1));
					}
				}
				if(option==3){
					System.out.println("ESCRIU LA CONTRASENYA");
					String Scontra=teclado.readLine();
					if (Scontra.equals("VIVA_JAVA")){
						for(y=0;y<6;y++){
							for(x=0;x<5;x++){
								while(ok==1){
									System.out.println("per a l'esportista "+(y+1));
									System.out.println("digues el resultat de la prova "+(x+1));
									String Sproba=teclado.readLine();
									int proba=Integer.parseInt(Sproba);
									if(proba<1 || proba>5 ){
										System.out.println("la xifra es incorrecta");
									}
									if(proba>0 && proba<6 ){
										if((sport[x][y]-proba)<1.5){
										sport[x][y]=proba;
										ok=2;
										}
										if((sport[x][y]-proba)>1.5){
											System.out.println("la xifra es incorrecta");
										}
									}
								ok=1;
								}
							}			
						}
					}
				}
				if(option==4){
					System.out.println("S'ha sortit del programa");
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}