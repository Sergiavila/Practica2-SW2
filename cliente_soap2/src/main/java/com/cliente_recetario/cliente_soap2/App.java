package com.cliente_recetario.cliente_soap2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

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
    public static void main( String[] args ) throws JAXBException_Exception, IOException{
    	RecetarioService rs = new RecetarioService();
        Methods methods = rs.getMethodsPort();
        
        // case 0
        
	    /*Recetario recetario = methods.obtenerRecetario();
	    System.out.println(recetario);*/
    	
        
        // case 1
        
       /* Receta receta = methods.obtenerReceta("Crema de calabaza");
	    System.out.println(receta);*/
    	
        
        // case 2
      /* Recetario recetario1 = new Recetario();
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
        recetario1 = methods.generarReceta(r1);
        System.out.println(recetario1);*/
        
        
        
        // case 3 (exportar recetario)
	    
	    /*String mensaje = methods.exportarRecetario("C:/Users/Sergio/Desktop/Universidad/4ºAño/SW2/Practica2/Pr2_SWII/RecetarioExportado.xml");
	    System.out.println(mensaje);*/
	    
	    
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
		int opcion = 0;
		boolean cerrojo = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		Recetario rec = new Recetario();
		Receta receta = new Receta();
		while(opcion!=9) {
			System.out.println("Bienvenido a su recetario\n" + "¿Qué desea hacer?\n");
			System.out.println("1. Crear Recetario\n");
			System.out.println("2. Obtener Recetario\n");
			System.out.println("3. Obtener Receta\n");
			System.out.println("4. Añadir una receta\n");
			System.out.println("5. Exportar Recetario\n");
			System.out.println("6. Exportar Receta\n");
			System.out.println("7. Importar Recetario\n");
			System.out.println("8. Importar Receta\n");
			System.out.println("9. Salir\n");
			
			
			opcion = entrada.nextInt();	
			
			switch(opcion) {
			case(1):
				System.out.println("Iniciando recetario vacío...\n");
				methods.iniciarRecetario();
				System.out.println("Recetario iniciado\n");
				break;
			case(2):
				System.out.println("Obteniendo Recetario...\n");
			    rec = methods.obtenerRecetario();
		    	System.out.println(rec);
				break;
			case(3):
				System.out.println("Indica el nombre de la receta que quiera visualizar\n");
				String nombre = br.readLine();
				System.out.println("Obteniendo Receta...\n");
				receta = methods.obtenerReceta(nombre);
				System.out.println(receta);
				break;
			case (4):
				Receta r1 = new Receta();
				ArrayList<Ingrediente> ingredientes1 = new ArrayList<Ingrediente>();
				System.out.println("Introduzca la receta que desea importar\n");
				System.out.println("Introduzca la dificultad de la receta:\n");
				String dificultad = br.readLine();
				r1.setDificultad(dificultad);
				System.out.println("Introduzca el tipo de la receta:\n");
				String tipo = br.readLine();
				r1.setTipo(tipo);
				System.out.println("Introduzca el nombre de la receta:\n");
				String nombreReceta = br.readLine();
				r1.setNombreReceta(nombreReceta);
				System.out.println("Introduce ingredientes\n");
				String nombreIngrediente;
				String cantidad;
				while (cerrojo == true) {
					Ingrediente ingrediente = new Ingrediente();
					System.out.println("Introduce nombre de ingrediente:\n");
					nombreIngrediente = br.readLine();
					ingrediente.setNombreIngrediente(nombreIngrediente);
					System.out.println("Introduce cantidad\n");
					cantidad = br.readLine();
					ingrediente.setCantidad(cantidad);
					ingredientes1.add(ingrediente);
					System.out.println("Has terminado de introducir ingredientes? (0 no| 1 si)\n");
					int variable = entrada.nextInt();
					if (variable == 1) {
						break;
					}
				}
				r1.setIngredientes(ingredientes1);
				System.out.println("Introduzca las instrucciones de la receta:\n");
				String instrucciones = br.readLine();
				r1.setInstrucciones(instrucciones);
				System.out.println(r1);
				rec = methods.obtenerRecetario();
				rec = methods.generarReceta(rec,r1);
				System.out.println(rec);
				break;
			case(5):
				System.out.println("Introduce el nombre del archivo para exportar el contenido (empezando por /Recursos)\n");
				String ruta = br.readLine();	
				System.out.println("Exportando Recetario...\n");
				String directorio = System.getProperty("user.home");
				String mensaje = methods.exportarRecetario( directorio + ruta);
			    System.out.println(mensaje);
				break;
			case(6):
				System.out.println("Introduce el nombre de la receta \n");
				String nombre1 = br.readLine();
				receta = methods.obtenerReceta(nombre1);
				System.out.println("Introduce el nombre del archivo para exportar el contenido (empezando por /Recursos)\n");
				String ruta1 = br.readLine();
				System.out.println("Exportando Receta\n");
				String directorio1 = System.getProperty("user.home");
				String mensajeReceta = methods.exportarReceta(receta , directorio1 + ruta1);
			    System.out.println(mensajeReceta);
				
				break;
				
			case(7):
				System.out.println("Introduzca la ruta absoluta para importar Recetario\n");
				String ruta2 = br.readLine();
				System.out.println("Importando Recetario...\n");
				methods.importarRecetario(ruta2);				
				break;

			case(8):
				System.out.println("Introduzca la ruta absoluta para importar la Receta\n");
				rec = methods.obtenerRecetario();
				String ruta3 = br.readLine();
				System.out.println("Importando Receta...\n");
				rec = methods.importarReceta(rec, ruta3);
				break;
			case(9):
				System.out.println("Saliendo del recetario");
				break;
			default:
				System.out.println("Opción no válida\n");
				break;
			
				
			}
			
			
			
		}
		entrada.close();

	}
	    
        
 }
    
   

