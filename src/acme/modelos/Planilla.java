package acme.modelos;

import java.util.ArrayList;
import java.util.List;

public class Planilla {
	private List<Empleado> empleadosEmpresa = new ArrayList<Empleado>();
	
	public List<Empleado> getEmpleadosEmpresa() {
		return empleadosEmpresa;
	}

	public void setEmpleadosEmpresa(List<Empleado> empleadosEmpresa) {
		this.empleadosEmpresa = empleadosEmpresa;
	}

	@Override
	public String toString() {
		return "Nómina = " + empleadosEmpresa;
	}
	
	
}
