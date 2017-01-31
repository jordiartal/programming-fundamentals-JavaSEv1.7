package xml_hamburguesas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
public class HamburguesaApp {
	public static void main(String[] args) throws Exception {
		ArrayList <Hamburguesa> carta = new ArrayList<Hamburguesa>();
		carta.add(new Hamburguesa(200,"Light","vacuno",150));
		carta.add(new Hamburguesa(1000,"Burger","payaso",1500));
		carta.add(new Hamburguesa(200,"Zombi","humana",375));
		
		CrearXML(carta);
		LeerXML(carta);
	}
	//-------------------SE DA FORMATO EL DOCUMENTO XML ---------------------------------
	//-----------------------------------------------------------------------------------
	private static void CrearXML(ArrayList<Hamburguesa>carta) throws Exception {
		String fichero= "hamburguesas.xml";

		//con document se crea un docuemnto XML
		//que alamacena el docuemnto XML entero como DOC
		Document doc = new Document();
		//se crea la raiz como HAMBURGUESAS
		Element raiz = new Element("Hamburguesas");
		//almacena el tag raiz del xml en el "DOC"
		doc.setRootElement(raiz);
		//amb el for each es recorre l'estructura de dades
		// amb setText es van ficant els valors
		int i=1;
		for(Hamburguesa ham: carta){
			Element producto = new Element("producto");
			producto.setAttribute("codigo",String.valueOf(i)); i++;
			producto.addContent(new Element("calorias").setText(String.valueOf(ham.getCalorias())));
			producto.addContent(new Element("nombre").setText(ham.getNombre()));
			producto.addContent(new Element("tipoCarne").setText(ham.getTipoCarne()));
			producto.addContent(new Element("peso").setText(String.valueOf(ham.getPeso())));
			raiz.addContent(producto);
		}
		//sirve para dcir como debe ser el formato de salida
		XMLOutputter xmlOUT = new XMLOutputter(Format.getPrettyFormat());
		//a la variable xmlOUT que hemos creado le añadimos los datos que 
		//hemos creado
		xmlOUT.output(doc,new FileOutputStream(fichero));
	}	
	//--------------------------SE LEE EL DOCUMENTO XML ---------------------------------
	//-----------------------------------------------------------------------------------
	private static void LeerXML(ArrayList<Hamburguesa>carta) throws Exception {
		//coje el Arxivo XML i lo parsea
		SAXBuilder builder = new SAXBuilder();
		//creamos la variable que almacene el fichero XML
		File fichero = new File("hamburguesas.xml"); 
		
		Document doc = builder.build(fichero);
		Element raiz = doc.getRootElement();
		List <Element> hamburguesas = raiz.getChildren();
		for (Element ham: hamburguesas){
			String codigo = ham.getAttributeValue("codigo");
			System.out.println("buguer codigo "+codigo);
			//se 
			List<Element>campos=ham.getChildren();
			for (Element campo: campos){
				System.out.println("\t"+campo.getName()+":"+campo.getText());
			}
		}
	}
}