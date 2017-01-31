package xml_trivial;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
public class Principal {
	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Pregunta>listaPreguntas= new ArrayList<Pregunta>();	
	public static void main(String[] args) throws Exception {
		cargarXML();
		int opcion;
		do{
			opcion=menu();
			switch (opcion) {
			case 1:
				nuevoJuego();
				break;
			case 2:
				addPregunta();
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				System.out.println("opcion incorrecta");
				break;
			}
		}while(opcion!=0);
		
	}
	private static void addPregunta() throws Exception, IOException {
		SAXBuilder builder = new SAXBuilder();
		File fichero = new File("preguntas.xml");
		if(!fichero.exists()){
			crearXML();
		}
		Document doc = builder.build(fichero);
		Element raiz = doc.getRootElement();
				
		
		Element pregunta2 = new Element("pregunta");
		System.out.println("introduce enunciado pregunta:");
		String texto= teclado.readLine();
		pregunta2.addContent(new Element("enunciado").setText("Cual es la mejor hamburguesa del Bacoa"));
		pregunta2.addContent(new Element("respuesta1").setText("Manchega"));
		pregunta2.addContent(new Element("respuesta2").setText("Bacoa"));
		pregunta2.addContent(new Element("respuesta3").setText("San Jacobo"));
		pregunta2.addContent(new Element("respuesta4").setText("Pollo marinado"));
		pregunta2.addContent(new Element("correcta").setText("1"));
		raiz.addContent(pregunta2);	
		
		XMLOutputter xmlOut = new XMLOutputter(Format.getPrettyFormat());
		xmlOut.output(doc, new FileOutputStream(fichero));
		
	}
	private static void nuevoJuego() throws Exception {
		int vidas=3;
		boolean victoria=false;
		int numeroPregunta;
		Pregunta p;
		int respuesta;
		while(vidas>0 &&!victoria){
			numeroPregunta=(int)(Math.floor(Math.random()))*listaPreguntas.size();
			p = listaPreguntas.get(numeroPregunta);
			System.out.println(p.getEnunciado());
			System.out.println("[1] - "+p.getRespuesta1());
			System.out.println("[2] - "+p.getRespuesta2());
			System.out.println("[3] - "+p.getRespuesta3());
			System.out.println("[4] - "+p.getRespuesta4());
			System.out.println("selecciona la resposta correcta:");
			respuesta = Integer.parseInt(teclado.readLine());
			if(respuesta==p.getCorrecta()){
				System.out.println("ole tu!");
			}
			else{
				System.out.println("has fallado");
				vidas--;
			}
			listaPreguntas.remove(numeroPregunta);
			if(listaPreguntas.size()==0){
				victoria=true;
			}
		}
		if(vidas==0){
			System.out.println("Has perdido");
		}
		else{
			System.out.println("Has Ganado 50 Millones");
		}
	}
	private static int menu() throws NumberFormatException, IOException {
		System.out.println("***50x15 Stucom***");	
		System.out.println("==================");
		System.out.println("[1] - Nuevo juego");
		System.out.println("[2] - Crear pregunta");
		System.out.println("[0] - Salir");
		System.out.println("Elige opcion");
		int opcion=Integer.parseInt(teclado.readLine());
		return opcion;
	}
	private static void cargarXML() throws FileNotFoundException, IOException, JDOMException {
		SAXBuilder builder = new SAXBuilder();
		File fichero = new File("preguntas.xml");
		if(!fichero.exists()){
			crearXML();
		}
		Document doc = builder.build(fichero);
		Element raiz = doc.getRootElement();
		List<Element> preguntas = raiz.getChildren();
		for(Element preg: preguntas){
			String enunciado=preg.getChild("enunciado").getValue();
			String respuesta1=preg.getChildText("respuesta1");
			String respuesta2=preg.getChildText("respuesta2");
			String respuesta3=preg.getChildText("respuesta3");
			String respuesta4=preg.getChildText("respuesta4");
			int correcta=Integer.parseInt(preg.getChildText("correcta"));
			listaPreguntas.add(new Pregunta(enunciado, respuesta1,respuesta2,respuesta3,respuesta4, correcta));
		}
	}
	private static void crearXML() throws FileNotFoundException, IOException {
		String fichero = "preguntas.xml";
		Document doc = new Document();
		Element raiz = new Element("preguntas");
		//Establezco el elemento raíz del XML
		doc.setRootElement(raiz);
		Element pregunta = new Element("pregunta");
		pregunta.addContent(new Element("enunciado").setText("Quien es ek crack brasileiro"));
		pregunta.addContent(new Element("respuesta1").setText("Xavi Vidal"));
		pregunta.addContent(new Element("respuesta2").setText("Pedro Porcuna"));
		pregunta.addContent(new Element("respuesta3").setText("Pequeño Nicolas"));
		pregunta.addContent(new Element("respuesta4").setText("Doña Cayetana"));
		pregunta.addContent(new Element("correcta").setText("2"));
		raiz.addContent(pregunta);
		//pregunta 2
		Element pregunta2 = new Element("pregunta");
		pregunta2.addContent(new Element("enunciado").setText("Cual es la mejor hamburguesa del Bacoa"));
		pregunta2.addContent(new Element("respuesta1").setText("Manchega"));
		pregunta2.addContent(new Element("respuesta2").setText("Bacoa"));
		pregunta2.addContent(new Element("respuesta3").setText("San Jacobo"));
		pregunta2.addContent(new Element("respuesta4").setText("Pollo marinado"));
		pregunta2.addContent(new Element("correcta").setText("1"));
		raiz.addContent(pregunta2);	
		XMLOutputter xmlOut = new XMLOutputter(Format.getPrettyFormat());
		xmlOut.output(doc, new FileOutputStream(fichero));
	}
}