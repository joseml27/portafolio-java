package Scl.edu.gt;

public class CommandList {

	String command [] = new String [12];
	String information [] = new String [12];
	
	int cantidadDeComados;
	
	CommandList() {
		
		command[0] = "suma";
		command[1] = "resta";
		command[2] = "division";
		command[3] = "multiplicacion";
		command[4] = "residuo";
		command[5] = "help";
		command[6] = "exit";
		command[7] = "kernel";
		command[8] = "red";
		command[9] = "bios";
		command[10] = "internet";
		command[11] = "procesador";
		
		information[0] = " El comado puede realizar la suma de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[1] = "El comado puede realizar la resta de dos \\n números ya sean enteros o decimaeles, el valor \\n a  retornar es un double.\";";
		information[2] = "El comado puede realizar la division de dos \\n números ya sean enteros o decimaeles, el valor \\n a  retornar es un double.\";";
		information[3] = "El comado puede realizar la multiplicacion de dos \\n números ya sean enteros o decimaeles, el valor \\n a  retornar es un double.\";";
		information[4] = "El comado puede realizar la residuo de dos \\n números ya sean enteros o decimaeles, el valor \\n a  retornar es un double.\";";
		information[5] = "El comado puede realizar la help de dos \\n números ya sean enteros o decimaeles, el valor \\n a  retornar es un double.\";";
		information[6] = "El comado puede realizar la exit de dos \\n números ya sean enteros o decimaeles, el valor \\n a  retornar es un double.\";";
		information[7] = "El Kernel o núcleo, es una parte fundamental del sistema operativo que se encarga de conceder el acceso al hardware de forma segura para todo el software que lo solicita";
		information[8] = "Una red de computadoras, también llamada red de ordenadores o red informática, es un conjunto de equipos conectados por medio de cables, señales, ondas";
		information[9] = "El propósito fundamental del BIOS es iniciar, y probar el hardware del sistema";
		information[10] = "es un conjunto descentralizado de redes de comunicación n interconectadas que utilizan la familia de protocolos TCP/IP.";
		information[11] = "es el componente más importante de nuestro PC. Su función es la de ser el cerebro de todo el funcionamiento del sistema";
	}
	
		
}