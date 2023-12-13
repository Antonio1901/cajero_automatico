package com.mx.Cajero_Automatico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	
	public static void main (String [] args) {
		
	 int numeroCuenta;
	 String nombreCliente;
	 int saldoCliente = 0 ;
	 
	 
	 
	 Cajero_Automatico cajero1 = new Cajero_Automatico(323232,"FRANCISCO",500);
	 Cajero_Automatico cajero2 = new Cajero_Automatico(6533545,"PACO",600);
	 Cajero_Automatico cajero3 = new Cajero_Automatico(9859896,"XIMENA",350);
	 Cajero_Automatico cajero = null;
	
	 
	 List<Cajero_Automatico> Lista = new ArrayList <Cajero_Automatico>();
		
	 int menu , indice;
		Scanner  scan = null;
		
		Implementacion imp = new Implementacion();
		
		imp.guardar(cajero);
		//Agregar los objetos a la lista
				Lista.add(cajero1);
				Lista.add(cajero2);
				Lista.add(cajero3);
	 

		//******************INICIA MENU
		
		do {
			System.out.println("  MENU BANCOMER BIENVENIDO");
			System.out.println("   1.- ALTA CLIENTE");
			System.out.println("   2.- CONSULTAR SALDO");
			System.out.println("   3.- DEPOSITO ");
			System.out.println("   4.- RETIRO ");
			System.out.println("   5.- MOSTRAR");
			System.out.println("   6.- Salir");
			System.out.println(" Seleccione una opcion" );
			
			scan = new Scanner (System.in);
			menu = scan.nextInt();
			
			switch (menu){
			case 1:
				System.out.println("OPCION PARA DAR DE ALTA A CLIENTE");
				System.out.println("ESCRIBA EL NOMBRE:");
				scan = new Scanner(System.in);
				nombreCliente = scan.nextLine();
				
				
				System.out.println("ESCRIBA SU NUMERO DE CUENTA:");
				scan = new Scanner(System.in);
				numeroCuenta = scan.nextInt();
				
		
				System.out.println("ESCRIBA SU SALDO INICIAL:");
				scan = new Scanner(System.in);
				saldoCliente = scan.nextInt();
				
				
				cajero = new Cajero_Automatico (numeroCuenta,nombreCliente, saldoCliente);
				
				Lista.add(cajero);
				System.out.println ("SE DIO DE ALTA EL NUEVO USUARIO: \""+ nombreCliente + "\" correctamente");
				
				break;
				
			case 2:
				System.out.println("OPCION PARA CONSULTAR SALDO");
				if (Lista.isEmpty()) {
					System.out.println (" NO EXISTEN DATOS PARA MOSTRAR.");
				} else {
					System.out.println (Lista);
				}
				
				if(Lista.size() ==0 ) {
					System.out.println ("EXISTEN DATOS PARA MOSTRAR.");
				} else {
					System.out.println (Lista);
				}
				break;
				
			case 3:
				
				System.out.println("OPCIÓN PARA DEPOSITAR");
			    if (Lista.isEmpty()) {
			        System.out.println("No existen datos para mostrar.");
			    } else {
			        System.out.println(Lista);
			    }

			    if (Lista.size() == 0) {
			        System.out.println("No existen datos para mostrar.");
			    } else {
			        System.out.println(Lista);
			    }
			    
			    System.out.print("Ingrese la cantidad a depositar: $");
			    int montoDeposito = scan.nextInt();

			    if (montoDeposito <= 10000) {
			        // Realizar la lógica de depósito aquí
			        System.out.println("Depósito exitoso. Su nuevo saldo es: $" + saldoCliente);
			    } else {
			        System.out.println("El monto ingresado excede el límite permitido.");
			    }
			    break;
			    

			    
			case 4:
			    System.out.println("OPCIÓN PARA RETIRAR");
			    if (Lista.isEmpty()) {
			        System.out.println("No existen datos para mostrar.");
			    } else {
			        System.out.println(Lista);
			    }

			    if (Lista.size() == 0) {
			        System.out.println("No existen datos para mostrar.");
			    } else {
			        System.out.println(Lista);
			    }
			    
			    System.out.print("Ingrese la cantidad a retirar: $");
			    int montoRetiro = scan.nextInt();

			    if (montoRetiro <= 10000) {
			        // Realizar la lógica de retiro aquí
			        System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldoCliente);
			    } else {
			        System.out.println("El monto ingresado excede el límite permitido.");
			    }
			    break;
				
			

			case 5:
				System.out.println("OPCION PARA MOSTRAR LOS SALDOS DE LOS CLIENTES");
				if (Lista.isEmpty()) {
					System.out.println ("NO EXISTEN DATOS PARA MOSTRAR.");
				} else {
					System.out.println (Lista);
				}
				
				if(Lista.size() ==0 ) {
					System.out.println ("NO EXISTEN DATOS PARA MOSTRAR");
				} else {
					System.out.println (Lista);
				}
				
				break;
			case 6:
				System.out.println("Hasta pronto");
				break;
			default:
				System.out.println("Opcion invalida, intente nuevamente");
				break;
				
			}
			
		} while(menu != 6 );
		
		
	}//fin main
	 
	 
}//fin del principal
