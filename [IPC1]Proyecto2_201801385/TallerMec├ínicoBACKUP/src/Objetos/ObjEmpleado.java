
package Objetos;


public class ObjEmpleado {
    
    int id;
    String nombre, rol, usuario, contraseña;
    String estado;
    ObjCarro carroAsignado;
    ObjOrdenTrabajo ordenAsignada;

    public ObjEmpleado(int id, String nombre, String rol, String usuario, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.usuario = usuario;
        this.contraseña = contraseña;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ObjCarro getCarroAsignado() {
        return carroAsignado;
    }

    public void setCarroAsignado(ObjCarro carroAsignado) {
        this.carroAsignado = carroAsignado;
    }

    public ObjOrdenTrabajo getOrdenAsignada() {
        return ordenAsignada;
    }

    public void setOrdenAsignada(ObjOrdenTrabajo ordenAsignada) {
        this.ordenAsignada = ordenAsignada;
    }
    
    

    
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", rol=" + rol + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
    
    
}
