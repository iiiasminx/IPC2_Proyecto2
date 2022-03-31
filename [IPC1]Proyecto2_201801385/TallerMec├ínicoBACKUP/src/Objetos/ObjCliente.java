
package Objetos;

import CosasDinamicas.ListaNormal;
import CosasDinamicas.ListaSimpleCircular;

public class ObjCliente {
    
    String id;
    String nombre, usuario, comtraseña, tipo, Stringlista;
    ListaSimpleCircular<ObjCarro> listaCarros = new ListaSimpleCircular();
    int contaServicios;
    ListaNormal<ObjFactura> listaFacturas = new ListaNormal();
    

    public ObjCliente(String id, String nombre, String usuario, String comtraseña, String tipo, ListaSimpleCircular<ObjCarro> listaCarros) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.comtraseña = comtraseña;
        this.tipo = tipo;
        this.listaCarros = listaCarros;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getComtraseña() {
        return comtraseña;
    }

    public void setComtraseña(String comtraseña) {
        this.comtraseña = comtraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStringlista() {
        return Stringlista;
    }

    public void setStringlista(String Stringlista) {
        this.Stringlista = Stringlista;
    }

    public ListaSimpleCircular<ObjCarro> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ListaSimpleCircular<ObjCarro> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public int getContaServicios() {
        return contaServicios;
    }

    public void setContaServicios(int contaServicios) {
        this.contaServicios = contaServicios;
    }

    public ListaNormal<ObjFactura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(ListaNormal<ObjFactura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    
    
    @Override
    public String toString() {
        return "ObjCliente{" + "id=" + id + ", nombre=" + nombre + ", usuario=" + usuario + ", comtrase\u00f1a=" + comtraseña + ", tipo=" + tipo + ", " + '}';
    }

    

    
    
    
}
