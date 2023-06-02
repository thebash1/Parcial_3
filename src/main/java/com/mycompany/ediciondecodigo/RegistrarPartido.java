package com.mycompany.ediciondecodigo;

import java.awt.Color;
import java.io.*;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RegistrarPartido extends javax.swing.JFrame {
    /**
     * Creates new form RegistrarPartido
     */
    
    int xMouse,
    
    /**
     * Creates new form CheckIn
     */

    /**
     * Creates new form RegistrarPartido
     */
    yMouse;
    
    public RegistrarPartido() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        TextoLugar = new javax.swing.JLabel();
        TextoGUI = new javax.swing.JLabel();
        HeaderPanel = new javax.swing.JPanel();
        BotonCerrar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JButton();
        DateChooser1 = new com.toedter.calendar.JDateChooser();
        LabelFecha = new javax.swing.JLabel();
        GolesLocal = new javax.swing.JTextField();
        GolesVisitante = new javax.swing.JTextField();
        EquipoLocaljLabel = new javax.swing.JLabel();
        GolesLocaljLabel = new javax.swing.JLabel();
        EquipoVisitantejLabel = new javax.swing.JLabel();
        GolesVisitantejLabel = new javax.swing.JLabel();
        Equipo2ComboBox = new javax.swing.JComboBox<>();
        Equipo1ComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoLugar.setBackground(new java.awt.Color(255, 255, 255));
        TextoLugar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TextoLugar.setForeground(new java.awt.Color(0, 0, 0));
        TextoLugar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TextoLugar.setText("REGISTRAR PARTIDO");
        MainPanel.add(TextoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 230, 50));

        TextoGUI.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TextoGUI.setForeground(new java.awt.Color(0, 0, 0));
        TextoGUI.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TextoGUI.setText("UPC AGUACHICA FUTSALA");
        MainPanel.add(TextoGUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 350, 50));

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderPanelMouseDragged(evt);
            }
        });
        HeaderPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeaderPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderPanelMousePressed(evt);
            }
        });

        BotonCerrar.setBackground(new java.awt.Color(255, 255, 255));
        BotonCerrar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        BotonCerrar.setForeground(new java.awt.Color(51, 51, 51));
        BotonCerrar.setText("X");
        BotonCerrar.setToolTipText("");
        BotonCerrar.setBorder(null);
        BotonCerrar.setBorderPainted(false);
        BotonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseExited(evt);
            }
        });
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainPanel.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        BotonGuardar.setBackground(new java.awt.Color(0, 102, 0));
        BotonGuardar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        BotonGuardar.setText("GUARDAR PARTIDO");
        BotonGuardar.setBorder(null);
        BotonGuardar.setBorderPainted(false);
        BotonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseExited(evt);
            }
        });
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        MainPanel.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 220, 40));

        BotonRegresar.setBackground(new java.awt.Color(0, 102, 0));
        BotonRegresar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        BotonRegresar.setForeground(new java.awt.Color(0, 0, 0));
        BotonRegresar.setText("REGRESAR");
        BotonRegresar.setBorder(null);
        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseExited(evt);
            }
        });
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        MainPanel.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 150, 40));

        DateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        DateChooser1.setDateFormatString("dd/MM/yyyy");
        MainPanel.add(DateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 200, 30));

        LabelFecha.setBackground(new java.awt.Color(255, 255, 255));
        LabelFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        LabelFecha.setForeground(new java.awt.Color(0, 0, 0));
        LabelFecha.setText("Fecha:");
        MainPanel.add(LabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 50, 30));

        GolesLocal.setBackground(new java.awt.Color(255, 255, 255));
        GolesLocal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        GolesLocal.setForeground(new java.awt.Color(0, 0, 0));
        GolesLocal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MainPanel.add(GolesLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 200, 30));

        GolesVisitante.setBackground(new java.awt.Color(255, 255, 255));
        GolesVisitante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        GolesVisitante.setForeground(new java.awt.Color(0, 0, 0));
        GolesVisitante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GolesVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GolesVisitanteActionPerformed(evt);
            }
        });
        MainPanel.add(GolesVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 200, 30));

        EquipoLocaljLabel.setBackground(new java.awt.Color(255, 255, 255));
        EquipoLocaljLabel.setForeground(new java.awt.Color(0, 0, 0));
        EquipoLocaljLabel.setText("EQUIPO LOCAL");
        MainPanel.add(EquipoLocaljLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        GolesLocaljLabel.setBackground(new java.awt.Color(255, 255, 255));
        GolesLocaljLabel.setForeground(new java.awt.Color(0, 0, 0));
        GolesLocaljLabel.setText("GOLES LOCAL");
        MainPanel.add(GolesLocaljLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        EquipoVisitantejLabel.setBackground(new java.awt.Color(255, 255, 255));
        EquipoVisitantejLabel.setForeground(new java.awt.Color(0, 0, 0));
        EquipoVisitantejLabel.setText("EQUIPO VISITANTE");
        MainPanel.add(EquipoVisitantejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        GolesVisitantejLabel.setBackground(new java.awt.Color(255, 255, 255));
        GolesVisitantejLabel.setForeground(new java.awt.Color(0, 0, 0));
        GolesVisitantejLabel.setText("GOLES VISITANTE");
        MainPanel.add(GolesVisitantejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        Equipo2ComboBox.setBackground(new java.awt.Color(255, 255, 255));
        Equipo2ComboBox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Equipo2ComboBox.setForeground(new java.awt.Color(0, 0, 0));
        Equipo2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Equipo2ComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Equipo2ComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(Equipo2ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 200, 30));

        Equipo1ComboBox.setBackground(new java.awt.Color(255, 255, 255));
        Equipo1ComboBox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Equipo1ComboBox.setForeground(new java.awt.Color(0, 0, 0));
        Equipo1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Equipo1ComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Equipo1ComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Equipo1ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Equipo1ComboBoxActionPerformed(evt);
            }
        });
        MainPanel.add(Equipo1ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 200, 30));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderPanelMousePressed

    private void HeaderPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HeaderPanelMouseClicked

    private void HeaderPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
        
    }//GEN-LAST:event_HeaderPanelMouseDragged

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void BotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BotonCerrarMouseClicked

    private void BotonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseEntered
        // TODO add your handling code here:
        BotonCerrar.setBackground(Color.red);
        BotonCerrar.setForeground(Color.white);
    }//GEN-LAST:event_BotonCerrarMouseEntered

    private void BotonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseExited
        // TODO add your handling code here:
        BotonCerrar.setBackground(Color.white);
        BotonCerrar.setForeground(Color.black);
    }//GEN-LAST:event_BotonCerrarMouseExited

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        String FechaSeleccionada = "";
        
        if(GolesLocal.getText().isEmpty() || GolesVisitante.getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null, "Error, no se han lleando todas las casillas");
        }
        
        SimpleDateFormat ObtenerFecha = new SimpleDateFormat("dd/MM/yyyy");
        FechaSeleccionada = ObtenerFecha.format(DateChooser1.getDate());
            
        if(FechaSeleccionada!=null && !"".equals(GolesLocal.getText()) && !"".equals(GolesVisitante.getText())){
            String goles_local = GolesLocal.getText(), goles_visitante = GolesVisitante.getText();
                
            if(" ".equals(goles_local) || " ".equals(goles_visitante)){
                JOptionPane.showMessageDialog(null, "No se pueden ingresar espacios en blanco");
            }
            else{
                Archivo datos = new Archivo();
                String fila = FechaSeleccionada+";"+goles_local+";"+goles_visitante+";";                

                if(fila != null){
                    datos.EscribirDatos(fila);
                    javax.swing.JOptionPane.showMessageDialog(this, "¡Partido guardado exitosamente!");
                    Menu regresar = new Menu();
                    regresar.setVisible(true);
                    dispose();
                }
                
            }
            
        }
        
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseEntered
        // TODO add your handling code here:
        BotonGuardar.setBackground(new Color(51, 255, 51));
    }//GEN-LAST:event_BotonGuardarMouseEntered

    private void BotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseExited
        // TODO add your handling code here:
        BotonGuardar.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_BotonGuardarMouseExited

    private void BotonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGuardarMouseClicked

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:
        Menu regresar = new Menu();
        regresar.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseEntered
        // TODO add your handling code here:
        BotonRegresar.setBackground(new Color(51, 255, 51));
    }//GEN-LAST:event_BotonRegresarMouseEntered

    private void BotonRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseExited
        // TODO add your handling code here:
        BotonRegresar.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_BotonRegresarMouseExited

    private void GolesVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GolesVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GolesVisitanteActionPerformed

    private void Equipo1ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Equipo1ComboBoxActionPerformed
        // TODO add your handling code here:
        
        JComboBox equipo1 = new JComboBox();
        
        try {
            FileReader leer_fr = new FileReader("archivo.txt");
            BufferedReader transferir_br = new BufferedReader(leer_fr);
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_Equipo1ComboBoxActionPerformed
 
    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarPartido().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonRegresar;
    private com.toedter.calendar.JDateChooser DateChooser1;
    private javax.swing.JComboBox<String> Equipo1ComboBox;
    private javax.swing.JComboBox<String> Equipo2ComboBox;
    private javax.swing.JLabel EquipoLocaljLabel;
    private javax.swing.JLabel EquipoVisitantejLabel;
    private javax.swing.JTextField GolesLocal;
    private javax.swing.JLabel GolesLocaljLabel;
    private javax.swing.JTextField GolesVisitante;
    private javax.swing.JLabel GolesVisitantejLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel TextoGUI;
    private javax.swing.JLabel TextoLugar;
    // End of variables declaration//GEN-END:variables
}