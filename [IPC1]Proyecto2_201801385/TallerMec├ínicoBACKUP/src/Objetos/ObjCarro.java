
package Objetos;


public class ObjCarro {

    
    String placa, marca, modelo, rutaImagen, dueño, estado, servicio;
    

    public ObjCarro(String placa, String marca, String modelo, String rutaImagen) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.rutaImagen = rutaImagen;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    
    // EL ESTADO PUEDE SER "en cola", "en servicio" ó "listo"
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    
    
    @Override
    public String toString() {
        return "ObjCarro{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", rutaImagen=" + rutaImagen + '}';
    }
    
    
    
}
