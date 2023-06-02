package com.mycompany.ediciondecodigo;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {
    int xMouse, yMouse;
    /**
     * Creates new form Inicio
     */
    public Menu() {
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
        HeaderPanel = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        TextoLugar = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JButton();
        BotonGestionar = new javax.swing.JButton();
        BotonResultados = new javax.swing.JButton();
        TextoGUI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(400, 500));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderPanelMouseDragged(evt);
            }
        });
        HeaderPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderPanelMousePressed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(255, 255, 255));
        ExitButton.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(51, 51, 51));
        ExitButton.setText("X");
        ExitButton.setBorder(null);
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
        });
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 350, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MainPanel.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        TextoLugar.setBackground(new java.awt.Color(0, 0, 0));
        TextoLugar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TextoLugar.setForeground(new java.awt.Color(0, 0, 0));
        TextoLugar.setText("MENÚ");
        MainPanel.add(TextoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, 50));

        BotonRegistrar.setBackground(new java.awt.Color(0, 102, 0));
        BotonRegistrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        BotonRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        BotonRegistrar.setText("REGISTRAR PARTIDOS");
        BotonRegistrar.setBorder(null);
        BotonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonRegistrarMouseExited(evt);
            }
        });
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        MainPanel.add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 200, 50));

        BotonGestionar.setBackground(new java.awt.Color(0, 102, 0));
        BotonGestionar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        BotonGestionar.setForeground(new java.awt.Color(0, 0, 0));
        BotonGestionar.setText("GESTIONAR EQUIPOS");
        BotonGestionar.setBorder(null);
        BotonGestionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGestionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonGestionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonGestionarMouseExited(evt);
            }
        });
        BotonGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGestionarActionPerformed(evt);
            }
        });
        MainPanel.add(BotonGestionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 200, 50));

        BotonResultados.setBackground(new java.awt.Color(0, 102, 0));
        BotonResultados.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        BotonResultados.setForeground(new java.awt.Color(0, 0, 0));
        BotonResultados.setText("VER RESULTADOS");
        BotonResultados.setBorder(null);
        BotonResultados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonResultadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonResultadosMouseExited(evt);
            }
        });
        BotonResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResultadosActionPerformed(evt);
            }
        });
        MainPanel.add(BotonResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 200, 50));

        TextoGUI.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TextoGUI.setForeground(new java.awt.Color(0, 0, 0));
        TextoGUI.setText("UPC AGUACHICA FUTSALA");
        MainPanel.add(TextoGUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 300, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        // TODO add your handling code here:
        ExitButton.setBackground(Color.red);
        ExitButton.setForeground(Color.white);
    }//GEN-LAST:event_ExitButtonMouseEntered

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        // TODO add your handling code here:
        ExitButton.setBackground(Color.white);
        ExitButton.setForeground(Color.black);
    }//GEN-LAST:event_ExitButtonMouseExited

    private void HeaderPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderPanelMouseDragged

    private void HeaderPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderPanelMousePressed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        // TODO add your handling code here:
        RegistrarPartido registrar_partido = new RegistrarPartido();
        registrar_partido.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarMouseEntered
        // TODO add your handling code here:
        BotonRegistrar.setBackground(new Color(51, 255, 51));
    }//GEN-LAST:event_BotonRegistrarMouseEntered

    private void BotonRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarMouseExited
        // TODO add your handling code here:
        BotonRegistrar.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_BotonRegistrarMouseExited

    private void BotonGestionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGestionarMouseExited
        // TODO add your handling code here:
        BotonGestionar.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_BotonGestionarMouseExited

    private void BotonGestionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGestionarMouseEntered
        // TODO add your handling code here:
        BotonGestionar.setBackground(new Color(51, 255, 51));
    }//GEN-LAST:event_BotonGestionarMouseEntered

    private void BotonResultadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResultadosMouseEntered
        // TODO add your handling code here:
        BotonResultados.setBackground(new Color(51, 255, 51));
    }//GEN-LAST:event_BotonResultadosMouseEntered

    private void BotonResultadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResultadosMouseExited
        // TODO add your handling code here:
        BotonResultados.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_BotonResultadosMouseExited

    private void BotonGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGestionarActionPerformed
        // TODO add your handling code here:
        GestionEquipos equipo1 = new GestionEquipos();
        equipo1.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonGestionarActionPerformed

    private void BotonResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResultadosActionPerformed
        // TODO add your handling code here:  
        VerResultados resultados = new VerResultados();
        resultados.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonResultadosActionPerformed


    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGestionar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonResultados;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel TextoGUI;
    private javax.swing.JLabel TextoLugar;
    // End of variables declaration//GEN-END:variables
}