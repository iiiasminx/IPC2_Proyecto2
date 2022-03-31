
package yanolousé;
import CosasDinamicas.ColaDobleTerminada;
import yanolousé.Nodo1;


public class Pila<T> {

    private ColaDobleTerminada<T> cdt = new ColaDobleTerminada();
    private Nodo1<T> top;

    public Pila() {
        top = null;
//        this.tamanio = 0;
    }

    public boolean agregar(T objeto) {
        return cdt.agregarAlInicio(objeto);
    }

    public T quitar() {
        return cdt.obtenerAlInicio();
    }

    public void imprimir() {
        cdt.imprimir();
    }
}
