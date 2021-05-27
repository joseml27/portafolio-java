package Scl.edu.gt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
/*MENSAJE INICIAL DEL PROGRAMA*/
		
		img txtMensaje = new img();
		txtMensaje.Mensaje();
		
		boolean on=true; 
		
		do {
		
		Scanner inputCommand = new Scanner(System.in);
		System.out.print("~$ ");
		String output = inputCommand.nextLine();

		CommandList dateCommand = new CommandList();
		ArithmeticFunctions fa = new ArithmeticFunctions();

		if(output.equals(dateCommand.command[0])) {
				fa.sumar() ;
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
		
			Help.listaComandos();
		}else if(output.equals(dateCommand.command[6])) {
			 on = false;
		}
		
		else {
       System.out.println("Comando no encontrado");
       System.out.println("Ingresa help para más información");
        }

	}while(on);  
 
        
        System.out.println("Programa Finalizado");
	}
		
	
}