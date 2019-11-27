package Vista;

import Controlador.DBConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Principal extends javax.swing.JFrame {
DBConexion conexion;
    public Principal() {
        initComponents();
        conexion=new DBConexion();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbCalle = new javax.swing.JTextField();
        tbInt = new javax.swing.JTextField();
        tbColonia = new javax.swing.JTextField();
        tbExt = new javax.swing.JTextField();
        tbCP = new javax.swing.JTextField();
        tbNombre = new javax.swing.JTextField();
        tbApPaterno = new javax.swing.JTextField();
        tbApMaterno = new javax.swing.JTextField();
        tbTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tbDelegacion = new javax.swing.JTextField();
        btBaja = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btVerPerfil = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tbBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        tbEstado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuGestionPerfil = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("4 Agencia de Integración Laboral ");
        setResizable(false);

        tbCalle.setEditable(false);

        tbInt.setEditable(false);

        tbColonia.setEditable(false);

        tbExt.setEditable(false);

        tbCP.setEditable(false);

        tbNombre.setEditable(false);
        tbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNombreActionPerformed(evt);
            }
        });

        tbApPaterno.setEditable(false);

        tbApMaterno.setEditable(false);

        tbTelefono.setEditable(false);

        jLabel10.setText("Codigo Postal");

        tbDelegacion.setEditable(false);

        btBaja.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gnome_edit_delete.png"))); // NOI18N
        btBaja.setText("Dar de baja");
        btBaja.setEnabled(false);
        btBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBajaMouseClicked(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/graphic_design (2).png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditarMouseClicked(evt);
            }
        });
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Apellido Materno");

        jLabel4.setText("Telefono");

        jLabel5.setText("Calle");

        jLabel6.setText("Colonia");

        jLabel11.setText("No Interior");

        jLabel7.setText("Delegacion");

        jLabel12.setText("No Exterior");

        btVerPerfil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btVerPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario (1).png"))); // NOI18N
        btVerPerfil.setText("Ver Perfil");
        btVerPerfil.setEnabled(false);
        btVerPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVerPerfilMouseClicked(evt);
            }
        });

        jLabel8.setText("Buscar por Folio");

        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        tbEstado.setEditable(false);
        tbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEstadoActionPerformed(evt);
            }
        });

        jLabel9.setText("Estado");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo.png"))); // NOI18N
        jMenu1.setText("Gestion de usuarios");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jMenuItem1.setText("Agregar Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuGestionPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario (2).png"))); // NOI18N
        menuGestionPerfil.setText("Añadir perfil a usuario");
        menuGestionPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuGestionPerfilMouseClicked(evt);
            }
        });
        menuGestionPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionPerfilActionPerformed(evt);
            }
        });
        jMenu1.add(menuGestionPerfil);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/users.png"))); // NOI18N
        jMenuItem6.setText("Ver Usuarios");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/students-on-class.png"))); // NOI18N
        jMenu2.setText("Gestion de talleres");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus.png"))); // NOI18N
        jMenuItem2.setText("Agregar Taller");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus.png"))); // NOI18N
        jMenuItem5.setText("Agregar Usuario a Taller");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/school.png"))); // NOI18N
        jMenu3.setText("Gestion CECATI");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus.png"))); // NOI18N
        jMenuItem3.setText("Agregar ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/building.png"))); // NOI18N
        jMenu4.setText("Gestion Empleos");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus.png"))); // NOI18N
        jMenuItem4.setText("Agregar");
        jMenuItem4.setToolTipText("");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contact.png"))); // NOI18N
        jMenu5.setText("Ayuda");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/symbol_help.png"))); // NOI18N
        jMenuItem7.setText("Consultoria");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbApMaterno)
                                .addComponent(tbApPaterno)
                                .addComponent(tbTelefono)
                                .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btEditar)
                                .addGap(30, 30, 30)))
                        .addGap(176, 176, 176)
                        .addComponent(tbInt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btBaja)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tbColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tbDelegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tbCP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tbCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btVerPerfil)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btBuscar))
                            .addComponent(tbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)))
                .addGap(18, 18, 18)
                .addComponent(tbExt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tbApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tbApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tbCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6))
                            .addComponent(tbColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tbDelegacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tbCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tbInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tbExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btBaja)
                    .addComponent(btVerPerfil)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNombreActionPerformed
    }//GEN-LAST:event_tbNombreActionPerformed

    private void btEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseClicked
      Campos(true);
      btBaja.setEnabled(false);
      btVerPerfil.setEnabled(false);
      btnGuardar.setEnabled(true);
      tbEstado.setEditable(false);
      btBaja.setVisible(false);
      btEditar.setVisible(false);
      btBuscar.setEnabled(false);
      tbBuscar.setEditable(false);
    }//GEN-LAST:event_btEditarMouseClicked

    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked
       if(tbBuscar.getText().equals(""))
       {        
           JOptionPane.showMessageDialog(null, "El campo de busqueda esta vacio","Datos incorrectos",JOptionPane.INFORMATION_MESSAGE);
           return;
       }
       
        Statement sent =conexion.getStatement();
        String sentencia="Select * FROM USUARIO WHERE FOLIO='"+tbBuscar.getText()+"'";
    try {
        ResultSet rs= sent.executeQuery(sentencia);
        if(rs.next())
        {
            String folio=rs.getString("FOLIO");
        String nombre = rs.getString("NOMBRE");
        String apPaterno=rs.getString("APPATERNO");
        String apMaterno=rs.getString("APMATERNO");
        String calle=rs.getString("CALLE");
        String colonia=rs.getString("COLONIA");
        String delegacion=rs.getString("DELEGACION");
        String cp=rs.getString("CP");
        String telefono=rs.getString("TELEFONO");
        String noInt=rs.getString("NUMINT");
        String noExt=rs.getString("NUMEXT");
        String estado=rs.getString("ESTADO");
        tbNombre.setText(nombre);
        tbApPaterno.setText(apPaterno);
        tbApMaterno.setText(apMaterno);
        tbCalle.setText(calle);
        tbColonia.setText(colonia);
        tbDelegacion.setText(delegacion);
        tbCP.setText(cp);
        tbTelefono.setText(telefono);
        tbInt.setText(noInt);
        tbExt.setText(noExt);
        tbEstado.setText(estado);
        btEditar.setEnabled(true);
        btBaja.setEnabled(true);
        btVerPerfil.setEnabled(true);
        }
        else
        {
        JOptionPane.showMessageDialog(null, "No se encontro al usuario","Usuario no exixtente",JOptionPane.INFORMATION_MESSAGE);
        tbApMaterno.setText("");
        tbApPaterno.setText("");
        tbBuscar.setText("");
        tbCP.setText("");
        tbCalle.setText("");
        tbColonia.setText("");
        tbDelegacion.setText("");
        tbEstado.setText("");
        tbExt.setText("");
        tbInt.setText("");
        tbNombre.setText("");
        tbTelefono.setText("");
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_btBuscarMouseClicked

    private void tbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEstadoActionPerformed

    private void btBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBajaMouseClicked
        tbEstado.setText("INACTIVO");
        
    }//GEN-LAST:event_btBajaMouseClicked

    public void Campos(boolean estado)
    {
        tbNombre.setEditable(estado);
        tbApMaterno.setEditable(estado);
        tbApPaterno.setEditable(estado);
        tbBuscar.setEditable(estado);
        tbCP.setEditable(estado);
        tbCalle.setEditable(estado);
        tbColonia.setEditable(estado);
        tbDelegacion.setEditable(estado);
        tbEstado.setEditable(estado);
        tbExt.setEditable(estado);
        tbInt.setEditable(estado);
        tbTelefono.setEditable(estado);
        tbBuscar.setEditable(estado);
    }
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
    
    try {
        Statement sent =conexion.getStatement();
        if(sent==null)
            return;
        
        if(tbNombre.getText().equals("")||tbApPaterno.getText().equals("")||tbApMaterno.getText().equals("")||tbTelefono.getText().equals("")||tbCalle.getText().equals("")||tbColonia.getText().equals("")||tbCP.getText().equals("")||tbCP.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Datos Invalidos","Verifica la informacion",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String sentencia="UPDATE USUARIO SET NOMBRE='"+tbNombre.getText()+"',";
        sentencia+=" APPATERNO='"+tbApPaterno.getText()+"',";
        sentencia+="APMATERNO='"+tbApMaterno.getText()+"',";
        sentencia+="CALLE='"+tbCalle.getText()+"',";
        sentencia+="COLONIA='"+tbColonia.getText()+"',";
        sentencia+="DELEGACION='"+tbDelegacion.getText()+"',";
        sentencia+="CP='"+tbCP.getText()+"',";
        sentencia+="TELEFONO='"+tbTelefono.getText()+"',";
        sentencia+="NUMINT='"+tbInt.getText()+"',";
        sentencia+="NUMEXT='"+tbExt.getText()+"',";
        sentencia+="ESTADO='"+tbEstado.getText()+"' WHERE FOLIO='"+tbBuscar.getText()+"'";
        sent.executeUpdate(sentencia);
        JOptionPane.showMessageDialog(null, "Contacto actualizado","Transaccion realizada",JOptionPane.INFORMATION_MESSAGE);
        btBuscar.setEnabled(true);
        Campos(false);
        tbBuscar.setEditable(true);
    } 
    catch (SQLException ex) {
    JOptionPane.showMessageDialog(null,"No se pudo actializar el usuario","ERROR",JOptionPane.ERROR);
    }
    
    btBaja.setEnabled(true);
      btVerPerfil.setEnabled(true);
      btnGuardar.setEnabled(false);
     
      btBaja.setVisible(true);
      btEditar.setVisible(true);    
    
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    FrmUsuario frmUser =new FrmUsuario();
    frmUser.show(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btVerPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVerPerfilMouseClicked
    try {
        DBConexion conexion= new DBConexion();
        Statement sent= conexion.getStatement();
        String sentencia="SELECT IDPERFIL FROM PERFIL WHERE IDPERFIL=";
        sentencia+="(SELECT FOLIO FROM USUARIO WHERE FOLIO='"+tbBuscar.getText()+"')";
        ResultSet rs=sent.executeQuery(sentencia);
        if(rs.next())
        {
        FrmFormulario formulario = new FrmFormulario();
        formulario.VerPerfil(tbBuscar.getText());
        formulario.show();
        }
        else JOptionPane.showMessageDialog(null,"El usuario aun no cuenta con un perfil","Usuario sin perfil",JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btVerPerfilMouseClicked

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarActionPerformed

    private void menuGestionPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGestionPerfilMouseClicked
 
    }//GEN-LAST:event_menuGestionPerfilMouseClicked

    private void menuGestionPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionPerfilActionPerformed
        FrmFormulario formu= new FrmFormulario();
        formu.BorrarActualizar(false);
        formu.show();
    }//GEN-LAST:event_menuGestionPerfilActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TallerVentana tv=new TallerVentana();
        tv.show(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CentroCapacitacion ccap=new CentroCapacitacion();
        ccap.show(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        EmpleoFrame empFrm=new EmpleoFrame();
        empFrm.show(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      AgregarTaller addTall =new AgregarTaller();
    addTall.show(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    UsuariosAgregados users = new UsuariosAgregados();
users.show(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Logo logo =new Logo();
       logo.show(true);       
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBaja;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btVerPerfil;
    private javax.swing.JButton btnGuardar;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem menuGestionPerfil;
    private javax.swing.JTextField tbApMaterno;
    private javax.swing.JTextField tbApPaterno;
    private javax.swing.JTextField tbBuscar;
    private javax.swing.JTextField tbCP;
    private javax.swing.JTextField tbCalle;
    private javax.swing.JTextField tbColonia;
    private javax.swing.JTextField tbDelegacion;
    private javax.swing.JTextField tbEstado;
    private javax.swing.JTextField tbExt;
    private javax.swing.JTextField tbInt;
    private javax.swing.JTextField tbNombre;
    private javax.swing.JTextField tbTelefono;
    // End of variables declaration//GEN-END:variables
}
