public class Cola<E> implements ILista{
	// Parametros
	private boolean Empty;
	private Nodo Cabeza;
	private Nodo Actual;
	
	// Constructor
	public Cola() {
		this.Empty = true;
		Cabeza = null;
		Actual = Cabeza;
	}
	
	// Getters y Setters
	public boolean isEmpty() {
		return Empty;
	}

	public void setEmpty(boolean empty) {
		Empty = empty;
	}

	public Nodo getCabeza() {
		return Cabeza;
	}

	public void setCabeza(Nodo cabeza) {
		Cabeza = cabeza;
	}

	public Nodo getActual() {
		return Actual;
	}

	public void setActual(Nodo actual) {
		Actual = actual;
	}

	

	

	@Override
	public void Push(Nodo nodo) {
		if(Empty){
			Cabeza = new NodoSimple((Comparable) nodo);
			Actual = Cabeza;
			Empty = false;
			return;
		}
		
			NodoSimple newNodo = new NodoSimple((Comparable) nodo);
			Actual.setSiguiente(newNodo);
			Actual = newNodo;
	}

	@Override
	public Nodo Pop() {
		if(Empty){
			return null;
		}
		if(Cabeza.getSiguiente()==null){
			Nodo regreso = (Nodo) Cabeza.getValor();
			Empty=true;
			Cabeza = null;
			Actual = Cabeza;
			return regreso;
		}
		Nodo regreso = (Nodo) Cabeza.getValor();
		Cabeza = Cabeza.getSiguiente();
		return regreso;
	}

	@Override
	public void Swap(Nodo nodo1, Nodo nodo2) {
		
		
	}
	
}


	

	@Override
	public void Swap(Nodo nodo1, Nodo nodo2) {
		
		
	}

	@Override
	public void Push(Nodo nodo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Nodo Pop() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
