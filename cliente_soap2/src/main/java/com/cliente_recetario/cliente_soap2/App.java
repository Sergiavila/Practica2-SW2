package com.cliente_recetario.cliente_soap2;

import java.io.File;
import java.util.ArrayList;

import com.cliente_recetario.cliente_soap.ws.client.generated.Ingrediente;
import com.cliente_recetario.cliente_soap.ws.client.generated.JAXBException_Exception;
import com.cliente_recetario.cliente_soap.ws.client.generated.Methods;
import com.cliente_recetario.cliente_soap.ws.client.generated.Receta;
import com.cliente_recetario.cliente_soap.ws.client.generated.Recetario;
import com.cliente_recetario.cliente_soap.ws.client.generated.RecetarioService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JAXBException_Exception{
    	RecetarioService rs = new RecetarioService();
        Methods methods = rs.getMethodsPort();
        
        // case 0
        
	    Recetario recetario = methods.obtenerRecetario();
	    System.out.println(recetario.toString());
    	
        
        // case 1
        /*
        Receta receta = methods.obtenerReceta("Crema de calabaza");
	    System.out.println(receta.toString());
    	*/
        
        // case 2
        /*
        Receta r1 = new Receta();
        r1.setDificultad("facil");
        r1.setTipo("mediterranea");
        r1.setNombreReceta("Nueva receta");
        r1.setInstrucciones("Instrucciones de la nueva receta");
        Ingrediente i1 = new Ingrediente();
        i1.setCantidad("500g");
        i1.setNombreIngrediente("Pollo");
        Ingrediente i2 = new Ingrediente();
        i2.setCantidad("500g");
        i2.setNombreIngrediente("Arroz");
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(i1); ingredientes.add(i2);
        // TODO: (SIEMPRE, NO BORRAR) en Receta.java: find-replace( Receta.Ingredientes -> ArrayList<Ingrediente>)
        r1.setIngredientes(ingredientes);
        methods.generarReceta(r1);
        */
        
        // case 3 (exportar recetario)
	    /*
	    String mensaje = methods.exportarRecetario("./RecetarioExportado.xml");
	    System.out.println(mensaje);
	    */
	    
	    // case 3.1 (exportar receta)
	    /*
	    String mensajeReceta = methods.exportarReceta("Crema de calabaza" , "./RecetaExportada.xml");
	    System.out.println(mensajeReceta);
	    */
	    
	    // case 4 (importar recetario)
	    /*
	    String mensaje = methods.importarRecetario("./RecetarioSmall.xml")
	    System.out.println(mensaje);
	    */
	    
	    // case 4.1 (importar receta)
	    /*
	    String mensaje = methods.importarReceta("./RecetaSmall.xml")
	    System.out.println(mensaje);
	    */
	    
	    
        
        
        
    }
    
   
}
