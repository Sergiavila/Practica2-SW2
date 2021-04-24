package Pr2_SWII.soap;

import java.io.File;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import pojos.Recetario;

@WebService(serviceName = "RecetarioService")
public class Methods {

	@WebMethod(operationName = "iniciar")
	public Recetario  inicializarRecetario() throws JAXBException {
		JAXBContext jaxbC = JAXBContext.newInstance(Recetario.class);
		Unmarshaller jaxbU = jaxbC.createUnmarshaller();
		File XMLfile = new File("C:/Users/Sergio/Desktop/Universidad/4ºAño/SW2/Practica2/Pr2_SWII/Recetario.xml");
		Recetario rec1 = (Recetario) jaxbU.unmarshal(XMLfile);
		return rec1;
	}
	
	/*
	@WebMethod(operationName = "hello")
	public String hello(@WebParam(name = "name") Receta receta) {
	        return "Hello " + txt + " !";
	}
	*/
	
}
