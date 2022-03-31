
package Objetos;


public class ObjFactura {
    
    int id;
    ObjCliente cliente;
    float monto;
    String fecha, estado, descripcion;
    ObjOrdenTrabajo orden;

    public ObjFactura(int id, ObjCliente cliente, float monto) {
        this.id = id;
        this.cliente = cliente;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ObjCliente getCliente() {
        return cliente;
    }

    public void setCliente(ObjCliente cliente) {
        this.cliente = cliente;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ObjOrdenTrabajo getOrden() {
        return orden;
    }

    public void setOrden(ObjOrdenTrabajo orden) {
        this.orden = orden;
    }
    
    

    @Override
    public String toString() {
        return "ObjFactura{" + "id=" + id + ", cliente=" + cliente + ", monto=" + monto + ", fecha=" + fecha + ", estado=" + estado + '}';
    }

    

   
    
    
    
}
