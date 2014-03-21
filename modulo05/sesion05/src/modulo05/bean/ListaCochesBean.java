package modulo05.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaCochesBean extends ArrayList<CocheBean> implements Serializable{

	public ListaCochesBean() {
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<table>").append("<tr><th>Matricula</th><th>Numero Plazas</th><th>Conductor</th><th>Cif de Empresa</th>");
		for (CocheBean coche : this) {
			sb.append("<tr><td>").append(coche.getMatricula()).append("</td> <td>").append(coche.getNumeroPlazas()).append("</td> <td>").append(coche.getConductor()).append("</td> <td>").append(coche.getCifEmpresa()).append("</td> <tr>");
		}
		sb.append("</table>");
		return sb.toString();
	}

}
