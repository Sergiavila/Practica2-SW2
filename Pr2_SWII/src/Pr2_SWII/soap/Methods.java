package Pr2_SWII.soap;

import javax.jws.WebMethod;

import pojos.Recetario;

public class Methods {

	@WebMethod(operationName = "hello")
	public String crearRecetario() {
	        Recetario recetario = new Recetario();
	        
	        //A quitar
	        return "Hello";
	}
	
	/*
	@WebMethod(operationName = "hello")
	public String hello(@WebParam(name = "name") Receta receta) {
	        return "Hello " + txt + " !";
	}
	*/
	
}
