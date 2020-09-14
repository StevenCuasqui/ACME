package acme.empleados.controladores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import acme.modelos.Empleado;
import acme.modelos.Jornada;

public class ControladorInput {
	
	private List<String> lineas = new ArrayList<String>();
	List<Empleado> empleados = new ArrayList<Empleado>();

	public void leerArchivo(File f) {
		
		try {
			BufferedReader b = new BufferedReader(new FileReader(f));
    		String readLine = "";
    		
			while ((readLine = b.readLine()) != null) {
				this.lineas.add(readLine);
				}
			
				b.close();
				guardarDatos();
				
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	public void guardarDatos() {
		int tamanio = this.lineas.size();
		
		for(int i=0;i<tamanio;i++) {
			//Obtner cada línea de DATA
			String empleado1 = this.lineas.get(i);
			
			String[] empleadoPartes = empleado1.split("=");
			
			String nombreEmpleado = empleadoPartes[0];
			String[] horarios = empleadoPartes[1].split(",");
			
			List<Jornada> jornadaCompleta = new ArrayList<Jornada>();
			
			this.empleados.add(new Empleado(nombreEmpleado,jornadaCompleta,0.0));
			
			for(int j = 0 ; j<horarios.length ; j++) {
				
				Jornada jornadaFinal = registrarJornada(horarios[j]);
				jornadaCompleta.add(jornadaFinal);
			}
			
			this.empleados.get(i).setJornadaSemanal(jornadaCompleta);
			System.out.println(this.empleados.get(i));
			
		}				
		
	}
	
	public Jornada registrarJornada(String jornada) {
		
		Jornada jornadaM;
		String dia = jornada.substring(0, 2);
		String horaInicio = jornada.substring(2,4);
		String horaFin = jornada.substring(8, 10);
		jornadaM = new Jornada(dia,horaInicio,horaFin);
		return jornadaM;
		
	}
	
           
}
