package Entidades;

public class Elemento extends Documento {
	private String contenido;
	private String id;
	public Elemento(String id){
		id=this.id;
	}
	@Override
	public void add(Documento documento) {
		// TODO Auto-generated method stub
		//No se implementa
	}

	@Override
	public void remove(Documento employee) {
		// TODO Auto-generated method stub
		//No se implementa
	}

	@Override
	public void getChild(int i) {
		// TODO Auto-generated method stub
		//No se implementa
	}

	@Override
	public void modificar(String contenido) {
		System.out.println("modificadoElemento");
		contenido=this.contenido;
	}
	
	public String getid(){
		return id;
	}
	
	
}
