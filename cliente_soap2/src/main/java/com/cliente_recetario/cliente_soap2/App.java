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
				try {
				System.out.println("Obteniendo Recetario...\n");
			    rec = methods.obtenerRecetario();
		    	System.out.println(rec);
				} catch(Exception ex){
					System.out.println("El recetario está vacío");
				}
				break;
			case(3):
				try {
				System.out.println("Indica el nombre de la receta que quiera visualizar\n");
				String nombre = br.readLine();
				System.out.println("Obteniendo Receta...\n");
				receta = methods.obtenerReceta(nombre);
				System.out.println(receta);
				}catch(Exception ex) {
					System.out.println("La receta no existe en el recetario");
				}
				break;
			case (4):
				Receta r1 = new Receta();
				ArrayList<Ingrediente> ingredientes1 = new ArrayList<Ingrediente>();
				try {
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
				String mensaje = methods.generarReceta(r1);
				System.out.println(mensaje);
				}catch(Exception ex) {
					System.out.println("Algo ha ido mal, introduce tu receta de nuevo");
				}
				break;
			case(5):
				try {
				System.out.println("Introduce el nombre del archivo para exportar el contenido (empezando por /Recursos)\n");
				String ruta = br.readLine();	
				System.out.println("Exportando Recetario...\n");
				String directorio = System.getProperty("user.home");
				String mensaje1 = methods.exportarRecetario( directorio + ruta);
			    System.out.println(mensaje1);
				}catch(Exception ex) {
					System.out.println("Ruta no válida");
				}
				break;
			case(6):
				try {
				System.out.println("Introduce el nombre de la receta \n");
				String nombre1 = br.readLine();
				receta = methods.obtenerReceta(nombre1);
				System.out.println("Introduce el nombre del archivo para exportar el contenido (empezando por /Recursos)\n");
				String ruta1 = br.readLine();
				System.out.println("Exportando Receta\n");
				String directorio1 = System.getProperty("user.home");
				String mensajeReceta = methods.exportarReceta(receta , directorio1 + ruta1);
			    System.out.println(mensajeReceta);
				}catch (Exception ex) {
					System.out.println("La receta no existe o la ruta no es válida");
				}
				
				break;
				
			case(7):
				try {
				System.out.println("Introduzca la ruta absoluta para importar Recetario\n");
				String ruta2 = br.readLine();
				System.out.println("Importando Recetario...\n");
				String mensaje3 = methods.importarRecetario(ruta2);
				System.out.println(mensaje3);
				}catch(Exception ex) {
					System.out.println("Ruta no válida");
				}
				break;

			case(8):
				try {
				System.out.println("Introduzca la ruta absoluta para importar la Receta\n");
				rec = methods.obtenerRecetario();
				String ruta3 = br.readLine();
				System.out.println("Importando Receta...\n");
				String mensaje2 = methods.importarReceta(ruta3);
				System.out.println(mensaje2);
				}catch(Exception ex) {
					System.out.println("Ruta no válida");
				}
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
    
   

