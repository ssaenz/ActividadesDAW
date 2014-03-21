package modulo05.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaEmpleadosBean extends ArrayList<EmpleadoBean> implements Serializable {

	public ListaEmpleadosBean() {
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("<table>").append("<tr><th>Nombre</th><th>fecha Nacimiento</th><th>cif de Empresa</th><th>Jefe</th>");
		for (EmpleadoBean empleado : this) {
			sb.append("<tr><td>").append(empleado.getNombre()).append("</td> <td>").append(empleado.getFechaNacimiento()).append("</td> <td>").append(empleado.getCifEmpresa()).append("</td> <td>").append(empleado.getJefe()).append("</td> <tr>");
		}
		sb.append("</table>");
		return sb.toString();
	}
	
	
}
