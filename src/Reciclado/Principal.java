package Reciclado;

import Reciclado.abstrac.AbstractEmpleado;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Rafael Valderrama Rivera
 */
public class Principal {

        static Scanner entrada = new Scanner(System.in);
     
        public static void main(String[] args) {
        
        //agregar Cordinador
        Coordinacion jefe = new Coordinacion("Rafael", "rafael@cordinacion.hope.cl", "225453789");
    
        //Instancio un HashMap para agregar clientes
        HashMap clientes = new HashMap();
        
        //Agregar cliente usando constructor al HashMap
        Cliente cliente = new Cliente("Rafael Valderrama", "151033199","rafaelv@gestion.cl" , "Pasaje Peyronet", "Domicilio", "Valparaiso");
        clientes.put(cliente.getRutCliente(), cliente);
 
        //Se instancia una Planta Valparaiso
        Planta plantaValparaiso = new Planta("Residuos Valparaiso", "Av. El Campo", "Valparaiso", 100000000); 
        
        //Arraylist Choferes de Valparaiso
        ArrayList choferesValparaiso;
        choferesValparaiso = new ArrayList();
            
        int opcion = 0;
        do{
            System.out.println("1. -Agregar Cliente al HashMap");
            System.out.println("2. -Agregar Chofer al ArrayList");
            System.out.println("3. -Listar los Choferes de ArrayList Planta Valparaiso");
            System.out.println("4. -Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    Scanner teclado = new Scanner(System.in);
                    Cliente aux = new Cliente();
                    
                    System.out.println("Ingrese su RUT ");
                    aux.setRutCliente(teclado.nextLine());
                    if(!clientes.containsKey(aux.getNombreCliente())){
                        System.out.println("Ingrese Nombre del Cliente ");
                        aux.setNombreCliente(teclado.nextLine());
                        System.out.println("Ingrese correo electronico ");
                        aux.setEmail(teclado.nextLine());
                        System.out.println("Ingrese direccion ");
                        aux.setDireccion(teclado.nextLine());
                        System.out.println("Ingrese el tipo de Domicilio");
                        aux.setTipoDomicilio(teclado.nextLine());
                        System.out.println("Ingrese Ciudad ");
                        aux.setCiudad(teclado.nextLine());

                        //Agregar un Cliente al HashMap
                        clientes.put(aux.getRutCliente(), aux);

                        System.out.println("Cliente "+aux.getNombreCliente()+ "  Ingreado correctamente\n");  
                    }
                    else{
                        System.out.println("El Clienete ya existe");
                    }
                       
                    break;
                case 2:
                    Scanner teclado1 = new Scanner(System.in);
                    Chofer choferAux = new Chofer();
                    
                    System.out.println("Ingrese un ID para el Chofer ");
                    choferAux.setId(teclado1.nextInt());
                    System.out.println("Ingrese Nombre Chofer ");
                    choferAux.setNombre(teclado1.nextLine());
                    System.out.println("Ingrese el RUT ");
                    choferAux.setRut(teclado1.nextLine());                        
                    System.out.println("Ingrese correo electronico ");
                    choferAux.setEmail(teclado1.nextLine());  
                    System.out.println("Ingrese tefefono ");
                    choferAux.setTelefono(teclado1.nextLine());
                    System.out.println("Ingrese email ");
                    choferAux.setEmail(teclado1.nextLine());
                    System.out.println("Ingrese TIPO Licencia de conducir");
                    choferAux.setLicencia(teclado1.nextLine());  
                    
                    //Agregar un Chofer a un ArrayList
                    choferesValparaiso.add(choferAux);
                    
                   
                    break;
                case 3:
                    //Recorrer el ArrayList con Iterator
                    Iterator  iterador = choferesValparaiso.iterator();
                    Chofer chofer;
                    System.out.println("\nChoferes en Planta Valparaiso :  \n");
                    while (iterador.hasNext()){
                        chofer = (Chofer) iterador.next();
                        System.out.println("ID Chofer        : "+chofer.getId()+
                                         "\nNombre Chofer    : "+chofer.getNombre()+
                                         "\nTipo de Licencia : "+chofer.getLicencia()+
                                         "\n---------------------------------------\n");
                    }
                    break;
                default:
                    System.out.println("Opción no disponible");            
            }    
        }while(opcion !=4);
        
    }//Fin Main
}//Fin Clase
    
 