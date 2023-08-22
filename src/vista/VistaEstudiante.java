package vista;

import controlador.ControladorEstudiante;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class VistaEstudiante extends javax.swing.JFrame {
    ControladorEstudiante ce = new ControladorEstudiante(this);

    public VistaEstudiante() {
        initComponents();
        ce.consultar();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTelCel = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtCorrIns = new javax.swing.JTextField();
        txtPrograma = new javax.swing.JTextField();
        txtTelFijo = new javax.swing.JTextField();
        txtCorrPer = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        cmbopcion = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estuiantes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Programa:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 100, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 90, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Telefono fijo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 140, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Fecha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 90, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Correo institucional:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 200, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Telefono celular:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 160, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Correo personal:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 190, 30));

        txtTelCel.setEnabled(false);
        txtTelCel.setName("txtTelCel"); // NOI18N
        getContentPane().add(txtTelCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 130, 30));
        txtTelCel.getAccessibleContext().setAccessibleName("txtTelCel");

        txtNombre.setEnabled(false);
        txtNombre.setName("txtNombre"); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, 30));
        txtNombre.getAccessibleContext().setAccessibleName("txtNombre");
        txtNombre.getAccessibleContext().setAccessibleDescription("");

        txtApellido.setEnabled(false);
        txtApellido.setName("txtApellido"); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, 30));
        txtApellido.getAccessibleContext().setAccessibleName("txtApellido");

        txtFecha.setEnabled(false);
        txtFecha.setName("txtFecha"); // NOI18N
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, 30));
        txtFecha.getAccessibleContext().setAccessibleName("txtFecha");

        txtCorrIns.setEnabled(false);
        txtCorrIns.setName("txtCorrIns"); // NOI18N
        getContentPane().add(txtCorrIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 160, 30));
        txtCorrIns.getAccessibleContext().setAccessibleName("txtCorrIns");

        txtPrograma.setEnabled(false);
        txtPrograma.setName("txtPrograma"); // NOI18N
        getContentPane().add(txtPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 160, 30));
        txtPrograma.getAccessibleContext().setAccessibleName("txtProg");

        txtTelFijo.setEnabled(false);
        txtTelFijo.setName("txtTelFijo"); // NOI18N
        getContentPane().add(txtTelFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 130, 30));
        txtTelFijo.getAccessibleContext().setAccessibleName("txtTelFijo");

        txtCorrPer.setEnabled(false);
        txtCorrPer.setName("txtCorrPer"); // NOI18N
        getContentPane().add(txtCorrPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 160, 30));
        txtCorrPer.getAccessibleContext().setAccessibleName("txtCorrPer");

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 51, 204));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 120, 50));
        btnEliminar.getAccessibleContext().setAccessibleName("btnEliminar");

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 51, 204));
        btnBuscar.setText("Buscar");
        btnBuscar.setEnabled(false);
        btnBuscar.setName("btnBuscar"); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 120, 50));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 51, 204));
        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("");
        btnActualizar.setEnabled(false);
        btnActualizar.setName("btnActualizar"); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 120, 50));
        btnActualizar.getAccessibleContext().setAccessibleName("btnActualizar");

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 51, 204));
        btnIngresar.setText("Ingresar");
        btnIngresar.setEnabled(false);
        btnIngresar.setName("btnIngresar"); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 120, 50));
        btnIngresar.getAccessibleContext().setAccessibleName("btnIngresar");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaDatos.setName("tablaDatos"); // NOI18N
        jScrollPane1.setViewportView(tablaDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 870, 210));

        cmbopcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar", "Editar", "Eliminar", "Insertar", "Ver todos" }));
        cmbopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbopcionActionPerformed(evt);
            }
        });
        getContentPane().add(cmbopcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 100, 30));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("Seleccione la accion a realizar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 280, 40));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 51, 204));
        btnSalir.setText("Salir");
        btnSalir.setEnabled(false);
        btnSalir.setName("btnEliminar"); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 120, 50));
        btnSalir.getAccessibleContext().setAccessibleName("btnSalir");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tree-3358468_1280.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 600));
        jLabel2.getAccessibleContext().setAccessibleName("labelImg");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       ce.insertar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       ce.actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ce.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbopcionActionPerformed
 
        if(cmbopcion.getSelectedItem().equals("Buscar")){
            txtCorrIns.setEnabled(true);
            txtCorrIns.requestFocus(true);
            btnBuscar.setEnabled(true);
            
            txtNombre.setEnabled(false);
            txtApellido.setEnabled(false);
            txtFecha.setEnabled(false);
            txtCorrPer.setEnabled(false);
            txtTelCel.setEnabled(false);
            txtTelFijo.setEnabled(false);
            txtPrograma.setEnabled(false);
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnIngresar.setEnabled(false);
        }
        if(cmbopcion.getSelectedItem().equals("Eliminar")){
            txtCorrIns.setEnabled(true);
            txtCorrIns.requestFocus();
            btnEliminar.setEnabled(true);
            
            txtNombre.setEnabled(false);
            txtApellido.setEnabled(false);
            txtFecha.setEnabled(false);
            txtCorrPer.setEnabled(false);
            txtTelCel.setEnabled(false);
            txtTelFijo.setEnabled(false);
            txtPrograma.setEnabled(false);
            
            btnActualizar.setEnabled(false);
            btnIngresar.setEnabled(false);
            btnBuscar.setEnabled(false);
        }
        
        if(cmbopcion.getSelectedItem().equals("Insertar")){
            txtNombre.setEnabled(true);
            txtApellido.setEnabled(true);
            txtFecha.setEnabled(true);
            txtCorrIns.setEnabled(true);
            txtCorrPer.setEnabled(true);
            txtTelCel.setEnabled(true);
            txtTelFijo.setEnabled(true);
            txtPrograma.setEnabled(true);
            btnIngresar.setEnabled(true);
            txtNombre.requestFocus();
            
            btnActualizar.setEnabled(false);
            btnBuscar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
        
        if(cmbopcion.getSelectedItem().equals("Editar")){
            txtNombre.setEnabled(false);
            txtApellido.setEnabled(false);
            txtFecha.setEnabled(false);
            
            txtCorrIns.setEnabled(true);
            txtCorrPer.setEnabled(true);
            txtTelCel.setEnabled(true);
            txtTelFijo.setEnabled(true);
            txtPrograma.setEnabled(true);
            txtCorrIns.requestFocus();
            
            btnActualizar.setEnabled(true);
            btnBuscar.setEnabled(false);
            btnEliminar.setEnabled(false);
            
            btnIngresar.setEnabled(false);
        }
        
         if(cmbopcion.getSelectedItem().equals("Ver todos")){
             ce.consultar();
         }
        
    }//GEN-LAST:event_cmbopcionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ce.consultarEstudiante();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEstudiante().setVisible(true);
            }
        });      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbopcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorrIns;
    private javax.swing.JTextField txtCorrPer;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrograma;
    private javax.swing.JTextField txtTelCel;
    private javax.swing.JTextField txtTelFijo;
    // End of variables declaration//GEN-END:variables

    
    
    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnIngresar() {
        return btnIngresar;
    }

    public void setBtnIngresar(JButton btnIngresar) {
        this.btnIngresar = btnIngresar;
    }


    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtCorrIns() {
        return txtCorrIns;
    }

    public void setTxtCorrIns(JTextField txtCorrIns) {
        this.txtCorrIns = txtCorrIns;
    }

    public JTextField getTxtCorrPer() {
        return txtCorrPer;
    }

    public void setTxtCorrPer(JTextField txtCorrPer) {
        this.txtCorrPer = txtCorrPer;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(JTextField txtFecha) {
        this.txtFecha = txtFecha;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtPrograma() {
        return txtPrograma;
    }

    public void setTxtPrograma(JTextField txtPrograma) {
        this.txtPrograma = txtPrograma;
    }

    public JTextField getTxtTelCel() {
        return txtTelCel;
    }

    public void setTxtTelCel(JTextField txtTelCel) {
        this.txtTelCel = txtTelCel;
    }

    public JTextField getTxtTelFijo() {
        return txtTelFijo;
    }

    public void setTxtTelFijo(JTextField txtTelFijo) {
        this.txtTelFijo = txtTelFijo;
    }

    public JTable getTablaDatos() {
        return tablaDatos;
    }

    public void setTablaDatos(JTable tablaDatos) {
        this.tablaDatos = tablaDatos;
    }


}
