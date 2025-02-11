package CompoNentesVisuales;

import SoporteBackend.soporter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class login_visual_sinU extends javax.swing.JFrame {
    
    private Image background_imagen ;
    private String ruta = "src/main/java/soporte_images//candidata_3.jpg";
    private boolean  text_usuario = true;
    private boolean text_clave = true;
    private boolean text_dirrecion = true;
    
    public login_visual_sinU() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        motarimagen(ruta, jPanelContenedor);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanelContenedor = new javax.swing.JPanel(){

            @Override
            public void paintComponent(Graphics g){

                int width = this.getSize().width;
                int height = this.getSize().height;

                if(background_imagen != null){
                    g.drawImage(background_imagen,0,0,width,height,null);
                }

                super.paintComponent(g);

            }

        };
        panelRoundContenerdor = new Principal.PanelRound();
        jTextFieldClave = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonConnectar = new javax.swing.JButton();
        jTextFieldDirrecion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelContenedor.setBackground(new java.awt.Color(255, 255, 255));

        panelRoundContenerdor.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundContenerdor.setRoundBottomLeft(60);
        panelRoundContenerdor.setRoundTopLeft(60);
        panelRoundContenerdor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelRoundContenerdorMouseMoved(evt);
            }
        });

        jTextFieldClave.setText("Clave");
        jTextFieldClave.setBorder(null);
        jTextFieldClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldClaveFocusGained(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        jTextFieldUsuario.setText("Usuario");
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusGained(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 102));

        jButtonConnectar.setIcon(new javax.swing.ImageIcon("C:\\Users\\azzzm\\OneDrive\\Documentos\\proyecto APP\\APP_BAN\\src\\main\\java\\soporte_images\\3301672.jpg")); // NOI18N
        jButtonConnectar.setBorder(null);
        jButtonConnectar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonConnectarMouseMoved(evt);
            }
        });
        jButtonConnectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConnectarMouseClicked(evt);
            }
        });

        jTextFieldDirrecion.setText("Gmail o telefono");
        jTextFieldDirrecion.setBorder(null);
        jTextFieldDirrecion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDirrecionFocusGained(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout panelRoundContenerdorLayout = new javax.swing.GroupLayout(panelRoundContenerdor);
        panelRoundContenerdor.setLayout(panelRoundContenerdorLayout);
        panelRoundContenerdorLayout.setHorizontalGroup(
            panelRoundContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundContenerdorLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(panelRoundContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundContenerdorLayout.createSequentialGroup()
                        .addGroup(panelRoundContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldClave)
                            .addComponent(jSeparator1)
                            .addComponent(jTextFieldUsuario)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldDirrecion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundContenerdorLayout.createSequentialGroup()
                        .addComponent(jButtonConnectar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
        );
        panelRoundContenerdorLayout.setVerticalGroup(
            panelRoundContenerdorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundContenerdorLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jTextFieldDirrecion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jButtonConnectar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorLayout.createSequentialGroup()
                .addGap(0, 409, Short.MAX_VALUE)
                .addComponent(panelRoundContenerdor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRoundContenerdor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnectarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConnectarMouseMoved
    
        jButtonConnectar.setSize(55, 55);
        
    }//GEN-LAST:event_jButtonConnectarMouseMoved

    private void panelRoundContenerdorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundContenerdorMouseMoved
        
        jButtonConnectar.setSize(50, 50);
        
    }//GEN-LAST:event_panelRoundContenerdorMouseMoved

    private void jButtonConnectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConnectarMouseClicked
        
        try {
            
            soporter peticion = new soporter(jTextFieldUsuario.getText(),jTextFieldClave.getText(), jTextFieldDirrecion.getText());
            peticion.registrar();
            this.setVisible(false);
            login_visual logiando = new login_visual();
            logiando.setVisible(true);
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error de Registro en el sistema :"+e);
        
        
        }
        
    }//GEN-LAST:event_jButtonConnectarMouseClicked

    private void jTextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusGained
        if(text_usuario){jTextFieldUsuario.setText("");}
        jTextFieldUsuario.setForeground(Color.black);
        text_usuario = false; 
    }//GEN-LAST:event_jTextFieldUsuarioFocusGained

    private void jTextFieldClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldClaveFocusGained
        if(text_clave){jTextFieldClave.setText("");}
        jTextFieldClave.setForeground(Color.black);
        text_clave = false;
    }//GEN-LAST:event_jTextFieldClaveFocusGained

    private void jTextFieldDirrecionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDirrecionFocusGained
        if(text_dirrecion){jTextFieldDirrecion.setText("");}
        jTextFieldDirrecion.setForeground(Color.black);
        text_dirrecion = false;
    }//GEN-LAST:event_jTextFieldDirrecionFocusGained
    
    public void motarimagen(String ruta, JPanel panel) {
        
       panel.setOpaque(false);
       background_imagen = new ImageIcon(ruta).getImage();
       
       panel.repaint();
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnectar;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldDirrecion;
    private javax.swing.JTextField jTextFieldUsuario;
    private Principal.PanelRound panelRoundContenerdor;
    // End of variables declaration//GEN-END:variables
}
