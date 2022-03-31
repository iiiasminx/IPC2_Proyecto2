
package CosasDinamicas;


public class Nodo<T> {
        
    private T elemento;
    private Nodo siguiente;
    private Nodo anterior;
    private int contador;
    
    public Nodo(){
        this.elemento = null;
        this.anterior = null;
        this.siguiente = null;
    }
    
    // Constructor para insertar al inicio
    public Nodo(T elemento, Nodo<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    
    //Constructor para insertar al final
    public Nodo(T elemento){
        this.elemento = elemento;
        this.anterior = null;
        this.siguiente = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
  
    
    // Lo unico que te sirve de aquí es este toString xdxd
    
    @Override
    public String toString() {
        
        return "elemento= " + elemento +"\n";
        
    }   
    

}
