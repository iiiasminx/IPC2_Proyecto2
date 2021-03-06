
package tallermecánico.Interfaz.IClientes;

import Objetos.ObjCarro;
import Objetos.ObjCliente;
import Objetos.ObjFactura;
import Objetos.ObjOrdenTrabajo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tallermecánico.Interfaz.Cliente;
import tallermecánico.TallerMecánico;

/**
 *
 * @author Yásmin
 */
public class MisFacturas extends javax.swing.JFrame {

    /**
     * Creates new form MisFacturas
     */
    public MisFacturas() {
        initComponents();
        mostrar();
        meterATabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mis Facturas");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Dueño", "Descripción", "Monto", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Pagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cliente c1 = new Cliente();
        c1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        Object coso = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        String cosito = coso.toString();
        
        int numero = Integer.parseInt(cosito);
        System.out.println("el id es: " + numero);
        
        TallerMecánico.l10.imprimir();
        
        for (int i = 0; i < TallerMecánico.l10.tamanio(); i++) {
            
            // Obtiene mi objeto factura
            TallerMecánico.l10.obtenerr(i);
            ObjFactura posibleFactura = TallerMecánico.l10.buscado.getElemento();
            
            if (posibleFactura.getId() == numero) {
                
                TallerMecánico.l10.eliminar(i);
                TallerMecánico.l10.imprimir();
                
                // ELIMINANDO DE CARROS LISTOS
                
                ObjOrdenTrabajo orden = posibleFactura.getOrden();
                ObjCarro carro = orden.getCarro();
                
                orden.getCarro().setEstado("fuera del taller");
           
                TallerMecánico.l9.imprimir();
                
                int indiceListaCarro = TallerMecánico.l9.indice(orden);
                TallerMecánico.l9.eliminar(indiceListaCarro);
                TallerMecánico.l9.imprimir();
                
                // FIN 
                
                ((DefaultTableModel)jTable1.getModel()).removeRow(jTable1.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Factura Pagada :D");
                break;
                
                
            } else{
                System.out.println("No encontramos factura D:");
            }
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MisFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MisFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void mostrar() {
        TallerMecánico.tablitaFacturasCliente = (DefaultTableModel) jTable1.getModel();
    
    }

    private void meterATabla() {
        try {
           int contador = 0;
           
            TallerMecánico.l10.imprimir();
            System.out.println(TallerMecánico.l10.tamanio());

            while (contador < TallerMecánico.l10.tamanio()) {

                System.out.println("Dentro del while");
                TallerMecánico.l10.obtenerr(contador);
                ObjFactura encontrado = TallerMecánico.l10.buscado.getElemento();

                ObjCliente clienteFactura = encontrado.getCliente();
                String nombreFactura = clienteFactura.getNombre();
                
                String nombreUsuario = TallerMecánico.clienteEnUso.getNombre();
                
                if (nombreFactura.equals(nombreUsuario)) {                    


                    TallerMecánico.tablitaFacturasCliente.addRow(new Object[]{
                        encontrado.getId(), nombreFactura, encontrado.getDescripcion(),
                        encontrado.getMonto(), encontrado.getFecha()});
                    contador++;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    
    }

    
}
