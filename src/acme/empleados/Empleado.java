package acme.empleados;

import java.util.Arrays;

public class Empleado {
	private String nombre;
	private Jornada[] jornadaSemanal;
	private float salario;

	public Empleado(String nombre, Jornada[] jornadaSemanal, float salario) {
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

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Jornada[] getJornadaSemanal() {
		return jornadaSemanal;
	}

	public void setJornadaSemanal(Jornada[] jornadaSemanal) {
		this.jornadaSemanal = jornadaSemanal;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", jornadaSemanal=" + Arrays.toString(jornadaSemanal) + ", salario="
				+ salario + "]";
	}
	
}
