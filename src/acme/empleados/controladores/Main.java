package acme.empleados.controladores;

import java.io.File;
import acme.modelos.Planilla;

public class Main {
	
	private static Planilla nomina;

	public static void main(String[] args) {

		System.out.println("Bienvenido al Sistema de ACME");
		
		obtenerDatos();
		calcularSalarios();
	}

	private static void obtenerDatos() {
		File f = new File("data.txt");
		ControladorDatosEntrada datos = new ControladorDatosEntrada();
		datos.leerArchivo(f);
		llenarPlantilla(datos);
		System.out.println("Datos leídos exitosamente");
		
	}
	
	private static void llenarPlantilla(ControladorDatosEntrada listaEmpleados) {
		nomina = new Planilla();
		nomina.setEmpleadosEmpresa(listaEmpleados.asignarDatosAPlanilla());
	}
	
	private static void calcularSalarios() {
		double a;
		ControladorPlanilla cont = new ControladorPlanilla();
		
		for(int i = 0 ; i < nomina.getEmpleadosEmpresa().size() ; i++) {
			
			a = cont.calcularSalario(nomina.getEmpleadosEmpresa().get(i));
			nomina.getEmpleadosEmpresa().get(i).setSalario(a);
			
		}
		
		System.out.println(nomina);
		
	}
}