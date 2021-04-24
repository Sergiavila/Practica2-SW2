package com.cliente_recetario.cliente_soap2;

import com.cliente_recetario.cliente_soap.ws.client.generated.JAXBException_Exception;
import com.cliente_recetario.cliente_soap.ws.client.generated.Methods;
import com.cliente_recetario.cliente_soap.ws.client.generated.Recetario;
import com.cliente_recetario.cliente_soap.ws.client.generated.RecetarioService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JAXBException_Exception
    {
    	RecetarioService rs = new RecetarioService();
        Methods methods = rs.getMethodsPort();
        Recetario respuesta = methods.iniciar();
        System.out.println(respuesta);
    }
}
