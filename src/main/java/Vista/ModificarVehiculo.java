package Vista;

import static ControladorPersonas.ControladorPersonas.updateVehiculos;
import Excepciones.SQLPersonasException;
import Modelo.Persona;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModificarVehiculo extends javax.swing.JDialog {

    private Persona p;

    public void setPersona(Persona persona) {
        p = persona;
        if (p.getV() != null) {
            MatriculaTextField.setText(p.getV().getMatricula());
        }
    }

    public ModificarVehiculo(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        MatriculaTextField.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        TipoJComboBox = new javax.swing.JComboBox<>();
        jButtonModificarVehiculo = new Vista.Elementos.MyButton();
        ColorTextField = new Vista.Elementos.TextField();
        MatriculaTextField = new Vista.Elementos.TextField();
        Cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(17, 37, 190));
        kGradientPanel1.setkStartColor(new java.awt.Color(46, 224, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TipoJComboBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TipoJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coche", "Camion", "Moto" }));
        TipoJComboBox.setBorder(null);
        kGradientPanel1.add(TipoJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 270, 48));

        jButtonModificarVehiculo.setBackground(new java.awt.Color(9, 45, 163));
        jButtonModificarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarVehiculo.setText("Modificar vehículo");
        jButtonModificarVehiculo.setBorderColor(new java.awt.Color(9, 45, 163));
        jButtonModificarVehiculo.setColor(new java.awt.Color(9, 45, 163));
        jButtonModificarVehiculo.setColorClick(new java.awt.Color(0, 21, 208));
        jButtonModificarVehiculo.setColorOver(new java.awt.Color(0, 21, 208));
        jButtonModificarVehiculo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jButtonModificarVehiculo.setRadius(30);
        jButtonModificarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarVehiculoActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButtonModificarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 210, 50));

        ColorTextField.setForeground(new java.awt.Color(153, 153, 153));
        ColorTextField.setText("Color del vehículo");
        ColorTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ColorTextField.setSelectionColor(new java.awt.Color(0, 0, 153));
        ColorTextField.setShadowColor(new java.awt.Color(0, 0, 102));
        ColorTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ColorTextFieldMouseClicked(evt);
            }
        });
        ColorTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ColorTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ColorTextFieldKeyTyped(evt);
            }
        });
        kGradientPanel1.add(ColorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 270, 50));

        MatriculaTextField.setForeground(new java.awt.Color(0, 102, 255));
        MatriculaTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        MatriculaTextField.setSelectionColor(new java.awt.Color(0, 0, 153));
        MatriculaTextField.setShadowColor(new java.awt.Color(0, 0, 102));
        kGradientPanel1.add(MatriculaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 270, 50));

        Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        Cerrar.setFont(new java.awt.Font("Tuerca Black Italic", 1, 20)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        kGradientPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean primerClickColorVehiculo = true;

    private void ColorTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColorTextFieldMouseClicked
        if (primerClickColorVehiculo) {
            ColorTextField.setText("");
            ColorTextField.setForeground(Color.BLACK);
            primerClickColorVehiculo = false;
        }
    }//GEN-LAST:event_ColorTextFieldMouseClicked

    public static boolean contieneNumero(String dato) {
        char letra;
        for (int i = 0; i < dato.length(); i++) {
            letra = dato.charAt(i);
            if (letra >= '0' && letra <= '9') {
                return true;
            }
        }

        return false;
    }

    private void ColorTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ColorTextFieldKeyReleased
        if (contieneNumero(ColorTextField.getText())) {
            JOptionPane.showMessageDialog(this, "No puedes introducir números en este campo.", "Error en nombre", JOptionPane.WARNING_MESSAGE);
            ColorTextField.setText("");
        }
    }//GEN-LAST:event_ColorTextFieldKeyReleased

    private void ColorTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ColorTextFieldKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(this, "No puedes dejar espacios en blanco.", "Error en formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_ColorTextFieldKeyTyped

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CerrarMouseClicked

    private void jButtonModificarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarVehiculoActionPerformed
        String tipo = TipoJComboBox.getSelectedItem().toString();
        String color = ColorTextField.getText();
        if (color.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se puede dejar campos en blanco.", "Datos vacíos", JOptionPane.WARNING_MESSAGE);
        } else {
            p.getV().setColor(color);
            p.getV().setTipo(tipo);
            try {
                updateVehiculos(p.getV());
                JOptionPane.showMessageDialog(this, "El vehículo ha sido modificado exitosamente.", "Vehículo modificado", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (SQLPersonasException ex) {
                JOptionPane.showMessageDialog(this, "Error al modificar los datos del vehiculo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonModificarVehiculoActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarVehiculo dialog = new ModificarVehiculo(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private Vista.Elementos.TextField ColorTextField;
    private Vista.Elementos.TextField MatriculaTextField;
    private javax.swing.JComboBox<String> TipoJComboBox;
    private Vista.Elementos.MyButton jButtonModificarVehiculo;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
