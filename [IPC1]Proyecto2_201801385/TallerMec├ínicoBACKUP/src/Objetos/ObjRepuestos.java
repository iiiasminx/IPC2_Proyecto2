
package Objetos;

public class ObjRepuestos {
    
    int id;
    String nombre, marca, modelo;
    int existencias;
    float precio;

    public ObjRepuestos(int id, String nombre, String marca, String modelo, int existencias, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.existencias = existencias;
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

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ObjRepuestos{" + "id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", existencias=" + existencias + ", precio=" + precio + '}';
    }
    
}
