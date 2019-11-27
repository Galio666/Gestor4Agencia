/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.DBConexion;
import Controlador.Usuario;
import Controlador.UsuarioDB;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmUsuario extends javax.swing.JFrame {

   Usuario user;
   UsuarioDB userDB;
    public FrmUsuario() 
    {
        initComponents();
        user=null;
        userDB=null;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCancelar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tbCalle = new javax.swing.JTextField();
        tbColonia = new javax.swing.JTextField();
        tbCP = new javax.swing.JTextField();
        tbNombre = new javax.swing.JTextField();
        tbApPaterno = new javax.swing.JTextField();
        tbApMaterno = new javax.swing.JTextField();
        tbTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tbDelegacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tbInt = new javax.swing.JTextField();
        tbExt = new javax.swing.JTextField();
        lblob1 = new javax.swing.JLabel();
        lblob2 = new javax.swing.JLabel();
        lblob3 = new javax.swing.JLabel();
        lblob4 = new javax.swing.JLabel();
        lblob5 = new javax.swing.JLabel();
        lblob6 = new javax.swing.JLabel();
        lblob7 = new javax.swing.JLabel();
        lblob8 = new javax.swing.JLabel();
        lblob9 = new javax.swing.JLabel();
        lblObligatorio = new javax.swing.JLabel();

        setResizable(false);

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/no.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus.png"))); // NOI18N
        btAgregar.setText("Agregar");
        btAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarMouseClicked(evt);
            }
        });
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Apellido Materno");

        jLabel4.setText("Telefono");

        jLabel5.setText("Calle");

        jLabel6.setText("Colonia");

        jLabel7.setText("Delegacion");

        tbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNombreActionPerformed(evt);
            }
        });

        jLabel10.setText("Codigo Postal");

        jLabel11.setText("No Interior");

        jLabel12.setText("No Exterior");

        lblob1.setVisible(false);
        lblob1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblob1.setForeground(new java.awt.Color(255, 0, 0));
        lblob1.setText("*");

        lblob2.setVisible(false);
        lblob2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblob2.setForeground(new java.awt.Color(255, 0, 0));
        lblob2.setText("*");

        lblob3.setVisible(false);
        lblob3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblob3.setForeground(new java.awt.Color(255, 0, 0));
        lblob3.setText("*");

        lblob4.setVisible(false);
        lblob4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblob4.setForeground(new java.awt.Color(255, 0, 0));
        lblob4.setText("*");

        lblob5.setVisible(false);
        lblob5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblob5.setForeground(new java.awt.Color(255, 0, 0));
        lblob5.setText("*");

        lblob6.setVisible(false);
        lblob6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblob6.setForeground(new java.awt.Color(255, 0, 0));
        lblob6.setText("*");

        lblob7.setVisible(false);
        lblob7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblob7.setForeground(new java.awt.Color(255, 0, 0));
        lblob7.setText("*");

        lblob8.setVisible(false);
        lblob8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblob8.setForeground(new java.awt.Color(255, 0, 0));
        lblob8.setText("*");

        lblob9.setVisible(false);
        lblob9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblob9.setForeground(new java.awt.Color(255, 0, 0));
        lblob9.setText("*");

        lblObligatorio.setVisible(false);
        lblObligatorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblObligatorio.setForeground(new java.awt.Color(0, 0, 255));
        lblObligatorio.setText("Todos los campos con * son obligatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblob2)
                        .addComponent(lblob3))
                    .addComponent(lblob4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(tbInt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblob1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tbApMaterno)
                                    .addComponent(tbApPaterno)
                                    .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblob5)
                                                    .addComponent(lblob6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblob7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblob8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(tbCP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(tbDelegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tbCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tbColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 40, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblob9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(tbExt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(49, 49, 49))
                    .addComponent(lblObligatorio)))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btAgregar)
                .addGap(22, 22, 22)
                .addComponent(btCancelar)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblObligatorio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(lblob1))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tbApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblob2))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tbApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblob3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lblob5)
                                    .addComponent(tbCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(lblob6)
                                    .addComponent(tbColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(lblob7)
                                    .addComponent(tbDelegacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(lblob8)
                                    .addComponent(tbCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tbInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(tbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(tbExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblob4)
                            .addComponent(lblob9))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregar)
                    .addComponent(btCancelar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarMouseClicked
        try
        {
        if(tbNombre.getText().equals("")||tbApPaterno.getText().equals("")||tbApMaterno.getText().equals("")||tbTelefono.getText().equals("")||tbCalle.getText().equals("")||tbColonia.getText().equals("")||tbDelegacion.getText().equals("")||tbExt.getText().equals(""))
        { JOptionPane.showMessageDialog(null, "Datos Invalidos","Verifica la informacion",JOptionPane.INFORMATION_MESSAGE);
        lblObligatorio.setVisible(true);
        lblob1.setVisible(true);
        lblob2.setVisible(true);
        lblob3.setVisible(true);
        lblob4.setVisible(true);
        lblob5.setVisible(true);
        lblob6.setVisible(true);
        lblob7.setVisible(true);
        lblob8.setVisible(true);
        lblob9.setVisible(true);
        }       
        else
        {
            DBConexion conexion= new DBConexion();
            Statement sent=conexion.getStatement();
            if(sent==null)
                return;
            ResultSet rs=sent.executeQuery("SELECT * FROM USUARIO");
            int numFolio=1;
            while(rs.next())
                numFolio++;
            String sentencia="INSERT INTO USUARIO VALUES=('"+numFolio+"','";
            sentencia+=tbNombre.getText()+"','";
            sentencia+=tbApPaterno.getText()+"','";
            sentencia+=tbApMaterno.getText()+"','";
            sentencia+=tbCalle.getText()+"','";
            sentencia+=tbColonia.getText()+"','";
            sentencia+=tbDelegacion.getText()+"','";
            sentencia+=tbCP.getText()+"','";
            sentencia+=tbTelefono.getText()+"','";
            sentencia+=tbInt.getText()+"','";
            sentencia+=tbExt.getText()+"','";
            sentencia+="ACTIVO')";
            userDB=new UsuarioDB();
            user= new Usuario(Integer.toString(numFolio).toUpperCase(),tbNombre.getText().toUpperCase(),tbApMaterno.getText().toUpperCase(),tbApPaterno.getText().toUpperCase(),tbCalle.getText().toUpperCase(),tbColonia.getText().toUpperCase(),tbDelegacion.getText().toUpperCase(),tbCP.getText().toUpperCase(),tbTelefono.getText().toUpperCase(),tbInt.getText().toUpperCase(),tbExt.getText().toUpperCase(),"ACTIVO");
            if(userDB.Agregar(user)==true)
                JOptionPane.showMessageDialog(null,"Operacion Exitosa","Usuario Agregado",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            
        lblObligatorio.setVisible(false);
        lblob1.setVisible(false);
        lblob2.setVisible(false);
        lblob3.setVisible(false);
        lblob4.setVisible(false);
        lblob5.setVisible(false);
        lblob6.setVisible(false);
        lblob7.setVisible(false);
        lblob8.setVisible(false);
        lblob9.setVisible(false);
        }
        }
        catch(HeadlessException er)
        {
            JOptionPane.showMessageDialog(null, "Error al agregar usuario","Transaccion fallida",JOptionPane.ERROR);
        } catch (SQLException ex) {               
           Logger.getLogger(FrmUsuario.class.getName()).log(Level.SEVERE, null, ex);
       }               
    }//GEN-LAST:event_btAgregarMouseClicked

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAgregarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNombreActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblObligatorio;
    private javax.swing.JLabel lblob1;
    private javax.swing.JLabel lblob2;
    private javax.swing.JLabel lblob3;
    private javax.swing.JLabel lblob4;
    private javax.swing.JLabel lblob5;
    private javax.swing.JLabel lblob6;
    private javax.swing.JLabel lblob7;
    private javax.swing.JLabel lblob8;
    private javax.swing.JLabel lblob9;
    private javax.swing.JTextField tbApMaterno;
    private javax.swing.JTextField tbApPaterno;
    private javax.swing.JTextField tbCP;
    private javax.swing.JTextField tbCalle;
    private javax.swing.JTextField tbColonia;
    private javax.swing.JTextField tbDelegacion;
    private javax.swing.JTextField tbExt;
    private javax.swing.JTextField tbInt;
    private javax.swing.JTextField tbNombre;
    private javax.swing.JTextField tbTelefono;
    // End of variables declaration//GEN-END:variables
}
