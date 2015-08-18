public class NodoDoble <E extends Comparable> extends Nodo<E>{

	NodoDoble Anterior;
	
	public NodoDoble getAnterior() {
		return Anterior;
	}
	
	public NodoDoble getSiguiente() {
		return (NodoDoble) Siguiente;
	}

	public void setAnterior(NodoDoble anterior) {
		Anterior = anterior;
	}

	public NodoDoble(E valor) {
		 this.Valor = valor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setSiguiente(Nodo<E> nodo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E getValor() {
		// TODO Auto-generated method stub
		return null;
	}

}
