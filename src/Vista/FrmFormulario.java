
package Vista;

import Controlador.DBConexion;
import Controlador.Perfil;
import Controlador.perfilHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class FrmFormulario extends javax.swing.JFrame {
        Perfil per;
        DBConexion conexion;
        perfilHelper phelp;

    public FrmFormulario() {
        initComponents();
        per=null;
        conexion=new DBConexion();
        phelp=null;
    }
    
    public void BorrarActualizar(boolean estado)
    {
    btAcualizar.setVisible(estado);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBuscar = new javax.swing.JButton();
        jlBuscar = new javax.swing.JLabel();
        tbFolio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEdoFam = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiscap = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEdoLabo = new javax.swing.JTextArea();
        btGuardar = new javax.swing.JButton();
        tbNombreCompleto = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btAcualizar = new javax.swing.JButton();

        setResizable(false);

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_find.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscarMouseClicked(evt);
            }
        });
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jlBuscar.setText("Buscar por folio");

        jLabel2.setText("Estado Familiar");

        txtEdoFam.setColumns(20);
        txtEdoFam.setRows(5);
        txtEdoFam.setEnabled(false);
        jScrollPane1.setViewportView(txtEdoFam);

        jLabel3.setText("Estado Discapacidad");

        txtDiscap.setColumns(20);
        txtDiscap.setRows(5);
        txtDiscap.setEnabled(false);
        jScrollPane2.setViewportView(txtDiscap);

        jLabel4.setText("Estado Laboral");

        txtEdoLabo.setColumns(20);
        txtEdoLabo.setRows(5);
        txtEdoLabo.setEnabled(false);
        jScrollPane3.setViewportView(txtEdoLabo);

        btGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.setEnabled(false);
        btGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btGuardarMouseClicked(evt);
            }
        });

        tbNombreCompleto.setEditable(false);

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/no.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMouseClicked(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/graphic_design (2).png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditarMouseClicked(evt);
            }
        });

        btAcualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAcualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refrescar.png"))); // NOI18N
        btAcualizar.setText("Actualizar");
        btAcualizar.setEnabled(false);
        btAcualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAcualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jlBuscar))
                        .addGap(18, 18, 18)
                        .addComponent(tbFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAcualizar)
                .addGap(165, 165, 165)
                .addComponent(btEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancelar)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(jlBuscar)
                    .addComponent(tbFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCancelar)
                        .addComponent(btEditar)
                        .addComponent(btAcualizar))
                    .addComponent(btGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGuardarMouseClicked
            try {
                if(txtDiscap.getText().equals(""))
                JOptionPane.showMessageDialog(null, "El estado de discapacidad no puesde estar vacio","Verifique los datos",JOptionPane.INFORMATION_MESSAGE);
                else if(txtEdoFam.getText().equals(""))
                JOptionPane.showMessageDialog(null, "El estado familiar no puesde estar vacio","Verifique los datos",JOptionPane.INFORMATION_MESSAGE);        
                else if(txtEdoLabo.getText().equals(""))
                JOptionPane.showMessageDialog(null, "El estado de laboral no puesde estar vacio","Verifique los datos",JOptionPane.INFORMATION_MESSAGE);
                else
                {
                Statement sent=conexion.getStatement();
                if(sent==null)
                    return;
                String sentencia="INSERT INTO PERFIL VALUES('"+tbFolio.getText()+"','";
                sentencia+="DESEMPLEADO','";
                sentencia+=tbFolio.getText()+"',";
                sentencia+="null,";
                sentencia+="null,";
                sentencia+="null,'";
                sentencia+=txtDiscap.getText().toUpperCase()+"','";
                sentencia+=txtEdoFam.getText().toUpperCase()+"','";
                sentencia+=txtEdoLabo.getText().toUpperCase()+"')";
                System.out.println(sentencia);
                ResultSet rs=sent.executeQuery(sentencia);
                JOptionPane.showMessageDialog(null, "Perfil agregado exitosamente","Transaccion realizada",JOptionPane.INFORMATION_MESSAGE);
           
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el perfil "+ex.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
            }
        
    }//GEN-LAST:event_btGuardarMouseClicked

    public void VerPerfil(String folio)
    {
        
        Statement sent=conexion.getStatement();
            try {
                
                ResultSet rs = sent.executeQuery("SELECT * FROM USUARIO WHERE FOLIO='"+folio+"'");
                rs.next();
                String nombre=rs.getString("NOMBRE")+" "+rs.getString("APPATERNO")+" "+rs.getString("APMATERNO");
                rs=sent.executeQuery("SELECT * FROM PERFIL WHERE FOLIO='"+folio+"'");
                rs.next();
                String disc=rs.getString("EDODISCAPACIDAD");
                String fam=rs.getString("EDOFAMILIAR");
                String lap=rs.getString("EDOLABORAL");
                txtDiscap.setText(disc);
                txtEdoFam.setText(fam);
                txtEdoLabo.setText(lap);
                tbNombreCompleto.setText(nombre);
                txtDiscap.setEnabled(true);
                txtEdoFam.setEnabled(true);
                txtEdoLabo.setEnabled(true);
                txtDiscap.setEditable(false);
                txtEdoFam.setEditable(false);
                txtEdoLabo.setEditable(false);
                btGuardar.setEnabled(false);
                btGuardar.setVisible(false);
                btBuscar.setVisible(false);
                tbFolio.setEditable(false);
                tbFolio.setText(folio);
                jlBuscar.setText("Folio");
            } catch (SQLException ex) {
                Logger.getLogger(FrmFormulario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked
       btGuardar.setEnabled(false);
        if(tbFolio.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Datos Invalidos","Verifica la informacion",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
            try {
                Statement sent=conexion.getStatement();
                ResultSet rs = sent.executeQuery("SELECT * FROM USUARIO WHERE FOLIO='"+tbFolio.getText()+"'");
                if(rs.next())
                {
                String nombre=rs.getString("NOMBRE")+" "+rs.getString("ApPaterno")+" "+rs.getString("ApMaterno");
                String sentencia="SELECT IDPERFIL FROM PERFIL WHERE IDPERFIL=";
                sentencia+="(SELECT FOLIO FROM USUARIO WHERE FOLIO='"+tbFolio.getText()+"')";
                ResultSet rss=sent.executeQuery(sentencia);
                if(!rss.next())
                {
                tbNombreCompleto.setText(nombre);
                txtDiscap.setEnabled(true);
                txtEdoFam.setEnabled(true);
                txtEdoLabo.setEnabled(true);
                btGuardar.setEnabled(true);
                }
                else
                {
                JOptionPane.showMessageDialog(null,"El usuario ya cuenta con un perfil","Perfil existente",JOptionPane.INFORMATION_MESSAGE);
                }
                
                }
                else
                {
                JOptionPane.showMessageDialog(null,"El usuario no existe","Usuario inexistente",JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(FrmFormulario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btBuscarMouseClicked

    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked
        this.hide();
    }//GEN-LAST:event_btCancelarMouseClicked

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseClicked
        txtDiscap.setEditable(true);
        txtEdoFam.setEditable(true);
        txtEdoLabo.setEditable(true);
        btAcualizar.setEnabled(true);
        btEditar.setVisible(false);
    }//GEN-LAST:event_btEditarMouseClicked

    private void btAcualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAcualizarMouseClicked
            try {
                Statement sent=conexion.getStatement();
                if(sent==null)
                    return;
                String sentencia="UPDATE PERFIL SET EDOFAMILIAR='"+txtEdoFam.getText()+"', ";
                sentencia+="EDODISCAPACIDAD='"+txtDiscap.getText()+"', ";
                sentencia+="EDOLABORAL='"+txtEdoLabo.getText()+"' WHERE IDPERFIL='"+tbFolio.getText()+"'";
                int estado=sent.executeUpdate(sentencia);
                if(estado==1)
                JOptionPane.showMessageDialog(null, "Perfil actualizado","Transaccion exitosa",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Perfil no actualizado","Transaccion fallida",JOptionPane.ERROR);
            }
        
    }//GEN-LAST:event_btAcualizarMouseClicked

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JTextField tbFolio;
    private javax.swing.JTextField tbNombreCompleto;
    private javax.swing.JTextArea txtDiscap;
    private javax.swing.JTextArea txtEdoFam;
    private javax.swing.JTextArea txtEdoLabo;
    // End of variables declaration//GEN-END:variables
}
