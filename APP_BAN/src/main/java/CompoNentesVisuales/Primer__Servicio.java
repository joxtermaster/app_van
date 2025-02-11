package CompoNentesVisuales;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import SoporteBackend.soporter;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Primer__Servicio extends javax.swing.JFrame {
        
    private Image background_imagen ;
    private String ruta = "src/main/java/soporte_images//candidata_3.jpg",
    IdChofer = null;
    private int pasajeros = 1,IdRUta = 0;
    private soporter usuario;
    private JFrame pantalla;
    public Primer__Servicio(soporter usuario,JFrame pantalla) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.usuario = usuario;
        this.pantalla = pantalla;
        motarimagen(ruta, jPanelContenedorP);
        Jcombobox_lleno(this.usuario.Chofer_PLaca(),this.usuario.ruta_CR());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedorP = new javax.swing.JPanel(){

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
        panelRoundContenedorS = new Principal.PanelRound();
        jComboBoxRuta = new javax.swing.JComboBox<>();
        jComboBoxChofer = new javax.swing.JComboBox<>();
        jTextFieldPasajeros = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonPeticionRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelContenedorP.setBackground(new java.awt.Color(0, 0, 0));

        panelRoundContenedorS.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundContenedorS.setRoundBottomLeft(70);
        panelRoundContenedorS.setRoundBottomRight(70);
        panelRoundContenedorS.setRoundTopLeft(70);
        panelRoundContenedorS.setRoundTopRight(70);

        jTextFieldPasajeros.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldPasajeros.setText("Cantidad de Pasajerod");
        jTextFieldPasajeros.setBorder(null);
        jTextFieldPasajeros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPasajerosFocusGained(evt);
            }
        });
        jTextFieldPasajeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPasajerosKeyTyped(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));

        jButtonPeticionRegistro.setIcon(new javax.swing.ImageIcon("C:\\Users\\azzzm\\OneDrive\\Documentos\\proyecto APP\\APP_BAN\\src\\main\\java\\soporte_images\\3301672.jpg")); // NOI18N
        jButtonPeticionRegistro.setText("Registra");
        jButtonPeticionRegistro.setBorder(null);
        jButtonPeticionRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPeticionRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRoundContenedorSLayout = new javax.swing.GroupLayout(panelRoundContenedorS);
        panelRoundContenedorS.setLayout(panelRoundContenedorSLayout);
        panelRoundContenedorSLayout.setHorizontalGroup(
            panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundContenedorSLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jComboBoxChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jComboBoxRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jTextFieldPasajeros, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addComponent(jButtonPeticionRegistro)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        panelRoundContenedorSLayout.setVerticalGroup(
            panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundContenedorSLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPeticionRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        javax.swing.GroupLayout jPanelContenedorPLayout = new javax.swing.GroupLayout(jPanelContenedorP);
        jPanelContenedorP.setLayout(jPanelContenedorPLayout);
        jPanelContenedorPLayout.setHorizontalGroup(
            jPanelContenedorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRoundContenedorS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelContenedorPLayout.setVerticalGroup(
            jPanelContenedorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorPLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(panelRoundContenedorS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedorP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPeticionRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPeticionRegistroMouseClicked
    
            
        this.IdChofer = VerificaChoferYRuta(this.usuario.Chofer_PLaca(),this.usuario.ruta_CR())[0];
        this.IdRUta = Integer.parseInt(VerificaChoferYRuta(this.usuario.Chofer_PLaca(),this.usuario.ruta_CR())[1]);

        try {
            
            if (Integer.parseInt(jTextFieldPasajeros.getText()) > this.pasajeros){
                
                pasajeros = Integer.parseInt(jTextFieldPasajeros.getText());
                
                this.usuario.Creat_viajes(IdChofer,IdRUta,pasajeros);
                JOptionPane.showMessageDialog(null, "Reserva exitosa:");
                this.setVisible(false);
                this.pantalla.setVisible(true);
                
            }else{this.usuario.Creat_viajes(IdChofer,IdRUta,pasajeros);}
            
        } catch (Exception e) {
        
        
        }

    }//GEN-LAST:event_jButtonPeticionRegistroMouseClicked

    private void jTextFieldPasajerosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPasajerosFocusGained
    
    jTextFieldPasajeros.setText("");
    jTextFieldPasajeros.setForeground(Color.black);
    
    }//GEN-LAST:event_jTextFieldPasajerosFocusGained

    private void jTextFieldPasajerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPasajerosKeyTyped
    
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')){
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextFieldPasajerosKeyTyped

    public void motarimagen(String ruta, JPanel panel) {
        
       panel.setOpaque(false);
       background_imagen = new ImageIcon(ruta).getImage();
       
       panel.repaint();
        
    }

    public void  Jcombobox_lleno(ArrayList [] Chofer,ArrayList [] Ruta){
  
        for (int i = 0; i < this.usuario.Chofer_PLaca()[0].size(); i++) {
        
            jComboBoxChofer.addItem(this.usuario.Chofer_PLaca()[0].get(i).toString());
            
        }
        
        for (int i = 0; i < this.usuario.ruta_CR()[1].size(); i++) {
        
            jComboBoxRuta.addItem(this.usuario.ruta_CR()[1].get(i).toString());
            
        }
        
    }
    
    public String [] VerificaChoferYRuta(ArrayList [] Chofer, ArrayList [] Ruta){
        
        String [] Idconfi = new String[2];
        
        for (int i = 0; i < jComboBoxChofer.getItemCount(); i++) {
                
            if (jComboBoxChofer.getSelectedItem().equals(Chofer[0].get(i))){
               Idconfi[0] = Chofer[1].get(i).toString();
            }
            
        }
        
        for (int i = 0; i < jComboBoxRuta.getItemCount(); i++) {
                
            if (jComboBoxRuta.getSelectedItem().equals(Ruta[1].get(i))){
               Idconfi[1] = Ruta[0].get(i).toString();
            }
            
        }
    
        return Idconfi;
    
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPeticionRegistro;
    private javax.swing.JComboBox<String> jComboBoxChofer;
    private javax.swing.JComboBox<String> jComboBoxRuta;
    private javax.swing.JPanel jPanelContenedorP;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldPasajeros;
    private Principal.PanelRound panelRoundContenedorS;
    // End of variables declaration//GEN-END:variables
}
