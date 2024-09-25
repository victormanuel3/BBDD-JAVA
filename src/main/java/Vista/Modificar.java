package Vista;

import static ControladorPersonas.ControladorPersonas.ObtenerDNIS;
import static ControladorPersonas.ControladorPersonas.mostrar;
import Excepciones.SQLPersonasException;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Modificar extends javax.swing.JDialog {

    public Modificar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            ArrayList<String> dnis = ObtenerDNIS();
            for (String dni : dnis) {
                IdentificarComboBox.addItem(dni);
            }
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los DNIs: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //IdentificarComboBox.addItem(p.getDNI());
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        IdentificarComboBox = new javax.swing.JComboBox<>();
        jLabel = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        ModificarJButton = new Vista.Elementos.MyButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel2.setkEndColor(new java.awt.Color(46, 224, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(17, 37, 190));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IdentificarComboBox.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        IdentificarComboBox.setBorder(null);
        kGradientPanel2.add(IdentificarComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 240, 46));

        jLabel.setFont(new java.awt.Font("Mensura 6", 0, 40)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Modificar");
        kGradientPanel2.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 400, 55));

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

        ModificarJButton.setBackground(new java.awt.Color(17, 37, 190));
        ModificarJButton.setForeground(new java.awt.Color(255, 255, 255));
        ModificarJButton.setText("Modificar");
        ModificarJButton.setBorderColor(new java.awt.Color(17, 37, 190));
        ModificarJButton.setColor(new java.awt.Color(17, 37, 190));
        ModificarJButton.setColorClick(new java.awt.Color(4, 54, 217));
        ModificarJButton.setColorOver(new java.awt.Color(4, 54, 217));
        ModificarJButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ModificarJButton.setRadius(30);
        ModificarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarJButtonActionPerformed(evt);
            }
        });
        kGradientPanel2.add(ModificarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 190, 50));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elige la persona que deseas modificar");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 410, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CerrarMouseClicked

    private void ModificarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarJButtonActionPerformed
        Persona p;
        String DNI = IdentificarComboBox.getSelectedItem().toString();
        try {
            p = mostrar(new Persona(DNI));
            if (p instanceof Cliente) {
                ModificarCliente mc = new ModificarCliente(this, true);
                mc.setPersona(p);
                mc.setLocationRelativeTo(null);
                mc.setVisible(true);
                dispose();
            } else if (p instanceof Empleado) {
                ModificarEmpleado me = new ModificarEmpleado(this, true);
                me.setPersona(p);
                me.setLocationRelativeTo(null);
                me.setVisible(true);
                dispose();
            }
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, "Error al obtener la persona en el modificar " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ModificarJButtonActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modificar dialog = new Modificar(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> IdentificarComboBox;
    private Vista.Elementos.MyButton ModificarJButton;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
