package scl.edu.gt;

import java.util.Scanner;

public class Main {
	
	public static void Main(String[] args) {
		
		img textMensaje= new img();
		textMensaje.mensaje();
		System.out.println("Bienvenidos a mi programa");
		System.out.println("ingresa el comando help para ver la lista de comandos");
		
		boolean on = true;
		boolean stop = false;
		
		/*INICIO DEL PROGRAMA*/
		do {
			
		Scanner inputCommand = new Scanner(System.in);
		System.out.println("");
		System.out.println("~$ ");
		String output = inputCommand.nextLine();
		
		CommandList dateCommand = new CommandList();
		ArithmeticFunctions fa = new ArithmeticFunctions();
		HELP help  = new HELP();
		
	
		if(output.equals(dateCommand.command[0])) {
			fa.sumar();	
		}
		else if(output.equals(dateCommand.command[1])) {
		   fa.restar();
		}
		else if(output.equals(dateCommand.command[2])) {
			   fa.dividir();
			}
		else if(output.equals(dateCommand.command[3])) {
			   fa.multiplicar();
			}
		else if(output.equals(dateCommand.command[4])) {
			   fa.residuo();
			}
		else if(output.equals(dateCommand.command[5])) {
			   help.CommandList();
			}
		if (output.equals(dateCommand.command[6])) {
			  stop = false;
		}
       
		else {
		System.out.println("comando no encontrado");
		System.out.println("ingresa a help para encontrar los comandos disponibles");
		}
	    }while(on);
	    
		
		
	}

}

