public class ColaCircular<E> extends ColaDoble {

		private boolean Empty;
		private NodoDoble Cabeza;
		private NodoDoble Final;
		
		// Constructor
		public ColaCircular() {
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

		public void Push(NodoDoble valor){ // Metodo para meter valores en la cola
			if(Empty){
				Cabeza = new NodoDoble((Comparable) valor);
				Final = Cabeza;
				Empty = false;
				return;
			}
			
				NodoDoble newNodo = new NodoDoble((Comparable) valor);
				Final.setSiguiente(newNodo);
				newNodo.setAnterior(Cabeza);
				Final = newNodo;
		}

		public NodoDoble Pop(){ // Metodo para sacar valores de la cola
			if(Empty){
				return null;
			}
			if(Cabeza.getSiguiente()==null){
				NodoDoble regreso = (NodoDoble) Cabeza.getValor();
				Empty=true;
				Cabeza = null;
				Final = Cabeza;
				return regreso;
			}
			NodoDoble regreso = (NodoDoble) Cabeza.getValor();
			Cabeza = (NodoDoble) Cabeza.getSiguiente();
			Final.setAnterior(Cabeza);
			return regreso;
		}
}
