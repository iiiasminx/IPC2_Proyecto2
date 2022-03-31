
package CosasDinamicas;

public interface Lista<T> {
    
    public boolean agregar(T objeto);
    public boolean insertar(int indice, T objeto);
    public T eliminar(int indice);
    public boolean estaVacio();
    public int tamanio();
    public void imprimir();
    public Nodo<T> obtenerr(int indice);
    public T modificar(int indice, T elemento);

}
