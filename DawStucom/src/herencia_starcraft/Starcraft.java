package herencia_starcraft;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.TreeMap;
public class Starcraft { 
	//-----------------------------DECLAREM VARIABLES--------------------------------------
	//-------------------------------------------------------------------------------------
	static int menu=0, teclat=0, bucle=0, torn=0; static String nombre, primer, segon, modifica;
	static double edificio, tecnologia, esbirro, overlord, pilon, defensa, atac, victoria=0;
	static double idprimer=0, idsegon=0, valprimer, valsegon, asaprimer, asasegon;
	static TreeMap <String,Escuadron> starcraft = new TreeMap <String,Escuadron>();
	static ArrayList <Escuadron> millors = new ArrayList <Escuadron>();
	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		//---------------------------EXECUTA LES FUNCIONS DE L'APLICACIÓ-----------------------
		//-------------------------------------------------------------------------------------		
		do{
			menu = menu();
			menu=Integer.parseInt(br.readLine());
			switch(menu){ 
				case 1:
					creaEscuadro();
					break;
				case 2:
					registraBatalla();
					break;
				case 3:
					milloraEscuadro();
					break;
				case 4:
					mostrarClassificacio();
					break;
				case 0:
					System.out.println("has SORTIT del programa");
					break;
				default:
					System.out.println("Opció incorrecta");
			}
		}
		while(menu!=0);
	}
	//------------------------MOSTRA LES FUNCIONS DE L'APLICACIÓ--------------------------
	//------------------------------------------------------------------------------------
	private static int menu() {
		System.out.println("----STARCRAFT----");
		System.out.println("[1]CREAR ESCUADRÓ");
		System.out.println("[2]REGISTRAR BATALLA");
		System.out.println("[3]MILLORAR ESCUADRÓ");
		System.out.println("[4]MOSTRAR ELS 3 PRIMERS");
		System.out.println("[0]SORTIR");
	return 0;
	}
	//-------------------------------METODE MOSTRAR CLASSIFICACIO-------------------------
	//------------------------------------------------------------------------------------
	private static void mostrarClassificacio() {
		for(Entry<String,Escuadron> e: starcraft.entrySet()){
            millors.add(e.getValue());
		}
		Collections.sort(millors);
		for(bucle=0;bucle<4;bucle++){
            System.out.println("["+bucle+"]NOM: "+millors.get(bucle));
		}
	}
	//-------------------------------METODE MILLORA ESCUADRO------------------------------
	//------------------------------------------------------------------------------------
	private static void milloraEscuadro() throws Exception {
		//PRIMER MOSTRA EL TREE MAP PER A QUE L'USUARI TRII ELS ELEMENTS
		System.out.println("SELECCIONA ELS ESCUADRO A MILLORAR:");
		bucle=0;
		for(Entry<String,Escuadron> e: starcraft.entrySet()){
            System.out.println("["+bucle+"]NOM: "+e.getValue().getNombre());
            bucle++;
		}
		System.out.println("DIGUES EL NOM DEL ESCUADRO:");
		nombre=br.readLine();
		//COMPROBACIÓ QUE ELS ELEMENTS ESTÁN A DINS EL TREEMAP, SINO SURT
		if(starcraft.get(nombre) == null){
			System.out.println("L'ESCUADRO NO EXISTEIX");
			return;
		}
		//S'HA DE DETECTAR LA SUBCLASE
		if(starcraft.get(nombre)instanceof Terran){
			System.out.println("QUE VOLS CANVIAR?");
			System.out.println("[1]-EDIFICIS");
			System.out.println("[2]-TECNOLOGIA");
			teclat=Integer.parseInt(br.readLine());
			switch(teclat){
				case 1:
					System.out.println("MODIFICA ELS EDIFICIS:");
					((Terran)starcraft.get(nombre)).setEdificio(Double.parseDouble(br.readLine()));
					((Terran)starcraft.get(nombre)).atac();
				break;
				case 2:
					System.out.println("MODIFICA LES TECNOLOGIES:");
					((Terran)starcraft.get(nombre)).setTecnologia(Double.parseDouble(br.readLine()));
					((Terran)starcraft.get(nombre)).defensa();
				break;
				default:
					System.out.println("HAS PITJAT UNA OPCIÓ INCORRECTA");
			}
		}
		if(starcraft.get(nombre)instanceof Zerg){
			System.out.println("QUE VOLS CANVIAR?");
			System.out.println("[1]-ESBIRRO");
			System.out.println("[2]-OVERLORD");
			teclat=Integer.parseInt(br.readLine());
			switch(teclat){
				case 1:
					System.out.println("MODIFICA ELS ESBIRROS:");
					((Zerg)starcraft.get(nombre)).setEsbirro(Double.parseDouble(br.readLine()));
					((Zerg)starcraft.get(nombre)).defensa();
					((Zerg)starcraft.get(nombre)).atac();
				break;
				case 2:
					System.out.println("MODIFICA ESL OVERLORDS:");
					((Zerg)starcraft.get(nombre)).setOverlord(Double.parseDouble(br.readLine()));
					((Zerg)starcraft.get(nombre)).atac();
				break;
				default:
					System.out.println("HAS PITJAT UNA OPCIÓ INCORRECTA");
			}
		}
		if(starcraft.get(nombre)instanceof Protos){
			System.out.println("MODIFICA ELS PILONS:");
			((Protos)starcraft.get(nombre)).setPilon(Double.parseDouble(br.readLine()));
			((Protos)starcraft.get(nombre)).defensa();
			((Protos)starcraft.get(nombre)).atac();
		}
		System.out.println("QUEDA AIXÍ "+starcraft.get(nombre));
	}
	//-------------------------------METODE REGISTRA BATALLA------------------------------
	//------------------------------------------------------------------------------------
	private static void registraBatalla() throws Exception {
		//PRIMER MOSTRA EL TREE MAP PER A QUE L'USUARI TRII ELS ELEMENTS
		System.out.println("SELECCIONA ELS 2 ESCUADRONS CONTRINCANTS:");
		bucle=0;
		for(Entry<String,Escuadron> e: starcraft.entrySet()){
            System.out.println("["+bucle+"]NOM: "+e.getValue().getNombre());
            bucle++;
		}
		System.out.println("DIGUES EL NOM DEL PRIMER ESCUADRO:");
		primer=br.readLine();
		System.out.println("DIGUES EL NOM DEL SEGON ESCUADRO:");
		segon=br.readLine();
		//COMPROBACIÓ QUE ELS ELEMENTS ESTÁN A DINS EL TREEMAP, SINO SURT
		if(starcraft.get(primer) == null || starcraft.get(segon) == null ){
			System.out.println("UN DELS DOS ESCUADRONS NO EXISTEIX");
			return;
		}
		//S'HA DE COMPARAR LA SUBCLASSE DELS 2 ELEMENTS, SI ES IGUAL SE SURT
		if(starcraft.get(primer)instanceof Terran && starcraft.get(segon)instanceof Terran){
			System.out.println("NO ES PODEN ENFRONTAR, SON TERRANS");
			return;
		}
		if(starcraft.get(primer)instanceof Zerg && starcraft.get(segon)instanceof Zerg){
			System.out.println("NO ES PODEN ENFRONTAR, SON ZERG");
			return;
		}
		if(starcraft.get(primer)instanceof Protos && starcraft.get(segon)instanceof Protos){
			System.out.println("NO ES PODEN ENFRONTAR, SON PROTOSS");
			return;
		}		
		//SI HA SUPERAT TOTES LES PROBES DE VERIFICACIO S'ENTRA A LA BATALLA
		while(torn<5){	
			//ES GENERA EL NUMERO ALEATORI PER A CADA PARTICIPANT
			idprimer=Math.floor(Math.random()*9+1);
			idsegon=Math.floor(Math.random()*9+1);
			while(idprimer==idsegon){idsegon=(int)Math.floor(Math.random()*9+1);}
			//S'AFEGEIX EL NOMBRE ALEATORI AL VALOR DE DEFENSA I ATAC DE CADA OPONENT			
			valprimer=idprimer+starcraft.get(primer).getAtaque()-starcraft.get(segon).getDefensa();
			valsegon=idsegon+starcraft.get(segon).getAtaque()-starcraft.get(primer).getDefensa();
			System.out.println("força "+primer+" : "+valprimer+". força "+segon+" : "+valsegon);
			if (valprimer>valsegon){
				System.out.println("ASALT NUMERO: "+torn+". l'ha guanyat el "+primer);
				System.out.println("-----------------------------------");
				asaprimer++;
			}
			if (valprimer<valsegon){
				System.out.println("ASALT NUMERO: "+torn+". l'ha guanyat el "+segon);
				System.out.println("-----------------------------------");
				asasegon++;
			}
			if (valprimer==valsegon){
				System.out.println("ASALT NUMERO: "+torn+". HAN EMPATAT, ES REPETEIX TORN");
				System.out.println("-----------------------------------");
				torn--;
			}
			torn++; 
		}
		if (asaprimer>asasegon){
			System.out.println("LA BATALLA L'HA GUANYAT EN: "+primer); 
			starcraft.get(primer).setVictorias(starcraft.get(primer).getVictorias()+1);
		}
		if (asaprimer<asasegon){
			System.out.println("LA BATALLA L'HA GUANYAT EN: "+segon); 
			starcraft.get(segon).setVictorias(starcraft.get(segon).getVictorias()+1);
		}
		System.out.println("victories acumulades de: "+primer+" : "+starcraft.get(primer).getVictorias()+" . victories acumulades de:"+segon+" : "+starcraft.get(segon).getVictorias());
		torn=0; asaprimer=0; asasegon=0;
	}
	//-------------------------------METODE CREA ESCUADRO---------------------------------
	//------------------------------------------------------------------------------------
	private static void creaEscuadro() throws Exception {
		//AQUI S'INSERTA EN EL TREE-MAP ELS ESCUADRONS, ES DESEN EN VARIABLES, DESPRES ES
		//CREA LA SUBCLASSE I S'INSERTA EN EL TREE-MAP
		System.out.println("DE QUÉ VOLS CREAR L'ESCUADRO?");
		System.out.println("[1]TERRAN");
		System.out.println("[2]ZERG");
		System.out.println("[3]PROTOSS");
		teclat=Integer.parseInt(br.readLine());
		if(teclat==1){System.out.println("has triat TERRAN");}
		if(teclat==2){System.out.println("has triat ZERG");}
		if(teclat==3){System.out.println("has triat PROTOSS");}
		if(teclat<1 || teclat>3){System.out.println("has triat EQUIVOCADAMENT");return;}
		System.out.println("DIGUES EL NOM DE L'ESCUADRÓ:");
		nombre=br.readLine();
		System.out.println("L'ESCUADRÓ ES DIU: "+nombre);
		if(starcraft.containsKey(nombre)){
			System.out.println("L'ESCUADRO "+nombre+" JA EXISTEIX");
			return;
		}
		System.out.println("DIGUES EL NIVELL DE DEFENSA:");
		defensa=Double.parseDouble(br.readLine());
		System.out.println("DIGUES EL NIVELL DE ATAC:");
		atac=Double.parseDouble(br.readLine());
		switch (teclat){
			case 1:
				System.out.println("QUANTITAT D'EDIFICIS");
				edificio=Double.parseDouble(br.readLine());
				System.out.println("NOMBRE DE TECNOLOGIES DESCOBERTES:");
				tecnologia=Double.parseDouble(br.readLine());
				Terran Terranu=new Terran(nombre, victoria, atac, defensa, edificio, tecnologia);
				starcraft.put( nombre, Terranu);
				Terranu.atac();Terranu.defensa();
				System.out.println("HAS CREAT UN ESCUADRO AMB LES SEGÜENTS CARACTERISTIQUES:");
				System.out.println(Terranu);
				break;
			case 2:
				System.out.println("QUANTITAT D'ESBIRROS:");
				esbirro=Double.parseDouble(br.readLine());
				System.out.println("QUANTITAT D'OVERLORDS");
				overlord=Double.parseDouble(br.readLine());
				Zerg Zergu = new Zerg(nombre, victoria, atac, defensa, esbirro, overlord);
				Zergu.atac();Zergu.defensa();
				starcraft.put( nombre, Zergu);
				System.out.println("HAS CREAT UN ESCUADRO AMB LES SEGÜENTS CARACTERISTIQUES:");
				System.out.println(Zergu);
				break;
			case 3:
				System.out.println("QUANTITAT DE PILONS");
				pilon=Double.parseDouble(br.readLine());
				Protos Protossu=new Protos(nombre, victoria, atac, defensa, pilon);
				Protossu.atac();Protossu.defensa();
				starcraft.put(nombre, Protossu);
				System.out.println("HAS CREAT UN ESCUADRO AMB LES SEGÜENTS CARACTERISTIQUES:");
				System.out.println(Protossu);
				break;
		}
	}
}