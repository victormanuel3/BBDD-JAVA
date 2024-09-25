package Vista;

import static ControladorPersonas.ControladorPersonas.buscar;
import Excepciones.SQLPersonasException;
import Modelo.Persona;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

public class Buscar extends javax.swing.JDialog {

    public Buscar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        Cerrar = new javax.swing.JLabel();
        BuscarJButton = new Vista.Elementos.MyButton();
        NombreTextField = new Vista.Elementos.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(46, 224, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(17, 37, 190));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(46, 224, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(17, 37, 190));

        Cerrar.setBackground(new java.awt.Color(0, 0, 255));
        Cerrar.setFont(new java.awt.Font("Tuerca Black Italic", 1, 20)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        BuscarJButton.setBackground(new java.awt.Color(204, 204, 204));
        BuscarJButton.setForeground(new java.awt.Color(102, 102, 102));
        BuscarJButton.setText("Buscar");
        BuscarJButton.setBorderColor(new java.awt.Color(204, 204, 204));
        BuscarJButton.setColor(new java.awt.Color(204, 204, 204));
        BuscarJButton.setColorClick(new java.awt.Color(234, 234, 234));
        BuscarJButton.setColorOver(new java.awt.Color(234, 234, 234));
        BuscarJButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BuscarJButton.setRadius(30);
        BuscarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarJButtonActionPerformed(evt);
            }
        });

        NombreTextField.setForeground(new java.awt.Color(153, 153, 153));
        NombreTextField.setText("Nombre de la persona");
        NombreTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        NombreTextField.setSelectionColor(new java.awt.Color(0, 0, 102));
        NombreTextField.setShadowColor(new java.awt.Color(0, 0, 102));
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

        jTextArea.setEditable(false);
        jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(NombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(550, Short.MAX_VALUE))
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CerrarMouseClicked

    private boolean primerClick = true;

    private void NombreTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreTextFieldMouseClicked
        if (primerClick) {
            NombreTextField.setText("");
            NombreTextField.setForeground(Color.BLACK);
            primerClick = false;
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
            JOptionPane.showMessageDialog(this, "No puedes introducir números en este campo.", "Error de campo", JOptionPane.WARNING_MESSAGE);
            NombreTextField.setText("");
        }
    }//GEN-LAST:event_NombreTextFieldKeyReleased

    private void BuscarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarJButtonActionPerformed
        String nombrePersona = NombreTextField.getText();
        jTextArea.setText("");
        List<Persona> personas;
        try {
            personas = buscar(nombrePersona);
            if (personas.isEmpty()) {
                jTextArea.setText("No se ha encontrado ninguna persona\ncon ese nombre.");
            } else {
                for (Persona p : personas) {
                    if (p.getNombre().equalsIgnoreCase(nombrePersona)) {
                        jTextArea.append(p.toString() + "\n\n");
                    }
                }
            }
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscvar atributos de persona por nombre" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BuscarJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Buscar dialog = new Buscar(new javax.swing.JFrame(), true);
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
    private Vista.Elementos.MyButton BuscarJButton;
    private javax.swing.JLabel Cerrar;
    private Vista.Elementos.TextField NombreTextField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
