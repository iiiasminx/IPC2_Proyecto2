
package Objetos;

import java.text.SimpleDateFormat;


public class ObjOrdenTrabajo {
    
    int id;
    ObjCarro carro;
    ObjCliente cliente;
    ObjServicios servicio;
    String fecha;
    ObjEmpleado empleado;
    String estado;

    public ObjOrdenTrabajo(int id, ObjCarro carro, ObjCliente cliente, ObjServicios servicio, String estado) {
        this.id = id;
        this.carro = carro;
        this.cliente = cliente;
        this.servicio = servicio;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ObjCarro getCarro() {
        return carro;
    }

    public void setCarro(ObjCarro carro) {
        this.carro = carro;
    }

    public ObjCliente getCliente() {
        return cliente;
    }

    public void setCliente(ObjCliente cliente) {
        this.cliente = cliente;
    }

    public ObjServicios getServicio() {
        return servicio;
    }

    public void setServicio(ObjServicios servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

    public ObjEmpleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ObjEmpleado empleado) {
        this.empleado = empleado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ObjOrdenTrabajo{" + "id=" + id + ", carro=" + carro.toString() +
                ", cliente=" + cliente.toString() + ", estado=" + estado + '}';
    }
    
    
    
}
