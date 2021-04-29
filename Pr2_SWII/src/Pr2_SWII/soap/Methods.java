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
	
	 */
	
	Recetario r1 = new Recetario();
	
	@WebMethod(operationName = "iniciarRecetario")
	public Recetario inicializarRecetario() throws JAXBException {
		JAXBContext jaxbC1 = JAXBContext.newInstance(Recetario.class);
        // Creamos el JAXBMarshaller
		Marshaller jaxbM = jaxbC1.createMarshaller();
        // Formateo bonito
		jaxbM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        //jaxbM.setProperty("com.sun.xml.bind.xmlDeclaration", false);
        // Escribiendo en un fichero
		String directorio = System.getProperty("user.dir");
		File XMLfile = new File( directorio + "/Recetario.xml");
		jaxbM.marshal(r1, XMLfile);
		return r1;
		
	}
	@WebMethod(operationName = "obtenerRecetario")
	public Recetario obtenerRecetario() throws JAXBException {
		
		JAXBContext jaxbC = JAXBContext.newInstance(Recetario.class);
		Unmarshaller jaxbU = jaxbC.createUnmarshaller();
		String directorio = System.getProperty("user.dir");
        File XMLfile = new File( directorio + "/Recetario.xml");
		r1 = (Recetario) jaxbU.unmarshal(XMLfile);
		return r1;
		
	}
	
	
	@WebMethod(operationName = "obtenerReceta")
	public Receta obtenerReceta(@WebParam(name = "nombre") String nombre) throws JAXBException{
		Receta receta = r1.buscarReceta(nombre);
		return receta;
	}
	
	@WebMethod(operationName = "generarReceta")
	public Recetario generarReceta(@WebParam(name = "receta") Receta receta) throws JAXBException{
		r1.addReceta(receta);
		JAXBContext jaxbC1 = JAXBContext.newInstance(Recetario.class);
        // Creamos el JAXBMarshaller
		Marshaller jaxbM = jaxbC1.createMarshaller();
        // Formateo bonito
		jaxbM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        //jaxbM.setProperty("com.sun.xml.bind.xmlDeclaration", false);
        // Escribiendo en un fichero
		String directorio = System.getProperty("user.dir");
		File XMLfile = new File( directorio + "/Recetario.xml");
		jaxbM.marshal(r1, XMLfile);
		// TODO: llamar al primer metodo (marshaller) con input=(recetario)
		return r1;
	}
	
	
	
	@WebMethod(operationName = "exportarRecetario")
	public String exportarRecetario(@WebParam(name = "path") String path) throws JAXBException {
        // Creamos el JAXBContext
        JAXBContext jaxbC = JAXBContext.newInstance(Recetario.class);
        // Creamos el JAXBMarshaller
        Marshaller jaxbM = jaxbC.createMarshaller();
        // Formateo bonito
        jaxbM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        //jaxbM.setProperty("com.sun.xml.bind.xmlDeclaration", false);
        // Escribiendo en un fichero
        File XMLfile = new File(path);
        jaxbM.marshal(r1, XMLfile);
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
        String directorio = System.getProperty("user.dir");
        File XMLfile = new File( directorio + "/Recetario.xml");
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
    	r1.addReceta(rec1);
    	// TODO:
    	// Recetario recetario = obtenerRecetario() 
    	// Anadir a recetario la receta rec1
    	// Llamar al primer metodo (marshaller) con input=(recetario)
    	return "Receta importada";
    }

}
