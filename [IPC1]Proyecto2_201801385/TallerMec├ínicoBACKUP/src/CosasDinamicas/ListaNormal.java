/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CosasDinamicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Yásmin
 */
public class ListaNormal<T> implements Lista<T> {
    
    private Nodo<T> nodoCabeza;
    int tamaño;
    public Nodo<T> buscado;
    
    public ListaNormal(){
        this.nodoCabeza = null;
    }

        
    @Override
    public boolean agregar(T objeto) {
        boolean respuesta = false;
        Nodo nodoNuevo;
        if(estaVacio()){
            nodoNuevo = new Nodo(objeto);
            this.nodoCabeza = nodoNuevo;
            this.nodoCabeza.setSiguiente(null);
            
            //Verificanding 1
            respuesta = this.nodoCabeza.getElemento().equals(objeto) 
                    && this.nodoCabeza == nodoNuevo
                    && this.nodoCabeza.getSiguiente()== null;
        }else{
            Nodo nodoAuxiliar = this.nodoCabeza;
            while(nodoAuxiliar.getSiguiente()!= null){
                nodoAuxiliar = nodoAuxiliar.getSiguiente();
            }
            nodoNuevo = new Nodo(objeto);
            nodoAuxiliar.setSiguiente(nodoNuevo);
            nodoNuevo.setSiguiente(null);
            
            //Verifica que el objeto exista y que las referencias sean correctas
            respuesta = nodoNuevo.getElemento().equals(objeto) 
                    && nodoAuxiliar.getSiguiente()== nodoNuevo 
                    && nodoNuevo.getSiguiente()== null;
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
            
            JOptionPane.showMessageDialog(null, "Tu lista (?) está vacía o no "
                    + "seleccionaste nada :C");
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

    @Override
    public int tamanio() {
         if(!estaVacio()){
            Nodo nodoAuxiliar = this.nodoCabeza;
            int contador = 0;
            do{
                contador++;
                nodoAuxiliar = nodoAuxiliar.getSiguiente();
            }while(nodoAuxiliar != null);
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
                System.out.println("Posición: " + contador + ", Objeto: " + nodoAuxiliar.getElemento());
                nodoAuxiliar = nodoAuxiliar.getSiguiente();
                contador++;
            }while(nodoAuxiliar != null);
        }else{
//            throw new EDDException("La lista esta vacía.");
            System.out.println("La lista está vacía :C");
        }
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
    
    @Override
    public Nodo<T> obtenerr(int indice) {
        
        if (estaVacio() || indice< 0 || indice>= tamanio()) {
            JOptionPane.showMessageDialog(null, "Tu lista (?) está vacía o no "
                    + "seleccionaste nada :C");
            return null;
            
        }else {
            Nodo<T> buscando = nodoCabeza;
            int contador = 0;
            while (contador < indice) {
                contador++;
                buscando = buscando.getSiguiente();
            }
//            System.out.println("ya encontré algo :D");
//            System.out.println(buscando.toString());
            buscado = buscando;
            return buscando;
        }
        
    }
    
        
    @Override
    public T modificar(int indice, T elemento){
        
        if (estaVacio() || indice < 0 || indice >= tamanio()) {
            
//            JOptionPane.showMessageDialog(null, "Tu lista (?) está vacía o no "
//                    + "seleccionaste nada :C");
            return null;
        } else{
            
            Nodo<T> aux = obtenerr(indice);
            aux.setElemento(elemento);
            return aux.getElemento();
        }
    }
    
    
    //COSOS DE LA PILA D:
    
    public T eliminarPrimero(){
        
        if (estaVacio()) {
            return null;
        } else{
            T elemento = nodoCabeza.getElemento();
            
            Nodo<T> aux = nodoCabeza.getSiguiente();
            nodoCabeza = null;
            nodoCabeza = aux;           
            
            
            return elemento;
            
        }
    }
    
   public T apilar(T elemento){
        
        Nodo<T> aux;
         if(estaVacio()){
            aux = new Nodo<>(elemento);
            this.nodoCabeza = aux;
            this.nodoCabeza.setSiguiente(null);
            
            
        } else{
             
             
             aux = new Nodo(elemento, nodoCabeza);
             nodoCabeza = aux;
         }
        
        return aux.getElemento();
    }

    @Override
    public String toString() {
        return "ListaNormal{" + "tamaño=" + tamaño + '}';
    }
    
    
    
    

    

        
}
