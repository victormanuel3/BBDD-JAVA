package Vista;

import static ControladorPersonas.ControladorPersonas.ObtenerDNIS;
import static ControladorPersonas.ControladorPersonas.darDeBaja;
import Excepciones.SQLPersonasException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DardeBaja extends javax.swing.JDialog {

    public DardeBaja(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            ArrayList<String> dnis = ObtenerDNIS();
            for (String dni : dnis) {
                DardeBajaComboBox.addItem(dni);
            }
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los DNIs: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        DardeBajaComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        DardeBajaJButton = new Vista.Elementos.MyButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel2.setkEndColor(new java.awt.Color(46, 224, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(17, 37, 190));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DardeBajaComboBox.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        DardeBajaComboBox.setBorder(null);
        kGradientPanel2.add(DardeBajaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 240, 46));

        jLabel3.setFont(new java.awt.Font("Mensura 6", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dar de baja");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 400, 55));

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
        kGradientPanel2.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 40));

        DardeBajaJButton.setBackground(new java.awt.Color(17, 37, 190));
        DardeBajaJButton.setForeground(new java.awt.Color(255, 255, 255));
        DardeBajaJButton.setText("Eliminar");
        DardeBajaJButton.setBorderColor(new java.awt.Color(17, 37, 190));
        DardeBajaJButton.setColor(new java.awt.Color(17, 37, 190));
        DardeBajaJButton.setColorClick(new java.awt.Color(4, 54, 217));
        DardeBajaJButton.setColorOver(new java.awt.Color(4, 54, 217));
        DardeBajaJButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DardeBajaJButton.setRadius(30);
        DardeBajaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DardeBajaJButtonActionPerformed(evt);
            }
        });
        kGradientPanel2.add(DardeBajaJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 190, 50));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elige la persona que deseas dar de baja");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 410, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CerrarMouseClicked

    private void DardeBajaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DardeBajaJButtonActionPerformed
        String DNI = DardeBajaComboBox.getSelectedItem().toString();
        try {
            darDeBaja(DNI);
            JOptionPane.showMessageDialog(this, "Persona dada de baja correctamente.", "Persona dada de baja", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, "Error al dar de baja a la persona: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DardeBajaJButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DardeBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DardeBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DardeBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DardeBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DardeBaja dialog;
                dialog = new DardeBaja(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> DardeBajaComboBox;
    private Vista.Elementos.MyButton DardeBajaJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
