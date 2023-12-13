package com.mx.Cajero_Automatico;

import java.util.ArrayList;
import java.util.List;

public class Implementacion  implements Metodos{

	
	List<Cajero_Automatico> Lista = new ArrayList <Cajero_Automatico>();
	@Override
	public void guardar(Cajero_Automatico cajero_Automatico) {
		Lista.add(cajero_Automatico);
		
	}

	@Override
	public Cajero_Automatico buscar(int indice) {
		Cajero_Automatico cajero_Automatico = new Cajero_Automatico();
		cajero_Automatico = Lista.get(indice);
		return cajero_Automatico;
	}

	@Override
	public void editar(int indice, Cajero_Automatico cajero_Automatico) {
		Lista.set(indice, cajero_Automatico);
		
	}

	@Override
	public void mostrar() {
		System.out.println(Lista);
		
	}

	@Override
	public void contar() {
		// TODO Auto-generated method stub
		
	}

}
