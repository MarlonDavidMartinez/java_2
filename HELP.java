package scl.edu.gt;

import java.util.Scanner;

public class HELP {
	
	public static void CommandList() {
		CommandList datos = new CommandList();
		
		int cantidadcomandos = datos.command.length;
		
		System.out.println("Todos los comandos disponibles son: ");
		for(var i = 0;i < cantidadcomandos;i++) {
			System.out.println(""+datos.command[i]+" | ");
			System.out.println(datos.information[i]);
			System.out.println("");
		}
		
	}

}
