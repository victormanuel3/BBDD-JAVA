package Vista;

import static ControladorPersonas.ControladorPersonas.ObtenerDNIS;
import Excepciones.SQLPersonasException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DardebajakButton = new Vista.Elementos.KButton();
        Cerrar = new javax.swing.JLabel();
        BuscarkButton = new Vista.Elementos.KButton();
        ModificarkButton = new Vista.Elementos.KButton();
        MostrarkButton = new Vista.Elementos.KButton();
        jLabel4 = new javax.swing.JLabel();
        DardeAltakButton1 = new Vista.Elementos.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DardebajakButton.setText("Dar de baja");
        DardebajakButton.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        DardebajakButton.setkBorderRadius(39);
        DardebajakButton.setkEndColor(new java.awt.Color(46, 224, 255));
        DardebajakButton.setkHoverEndColor(new java.awt.Color(7, 2, 255));
        DardebajakButton.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        DardebajakButton.setkHoverStartColor(new java.awt.Color(51, 51, 255));
        DardebajakButton.setkPressedColor(new java.awt.Color(0, 178, 255));
        DardebajakButton.setkStartColor(new java.awt.Color(51, 51, 255));
        DardebajakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DardebajakButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DardebajakButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 225, 54));

        Cerrar.setBackground(new java.awt.Color(0, 0, 255));
        Cerrar.setFont(new java.awt.Font("Tuerca Black Italic", 1, 24)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(204, 204, 204));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 50, 50));

        BuscarkButton.setText("Buscar");
        BuscarkButton.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        BuscarkButton.setkBorderRadius(39);
        BuscarkButton.setkEndColor(new java.awt.Color(46, 224, 255));
        BuscarkButton.setkHoverEndColor(new java.awt.Color(7, 2, 255));
        BuscarkButton.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        BuscarkButton.setkHoverStartColor(new java.awt.Color(51, 51, 255));
        BuscarkButton.setkPressedColor(new java.awt.Color(0, 178, 255));
        BuscarkButton.setkStartColor(new java.awt.Color(51, 51, 255));
        BuscarkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarkButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 225, 54));

        ModificarkButton.setText("Modificar");
        ModificarkButton.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        ModificarkButton.setkBorderRadius(39);
        ModificarkButton.setkEndColor(new java.awt.Color(46, 224, 255));
        ModificarkButton.setkHoverEndColor(new java.awt.Color(7, 2, 255));
        ModificarkButton.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        ModificarkButton.setkHoverStartColor(new java.awt.Color(51, 51, 255));
        ModificarkButton.setkPressedColor(new java.awt.Color(0, 178, 255));
        ModificarkButton.setkStartColor(new java.awt.Color(51, 51, 255));
        ModificarkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarkButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ModificarkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 225, 54));

        MostrarkButton.setText("Mostrar");
        MostrarkButton.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        MostrarkButton.setkBorderRadius(39);
        MostrarkButton.setkEndColor(new java.awt.Color(46, 224, 255));
        MostrarkButton.setkHoverEndColor(new java.awt.Color(7, 2, 255));
        MostrarkButton.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        MostrarkButton.setkHoverStartColor(new java.awt.Color(51, 51, 255));
        MostrarkButton.setkPressedColor(new java.awt.Color(0, 178, 255));
        MostrarkButton.setkStartColor(new java.awt.Color(51, 51, 255));
        MostrarkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarkButtonActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 225, 54));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Mensura 7", 0, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Menú personas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 360, 60));

        DardeAltakButton1.setText("Dar de alta");
        DardeAltakButton1.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        DardeAltakButton1.setkBorderRadius(39);
        DardeAltakButton1.setkEndColor(new java.awt.Color(46, 224, 255));
        DardeAltakButton1.setkHoverEndColor(new java.awt.Color(7, 2, 255));
        DardeAltakButton1.setkHoverForeGround(new java.awt.Color(204, 255, 255));
        DardeAltakButton1.setkHoverStartColor(new java.awt.Color(51, 51, 255));
        DardeAltakButton1.setkPressedColor(new java.awt.Color(0, 178, 255));
        DardeAltakButton1.setkStartColor(new java.awt.Color(51, 51, 255));
        DardeAltakButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DardeAltakButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(DardeAltakButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 225, 54));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DardebajakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DardebajakButtonActionPerformed
        try {
            ArrayList<String> dnis = ObtenerDNIS();
            if (dnis.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay personas registradas", "No hay registros", JOptionPane.INFORMATION_MESSAGE);
            } else {
                DardeBaja b = new DardeBaja(this, true);
                b.setLocationRelativeTo(null);
                b.setVisible(true);
            }
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al obtener los datos.", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_DardebajakButtonActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_CerrarMouseClicked

    private void BuscarkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarkButtonActionPerformed
        try {
            ArrayList<String> dnis = ObtenerDNIS();
            if (dnis.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay personas registradas", "No hay registros", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Buscar u = new Buscar(this, true);
                u.setLocationRelativeTo(null);
                u.setVisible(true);
            }
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al obtener los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BuscarkButtonActionPerformed

    private void ModificarkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarkButtonActionPerformed
        try {
            ArrayList<String> dnis = ObtenerDNIS();
            if (dnis.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay personas registradas", "No hay registros", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Modificar m = new Modificar(this, true);
                m.setLocationRelativeTo(null);
                m.setVisible(true);
            }
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al obtener los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ModificarkButtonActionPerformed

    private void MostrarkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarkButtonActionPerformed
        try {
            ArrayList<String> dnis = ObtenerDNIS();
            if (dnis.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay personas registradas", "No hay registros", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Mostrar m = new Mostrar(this, true);
                m.setLocationRelativeTo(null);
                m.setVisible(true);
            }
        } catch (SQLPersonasException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al obtener los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_MostrarkButtonActionPerformed

    private void DardeAltakButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DardeAltakButton1ActionPerformed
        AltaPersona a = new AltaPersona(this, true);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }//GEN-LAST:event_DardeAltakButton1ActionPerformed

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.Elementos.KButton BuscarkButton;
    private javax.swing.JLabel Cerrar;
    private Vista.Elementos.KButton DardeAltakButton1;
    private Vista.Elementos.KButton DardebajakButton;
    private Vista.Elementos.KButton ModificarkButton;
    private Vista.Elementos.KButton MostrarkButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
