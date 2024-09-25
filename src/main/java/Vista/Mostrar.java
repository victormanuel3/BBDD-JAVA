package Vista;

import static ControladorPersonas.ControladorPersonas.ObtenerDNIS;
import static ControladorPersonas.ControladorPersonas.mostrar;
import Excepciones.SQLPersonasException;
import Modelo.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Mostrar extends javax.swing.JDialog {

    public Mostrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            ArrayList<String> dnis = ObtenerDNIS();
            for (String dni : dnis) {
                IdentificadorjComboBox.addItem(dni);
            }
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los DNIs: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        IdentificadorjComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        Cerrar = new javax.swing.JLabel();
        MostrarAtributosJButton = new Vista.Elementos.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(46, 224, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(17, 37, 190));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IdentificadorjComboBox.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        IdentificadorjComboBox.setBorder(null);
        kGradientPanel1.add(IdentificadorjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 259, 50));

        jTextArea.setEditable(false);
        jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        kGradientPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 410, 240));

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
        kGradientPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 40, 40));

        MostrarAtributosJButton.setBackground(new java.awt.Color(204, 204, 204));
        MostrarAtributosJButton.setForeground(new java.awt.Color(102, 102, 102));
        MostrarAtributosJButton.setText("Mostrar");
        MostrarAtributosJButton.setBorderColor(new java.awt.Color(204, 204, 204));
        MostrarAtributosJButton.setColor(new java.awt.Color(204, 204, 204));
        MostrarAtributosJButton.setColorClick(new java.awt.Color(234, 234, 234));
        MostrarAtributosJButton.setColorOver(new java.awt.Color(234, 234, 234));
        MostrarAtributosJButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        MostrarAtributosJButton.setRadius(30);
        MostrarAtributosJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarAtributosJButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(MostrarAtributosJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CerrarMouseClicked

    private void MostrarAtributosJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarAtributosJButtonActionPerformed
        String DNI = IdentificadorjComboBox.getSelectedItem().toString();
        Persona p;
        try {
            p = mostrar(new Persona(DNI));
            jTextArea.setText(p.toString());
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, "Error al mostrar atributos de persona por DNI " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_MostrarAtributosJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mostrar dialog = new Mostrar(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> IdentificadorjComboBox;
    private Vista.Elementos.MyButton MostrarAtributosJButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
