package acme.modelos;

import java.util.List;

public class Empleado {
	private String nombre;
	private List<Jornada> jornadaSemanal;
	private double salario;

	

	public Empleado(String nombre, List<Jornada> jornadaSemanal, double salario) {
		super();
		this.nombre = nombre;
		this.jornadaSemanal = jornadaSemanal;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public List<Jornada> getJornadaSemanal() {
		return jornadaSemanal;
	}

	public void setJornadaSemanal(List<Jornada> jornadaSemanal) {
		this.jornadaSemanal = jornadaSemanal;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", jornadaSemanal=" + jornadaSemanal + ", salario=" + salario + "]";
	}
	
}
