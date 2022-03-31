
package yanolousé;

import yanolousé.Nodo1;




public class Pilaaa<T> {
    
//    private Nodo1<T> top;
////     el que siempre está arriba, el último que metieorn
//    private int tamaño;
//    
//    public Pilaaa(){
//        
//        top = null;
//        this.tamaño=0;
//    }
//    
////     Checha si la lista está vacía
//    public boolean isEmpty(){
//        return top == null;
//    }
//    
//     checa el tamaño
//    public int size(){
//        return this.tamaño;
//    }
//    
//    public T top(){
//       devuelve el elemento que está arriba
//         sin eliminarlo
//        if (isEmpty()) {
//            return null;
//        } else{
//            return top.getElemento();
//        }
//    }
//    
//    public T pop(){
//         devuelve el primer coso de la pila y lo elimina
//        if (isEmpty()) {
//            return null;
//        } else {
//            T elemento = top.getElemento();
//            copia de seguridad 
//            Nodo<T> aux = top.getSiguiente();
//            top = null;
//            top = aux;
//            cambiando el valor de top usando el basurero
//            this.tamaño--;
//            return elemento;
//        }
//    }
//    
//    public void agregar(T elemento){
//         mete un elemento a la pila
//         hasta arriba xq es pila
//        Nodo<T> aux =  new Nodo<>(elemento, top);
//        top = aux;
//        this.tamaño++;
//        
//    }    
//    
//    public String toString(){
//        
//        if (isEmpty()) {
//            return "La pila está vacía";
//        } else {
//        
//            String resultado = "";
//            Nodo<T> aux = top;
//            while(aux != null){
//                
//                resultado += aux.toString();
//                 tambien se podría usar getElemento() 
//                 pero nah
//                aux = aux.getSiguiente();
//            }
//            
//            return resultado;
//    }
//    }
}
