package CompoNentesVisuales;

import SoporteBackend.soporter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class login_visual extends javax.swing.JFrame {
    private boolean  text_usuario = true;
    private boolean text_clave = true;
    private Image background_imagen ;
    private String ruta = "src/main/java/soporte_images//candidata_3.jpg";
    
    public login_visual() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        motarimagen(ruta, jPanelImagen);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelImagen = new javax.swing.JPanel(){

            @Override
            public void paintComponent(Graphics g){

                int width = this.getSize().width;
                int height = this.getSize().height;

                if(background_imagen != null){
                    g.drawImage(background_imagen,0,0,width,height,null);
                }

                super.paintComponent(g);

            }
        }
        ;
        panelRoundcontenedor = new Principal.PanelRound();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldClave = new javax.swing.JTextField();
        jButtonConnectar = new javax.swing.JButton();
        jLabelPeticion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelImagen.setBackground(new java.awt.Color(255, 255, 255));

        panelRoundcontenedor.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundcontenedor.setRoundBottomLeft(60);
        panelRoundcontenedor.setRoundTopLeft(60);
        panelRoundcontenedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelRoundcontenedorMouseMoved(evt);
            }
        });

        jTextFieldUsuario.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldUsuario.setText("Usuario");
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusGained(evt);
            }
        });

        jTextFieldClave.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jTextFieldClave.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldClave.setText("Clave");
        jTextFieldClave.setBorder(null);
        jTextFieldClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldClaveFocusGained(evt);
            }
        });

        jButtonConnectar.setIcon(new javax.swing.ImageIcon("C:\\Users\\azzzm\\OneDrive\\Documentos\\proyecto APP\\APP_BAN\\src\\main\\java\\soporte_images\\3301672.jpg")); // NOI18N
        jButtonConnectar.setBorder(null);
        jButtonConnectar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonConnectarMouseMoved(evt);
            }
        });
        jButtonConnectar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonConnectarFocusLost(evt);
            }
        });
        jButtonConnectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectarActionPerformed(evt);
            }
        });

        jLabelPeticion.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabelPeticion.setText("si no tiene usuario clik aqui");
        jLabelPeticion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelPeticionMouseMoved(evt);
            }
        });
        jLabelPeticion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeticionMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 51));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout panelRoundcontenedorLayout = new javax.swing.GroupLayout(panelRoundcontenedor);
        panelRoundcontenedor.setLayout(panelRoundcontenedorLayout);
        panelRoundcontenedorLayout.setHorizontalGroup(
            panelRoundcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundcontenedorLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(panelRoundcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addComponent(jTextFieldClave)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundcontenedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRoundcontenedorLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButtonConnectar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRoundcontenedorLayout.setVerticalGroup(
            panelRoundcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundcontenedorLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButtonConnectar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jLabelPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelImagenLayout = new javax.swing.GroupLayout(jPanelImagen);
        jPanelImagen.setLayout(jPanelImagenLayout);
        jPanelImagenLayout.setHorizontalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImagenLayout.createSequentialGroup()
                .addGap(0, 369, Short.MAX_VALUE)
                .addComponent(panelRoundcontenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelImagenLayout.setVerticalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRoundcontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectarActionPerformed
    
        soporter Peticion = new soporter(jTextFieldUsuario.getText(), jTextFieldClave.getText());
        try {
            
            if(Peticion.comprueba()){
                
                JOptionPane.showMessageDialog(null, "Usuario y clave correctas");
                this.setVisible(false);
                Inicio_Principal print = new Inicio_Principal(Peticion);
                print.setVisible(true);
            
            }else{
            
                JOptionPane.showMessageDialog(null, "Usuario o clave incorrectas");
            
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(login_visual.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al Connectar o al hacer la Petision"+ex);
        }
    
    }//GEN-LAST:event_jButtonConnectarActionPerformed

    private void jButtonConnectarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConnectarMouseMoved
    
        jButtonConnectar.setSize(55, 55);
        
    }//GEN-LAST:event_jButtonConnectarMouseMoved

    private void jLabelPeticionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPeticionMouseMoved
    
        jLabelPeticion.setForeground(Color.blue);
        
    }//GEN-LAST:event_jLabelPeticionMouseMoved

    private void panelRoundcontenedorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundcontenedorMouseMoved
        
        jButtonConnectar.setSize(50, 50);
        jLabelPeticion.setForeground(Color.black);
        
    }//GEN-LAST:event_panelRoundcontenedorMouseMoved

    private void jLabelPeticionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPeticionMouseClicked
        
        this.setVisible(false);
        login_visual_sinU Registro = new login_visual_sinU();
        Registro.setVisible(true);
        
    }//GEN-LAST:event_jLabelPeticionMouseClicked

    private void jTextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusGained
        if(text_usuario){jTextFieldUsuario.setText("");}
        jTextFieldUsuario.setForeground(Color.black);
        text_usuario = false;
    }//GEN-LAST:event_jTextFieldUsuarioFocusGained

    private void jTextFieldClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldClaveFocusGained
        if(text_clave){jTextFieldClave.setText("");}
        jTextFieldClave.setForeground(Color.black);
         text_clave= false;
    }//GEN-LAST:event_jTextFieldClaveFocusGained

    private void jButtonConnectarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonConnectarFocusLost
     evt.getSource();
    }//GEN-LAST:event_jButtonConnectarFocusLost

    public void motarimagen(String ruta, JPanel panel) {
        
       panel.setOpaque(false);
       background_imagen = new ImageIcon(ruta).getImage();
       
       panel.repaint();
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnectar;
    private javax.swing.JLabel jLabelPeticion;
    private javax.swing.JPanel jPanelImagen;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldUsuario;
    private Principal.PanelRound panelRoundcontenedor;
    // End of variables declaration//GEN-END:variables
}
