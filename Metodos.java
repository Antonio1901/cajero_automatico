package com.mx.Cajero_Automatico;

public interface Metodos {

   public void guardar (Cajero_Automatico cajero_Automatico);
	
	public Cajero_Automatico buscar (int indice);
	
	public void editar(int indice, Cajero_Automatico cajero_Automatico);
	
	public void mostrar ();
	
	public void contar();
}
