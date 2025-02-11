package CompoNentesVisuales;

import SoporteBackend.soporter;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Inicio_Principal extends javax.swing.JFrame {
    
    private Image background_imagen ;
    private String ruta = "src/main/java/soporte_images/Precentacion.png";
    private soporter usuarios;
            
    public Inicio_Principal(soporter usuarios) {
        initComponents();
        this.usuarios = usuarios; 
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        motarimagen(ruta, jPanelContenedorSS);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelComtenedorP = new javax.swing.JPanel();
        panelRoundContenedorS = new Principal.PanelRound();
        panelRoundContenedor = new Principal.PanelRound();
        jButtonPlanear = new javax.swing.JButton();
        jButtonReservar = new javax.swing.JButton();
        jButtonDisponibles = new javax.swing.JButton();
        jLabelinfo2 = new javax.swing.JLabel();
        jLabelinfo1 = new javax.swing.JLabel();
        jLabelinfo3 = new javax.swing.JLabel();
        jPanelContenedorSS = new javax.swing.JPanel(){

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelComtenedorP.setBackground(new java.awt.Color(255, 255, 255));

        panelRoundContenedorS.setBackground(new java.awt.Color(255, 255, 255));

        panelRoundContenedor.setBackground(new java.awt.Color(248, 248, 248));
        panelRoundContenedor.setRoundBottomLeft(70);
        panelRoundContenedor.setRoundBottomRight(70);
        panelRoundContenedor.setRoundTopLeft(70);
        panelRoundContenedor.setRoundTopRight(70);
        panelRoundContenedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelRoundContenedorMouseMoved(evt);
            }
        });

        jButtonPlanear.setIcon(new javax.swing.ImageIcon("C:\\Users\\azzzm\\OneDrive\\Documentos\\proyecto APP\\APP_BAN\\src\\main\\java\\soporte_images\\Boton1.png")); // NOI18N
        jButtonPlanear.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonPlanearMouseMoved(evt);
            }
        });
        jButtonPlanear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPlanearMouseClicked(evt);
            }
        });

        jButtonReservar.setIcon(new javax.swing.ImageIcon("C:\\Users\\azzzm\\OneDrive\\Documentos\\proyecto APP\\APP_BAN\\src\\main\\java\\soporte_images\\boton2.png")); // NOI18N
        jButtonReservar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonReservarMouseMoved(evt);
            }
        });

        jButtonDisponibles.setIcon(new javax.swing.ImageIcon("C:\\Users\\azzzm\\OneDrive\\Documentos\\proyecto APP\\APP_BAN\\src\\main\\java\\soporte_images\\boton3.png")); // NOI18N
        jButtonDisponibles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonDisponiblesMouseMoved(evt);
            }
        });

        jLabelinfo2.setFont(new java.awt.Font("Cascadia Code", 2, 12)); // NOI18N

        jLabelinfo1.setFont(new java.awt.Font("Cascadia Code", 2, 12)); // NOI18N

        jLabelinfo3.setFont(new java.awt.Font("Cascadia Code", 2, 12)); // NOI18N

        javax.swing.GroupLayout panelRoundContenedorLayout = new javax.swing.GroupLayout(panelRoundContenedor);
        panelRoundContenedor.setLayout(panelRoundContenedorLayout);
        panelRoundContenedorLayout.setHorizontalGroup(
            panelRoundContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundContenedorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelRoundContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRoundContenedorLayout.createSequentialGroup()
                        .addComponent(jLabelinfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabelinfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRoundContenedorLayout.createSequentialGroup()
                        .addComponent(jButtonPlanear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jButtonReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(panelRoundContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelinfo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        panelRoundContenedorLayout.setVerticalGroup(
            panelRoundContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundContenedorLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panelRoundContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelinfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRoundContenedorLayout.createSequentialGroup()
                        .addGroup(panelRoundContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPlanear, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelRoundContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRoundContenedorLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabelinfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundContenedorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelinfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRoundContenedorSLayout = new javax.swing.GroupLayout(panelRoundContenedorS);
        panelRoundContenedorS.setLayout(panelRoundContenedorSLayout);
        panelRoundContenedorSLayout.setHorizontalGroup(
            panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundContenedorSLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelRoundContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelRoundContenedorSLayout.setVerticalGroup(
            panelRoundContenedorSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundContenedorSLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panelRoundContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContenedorSSLayout = new javax.swing.GroupLayout(jPanelContenedorSS);
        jPanelContenedorSS.setLayout(jPanelContenedorSSLayout);
        jPanelContenedorSSLayout.setHorizontalGroup(
            jPanelContenedorSSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelContenedorSSLayout.setVerticalGroup(
            jPanelContenedorSSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelComtenedorPLayout = new javax.swing.GroupLayout(jPanelComtenedorP);
        jPanelComtenedorP.setLayout(jPanelComtenedorPLayout);
        jPanelComtenedorPLayout.setHorizontalGroup(
            jPanelComtenedorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRoundContenedorS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelContenedorSS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelComtenedorPLayout.setVerticalGroup(
            jPanelComtenedorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComtenedorPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelContenedorSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelRoundContenedorS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelComtenedorP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelComtenedorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPlanearMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPlanearMouseMoved
    
        jLabelinfo1.setText("Planeacion de viajes.....");
        
    }//GEN-LAST:event_jButtonPlanearMouseMoved

    private void panelRoundContenedorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundContenedorMouseMoved
    
        jLabelinfo1.setText("");
        jLabelinfo2.setText("");
        jLabelinfo3.setText("");
        
    }//GEN-LAST:event_panelRoundContenedorMouseMoved

    private void jButtonReservarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReservarMouseMoved
    
        jLabelinfo2.setText("Reserva de transporte");
        
    }//GEN-LAST:event_jButtonReservarMouseMoved

    private void jButtonDisponiblesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDisponiblesMouseMoved
    
        jLabelinfo3.setText("Rutas disponibles");
        
    }//GEN-LAST:event_jButtonDisponiblesMouseMoved

    private void jButtonPlanearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPlanearMouseClicked
        
       
        try {
            
            
            Primer__Servicio print = new Primer__Servicio(this.usuarios,this);
            print.setVisible(true);
            this.setVisible(false);
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error de connecion:"+e);
            
        }
        
    }//GEN-LAST:event_jButtonPlanearMouseClicked

    public void motarimagen(String ruta, JPanel panel) {
        
       panel.setOpaque(false);
       background_imagen = new ImageIcon(ruta).getImage();
       
       panel.repaint();
        
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDisponibles;
    private javax.swing.JButton jButtonPlanear;
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JLabel jLabelinfo1;
    private javax.swing.JLabel jLabelinfo2;
    private javax.swing.JLabel jLabelinfo3;
    private javax.swing.JPanel jPanelComtenedorP;
    private javax.swing.JPanel jPanelContenedorSS;
    private Principal.PanelRound panelRoundContenedor;
    private Principal.PanelRound panelRoundContenedorS;
    // End of variables declaration//GEN-END:variables
}
