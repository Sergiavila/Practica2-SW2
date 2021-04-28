package Pr2_SWII.soap;

import java.io.File;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Marshaller;
import pojos.Receta;
import pojos.Recetario;


@WebService(serviceName = "RecetarioService")
public class Methods {

	// Hacer metodo para crear nuevo recetario (VACIO) en ultimo paso
	// (para asi poder ver de momento la obtencion)
	
	/*
	(operationName = "")
	public Recetario inicializarRecetario(Recetario recetario) throws JAXBException {
		
		Hacer un marshaler que lo sobreescriba en Recetario.xml
		Asi, puede ser tanto uno vacio como uno con contenido
		
	}
	 */
	
	Recetario r1 = new Recetario();
	@WebMethod(operationName = "obtenerRecetario")
	public Recetario obtenerRecetario() throws JAXBException {
		
		JAXBContext jaxbC = JAXBContext.newInstance(Recetario.class);
		Unmarshaller jaxbU = jaxbC.createUnmarshaller();
		File XMLfile = new File("C:/Users/Sergio/Desktop/Universidad/4ºAño/SW2/Practica2/Pr2_SWII/Recetario.xml");
		Recetario r1 = (Recetario) jaxbU.unmarshal(XMLfile);
		return r1;
		
	}
	
	
	@WebMethod(operationName = "obtenerReceta")
	public Receta obtenerReceta(@WebParam(name = "nombre") String nombre) throws JAXBException{
		Recetario recetario = obtenerRecetario();
		Receta receta = recetario.buscarReceta(nombre);
		return receta;
	}
	
	@WebMethod(operationName = "generarReceta")
	public Recetario generarReceta(@WebParam(name = "receta") Receta receta) throws JAXBException{
		Recetario recetario = obtenerRecetario();
		recetario.addReceta(receta);
		// TODO: llamar al primer metodo (marshaller) con input=(recetario)
		return recetario;
	}
	
	
	
	@WebMethod(operationName = "exportarRecetario")
	public String exportarRecetario(@WebParam(name = "path") String path) throws JAXBException {
		Recetario rec = obtenerRecetario();
        // Creamos el JAXBContext
        JAXBContext jaxbC = JAXBContext.newInstance(Recetario.class);
        // Creamos el JAXBMarshaller
        Marshaller jaxbM = jaxbC.createMarshaller();
        // Formateo bonito
        jaxbM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        //jaxbM.setProperty("com.sun.xml.bind.xmlDeclaration", false);
        // Escribiendo en un fichero
        File XMLfile = new File(path);
        jaxbM.marshal(rec, XMLfile);
        // Escribiendo por pantalla
        //jaxbM.marshal(book, System.out);
        return "Recetario exportado";
    }
	
	
	@WebMethod(operationName = "exportarReceta")
    public String exportarReceta(@WebParam(name = "nombreReceta") String nombre, @WebParam(name = "path") String path) throws JAXBException {
		Receta rec = obtenerReceta(nombre);
        // Creamos el JAXBContext
        JAXBContext jaxbC = JAXBContext.newInstance(Receta.class);
        // Creamos el JAXBMarshaller
        Marshaller jaxbM = jaxbC.createMarshaller();
        // Formateo bonito
        jaxbM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        // jaxbM.setProperty("com.sun.xml.bind.xmlDeclaration", false);
        // Escribiendo en un fichero
        File XMLfile = new File(path);
        jaxbM.marshal(rec, XMLfile);
        // Escribiendo por pantalla
        //jaxbM.marshal(book, System.out);
        return "Receta exportada";
    }
    
	@WebMethod(operationName = "importarRecetario")
    public String importarRecetario(@WebParam(name = "ruta") String ruta) throws JAXBException {
    	JAXBContext jaxbC = JAXBContext.newInstance(Recetario.class);
    	Unmarshaller jaxbU = jaxbC.createUnmarshaller();
    	File fichero = new File(ruta);
        r1 = (Recetario) jaxbU.unmarshal(fichero);
    	JAXBContext jaxbC1 = JAXBContext.newInstance(Recetario.class);
          // Creamos el JAXBMarshaller
        Marshaller jaxbM = jaxbC1.createMarshaller();
          // Formateo bonito
        jaxbM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
          //jaxbM.setProperty("com.sun.xml.bind.xmlDeclaration", false);
          // Escribiendo en un fichero
        File XMLfile = new File("C:/Users/Sergio/Desktop/Universidad/4ºAño/SW2/Practica2/Pr2_SWII/Recetario.xml");
        jaxbM.marshal(r1, XMLfile);
    	// TODO: llamar al primer metodo (marshaller) con input=(rec1)
    	
    	return "Recetario importado";
    }

	@WebMethod(operationName = "importarReceta")
    public String importarReceta(@WebParam(name = "ruta") String ruta) throws JAXBException {
    	JAXBContext jaxbC = JAXBContext.newInstance(Receta.class);
    	Unmarshaller jaxbU = jaxbC.createUnmarshaller();
    	File fichero = new File(ruta);
    	Receta rec1 = (Receta) jaxbU.unmarshal(fichero);
    	// TODO:
    	// Recetario recetario = obtenerRecetario() 
    	// Anadir a recetario la receta rec1
    	// Llamar al primer metodo (marshaller) con input=(recetario)
    	return "Receta importada";
    }

}
