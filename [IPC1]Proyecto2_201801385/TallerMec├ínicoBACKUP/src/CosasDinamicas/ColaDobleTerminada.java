
package CosasDinamicas;


public class ColaDobleTerminada<T> {
    private Lista<T> lcde = new ListaCircularDoble();
    public ColaDobleTerminada(){
    
    }
    public boolean agregarAlInicio(T objeto){
        return false;
    }
    public boolean agregarAlFinal(T objeto){
        return lcde.agregar(objeto);
    }
    public boolean eliminarAlFinal(){
        return false;
    }
    public boolean eliminarAlInicio(){
        return false;
    }
    public T obtenerAlInicio(){
        return null;
    }
    public T obtenerAlFinal(){
        return null;
    }
    public int tamanio(){
        return lcde.tamanio();
    }
    public void imprimir(){
        lcde.imprimir();
    }
}
