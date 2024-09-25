package Vista;

import static ControladorPersonas.ControladorPersonas.updatePersonas;
import Excepciones.SQLPersonasException;
import Modelo.Cliente;
import Modelo.Persona;
import Modelo.Vehiculo;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ModificarCliente extends javax.swing.JDialog {

    private Persona p;
    private Vehiculo v;

    public void setPersona(Persona persona) {
        p = persona;
        if (p instanceof Cliente) {
            Cliente c = (Cliente) p;
            DNITextField.setText(c.getDNI());
            IDClienteTextField.setText(String.valueOf(c.getIdCliente()));
        }
    }

    public ModificarCliente(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DNITextField.setEnabled(false);
        IDClienteTextField.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DNITextField = new Vista.Elementos.TextField();
        NombreTextField = new Vista.Elementos.TextField();
        DireccionTextField = new Vista.Elementos.TextField();
        IDClienteTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        GeneroJComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        EdadJSpinner = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new Vista.Elementos.RadioButtonCustom();
        jRadioButton2 = new Vista.Elementos.RadioButtonCustom();
        ModificarVehiculoClienteJButton = new Vista.Elementos.MyButton();
        ModificarClienteButton = new Vista.Elementos.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setBackground(new java.awt.Color(0, 0, 255));
        Cerrar.setFont(new java.awt.Font("Tuerca Black Italic", 1, 24)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(0, 0, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 50, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Mensura 6", 0, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 37, 190));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cliente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 670, 60));

        DNITextField.setBackground(new java.awt.Color(222, 225, 229));
        DNITextField.setForeground(new java.awt.Color(142, 143, 145));
        DNITextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        DNITextField.setRound(30);
        DNITextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        DNITextField.setSelectionColor(new java.awt.Color(85, 85, 85));
        DNITextField.setShadowColor(new java.awt.Color(85, 85, 85));
        jPanel1.add(DNITextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 320, 60));

        NombreTextField.setForeground(new java.awt.Color(153, 153, 153));
        NombreTextField.setText("Nombre");
        NombreTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        NombreTextField.setRound(30);
        NombreTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        NombreTextField.setSelectionColor(new java.awt.Color(0, 204, 255));
        NombreTextField.setShadowColor(new java.awt.Color(0, 153, 255));
        NombreTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreTextFieldMouseClicked(evt);
            }
        });
        NombreTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NombreTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(NombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 320, 60));

        DireccionTextField.setForeground(new java.awt.Color(153, 153, 153));
        DireccionTextField.setText("Direccion");
        DireccionTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        DireccionTextField.setRound(30);
        DireccionTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        DireccionTextField.setSelectionColor(new java.awt.Color(0, 153, 255));
        DireccionTextField.setShadowColor(new java.awt.Color(0, 153, 255));
        DireccionTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DireccionTextFieldMouseClicked(evt);
            }
        });
        jPanel1.add(DireccionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 320, 60));

        IDClienteTextField.setBackground(new java.awt.Color(255, 255, 255));
        IDClienteTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        IDClienteTextField.setForeground(new java.awt.Color(0, 51, 204));
        IDClienteTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(206, 206, 206)));
        jPanel1.add(IDClienteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 320, 46));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("ID del cliente");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 290, 30));

        GeneroJComboBox.setBackground(new java.awt.Color(241, 241, 241));
        GeneroJComboBox.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        GeneroJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        GeneroJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        GeneroJComboBox.setBorder(null);
        jPanel1.add(GeneroJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 190, 40));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Género");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 130, 30));

        EdadJSpinner.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EdadJSpinner.setModel(new javax.swing.SpinnerNumberModel(18, 18, 90, 1));
        EdadJSpinner.setBorder(null);
        jPanel1.add(EdadJSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 190, 45));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Edad");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("¿Es vip?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 190, -1));

        jRadioButton1.setBackground(new java.awt.Color(0, 51, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Sí");
        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 51, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");
        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        ModificarVehiculoClienteJButton.setBackground(new java.awt.Color(204, 204, 204));
        ModificarVehiculoClienteJButton.setForeground(new java.awt.Color(102, 102, 102));
        ModificarVehiculoClienteJButton.setText("Modificar vehículo");
        ModificarVehiculoClienteJButton.setBorderColor(new java.awt.Color(204, 204, 204));
        ModificarVehiculoClienteJButton.setColor(new java.awt.Color(204, 204, 204));
        ModificarVehiculoClienteJButton.setColorClick(new java.awt.Color(234, 234, 234));
        ModificarVehiculoClienteJButton.setColorOver(new java.awt.Color(234, 234, 234));
        ModificarVehiculoClienteJButton.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        ModificarVehiculoClienteJButton.setRadius(30);
        ModificarVehiculoClienteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarVehiculoClienteJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ModificarVehiculoClienteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 190, 40));

        ModificarClienteButton.setBackground(new java.awt.Color(17, 37, 190));
        ModificarClienteButton.setForeground(new java.awt.Color(255, 255, 255));
        ModificarClienteButton.setText("Modificar");
        ModificarClienteButton.setBorderColor(new java.awt.Color(17, 37, 190));
        ModificarClienteButton.setColor(new java.awt.Color(17, 37, 190));
        ModificarClienteButton.setColorClick(new java.awt.Color(4, 54, 217));
        ModificarClienteButton.setColorOver(new java.awt.Color(4, 54, 217));
        ModificarClienteButton.setFont(new java.awt.Font("Verdana", 0, 19)); // NOI18N
        ModificarClienteButton.setRadius(50);
        ModificarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarClienteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ModificarClienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CerrarMouseClicked

    private boolean primerClickNombre = true;

    private void NombreTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreTextFieldMouseClicked
        if (primerClickNombre) {
            NombreTextField.setText("");
            NombreTextField.setForeground(Color.BLACK);
            primerClickNombre = false;
        }
    }//GEN-LAST:event_NombreTextFieldMouseClicked

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

    private void NombreTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreTextFieldKeyReleased
        if (contieneNumero(NombreTextField.getText())) {
            JOptionPane.showMessageDialog(this, "No puedes introducir números en el nombre.", "Error en nombre", JOptionPane.WARNING_MESSAGE);
            NombreTextField.setText("");
        }
    }//GEN-LAST:event_NombreTextFieldKeyReleased

    private boolean primerClickDireccion = true;

    private void DireccionTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DireccionTextFieldMouseClicked
        if (primerClickDireccion) {
            DireccionTextField.setText("");
            DireccionTextField.setForeground(Color.BLACK);
            primerClickDireccion = false;
        }
    }//GEN-LAST:event_DireccionTextFieldMouseClicked

    private void ModificarVehiculoClienteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarVehiculoClienteJButtonActionPerformed
        if (p.getV() == null) {
            AñadirVehiculo av = new AñadirVehiculo(this, true);
            av.setLocationRelativeTo(null);
            av.setVisible(true);
            v = av.getVehiculo();
            if (v != null) {
                p.setV(v);
            }
        } else {
            ModificarVehiculo mv = new ModificarVehiculo(this, true);
            mv.setPersona(p);
            mv.setLocationRelativeTo(null);
            mv.setVisible(true);
        }
    }//GEN-LAST:event_ModificarVehiculoClienteJButtonActionPerformed

    private void ModificarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarClienteButtonActionPerformed
        String Nombre = NombreTextField.getText();
        String Direccion = DireccionTextField.getText();
        int Edad = (int) EdadJSpinner.getValue();
        char Genero = GeneroJComboBox.getSelectedItem().toString().toUpperCase().charAt(0);
        boolean VIP = false;

        if (Nombre.isEmpty() || Direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se puede dejar campos en blanco.", "Datos vacíos", JOptionPane.WARNING_MESSAGE);
        } else {
            boolean confirm = false;
            if (jRadioButton1.isSelected()) {
                VIP = true;
                confirm = true;
            } else if (jRadioButton2.isSelected()) {
                VIP = false;
                confirm = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debes marcar si el cliente es VIP o no obligatoriamente.", "Rellenar dato", JOptionPane.WARNING_MESSAGE);
                confirm = false;
            }

            if (confirm) {
                p.setNombre(Nombre);
                p.setDireccion(Direccion);
                p.setEdad(Edad);
                p.setGenero(Genero);
                ((Cliente) p).setVip(VIP);
                try {
                    updatePersonas(p);
                    JOptionPane.showMessageDialog(this, "Los datos de la persona han sido modificados exitosamente.", "Persona modificada correctamente", JOptionPane.WARNING_MESSAGE);
                    dispose();
                } catch (SQLPersonasException ex) {
                    JOptionPane.showMessageDialog(this, "Error al modificar los datos del empleado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_ModificarClienteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarCliente dialog = new ModificarCliente(new javax.swing.JDialog(), true); //ME SALE ERROR AQUI
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
    private Vista.Elementos.TextField DNITextField;
    private Vista.Elementos.TextField DireccionTextField;
    private javax.swing.JSpinner EdadJSpinner;
    private javax.swing.JComboBox<String> GeneroJComboBox;
    private javax.swing.JTextField IDClienteTextField;
    private Vista.Elementos.MyButton ModificarClienteButton;
    private Vista.Elementos.MyButton ModificarVehiculoClienteJButton;
    private Vista.Elementos.TextField NombreTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private Vista.Elementos.RadioButtonCustom jRadioButton1;
    private Vista.Elementos.RadioButtonCustom jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
