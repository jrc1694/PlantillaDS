package Entidades;

public abstract class Documento {
	 private boolean isDraft;
	 public abstract void add(Documento documento);  
     public abstract void remove(Documento documento);  
     public abstract void getChild(int i);
     public abstract void modificar(String documento);
     
	
}
