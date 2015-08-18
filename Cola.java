
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
