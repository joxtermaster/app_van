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
import javax.swing.JComboBox;

public class Primer__Servicio extends javax.swing.JFrame {
        
    private Image background_imagen ;
    private String ruta = "src/main/java/soporte_images//candidata_3.jpg",
    IdChofer = null,FechaFinal = "";
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
        jcombobox_llenar_hora(jComboBoxAños, jComboBoxmeses, jComboBoxDia, jComboBoxHora, jComboBoxminutos, jComboBoxSegundos);
     
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
        jSeparatorAyudaVisual = new javax.swing.JSeparator();
        jButtonPeticionRegistro = new javax.swing.JButton();
        jComboBoxmeses = new javax.swing.JComboBox<>();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxHora = new javax.swing.JComboBox<>();
        jComboBoxminutos = new javax.swing.JComboBox<>();
        jComboBoxSegundos = new javax.swing.JComboBox<>();
        jComboBoxAños = new javax.swing.JComboBox<>();
        jLabelRuta = new javax.swing.JLabel();
        jLabelPasajeros = new javax.swing.JLabel();
        jLabelaños = new javax.swing.JLabel();
        jLabelMese = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelMinutos = new javax.swing.JLabel();
        jLabelSegundo = new javax.swing.JLabel();
        jLabelDia = new javax.swing.JLabel();
        jLabelChofer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelContenedorP.setBackground(new java.awt.Color(0, 0, 0));

        panelRoundContenedorS.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundContenedorS.setRoundBottomLeft(70);
        panelRoundContenedorS.setRoundBottomRight(70);
        panelRoundContenedorS.setRoundTopLeft(70);
        panelRoundContenedorS.setRoundTopRight(70);
        panelRoundContenedorS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelRoundContenedorSMouseMoved(evt);
            }
        });

        jComboBoxRuta.setBorder(null);
        jComboBoxRuta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxRutaMouseMoved(evt);
            }
        });

        jComboBoxChofer.setBorder(null);
        jComboBoxChofer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxChoferMouseMoved(evt);
            }
        });

        jTextFieldPasajeros.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldPasajeros.setText("Cantidad de Pasajerod");
        jTextFieldPasajeros.setBorder(null);
        jTextFieldPasajeros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldPasajerosMouseMoved(evt);
            }
        });
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

        jSeparatorAyudaVisual.setForeground(new java.awt.Color(0, 0, 255));

        jButtonPeticionRegistro.setIcon(new javax.swing.ImageIcon("C:\\Users\\azzzm\\OneDrive\\Documentos\\proyecto APP\\APP_BAN\\src\\main\\java\\soporte_images\\3301672.jpg")); // NOI18N
        jButtonPeticionRegistro.setBorder(null);
        jButtonPeticionRegistro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonPeticionRegistroMouseMoved(evt);
            }
        });
        jButtonPeticionRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPeticionRegistroMouseClicked(evt);
            }
        });

        jComboBoxmeses.setBorder(null);
        jComboBoxmeses.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxmesesMouseMoved(evt);
            }
        });

        jComboBoxDia.setBorder(null);
        jComboBoxDia.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxDiaMouseMoved(evt);
            }
        });

        jComboBoxHora.setBorder(null);
        jComboBoxHora.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxHoraMouseMoved(evt);
            }
        });

        jComboBoxminutos.setBorder(null);
        jComboBoxminutos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxminutosMouseMoved(evt);
            }
        });

        jComboBoxSegundos.setBorder(null);
        jComboBoxSegundos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxSegundosMouseMoved(evt);
            }
        });

        jComboBoxAños.setBorder(null);
        jComboBoxAños.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxAñosMouseMoved(evt);
            }
        });

        jLabelRuta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelPasajeros.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelaños.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelMese.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelHora.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelMinutos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelSegundo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelDia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelChofer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelRoundContenedorSLayout = new javax.swing.GroupLayout(panelRoundContenedorS);
        panelRoundContenedorS.setLayout(panelRoundContenedorSLayout);
        panelRoundContenedorSLayout.setHorizontalGroup(
            panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundContenedorSLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRoundContenedorSLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxChofer, 0, 140, Short.MAX_VALUE)
                            .addComponent(jLabelChofer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(250, 250, 250)
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxRuta, 0, 140, Short.MAX_VALUE)
                            .addComponent(jLabelRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPasajeros, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(jSeparatorAyudaVisual)
                            .addComponent(jLabelPasajeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80))
                    .addGroup(panelRoundContenedorSLayout.createSequentialGroup()
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelaños, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxAños, 0, 130, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxmeses, 0, 130, Short.MAX_VALUE)
                            .addComponent(jLabelMese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMinutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxminutos, 0, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxSegundos, 0, 130, Short.MAX_VALUE))
                        .addGap(50, 50, 50))))
            .addGroup(panelRoundContenedorSLayout.createSequentialGroup()
                .addGap(495, 495, 495)
                .addComponent(jButtonPeticionRegistro)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRoundContenedorSLayout.setVerticalGroup(
            panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundContenedorSLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparatorAyudaVisual, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRoundContenedorSLayout.createSequentialGroup()
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRoundContenedorSLayout.createSequentialGroup()
                                .addComponent(jLabelPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(jLabelChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxmeses, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxminutos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxAños, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelaños, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMese, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62))
                    .addGroup(panelRoundContenedorSLayout.createSequentialGroup()
                        .addComponent(jLabelRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButtonPeticionRegistro)
                .addContainerGap())
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
                .addGap(71, 71, 71)
                .addComponent(panelRoundContenedorS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedorP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelContenedorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPeticionRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPeticionRegistroMouseClicked
    
        this.IdChofer = VerificaChoferYRuta(this.usuario.Chofer_PLaca(),this.usuario.ruta_CR())[0];
        this.IdRUta = Integer.parseInt(VerificaChoferYRuta(this.usuario.Chofer_PLaca(),this.usuario.ruta_CR())[1]);

        try {
            this.FechaFinal = ""+(Integer)jComboBoxAños.getSelectedItem()+"-"+(Integer)jComboBoxmeses.getSelectedItem()+"-"
        +(Integer)jComboBoxDia.getSelectedItem()+" "+(Integer)jComboBoxHora.getSelectedItem()+":"
        +(Integer)jComboBoxminutos.getSelectedItem()+":"+(Integer)jComboBoxSegundos.getSelectedItem();
        
            
            if (Integer.parseInt(jTextFieldPasajeros.getText()) > this.pasajeros && jTextFieldPasajeros.getText() != "Cantidad de Pasajerod"){
                
                pasajeros = Integer.parseInt(jTextFieldPasajeros.getText());
                
                this.usuario.Creat_viajes(IdChofer,IdRUta,pasajeros,FechaFinal);
                JOptionPane.showMessageDialog(null, "Reserva exitosa:");
                this.setVisible(false);
                this.pantalla.setVisible(true);
                
            }else{this.usuario.Creat_viajes(IdChofer,IdRUta,pasajeros,FechaFinal);}
            
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "Error al revisar revizar bien los campos:"+e);
        
        }

    }//GEN-LAST:event_jButtonPeticionRegistroMouseClicked

    private void jTextFieldPasajerosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPasajerosFocusGained
    
    jTextFieldPasajeros.setText("");
    jTextFieldPasajeros.setForeground(Color.black);
    
    }//GEN-LAST:event_jTextFieldPasajerosFocusGained

    private void jTextFieldPasajerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPasajerosKeyTyped
    
        char c = evt.getKeyChar();
        if ((c < '1') || (c > '8')){
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextFieldPasajerosKeyTyped

    private void jComboBoxChoferMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxChoferMouseMoved
    jLabelChofer.setText("Chofer");
    }//GEN-LAST:event_jComboBoxChoferMouseMoved

    private void jComboBoxRutaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxRutaMouseMoved
    jLabelRuta.setText("Ruta");
    }//GEN-LAST:event_jComboBoxRutaMouseMoved

    private void jTextFieldPasajerosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPasajerosMouseMoved
    jLabelPasajeros.setText("Cantidad Pasajeros");
    }//GEN-LAST:event_jTextFieldPasajerosMouseMoved

    private void jComboBoxAñosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxAñosMouseMoved
    jLabelaños.setText("Año");
    }//GEN-LAST:event_jComboBoxAñosMouseMoved

    private void jComboBoxmesesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxmesesMouseMoved
    jLabelMese.setText("Mese");
    }//GEN-LAST:event_jComboBoxmesesMouseMoved

    private void jComboBoxDiaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxDiaMouseMoved
    jLabelDia.setText("Dia");
    }//GEN-LAST:event_jComboBoxDiaMouseMoved

    private void jComboBoxHoraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxHoraMouseMoved
    jLabelHora.setText("Hora");
    }//GEN-LAST:event_jComboBoxHoraMouseMoved

    private void jComboBoxminutosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxminutosMouseMoved
    jLabelMinutos.setText("Minuto");
    }//GEN-LAST:event_jComboBoxminutosMouseMoved

    private void jComboBoxSegundosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSegundosMouseMoved
    jLabelSegundo.setText("Segundo");
    }//GEN-LAST:event_jComboBoxSegundosMouseMoved

    private void panelRoundContenedorSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundContenedorSMouseMoved
    jLabelChofer.setText("");
    jLabelRuta.setText("");
    jLabelPasajeros.setText("");
    jLabelaños.setText("");
    jLabelMese.setText("");
    jLabelDia.setText("");
    jLabelHora.setText("");
    jLabelMinutos.setText("");
    jLabelSegundo.setText("");
    jButtonPeticionRegistro.setSize(50, 50);
    
    }//GEN-LAST:event_panelRoundContenedorSMouseMoved

    private void jButtonPeticionRegistroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPeticionRegistroMouseMoved
    jButtonPeticionRegistro.setSize(55, 55);
    }//GEN-LAST:event_jButtonPeticionRegistroMouseMoved

    private void motarimagen(String ruta, JPanel panel) {
        
       panel.setOpaque(false);
       background_imagen = new ImageIcon(ruta).getImage();
       
       panel.repaint();
        
    }

    private void  Jcombobox_lleno(ArrayList [] Chofer,ArrayList [] Ruta){
  
        for (int i = 0; i < this.usuario.Chofer_PLaca()[0].size(); i++) {
        
            jComboBoxChofer.addItem(this.usuario.Chofer_PLaca()[0].get(i).toString());
            
        }
        
        for (int i = 0; i < this.usuario.ruta_CR()[1].size(); i++) {
        
            jComboBoxRuta.addItem(this.usuario.ruta_CR()[1].get(i).toString());
            
        }
        
    }
    
    private String [] VerificaChoferYRuta(ArrayList [] Chofer, ArrayList [] Ruta){
        
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
    
    private void jcombobox_llenar_hora(JComboBox a,JComboBox m,JComboBox d,JComboBox h,JComboBox mi,JComboBox s){
        
        for (int i = 2025; i < 2030; i++) {
            
        a.addItem(i);
            
        }
        
    
        for (int j = 1; j < 13 ; j++) {
                   
        m.addItem(j);
            
        }
        
        
        for (int j = 1; j < 32 ; j++) {
                   
        d.addItem(j);
            
        }
        
        
        for (int j = 1; j < 25 ; j++) {
                   
        h.addItem(j);
            
        }
        
       for (int j = 1; j < 61 ; j++) {
                   
        mi.addItem(j);
            
        }
       
        for (int j = 1; j < 61 ; j++) {
                   
        s.addItem(j);
            
        }
    
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPeticionRegistro;
    private javax.swing.JComboBox<String> jComboBoxAños;
    private javax.swing.JComboBox<String> jComboBoxChofer;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxHora;
    private javax.swing.JComboBox<String> jComboBoxRuta;
    private javax.swing.JComboBox<String> jComboBoxSegundos;
    private javax.swing.JComboBox<String> jComboBoxmeses;
    private javax.swing.JComboBox<String> jComboBoxminutos;
    private javax.swing.JLabel jLabelChofer;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelMese;
    private javax.swing.JLabel jLabelMinutos;
    private javax.swing.JLabel jLabelPasajeros;
    private javax.swing.JLabel jLabelRuta;
    private javax.swing.JLabel jLabelSegundo;
    private javax.swing.JLabel jLabelaños;
    private javax.swing.JPanel jPanelContenedorP;
    private javax.swing.JSeparator jSeparatorAyudaVisual;
    private javax.swing.JTextField jTextFieldPasajeros;
    private Principal.PanelRound panelRoundContenedorS;
    // End of variables declaration//GEN-END:variables
}
