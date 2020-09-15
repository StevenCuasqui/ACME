package acme.empleados.controladores;

import java.io.File;

import acme.modelos.Planilla;

public class Main {
	
	private static Planilla nomina;

	public static void main(String[] args) {

		System.out.println("Bienvenido al Sistema de ACME");
		
		obtenerDatos();
	}
	
	private static void obtenerDatos() {
		File f = new File("data.txt");
		ControladorDatosEntrada datos = new ControladorDatosEntrada();
		datos.leerArchivo(f);
		nomina = new Planilla();
		nomina.setEmpleadosEmpresa(datos.asignarDatosAPlanilla());
		System.out.println(nomina);
		
	}
}