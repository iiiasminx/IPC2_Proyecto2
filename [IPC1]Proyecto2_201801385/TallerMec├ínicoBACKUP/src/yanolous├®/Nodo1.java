
package yanolousé;

public class Nodo1<T> {
    
    private T elemento;
    private Nodo1 siguiente;
    private Nodo1 anterior;
    
    public Nodo1(){
        this.elemento = null;
        this.anterior = null;
        this.siguiente = null;
    }
    
    // Constructor para incertar al inicio
    public Nodo1(T elemento, Nodo1<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    
    //Constructor para insertar al final
    public Nodo1(T elemento){
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

    public Nodo1<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo1<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo1 getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo1 anterior) {
        this.anterior = anterior;
    }

    
    
    // Lo unico que te sirve de aquí es este toString xdxd
    
    @Override
    public String toString() {
        
        return "elemento= " + elemento +"\n";
        
    }
    
    
}