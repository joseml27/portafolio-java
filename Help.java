package Scl.edu.gt;

public class Help {

	public static void listaComandos() {	
		
		CommandList datos = new CommandList();
		
		int cantidadDeComandos = datos.command.length;
		
		System.out.println("Todos los comandos disponibles son: ");
		System.out.println();
		for(int i = 0;i<cantidadDeComandos;i++) {
			
			System.out.println("| "+datos.command[i]+ " |");
			System.out.println(datos.information[i]);
			System.out.println();
		}
	}
}