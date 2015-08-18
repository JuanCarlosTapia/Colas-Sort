public class NodoSimple<E extends Comparable> extends Nodo<E>{
    
    public NodoSimple(E nodo){
        this.Valor = nodo;
    }
    
    @Override
    public void setSiguiente(Nodo<E> nodo){
        this.Siguiente = nodo;
    }
    
    @Override
    public Nodo<E> getSiguiente(){
        return (NodoSimple)Siguiente;
    }
    
    @Override
    public E getValor(){
        return Valor;
    }
    
    public int compareTo(Nodo<E> nodo){
		return 0;
   
    	
    }
   
}
