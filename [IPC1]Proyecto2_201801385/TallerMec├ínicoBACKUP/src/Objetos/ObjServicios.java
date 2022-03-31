
package Objetos;

import CosasDinamicas.ListaNormal;
import CosasDinamicas.ListaSimpleCircular;


public class ObjServicios {
    
    int id;
    String nombre, marca, modelo;
    ListaNormal<Integer> lista = new ListaNormal();
    float precio, precioTotal;
    String stringLista;

    public ObjServicios(int id, String nombre, String marca, String modelo, ListaNormal<Integer> lista, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.lista = lista;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ListaNormal<Integer> getLista() {
        return lista;
    }

    public void setLista(ListaNormal<Integer> lista) {
        this.lista = lista;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getStringLista() {
        return stringLista;
    }

    public void setStringLista(String stringLista) {
        this.stringLista = stringLista;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    
    
    @Override
    public String toString() {
        return "ObjServicios{" + "id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo +  ", precio=" + precio + '}';
    }
    
    
    
    

    
    
    
    
    
}
