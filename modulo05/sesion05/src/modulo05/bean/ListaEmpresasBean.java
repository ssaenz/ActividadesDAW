package modulo05.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaEmpresasBean extends ArrayList<EmpresaBean> implements Serializable{
	
	public ListaEmpresasBean() {
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (EmpresaBean empresa : this) {
			sb.append("<option value='").append(empresa.getNombre()).append("</option>");
		}
		return sb.toString();

	}

}
