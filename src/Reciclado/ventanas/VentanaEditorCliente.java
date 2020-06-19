/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado.ventanas;

import Reciclado.Cliente;
import Reciclado.Solicitud;
import Reciclado.dao.ClienteDAO;
import Reciclado.dao.Database;
import Reciclado.dao.MysqlDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Rafa
 */
public class VentanaEditorCliente extends javax.swing.JInternalFrame {

    List<Cliente> listaSolicitudesClientes;
    
    DefaultTableModel defaultTableModel;
    //datos INICIALMENTE VACIO
    String data[][]={};
    
    //cabezera de tabla inicialmente con los nombre de columnas
    String cabezera[]={"id_cliente","NOMBRE","RUT","EMAIL","DIRECCION","TIPO DOMICILIO","CIUDAD"};
    
    
    ClienteDAO clienteDao;
    Database database;
    
    public VentanaEditorCliente(List<Cliente> listaSolicitudesClientes) {
        initComponents();
        database = new MysqlDatabase();
        clienteDao = new ClienteDAO(database);
        this.listaSolicitudesClientes = listaSolicitudesClientes;
        //se inicia el listados de datos precargados
        listarSolicitudesEnTabla();
        
        
        //MANIPULAR COLUMNAS DE TABLA, SETEAR EL ANCHO EN 0 PARA LOS IDS OCULTOS
        
        TableColumn columnaIdCliente = tablaUsuarios.getColumn("id_cliente");
        columnaIdCliente.setMinWidth(0);
        columnaIdCliente.setMaxWidth(0);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreText = new javax.swing.JTextField();
        rutText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        direccionText = new javax.swing.JTextField();
        tipoDomicilioText = new javax.swing.JTextField();
        ciudadText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        nombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextActionPerformed(evt);
            }
        });

        jLabel1.setText("nombre");

        jLabel2.setText("rut");

        jLabel3.setText("email");

        jLabel4.setText("direccion");

        jLabel5.setText("tipo domicilio");

        jLabel6.setText("ciudad");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(emailText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(direccionText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                        .addComponent(nombreText, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rutText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(65, 65, 65))
                                .addComponent(ciudadText)
                                .addComponent(tipoDomicilioText)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rutText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addComponent(ciudadText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoDomicilioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean existe = clienteExiste();
        if(existe){
            JOptionPane.showMessageDialog(this, "Cliente "+this.nombreText.getText()+" ya existe");
            return;
        }
        
        Cliente cliente = new Cliente();
        cliente.setNombreCliente(nombreText.getText());
        cliente.setRutCliente(rutText.getText());
        cliente.setEmail(emailText.getText());
        cliente.setDireccion(direccionText.getText());
        cliente.setTipoDomicilio(tipoDomicilioText.getText());
        cliente.setCiudad(ciudadText.getText());

        clienteDao.agregarCliente(cliente);
        
                
        
        //reset
        String fila[] = new  String[cabezera.length];
        //nombre
        fila[1] =  nombreText.getText();
        //rut
        fila[2] =  rutText.getText();
        //email
        fila[3] =  emailText.getText();
        //direccion
        fila[4] =  direccionText.getText();
        //tipo domicilio
        fila[5] =  tipoDomicilioText.getText();
        //ciudad
        fila[6] =  ciudadText.getText();
        
        
        //agrega la fila (fila[]) a la tabla
        defaultTableModel.addRow(fila);
        //se agrega el modelo a la tabla
        tablaUsuarios.setModel(defaultTableModel);
        
        
        //limpia el formulario
        limpiarFormulario();
        //hace un refresh de la tabla para mostrar lo ultimo de la informacion
//        listarSolicitudesEnTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ciudadText;
    private javax.swing.JTextField direccionText;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextField rutText;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField tipoDomicilioText;
    // End of variables declaration//GEN-END:variables

    private boolean clienteExiste() {
        String rut = rutText.getText();
        //obtener lista
        List<Cliente> clientes = this.listaSolicitudesClientes;
        //recorrer hasta encontrar el objeto cliente
        for (Cliente cliente : clientes) {
            if (cliente.getRutCliente().equals(rut)) {
                return true;
            }
        }
        return false;
    }

    private void limpiarFormulario() {
        nombreText.setText("");
        rutText.setText("");
        emailText.setText("");
        ciudadText.setText("");
        direccionText.setText("");
        tipoDomicilioText.setText("");
    }
 
    private void listarSolicitudesEnTabla() {
        this.defaultTableModel = new DefaultTableModel(data, cabezera);
        
        List<Cliente> clientes  = this.listaSolicitudesClientes;
        Object[] fila=new Object[cabezera.length];
        for (Cliente cliente : clientes) {
                fila[0] = cliente.getId();
                fila[1] = cliente.getNombreCliente();
                fila[2] = cliente.getRutCliente();
                fila[3] = cliente.getEmail();
                fila[4] = cliente.getDireccion();
                fila[5] = cliente.getTipoDomicilio();
                fila[6] = cliente.getCiudad();
                defaultTableModel.addRow(fila);
            }
            tablaUsuarios.setModel(defaultTableModel);
        }
        
    
}
