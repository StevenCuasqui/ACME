package acme.empleados.controladores;

import java.util.List;

import acme.modelos.Empleado;
import acme.modelos.Jornada;

public class ControladorPlanilla {

	
	public double calcularSalario(Empleado empleado) {
		List<Jornada> semana = empleado.getJornadaSemanal(); 
		int size = semana.size();
		double salarioFinal = 0;
		int a,b,c,diferencia;
		
		for(int i = 0; i < size; i++) {
			
			a = transformarDia(semana.get(i).getDia());
			b = Integer.parseInt(semana.get(i).getHoraInicio()); 
			c = Integer.parseInt(semana.get(i).getHoraFin());
			
			diferencia = c - b;
			
			for( int j = 0 ; j < diferencia ; j++) {
				salarioFinal = salarioFinal + valorSalario(a,b);
				b++;
			}	

		}
		
		return salarioFinal;
	}
	
	public double valorSalario(int x, int y) {
		int i = x, j = y;
		double valor;
		if(i <= 4 ) {
			if( j <= 8 ) {
				valor = 25;
			}else if( j > 8 && j <=17) {
				valor = 15;
			}else {
				valor = 20;
			}
		}else {
			if( j <= 8 ) {
				valor = 30;
			}else if( j > 8 && j <=17) {
				valor = 20;
			}else {
				valor = 25;
			}
		}
		return valor;
	}
	
	public int transformarDia(String dia){
		int coordenada = 0;
		switch(dia) {
		case "MO": coordenada = 0; break;
		case "TU": coordenada = 1; break;
		case "WE": coordenada = 2; break;
		case "TH": coordenada = 3; break;
		case "FR": coordenada = 4; break;
		case "SA": coordenada = 5; break;
		case "SU": coordenada = 6; break;
		}
		return coordenada;
	}
	
}
