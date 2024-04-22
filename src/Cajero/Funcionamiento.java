package Cajero;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionamiento {
ArrayList <Aplicacion> Clientes = new ArrayList <Aplicacion> ();
ArrayList <Tarjeta> Tarjet = new ArrayList <Tarjeta> ();
	public void Nclientes(){
		Aplicacion Cliente0 = new Aplicacion();
		Cliente0.setName("Elvio Lao");
		Cliente0.setBanco("Davivienda");
		Cliente0.setId(529975345);
		Cliente0.setNumber(900187889);
		Cliente0.setCash(1000000.0);
		Cliente0.setPin(4523);
		Cliente0.setNumberApp("3134567899");
		Cliente0.setClaveAPP(2345);
		Cliente0.setCashAPP(12000.0);
		Clientes.add(Cliente0);
		Tarjeta Infotarjet0 = new Tarjeta (9977);
		Tarjet.add(Infotarjet0);
		Aplicacion Cliente1 = new Aplicacion();
		Cliente1.setName("Zoila Zerda");
		Cliente1.setBanco("BBVA");
		Cliente1.setId(458867324);
		Cliente1.setNumber(900187876);
		Cliente1.setCash(789000.0);
		Cliente1.setPin(5967);
		Cliente1.setNumberApp("3214562205");
		Cliente1.setClaveAPP(5566);
		Cliente1.setCashAPP(1000.0);
		Clientes.add(Cliente1);
		Tarjeta Infotarjet1 = new Tarjeta (9671);
		Tarjet.add(Infotarjet1);
		Aplicacion Cliente2 = new Aplicacion();
		Cliente2.setName("Debora Melo");
		Cliente2.setBanco("Pichincha");
		Cliente2.setId(709912123);
		Cliente2.setNumber(900186511);
		Cliente2.setCash(30000.0);
		Cliente2.setPin(9055);
		Cliente2.setNumberApp("3134567899");
		Cliente2.setClaveAPP(6007);
		Cliente2.setCashAPP(120000.0);
		Clientes.add(Cliente2);
		Tarjeta Infotarjet2 = new Tarjeta (7793);
		Tarjet.add(Infotarjet2);
	}
	public boolean compararPines(int pin) {
		boolean ejecucion=false;
	    for (int i=0;i<Clientes.size();i++) {
	        if (Clientes.get(i).pin == pin) {
	        	System.out.println(" ------------------------------------------ \n"
	     		 		+ "            ¡Bienvenido Sr/Sra!            \n"
	     		 		+ "               "+Clientes.get(i).getName()+"\n"
	     		 		+ "                "+Clientes.get(i).getId()+  "\n"
	     		 		+ " ------------------------------------------\n");
		        ejecucion=true;
	        }
	    }
	    return ejecucion;
	}
	public boolean compararTarjets(int tarjet) {
		Scanner sc = new Scanner(System.in);
		boolean ejecucion=false;
		byte tipoT;
		do {
		System.out.println(" -------------------------------------------------- \n"
				+ "|       ¿De que tipo de tarjeta va a retirar?      |\n"
				+ "|--------------------------------------------------|\n"
 		 		+ "|     1. Tarjeta Debito  ||   2. Tarjeta Credito   |\n"
 		 		+ " ------------------------------------------------- \n");
		tipoT=sc.nextByte();

		if(tipoT==2) {
			System.out.println("Se va a cobrar un 5% a la transaccion final");
		    for (int i=0;i<Tarjet.size();i++) {
		        if (Tarjet.get(i).tarjetaN == tarjet) {
			        ejecucion=true;
		        }
		    }
		}else if (tipoT==1){
			System.out.println("Nose va a cobrar en la transaccion final");
		    for (int i=0;i<Tarjet.size();i++) {
		        if (Tarjet.get(i).tarjetaN == tarjet) {
			        ejecucion=false;
		        }
		    }
		}else {
			System.out.println("Opcion no valida, repetir proceso");
		}

		}while(tipoT!=1 && tipoT!=2);
	    return ejecucion;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		double monto;
		boolean ejecucion, error=true,tarjeta;
		byte decision=0;
		Aplicacion Cliente = new Aplicacion();
		do {
	    System.out.println(" -------------------------------------------------- \n"
 		 		+ "|                    ¡¡Bienvenido!!                |\n"
 		 		+ "|                ¿Que deseas hacer hoy?            |\n"
 		 		+ "|------------------------||------------------------|\n"
 		 		+ "|   1. Retirar dinero    ||   2. Transferir dinero |\n" 
 		 		+ "|------------------------||------------------------|\n"
 		 		+ "|   3. Recibir dinero    ||   4. Pagar Servicios   |\n"
 		 		+ "|------------------------||------------------------|\n"
 		 		+ "|   5. Cambiar Datos     ||   6. Ver Informacion   |\n"               
 		 		+ "|------------------------||------------------------|\n"
 		 		+ "|   7. Crear Cuenta      ||   8. Cancelar          |\n"
 		 		+ " -------------------------------------------------- ");
	     decision=sc.nextByte();
	     System.out.println(" Espere un momento ... ");
	        Funcionamiento funcionamiento = new Funcionamiento();
	        funcionamiento.Nclientes();
	        switch(decision){
	    	 	case 1:
	    	 		System.out.println(" -------------------------------------------------- \n"
	    	 		 		+ "|          ¿Que Tipo de Retiro Vas A Hacer?        |\n"
	    	 		 		+ "|------------------------||------------------------|\n"
	    	 		 		+ "|   1. Retiro Tarjeta    ||  2. Retiro Aplicacion  |\n" 
	    	 		 		+ " --------------------------------------------------");
	    	 		decision=sc.nextByte();

	    	 		if(decision==1) {
		    	 		System.out.print("Inserte los ultimos cuatro digitos de su tarjeta");
		    	 		Tarjeta Insertart = new Tarjeta(sc.nextInt());
		    	 		funcionamiento.compararTarjets(Insertart.getTarjetaN());
		    	 		tarjeta=funcionamiento.compararTarjets(Insertart.getTarjetaN());
	    	 			System.out.print("Inserte su clave");
	    	 			Cliente.setPin(s.nextInt());
	    	 			funcionamiento.compararPines(Cliente.getPin());
	    	 			ejecucion= funcionamiento.compararPines(Cliente.getPin());
	    	 			System.out.println(" Espere un momento ... ");
	    	 				if(ejecucion== true) {
	    	 					System.out.println(" ------------------------------------------------ \n"
	    	 							+ "|        ¿Cuanto efectivo desea retirar?         |\n"
	    	 							+ " ------------------------------------------------");
	    	 					monto=sc.nextDouble();
	    	 					Tarjeta Retiro = new Tarjeta (0);
	    	 					Retiro.retirar(monto);
	    	 					
	    	 				}else {
	    	 					System.out.println("Clave no valida");
	    	 					error=false;
	    	 				}
	    	 		}else if(decision==2) {
	    			 
	    	 		}else {
	    			 
	    		 }
	    		  
	    	 case 2:
	    	 case 3:
	    	 case 4:
	    	 case 5:
	    	 case 6:
	    	 case 7:
	    	 case 8:
	    	 default:
	    			 
	    	 }
		}while(error==true);
	    	 
	     }
}
	    
	  

	
