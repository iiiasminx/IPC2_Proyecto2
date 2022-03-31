
package tallermecánico;

import CosasDinamicas.ListaCircularDoble;
import CosasDinamicas.Cola;
import CosasDinamicas.ListaNormal;
import CosasDinamicas.ListaNormalDoble;
import CosasDinamicas.ListaSimpleCircular;
import Objetos.ObjCarro;
import Objetos.ObjCliente;
import yanolousé.Pila;
import Objetos.ObjEmpleado;
import Objetos.ObjFactura;
import Objetos.ObjOrdenTrabajo;
import Objetos.ObjRepuestos;
import Objetos.ObjServicios;
import javax.swing.table.DefaultTableModel;
import tallermecánico.Interfaz.Login;


public class TallerMecánico {

    public static int contadorLND, contadorLCD;
    
    public static int contandingServicios, contandingEmpleados, 
            contandingRepuestos, contandingClientes,
            contandingCarros, contandingOrdenes, 
            clienteContandingServicios, contandingFacturas;
    
    public static ObjCliente clienteEnUso;   
    public static ObjEmpleado empleadoEnUso;
    
     
    public static ListaNormalDoble<ObjEmpleado> l1= new ListaNormalDoble();
    // es una lista con los atributos de una PILA!!!!!
    public static ListaNormal<ObjRepuestos> l2 = new ListaNormal();
    public static ListaNormal<ObjServicios> l3 = new ListaNormal();
    public static ListaCircularDoble<ObjCliente> l4 = new ListaCircularDoble();
    // esta es la lista de id's de repuestos
    public static ListaNormal<Integer> l5 = new ListaNormal();
    // esta es la lista de autos
    public static ListaSimpleCircular<ObjCarro> l6 = new ListaSimpleCircular();    
    // cola de prioridad (usando el cosito de lista) 
    // PARA CARROS EN ESPERA
    public static Cola<ObjOrdenTrabajo> l7 = new Cola();
    // cola para carros en servicio
    public static Cola<ObjOrdenTrabajo> l8 = new Cola();
    // cola para carros listos
    public static Cola<ObjOrdenTrabajo> l9 = new Cola();
    // lista de facturas
    public static ListaNormal<ObjFactura> l10 = new ListaNormal();
    // lista de facturas por cliente
    public static ListaNormal<ObjFactura> l11 = new ListaNormal();
    
    
    
    
    public static DefaultTableModel tablitaServicios, tablitaEmpleados,
            tablitaRepuestos, tablitaClientes, tablitaCAutos, 
            tablitaSRepuestos, tablitaRClientes, tablitaCCAutos,
            tablitaRAAutos, tablitaRAServicios, tablitaProgresoCola,
            tablitaProgresoServicio, tablitaProgresoListo, 
            tablitaFacturasSinPagar, tablitaFacturasCliente, 
            tablitaMiProgreso;
    
    
    public static void main(String[] args) {
        contandingEmpleados = 0;
        contandingServicios = 0;
        contandingRepuestos = 0; 
        contandingClientes = 0;
        contandingCarros = 0;
        contandingOrdenes = 0;
        clienteContandingServicios = 0;
        contandingFacturas =0;
        
                
        
        // admin default
        ObjEmpleado defaultt = new ObjEmpleado(contandingEmpleados, "Yasmin", 
        "Administrador", "yas", "123");        
        l1.agregar(defaultt);
        contandingEmpleados++;
        
       
        
        Login c1 = new Login();
        c1.setVisible(true);
               
       
        
    }
    
}
