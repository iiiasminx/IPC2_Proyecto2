/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermecánico.Interfaz.IAdmin;

import CosasDinamicas.ListaSimpleCircular;
import Objetos.ObjCarro;
import Objetos.ObjCliente;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import tallermecánico.TallerMecánico;

/**
 *
 * @author Yásmin
 */
public class CargarClientes extends javax.swing.JFrame {

    /**
     * Creates new form CargarClientes
     */
    public CargarClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EscogerArchivo = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel2.setText("Escoger Archivo");

        EscogerArchivo.setBackground(new java.awt.Color(255, 255, 255));
        EscogerArchivo.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        EscogerArchivo.setText("Escoger Archivo");
        EscogerArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscogerArchivoActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Guardar.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        Guardar.setText("Listo");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        txt.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(Guardar)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EscogerArchivo)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(EscogerArchivo)
                .addGap(18, 18, 18)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Guardar)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EscogerArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscogerArchivoActionPerformed
        JFileChooser dlg = new JFileChooser();
        dlg.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileFilter filtro = new FileNameExtensionFilter("Archivos TMCA (*.tmca)", "tmca");
        dlg.setFileFilter(filtro);

        int opcion = dlg.showSaveDialog(jPanel1);

        if (opcion == JFileChooser.APPROVE_OPTION) {

            try {
                Scanner sc = new Scanner(dlg.getSelectedFile());

                while (sc.hasNextLine()) {
                    String[] lineacodigo = sc.nextLine().split("-");
                    
                    String[] carros = lineacodigo[5].split(";");
                    TallerMecánico.l6 = new ListaSimpleCircular();
                    
                    for (int i = 0; i < carros.length; i++) {
                        
                        String[] auto = carros[i].split(",");
                        ObjCarro obj1 = new ObjCarro(auto[0], auto[1], auto[2],
                        auto[3]);
                        obj1.setDueño(lineacodigo[1]);
                        obj1.setEstado("fuera del taller");
                        TallerMecánico.l6.agregar(obj1);
                    }
                    
                    System.out.println("Imprmiendo Lista de Autos");
                    TallerMecánico.l6.imprimir();
                    
                    // AQUI CREO LA DOBLE ENLAZADA DE UNA
                    
                    
                    ObjCliente obj1 = new ObjCliente(lineacodigo[0], lineacodigo[1], 
                    lineacodigo[2], lineacodigo[3], lineacodigo[4], TallerMecánico.l6);
                    
                    obj1.setStringlista(lineacodigo[5]);
                    obj1.setContaServicios(0);
                                        
                                        
                   TallerMecánico.l4.agregar(obj1);
                   TallerMecánico.contandingClientes++;

                    
                    TallerMecánico.tablitaClientes.addRow(new Object[] {obj1.getId(),
                        obj1.getNombre(), obj1.getUsuario(), obj1.getComtraseña(),
                    obj1.getTipo(), lineacodigo[5]});

            }
                System.out.println("");
                System.out.println("Imprimiendo lista de Clientes: ");
            TallerMecánico.l4.imprimir();
            System.out.println("");

            File f = dlg.getSelectedFile();
            txt.setText(f.toString());

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        }
    }//GEN-LAST:event_EscogerArchivoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        dispose();
    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(CargarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EscogerArchivo;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
