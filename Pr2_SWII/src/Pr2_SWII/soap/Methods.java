package Pr2_SWII.soap;

import java.io.File;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import pojos.Receta;
import pojos.Recetario;

import javax.xml.bind.Marshaller;



@WebService(serviceName = "RecetarioService")
public class Methods {

	
	@WebMethod(operationName = "iniciarRecetario")
	public Recetario inicializarRecetario() throws JAXBException {
		Recetario r1 = new Recetario();
		JAXBContext jaxbC1 = JAXBContext.newInstance(Recetario.class);
        // Creamos el JAXBMarshaller
		Marshaller jaxbM = jaxbC1.createMarshaller();
        // Formateo bonito
		jaxbM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        //jaxbM.setProperty("com.sun.xml.bind.xmlDeclaration", false);
        // Escribiendo en un fichero
		String directorio = System.getProperty("user.home");
		File carpeta = new File(directorio + "/Recursos");
		carpeta.mkdir();
		String directorio2 = carpeta.getAbsolutePath();
		File XMLfile = new File( directorio2 + "/Recetario.xml");
		jaxbM.marshal(r1, XMLfile);
		return r1;
		
	}
	@WebMethod(operationName = "obtenerRecetario")
	public Recetario obtenerRecetario() throws JAXBException {
		
		JAXBContext jaxbC = JAXBContext.newInstance(Recetario.class);
		Unmarshaller jaxbU = jaxbC.createUnmarshaller();
		String directorio = System.getProperty("user.home");
        File XMLfile = new File( directorio + "/Recursos/Recetario.xml");
		Recetario recetario = (Recetario) jaxbU.unmarshal(XMLfile);
		return recetario;
		
	}
	
	
	@WebMethod(operationName = "obtenerReceta")
	public Receta obtenerReceta(@WebParam(name = "nombre") String nombre) throws JAXBException{
		Recetario recetario = obtenerRecetario();
		Receta receta = recetario.buscarReceta(nombre);
		return receta;
	}
	
	@WebMethod(operationName = "generarReceta")
	public String generarReceta(@WebParam(name = "receta") Receta receta) throws JAXBException{
		Recetario recetario = obtenerRecetario();
		recetario.addReceta(receta);
		JAXBContext jaxbC = JAXBContext.newInstance(Recetario.class);
	        // Creamos el JAXBMarshaller
	    Marshaller jaxbM = jaxbC.createMarshaller();
	        // Formateo bonito
	    jaxbM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
	        // jaxbM.setProperty("com.sun.xml.bind.xmlDeclaration", false);
	        // Escribiendo en un fichero
	    String directorio = System.getProperty("user.home");
		File XMLfile = new File( directorio + "/Recursos/Recetario.xml");
	    jaxbM.marshal(recetario, XMLfile);
		return "Receta a?adida";
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
    public String exportarReceta(@WebParam(name = "nombreReceta") Receta receta, @WebParam(name = "path") String path) throws JAXBException {
		
        // Creamos el JAXBContext
        JAXBContext jaxbC = JAXBContext.newInstance(Receta.class);
        // Creamos el JAXBMarshaller
        Marshaller jaxbM = jaxbC.createMarshaller();
        // Formateo bonito
        jaxbM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        // jaxbM.setProperty("com.sun.xml.bind.xmlDeclaration", false);
        // Escribiendo en un fichero
        File XMLfile = new File(path);
        jaxbM.marshal(receta, XMLfile);
        // Escribiendo por pantalla
        //jaxbM.marshal(book, System.out);
        return "Receta exportada";
    }
    
	@WebMethod(operationName = "importarRecetario")
    public String importarRecetario(@WebParam(name = "ruta") String ruta) throws JAXBException {
    	JAXBContext jaxbC = JAXBContext.newInstance(Recetario.class);
    	Unmarshaller jaxbU = jaxbC.createUnmarshaller();
    	File fichero = new File(ruta);
        Recetario r1 = (Recetario) jaxbU.unmarshal(fichero);
        
    	JAXBContext jaxbC1 = JAXBContext.newInstance(Recetario.class);
          // Creamos el JAXBMarshaller
        Marshaller jaxbM = jaxbC1.createMarshaller();
          // Formateo bonito
        jaxbM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
          //jaxbM.setProperty("com.sun.xml.bind.xmlDeclaration", false);
          // Escribiendo en un fichero
        String directorio = System.getProperty("user.home");
        File XMLfile = new File( directorio + "/Recursos/Recetario.xml");
        jaxbM.marshal(r1, XMLfile);    	
    	return "Recetario Importado";
    }

	@WebMethod(operationName = "importarReceta")
    public String importarReceta( @WebParam(name = "ruta") String ruta) throws JAXBException {
		JAXBContext jaxbC = JAXBContext.newInstance(Receta.class);
    	Unmarshaller jaxbU = jaxbC.createUnmarshaller();
    	File fichero = new File(ruta);
    	Receta rec1 = (Receta) jaxbU.unmarshal(fichero);
    	Recetario recetario = obtenerRecetario();
    	recetario.addReceta(rec1);
    	
    	JAXBContext jaxbC1 = JAXBContext.newInstance(Recetario.class);    	
        // Creamos el JAXBMarshaller
    	Marshaller jaxbM = jaxbC1.createMarshaller();
        // Formateo bonito
    	jaxbM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        // jaxbM.setProperty("com.sun.xml.bind.xmlDeclaration", false);
        // Escribiendo en un fichero
    	String directorio = System.getProperty("user.home");
    	File XMLfile = new File( directorio + "/Recursos/Recetario.xml");
    	jaxbM.marshal(recetario, XMLfile);
    	return "Receta Importada";
    }

}
