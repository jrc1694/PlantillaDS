package Entidades;

public class main {
	public static void main(String[] args){
		Documento c1=new Elemento(null);
		Documento c2=new Elemento(null);
		Documento c3=new Seccion();
		c3.add(c1);
		c3.modificar("ddd");
	}
}
