
package CosasDinamicas;

import javax.swing.JOptionPane;


public class ListaCircularDoble<T> implements Lista<T>{
    private Nodo<T> nodoCabeza;
   public Nodo<T> buscado;
    public ListaCircularDoble(){
        this.nodoCabeza = null;
    }
    @Override
    public boolean agregar(T objeto) {
        boolean respuesta = false;
        Nodo nodoNuevo;
        if(estaVacio()){
            nodoNuevo = new Nodo(objeto);
            this.nodoCabeza = nodoNuevo;
            this.nodoCabeza.setAnterior(this.nodoCabeza);
            this.nodoCabeza.setSiguiente(this.nodoCabeza);
            //Verifica que el objeto exista y que las referencias sean correctas
            respuesta = this.nodoCabeza.getElemento().equals(objeto) 
                    && this.nodoCabeza == nodoNuevo
                    && this.nodoCabeza.getAnterior()== this.nodoCabeza
                    && this.nodoCabeza.getSiguiente()== this.nodoCabeza;
        }else{
            Nodo nodoAuxiliar = this.nodoCabeza;
            while(nodoAuxiliar.getSiguiente()!= this.nodoCabeza){
                nodoAuxiliar = nodoAuxiliar.getSiguiente();
            }
            nodoNuevo = new Nodo(objeto);
            nodoAuxiliar.setSiguiente(nodoNuevo);
            nodoNuevo.setSiguiente(this.nodoCabeza);
            nodoNuevo.setAnterior(nodoAuxiliar);
            this.nodoCabeza.setAnterior(nodoNuevo);
            //Verificanding 1
            respuesta = nodoNuevo.getElemento().equals(objeto) 
                    && nodoAuxiliar.getSiguiente()== nodoNuevo 
                    && nodoNuevo.getSiguiente()== this.nodoCabeza
                    && nodoNuevo.getAnterior()== nodoAuxiliar
                    && this.nodoCabeza.getAnterior()== nodoNuevo;
        }
        return respuesta;
    }

    @Override
    public boolean insertar(int indice, T objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T eliminar(int indice) {
        if (estaVacio() || indice < 0 || indice >= tamanio()) {
            
//            JOptionPane.showMessageDialog(null, "Tu lista (?) est?? vac??a o no "
//                    + "seleccionaste nada :C");
            return null;
        }else if (indice == 0) {
            eliminarPrimero();
            return null;
        } else {
             Nodo<T> nodo_anterior = obtenerr(indice-1);
            Nodo<T> nodo_actual = obtenerr(indice);
            
            
            T elemento = nodo_actual.getElemento();
            
            Nodo<T> nodo_siguiente = nodo_actual.getSiguiente();
            
            nodo_anterior.setSiguiente(nodo_siguiente);
            nodo_actual = null;
            
            return elemento;                                  
        }
    }
    
    @Override
    public boolean estaVacio() {
        return this.nodoCabeza == null;       
    }

    //M??todo iterativo
    @Override
    public int tamanio() {
        if(!estaVacio()){
            Nodo nodoAuxiliar = this.nodoCabeza;
            int contador = 0;
            do{
                contador++;
                nodoAuxiliar = nodoAuxiliar.getSiguiente();
            }while(nodoAuxiliar != this.nodoCabeza);
            return contador;
        }else{
            throw new RuntimeException();
        }
    }
    
    @Override
    public void imprimir() {
        if(!estaVacio()){
            Nodo nodoAuxiliar = this.nodoCabeza;
            int contador = 0;
            do{
                System.out.println("Posici??n: " + contador + ", Objeto: " + nodoAuxiliar.getElemento());
                nodoAuxiliar = nodoAuxiliar.getSiguiente();
                contador++;
            }while(nodoAuxiliar != this.nodoCabeza);
        }else{
//            throw new EDDException("La lista esta vac??a.");
            System.out.println("La lista est?? vac??a :C");
        }
    }

    @Override
    public Nodo<T> obtenerr(int indice) {
        if (estaVacio() || indice< 0 || indice>= tamanio()) {
//            JOptionPane.showMessageDialog(null, "Tu lista (?) est?? vac??a o no "
//                    + "seleccionaste nada :C");
            return null;
            
        }else {
            Nodo<T> buscando = nodoCabeza;
            int contador = 0;
            while (contador < indice) {
                contador++;
                buscando = buscando.getSiguiente();
            }
//            System.out.println("ya encontr?? algo :D");
//            System.out.println(buscando.toString());
            buscado = buscando;
            return buscando;
        }
    }

    @Override
    public T modificar(int indice, T elemento) {
        if (estaVacio() || indice < 0 || indice >= tamanio()) {
            
            JOptionPane.showMessageDialog(null, "Tu lista (?) est?? vac??a o no "
                    + "seleccionaste nada :C");
            return null;
        } else{
            
            Nodo<T> aux = obtenerr(indice);
            aux.setElemento(elemento);
            return aux.getElemento();
        }
    }

    public T eliminarPrimero(){
        
        if (estaVacio()) {
            return null;
        } else{
            T elemento = nodoCabeza.getElemento();
            
            Nodo<T> aux = nodoCabeza.getSiguiente();
            Nodo<T> aux2 = nodoCabeza.getAnterior();
            
            nodoCabeza = null;
            nodoCabeza = aux;     
            nodoCabeza.setAnterior(aux2);
            
            
            return elemento;
            
        }
    }
    
    public T loginear(String usuario, String contrase??a){
//        if (estaVacio()) {
//            return null;
//        } else{
//            Nodo<T> aux = nodoCabeza;
//            int posicion = 0;
//            while (aux != null) {
//                if (elemento == aux.getElemento()) {
//                    return posicion;
//                }
//                posicion++;
//                aux = aux.getSiguiente();
//            }
            return null;
//    }
    }

    public int indice(T elemento){
        if (estaVacio()) {
            return -1;
        } else{
            Nodo<T> aux = nodoCabeza;
            int posicion = 0;
            while (aux != null) {
                if (elemento == aux.getElemento()) {
                    return posicion;
                }
                posicion++;
                aux = aux.getSiguiente();
            }
            return -1;
        }
    }
}


