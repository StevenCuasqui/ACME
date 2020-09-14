package acme.empleados.controladores;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		System.out.println("Bienvenido al Sistema de ACME");
		
		obtenerDatos();
	}
	
	private static void obtenerDatos() {
		File f = new File("data.txt");
		ControladorInput datos = new ControladorInput();
		datos.leerArchivo(f);
	}
}