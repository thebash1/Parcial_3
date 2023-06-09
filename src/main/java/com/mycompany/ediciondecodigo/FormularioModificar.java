package com.mycompany.ediciondecodigo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormularioModificar extends javax.swing.JFrame {

    /**
     * Creates new form FormularioModificar
     */
    public FormularioModificar() {
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
        LabelLugar = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        EquipoTextField = new javax.swing.JTextField();
        EquipoLabel = new javax.swing.JLabel();
        GolesEquipoLabel = new javax.swing.JLabel();
        EntrenadorTextField = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(500, 350));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLugar.setBackground(new java.awt.Color(255, 255, 255));
        LabelLugar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        LabelLugar.setForeground(new java.awt.Color(0, 0, 0));
        LabelLugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLugar.setText("FORMULARIO PARA MODIFICAR");
        MainPanel.add(LabelLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 300, 40));

        BotonRegresar.setBackground(new java.awt.Color(0, 102, 0));
        BotonRegresar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
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
        MainPanel.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, 40));

        idLabel.setBackground(new java.awt.Color(255, 255, 255));
        idLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLabel.setText("id:");
        MainPanel.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 30, 30));

        idTextField.setBackground(new java.awt.Color(255, 255, 255));
        idTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        idTextField.setForeground(new java.awt.Color(0, 0, 0));
        idTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        MainPanel.add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 100, 30));

        EquipoTextField.setBackground(new java.awt.Color(255, 255, 255));
        EquipoTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        EquipoTextField.setForeground(new java.awt.Color(0, 0, 0));
        EquipoTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EquipoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EquipoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipoTextFieldActionPerformed(evt);
            }
        });
        MainPanel.add(EquipoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 200, 30));

        EquipoLabel.setBackground(new java.awt.Color(255, 255, 255));
        EquipoLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        EquipoLabel.setForeground(new java.awt.Color(0, 0, 0));
        EquipoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EquipoLabel.setText("Nombre de equipo:");
        MainPanel.add(EquipoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 130, 30));

        GolesEquipoLabel.setBackground(new java.awt.Color(255, 255, 255));
        GolesEquipoLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        GolesEquipoLabel.setForeground(new java.awt.Color(0, 0, 0));
        GolesEquipoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GolesEquipoLabel.setText("Nombre de entrenador:");
        MainPanel.add(GolesEquipoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 160, 30));

        EntrenadorTextField.setBackground(new java.awt.Color(255, 255, 255));
        EntrenadorTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        EntrenadorTextField.setForeground(new java.awt.Color(0, 0, 0));
        EntrenadorTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EntrenadorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MainPanel.add(EntrenadorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 100, 30));

        BotonGuardar.setBackground(new java.awt.Color(0, 102, 0));
        BotonGuardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        BotonGuardar.setText("GUARDAR CAMBIOS");
        BotonGuardar.setBorder(null);
        BotonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        MainPanel.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:
        GestionEquipos boton_regresar = new GestionEquipos();
        boton_regresar.setVisible(true);
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

    private void EquipoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EquipoTextFieldActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        if(idTextField.getText().isEmpty() || EquipoTextField.getText().isEmpty() || EntrenadorTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Error, hay casillas vacias");
        }
        else if(" ".equals(idTextField.getText()) || " ".equals(EquipoTextField.getText()) || " ".equals(EntrenadorTextField.getText())){
            JOptionPane.showMessageDialog(null, "Error, no se llenan casillas con espacios");
        }
        
        else{
            
            String id = idTextField.getText();
            String nombreEquipo = EquipoTextField.getText();
            String nombreEntrenador = EntrenadorTextField.getText();

            try {
                File inputFile = new File("datos.txt");
                File tempFile = new File("temp.txt");

                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                String line;
                boolean encontrado = false;

                while ((line = reader.readLine()) != null) {
                    String[] datos = line.split(",");
                    if (datos.length >= 3 && datos[0].equals(id)) {
                        datos[1] = nombreEquipo;
                        datos[2] = nombreEntrenador;
                        line = String.join(",", datos);
                        encontrado = true;
                    }
                    writer.write(line + System.lineSeparator());
                }

                reader.close();
                writer.close();

                if (encontrado) {
                    inputFile.delete();
                    tempFile.renameTo(inputFile);
                    JOptionPane.showMessageDialog(null, "Equipo editado correctamente.");
                    Menu volver_menu = new Menu();
                    volver_menu.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un equipo con el ID proporcionado.");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al editar el equipo.");
                ex.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField EntrenadorTextField;
    private javax.swing.JLabel EquipoLabel;
    private javax.swing.JTextField EquipoTextField;
    private javax.swing.JLabel GolesEquipoLabel;
    private javax.swing.JLabel LabelLugar;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    // End of variables declaration//GEN-END:variables
}
