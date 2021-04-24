package com.cliente_recetario.cliente_soap;

import com.cliente_recetario.cliente_soap.ws.client.generated.Methods;
import com.cliente_recetario.cliente_soap.ws.client.generated.RecetarioService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RecetarioService rs = new RecetarioService();
        Methods methods = rs.getMethodsPort();
        String respuesta = methods.hello();
        System.out.println(respuesta);
    }
}
