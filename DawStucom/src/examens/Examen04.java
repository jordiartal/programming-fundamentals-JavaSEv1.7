package examens;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Examen04 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int surt=Integer.MAX_VALUE,menu=Integer.MAX_VALUE,numero=0,x=0,y=0,max=0,maxi=0,mini=0,min=0,campi=0,camp=0;
			while(surt!=0){
				System.out.println("quants equips hi ha?");
				String slliga=teclado.readLine();
				numero=Integer.parseInt(slliga);
				if(numero<2){
					System.out.println("ha de ser major de 2");
				}
				if(numero>=2){
					System.out.println("s'ha preparat la lliga");
					surt=0;
				}
			}
			int lliga[][]=new int[numero][numero];
			int gols[][]=new int[numero][3];
			for(x=0;x<numero;x++){
				for(y=0;y<numero;y++){
					lliga[x][y]=Integer.MAX_VALUE;
				}
			}
			for(x=0;x<numero;x++){
				lliga[x][x]=-1;
			}
			System.out.println("Inserta els resultats");
			for(x=0;x<numero;x++){
				for(y=0;y<numero;y++){
					if(lliga[x][y]==Integer.MAX_VALUE){
						System.out.println("partit "+x+" vs "+y);
						System.out.print("gols de l'equip "+x+":");
						String sres1=teclado.readLine();
						int res1=Integer.parseInt(sres1);
						System.out.print("gols de l'equip "+y+":");
						String sres2=teclado.readLine();
						int res2=Integer.parseInt(sres2);
						gols[x][0]=gols[x][0]+res1;
						gols[x][1]=gols[x][1]+res2;
						gols[y][0]=gols[y][0]+res2;
						gols[y][1]=gols[y][1]+res1;
						if(res1>res2){
							lliga[x][y]=3;
							lliga[y][x]=0;
							gols[x][2]=gols[x][2]+3;
						}
						if(res1<res2){
							lliga[x][y]=0;
							lliga[y][x]=3;
							gols[y][2]=gols[y][2]+3;
						}
						if(res1==res2){
							lliga[x][y]=1;
							lliga[y][x]=1;
							gols[x][2]=gols[x][2]+1;
							gols[y][2]=gols[y][2]+1;
						}
					}
				}
			}
			System.out.println("has insertat els resultats");
			System.out.println("resultats de la lliga");
			for(x=0;x<numero;x++){
				System.out.println();
				for(y=0;y<numero;y++){
					System.out.print("|"+lliga[x][y]+"|");
				}
			}
			System.out.println();
			while(menu!=4){
				System.out.println("-----------------------");
				System.out.println("1.Equip campió");
				System.out.println("2.Equip més golejador");
				System.out.println("3.Equip més golejat");
				System.out.println("4.Sortir");
				System.out.println("-----------------------");
				System.out.print("Escull la opció adecuada:");
				String smenu=teclado.readLine();
				menu=Integer.parseInt(smenu);
				if(menu==1){
					for(x=0;x<numero;x++){
						if(gols[x][2]>camp){
							camp=gols[x][2];
							campi=x;
						}
					}
					System.out.println("l'equip campió és el "+campi+" amb "+camp+" punts");
				}
				if(menu==2){
					for(x=0;x<numero;x++){
						if(gols[x][0]>max){
							max=gols[x][0];
							maxi=x;
						}
					}
					System.out.println("l'equip golejador és el "+maxi+" amb "+max+" gols");
				}
				if(menu==3){
					for(x=0;x<numero;x++){
						if(gols[x][1]>min){
							min=gols[x][1];
							mini=x;
						}
					}
					System.out.println("l'equip més golejat és el "+mini+" amb "+min+" gols");
				}
				if(menu==4){
					System.out.println("Has sortit del programa");	
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}