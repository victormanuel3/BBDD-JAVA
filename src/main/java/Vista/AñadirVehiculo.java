package Vista;

import ControladorPersonas.ControladorPersonas;
import Excepciones.SQLPersonasException;
import Modelo.Vehiculo;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class AñadirVehiculo extends javax.swing.JDialog {

    Vehiculo v;

    public AñadirVehiculo(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        TipoJComboBox = new javax.swing.JComboBox<>();
        jButtonAgregar = new Vista.Elementos.MyButton();
        ColorTextField = new Vista.Elementos.TextField();
        MatriculaTextField = new Vista.Elementos.TextField();
        Cerrar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matricula");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(17, 37, 190));
        kGradientPanel1.setkStartColor(new java.awt.Color(46, 224, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TipoJComboBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TipoJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coche", "Camion", "Moto" }));
        TipoJComboBox.setBorder(null);
        kGradientPanel1.add(TipoJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 270, 48));

        jButtonAgregar.setBackground(new java.awt.Color(9, 45, 163));
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setText("Agregar vehículo");
        jButtonAgregar.setBorderColor(new java.awt.Color(9, 45, 163));
        jButtonAgregar.setColor(new java.awt.Color(9, 45, 163));
        jButtonAgregar.setColorClick(new java.awt.Color(0, 21, 208));
        jButtonAgregar.setColorOver(new java.awt.Color(0, 21, 208));
        jButtonAgregar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jButtonAgregar.setRadius(30);
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 210, 50));

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
        kGradientPanel1.add(ColorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 270, 50));

        MatriculaTextField.setForeground(new java.awt.Color(153, 153, 153));
        MatriculaTextField.setText("Matrícula");
        MatriculaTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        MatriculaTextField.setSelectionColor(new java.awt.Color(0, 0, 153));
        MatriculaTextField.setShadowColor(new java.awt.Color(0, 0, 102));
        MatriculaTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatriculaTextFieldMouseClicked(evt);
            }
        });
        MatriculaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MatriculaTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MatriculaTextFieldKeyTyped(evt);
            }
        });
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

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("la matrícula en el formato '1234ABC'");
        kGradientPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 370, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean verificacionNumerosMatricula(String matricula) {
        for (int i = 0; i < matricula.length(); i++) {
            if (Character.isLetter(matricula.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean verificacionLetrasMatricula(String matricula) {
        for (int i = 4; i < matricula.length(); i++) {
            if (Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }
        return true;
    }

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


    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CerrarMouseClicked

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        String tipo = TipoJComboBox.getSelectedItem().toString();
        String matricula = MatriculaTextField.getText();
        String color = ColorTextField.getText();

        if (matricula.isEmpty() || color.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se puede dejar campos en blanco.", "Datos vacíos", JOptionPane.WARNING_MESSAGE);
        } else {
            if (matricula.length() != 7) {
                JOptionPane.showMessageDialog(this, "El formato de la matrícula es inválido, debe contener 7 caracteres.", "Error en matrícula", JOptionPane.WARNING_MESSAGE);
                MatriculaTextField.setText("");
            } else {
                try {
                    v = new Vehiculo(matricula, color, tipo);
                    ControladorPersonas.insertarVehiculo(v);
                    JOptionPane.showMessageDialog(this, "El vehículo se ha agregado correctamente.", "Vehículo agregado", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } catch (SQLPersonasException ex) {
                    JOptionPane.showMessageDialog(this, "Error al insertar el vehículo en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private boolean primerClickMatriculaVehiculo = true;
    private boolean primerClickColorVehiculo = true;

    private void MatriculaTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatriculaTextFieldMouseClicked
        if (primerClickMatriculaVehiculo) {
            MatriculaTextField.setText("");
            MatriculaTextField.setForeground(Color.BLACK);
            primerClickMatriculaVehiculo = false;
        }
    }//GEN-LAST:event_MatriculaTextFieldMouseClicked

    private void ColorTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColorTextFieldMouseClicked
        if (primerClickColorVehiculo) {
            ColorTextField.setText("");
            ColorTextField.setForeground(Color.BLACK);
            primerClickColorVehiculo = false;
        }
    }//GEN-LAST:event_ColorTextFieldMouseClicked

    private void MatriculaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MatriculaTextFieldKeyReleased
        String matricula = MatriculaTextField.getText();
        if (matricula.length() <= 4) {
            if (!verificacionNumerosMatricula(matricula)) {
                JOptionPane.showMessageDialog(this, "Formato incorrecto, debes introducir 4 números seguidos de 3 letras.", "Error en formato", JOptionPane.WARNING_MESSAGE);
                MatriculaTextField.setText("");
            }
        } else {
            if (!verificacionLetrasMatricula(matricula)) {
                JOptionPane.showMessageDialog(this, "Formato incorrecto, debes introducir 4 números seguidos de 3 letras.", "Error en formato", JOptionPane.WARNING_MESSAGE);
                MatriculaTextField.setText("");
            }
        }
        try {
            if (ControladorPersonas.matriculaExistente(matricula)) {
                v = ControladorPersonas.getVehiculoByMatricula(matricula);
                JOptionPane.showMessageDialog(this, "El vehículo ha sido encontrado y asignado correctamente.", "El vehículo ha sido encontrado.", JOptionPane.INFORMATION_MESSAGE);
                // Asigna el vehículo a la persona o a una variable global
                this.dispose();
            }
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, "Error al verificar la matrícula en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_MatriculaTextFieldKeyReleased

    private void MatriculaTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MatriculaTextFieldKeyTyped
        if (MatriculaTextField.getText().length() >= 7) {
            JOptionPane.showMessageDialog(this, "La matrícula debe contener 7 caracteres.", "Error en formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(this, "No puedes dejar espacios en blanco.", "Error en formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_MatriculaTextFieldKeyTyped

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

    public Vehiculo getVehiculo() {
        return v;
    }

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
            java.util.logging.Logger.getLogger(AñadirVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AñadirVehiculo dialog = new AñadirVehiculo(new javax.swing.JDialog(), true);
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
    private Vista.Elementos.MyButton jButtonAgregar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
