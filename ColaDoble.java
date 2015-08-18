public class ColaDoble<E> extends Cola {
	private boolean Empty;
	private NodoDoble Cabeza;
	private NodoDoble Final;
	
	// Constructor
	public ColaDoble() {
		this.Empty = true;
		Cabeza = null;
		Final = Cabeza;
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
		Cabeza = (NodoDoble) cabeza;
	}

	public Nodo getFinal() {
		return Final;
	}

	public void setFinal(Nodo finaL) {
		Final = (NodoDoble) finaL;
	}

	public void Push(E valor){ // Metodo para meter valores en la cola
		if(Empty){
			Cabeza = new NodoDoble((Comparable) valor);
			Final = Cabeza;
			Empty = false;
			return;
		}
		
			NodoDoble newNodo = new NodoDoble((Comparable) valor);
			Final.setSiguiente(newNodo);
			newNodo.setAnterior(Final);
			Final = newNodo;
	}

	public NodoDoble Pop(){ // Metodo para sacar valores de la cola
		if(Empty){
			return null;
		}
		if(Cabeza.getSiguiente()==null){
			Nodo regreso = (NodoDoble) Cabeza.getValor();
			Empty=true;
			Cabeza = null;
			Final = Cabeza;
			return (NodoDoble) regreso;
		}
		NodoDoble regreso = (NodoDoble) Cabeza.getValor();
		Cabeza = (NodoDoble) Cabeza.getSiguiente();
		return regreso;
	}
	
	public void PushInv(E valor){ // Metodo para meter valores en la cola
		if(Empty){
			Cabeza = new NodoDoble((Comparable) valor);
			Final = Cabeza;
			Empty = false;
			return;
		}
		
			NodoDoble newNodo = new NodoDoble((Comparable) valor);
			Cabeza.setAnterior(newNodo);
			newNodo.setSiguiente(Cabeza);
			
	}

	public NodoDoble PopInv(){ // Metodo para sacar valores de la cola
		if(Empty){
			return null;
		}
		if(Final.getAnterior()==null){
			NodoDoble regreso = (NodoDoble) Final.getValor();
			Empty=true;
			Cabeza = null;
			Final = Cabeza;
			return regreso;
		}
		NodoDoble regreso = (NodoDoble) Final.getValor();
		Final = Final.getAnterior();
		return regreso;
	}
	
	public void Swap(NodoDoble nodo1, NodoDoble nodo2) {
		NodoDoble temporal = nodo1;
		nodo1.setSiguiente(nodo2.getSiguiente());
		nodo1.setAnterior(nodo2.getAnterior());
		nodo1.getAnterior().setSiguiente(nodo2);
		nodo1.getSiguiente().setAnterior(nodo2);
		
		nodo2.setSiguiente(temporal.getSiguiente());
		nodo2.setAnterior(temporal.getAnterior());
		nodo2.getAnterior().setSiguiente(temporal);
		nodo2.getSiguiente().setAnterior(temporal);
		
	}
}

