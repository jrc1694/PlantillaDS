package Entidades;

import java.util.ArrayList;

import java.util.List;

public class Seccion extends Documento {
private List<Documento> listaSeccion;
	 public Seccion(){
		listaSeccion= new ArrayList<Documento>();
	 }
	
	 @Override
	public void add(Documento documento) {
		// TODO Auto-generated method stub
		listaSeccion.add(documento);
	}
	@Override
	public void remove(Documento documento) {
		// TODO Auto-generated method stub
		listaSeccion.remove(documento);
	}
	@Override
	//Obtener hijos(Elemento en lista)
	public void getChild(int i) {
		
		
	}
	@Override
	//ModificarContenido
	public void modificar(String documento) {
		// TODO Auto-generated method stub
			
		}
		
	}
	

