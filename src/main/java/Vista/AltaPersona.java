package Vista;

import static ControladorPersonas.ControladorPersonas.darDeAlta;
import Excepciones.PersonaException;
import Excepciones.SQLPersonasException;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Persona;
import Modelo.Vehiculo;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class AltaPersona extends javax.swing.JDialog {

    private Vehiculo vCliente = null;
    private Vehiculo vEmpleado = null;

    public AltaPersona(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EmpresarioJButton = new Vista.ButtonGradient();
        ClienteJButton = new Vista.ButtonGradient();
        jLabel8 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jTabbedPanel = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        DNIEmpleadoTextField = new Vista.Elementos.TextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        NombreEmpleadoTextField = new Vista.Elementos.TextField();
        DireccionEmpleadoTextField = new Vista.Elementos.TextField();
        IDEmpleadoTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        GeneroEmpleadoJComboBox = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        SueldoEmpleadoJSpinner = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        EdadEmpleadoJSpinner = new javax.swing.JSpinner();
        AgregarVehiculoEmpleadoJButton = new Vista.Elementos.MyButton();
        DardeAltaEmpleadokButton = new Vista.Elementos.KButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        EdadClienteJSpinner = new javax.swing.JSpinner();
        GeneroClienteJComboBox = new javax.swing.JComboBox<>();
        IDClienteTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DNIClienteTextField = new Vista.Elementos.TextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DireccionClienteTextField = new Vista.Elementos.TextField();
        jLabel15 = new javax.swing.JLabel();
        NombreClienteTextField = new Vista.Elementos.TextField();
        jLabel16 = new javax.swing.JLabel();
        AgregarVehiculoClienteJButton = new Vista.Elementos.MyButton();
        jRadioButton1 = new Vista.Elementos.RadioButtonCustom();
        jRadioButton2 = new Vista.Elementos.RadioButtonCustom();
        DardeAltaClientekButton = new Vista.Elementos.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel4.setkEndColor(new java.awt.Color(46, 224, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(17, 37, 190));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Mensura 6", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("persona");
        kGradientPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 310, 46));

        jLabel2.setFont(new java.awt.Font("Mensura 6", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar");
        kGradientPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 310, 55));

        EmpresarioJButton.setForeground(new java.awt.Color(0, 0, 153));
        EmpresarioJButton.setText("Empresario");
        EmpresarioJButton.setColor1(new java.awt.Color(46, 224, 255));
        EmpresarioJButton.setColor2(new java.awt.Color(51, 51, 255));
        EmpresarioJButton.setFont(new java.awt.Font("Mensura 6", 0, 22)); // NOI18N
        EmpresarioJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresarioJButtonActionPerformed(evt);
            }
        });
        kGradientPanel4.add(EmpresarioJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 203, 57));

        ClienteJButton.setForeground(new java.awt.Color(0, 0, 153));
        ClienteJButton.setText("Cliente");
        ClienteJButton.setColor1(new java.awt.Color(46, 224, 255));
        ClienteJButton.setColor2(new java.awt.Color(51, 51, 255));
        ClienteJButton.setFont(new java.awt.Font("Mensura 6", 0, 22)); // NOI18N
        ClienteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteJButtonActionPerformed(evt);
            }
        });
        kGradientPanel4.add(ClienteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 204, 53));
        kGradientPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 151, 11, 1));

        jPanel1.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 570));

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
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 0, 50, 50));

        jTabbedPanel.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Mensura 6", 0, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 37, 190));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Empleado");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 650, 50));

        DNIEmpleadoTextField.setForeground(new java.awt.Color(153, 153, 153));
        DNIEmpleadoTextField.setText("DNI");
        DNIEmpleadoTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        DNIEmpleadoTextField.setRound(30);
        DNIEmpleadoTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        DNIEmpleadoTextField.setSelectionColor(new java.awt.Color(0, 153, 255));
        DNIEmpleadoTextField.setShadowColor(new java.awt.Color(0, 153, 255));
        DNIEmpleadoTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DNIEmpleadoTextFieldMouseClicked(evt);
            }
        });
        DNIEmpleadoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DNIEmpleadoTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DNIEmpleadoTextFieldKeyTyped(evt);
            }
        });
        jPanel4.add(DNIEmpleadoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 320, 60));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Introduce 8 números la letra será añadida");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 310, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("automáticamente.");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 290, 30));

        NombreEmpleadoTextField.setForeground(new java.awt.Color(153, 153, 153));
        NombreEmpleadoTextField.setText("Nombre");
        NombreEmpleadoTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        NombreEmpleadoTextField.setRound(30);
        NombreEmpleadoTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        NombreEmpleadoTextField.setSelectionColor(new java.awt.Color(0, 204, 255));
        NombreEmpleadoTextField.setShadowColor(new java.awt.Color(0, 153, 255));
        NombreEmpleadoTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreEmpleadoTextFieldMouseClicked(evt);
            }
        });
        NombreEmpleadoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NombreEmpleadoTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreEmpleadoTextFieldKeyTyped(evt);
            }
        });
        jPanel4.add(NombreEmpleadoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 320, 60));

        DireccionEmpleadoTextField.setForeground(new java.awt.Color(153, 153, 153));
        DireccionEmpleadoTextField.setText("Direccion");
        DireccionEmpleadoTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        DireccionEmpleadoTextField.setRound(30);
        DireccionEmpleadoTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        DireccionEmpleadoTextField.setSelectionColor(new java.awt.Color(0, 153, 255));
        DireccionEmpleadoTextField.setShadowColor(new java.awt.Color(0, 153, 255));
        DireccionEmpleadoTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DireccionEmpleadoTextFieldMouseClicked(evt);
            }
        });
        DireccionEmpleadoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DireccionEmpleadoTextFieldKeyTyped(evt);
            }
        });
        jPanel4.add(DireccionEmpleadoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 320, 60));

        IDEmpleadoTextField.setBackground(new java.awt.Color(255, 255, 255));
        IDEmpleadoTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        IDEmpleadoTextField.setForeground(new java.awt.Color(153, 153, 153));
        IDEmpleadoTextField.setText("    ID Empleado");
        IDEmpleadoTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(194, 231, 255)));
        IDEmpleadoTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDEmpleadoTextFieldMouseClicked(evt);
            }
        });
        IDEmpleadoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDEmpleadoTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDEmpleadoTextFieldKeyTyped(evt);
            }
        });
        jPanel4.add(IDEmpleadoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 300, 46));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Solo puedes introducir 3 números.");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 290, 30));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Género");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 130, 30));

        GeneroEmpleadoJComboBox.setBackground(new java.awt.Color(241, 241, 241));
        GeneroEmpleadoJComboBox.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        GeneroEmpleadoJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        GeneroEmpleadoJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        GeneroEmpleadoJComboBox.setBorder(null);
        jPanel4.add(GeneroEmpleadoJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 190, 40));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Sueldo");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 80, -1));

        SueldoEmpleadoJSpinner.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        SueldoEmpleadoJSpinner.setModel(new javax.swing.SpinnerNumberModel(600, 600, 3500, 1));
        SueldoEmpleadoJSpinner.setBorder(null);
        jPanel4.add(SueldoEmpleadoJSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 190, 45));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Edad");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        EdadEmpleadoJSpinner.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EdadEmpleadoJSpinner.setModel(new javax.swing.SpinnerNumberModel(18, 18, 90, 1));
        EdadEmpleadoJSpinner.setBorder(null);
        jPanel4.add(EdadEmpleadoJSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 190, 45));

        AgregarVehiculoEmpleadoJButton.setBackground(new java.awt.Color(204, 204, 204));
        AgregarVehiculoEmpleadoJButton.setForeground(new java.awt.Color(102, 102, 102));
        AgregarVehiculoEmpleadoJButton.setText("Agregar vehículo");
        AgregarVehiculoEmpleadoJButton.setBorderColor(new java.awt.Color(204, 204, 204));
        AgregarVehiculoEmpleadoJButton.setColor(new java.awt.Color(204, 204, 204));
        AgregarVehiculoEmpleadoJButton.setColorClick(new java.awt.Color(234, 234, 234));
        AgregarVehiculoEmpleadoJButton.setColorOver(new java.awt.Color(234, 234, 234));
        AgregarVehiculoEmpleadoJButton.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        AgregarVehiculoEmpleadoJButton.setRadius(30);
        AgregarVehiculoEmpleadoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVehiculoEmpleadoJButtonActionPerformed(evt);
            }
        });
        jPanel4.add(AgregarVehiculoEmpleadoJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 190, 40));

        DardeAltaEmpleadokButton.setText("Registrar");
        DardeAltaEmpleadokButton.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        DardeAltaEmpleadokButton.setkBorderRadius(39);
        DardeAltaEmpleadokButton.setkEndColor(new java.awt.Color(17, 37, 190));
        DardeAltaEmpleadokButton.setkHoverEndColor(new java.awt.Color(7, 2, 255));
        DardeAltaEmpleadokButton.setkHoverForeGround(new java.awt.Color(204, 255, 255));
        DardeAltaEmpleadokButton.setkHoverStartColor(new java.awt.Color(51, 51, 255));
        DardeAltaEmpleadokButton.setkPressedColor(new java.awt.Color(0, 178, 255));
        DardeAltaEmpleadokButton.setkStartColor(new java.awt.Color(0, 102, 255));
        DardeAltaEmpleadokButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DardeAltaEmpleadokButtonActionPerformed(evt);
            }
        });
        jPanel4.add(DardeAltaEmpleadokButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 210, 50));

        jTabbedPanel.addTab("tab2", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Mensura 6", 0, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 37, 190));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cliente");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 650, -1));

        EdadClienteJSpinner.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EdadClienteJSpinner.setModel(new javax.swing.SpinnerNumberModel(18, 18, 90, 1));
        EdadClienteJSpinner.setBorder(null);
        jPanel2.add(EdadClienteJSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 190, 45));

        GeneroClienteJComboBox.setBackground(new java.awt.Color(241, 241, 241));
        GeneroClienteJComboBox.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        GeneroClienteJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        GeneroClienteJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        GeneroClienteJComboBox.setBorder(null);
        jPanel2.add(GeneroClienteJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 190, 40));

        IDClienteTextField.setBackground(new java.awt.Color(255, 255, 255));
        IDClienteTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        IDClienteTextField.setForeground(new java.awt.Color(153, 153, 153));
        IDClienteTextField.setText("    ID Cliente");
        IDClienteTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(194, 231, 255)));
        IDClienteTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDClienteTextFieldMouseClicked(evt);
            }
        });
        IDClienteTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDClienteTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDClienteTextFieldKeyTyped(evt);
            }
        });
        jPanel2.add(IDClienteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 300, 46));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("¿Es vip?");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 190, -1));

        DNIClienteTextField.setForeground(new java.awt.Color(153, 153, 153));
        DNIClienteTextField.setText("DNI");
        DNIClienteTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        DNIClienteTextField.setRound(30);
        DNIClienteTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        DNIClienteTextField.setSelectionColor(new java.awt.Color(0, 153, 255));
        DNIClienteTextField.setShadowColor(new java.awt.Color(0, 153, 255));
        DNIClienteTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DNIClienteTextFieldMouseClicked(evt);
            }
        });
        DNIClienteTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DNIClienteTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DNIClienteTextFieldKeyTyped(evt);
            }
        });
        jPanel2.add(DNIClienteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 320, 60));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("automáticamente.");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 290, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Edad");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Género");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 130, 30));

        DireccionClienteTextField.setForeground(new java.awt.Color(153, 153, 153));
        DireccionClienteTextField.setText("Direccion");
        DireccionClienteTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        DireccionClienteTextField.setRound(30);
        DireccionClienteTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        DireccionClienteTextField.setSelectionColor(new java.awt.Color(0, 153, 255));
        DireccionClienteTextField.setShadowColor(new java.awt.Color(0, 153, 255));
        DireccionClienteTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DireccionClienteTextFieldMouseClicked(evt);
            }
        });
        DireccionClienteTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DireccionClienteTextFieldKeyTyped(evt);
            }
        });
        jPanel2.add(DireccionClienteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 320, 60));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Solo puedes introducir 3 números.");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 290, 30));

        NombreClienteTextField.setForeground(new java.awt.Color(153, 153, 153));
        NombreClienteTextField.setText("Nombre");
        NombreClienteTextField.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        NombreClienteTextField.setRound(30);
        NombreClienteTextField.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        NombreClienteTextField.setSelectionColor(new java.awt.Color(0, 204, 255));
        NombreClienteTextField.setShadowColor(new java.awt.Color(0, 153, 255));
        NombreClienteTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreClienteTextFieldMouseClicked(evt);
            }
        });
        NombreClienteTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NombreClienteTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreClienteTextFieldKeyTyped(evt);
            }
        });
        jPanel2.add(NombreClienteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 320, 60));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Introduce 8 números la letra será añadida");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 310, 30));

        AgregarVehiculoClienteJButton.setBackground(new java.awt.Color(204, 204, 204));
        AgregarVehiculoClienteJButton.setForeground(new java.awt.Color(102, 102, 102));
        AgregarVehiculoClienteJButton.setText("Agregar vehículo");
        AgregarVehiculoClienteJButton.setBorderColor(new java.awt.Color(204, 204, 204));
        AgregarVehiculoClienteJButton.setColor(new java.awt.Color(204, 204, 204));
        AgregarVehiculoClienteJButton.setColorClick(new java.awt.Color(234, 234, 234));
        AgregarVehiculoClienteJButton.setColorOver(new java.awt.Color(234, 234, 234));
        AgregarVehiculoClienteJButton.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        AgregarVehiculoClienteJButton.setRadius(30);
        AgregarVehiculoClienteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVehiculoClienteJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AgregarVehiculoClienteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 190, 40));

        jRadioButton1.setBackground(new java.awt.Color(0, 51, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Sí");
        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 51, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");
        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        DardeAltaClientekButton.setText("Registrar");
        DardeAltaClientekButton.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        DardeAltaClientekButton.setkBorderRadius(39);
        DardeAltaClientekButton.setkEndColor(new java.awt.Color(17, 37, 190));
        DardeAltaClientekButton.setkHoverEndColor(new java.awt.Color(7, 2, 255));
        DardeAltaClientekButton.setkHoverForeGround(new java.awt.Color(204, 255, 255));
        DardeAltaClientekButton.setkHoverStartColor(new java.awt.Color(51, 51, 255));
        DardeAltaClientekButton.setkPressedColor(new java.awt.Color(0, 178, 255));
        DardeAltaClientekButton.setkStartColor(new java.awt.Color(0, 102, 255));
        DardeAltaClientekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DardeAltaClientekButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DardeAltaClientekButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 210, 50));

        jTabbedPanel.addTab("tab1", jPanel2);

        jPanel1.add(jTabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -30, 670, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmpresarioJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresarioJButtonActionPerformed
        jTabbedPanel.setSelectedIndex(0);
    }//GEN-LAST:event_EmpresarioJButtonActionPerformed

    private void ClienteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteJButtonActionPerformed
        jTabbedPanel.setSelectedIndex(1);
    }//GEN-LAST:event_ClienteJButtonActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CerrarMouseClicked

    public static boolean verificacionNumerosDNI(String DNI) {
        for (int i = 0; i < DNI.length(); i++) {
            if (Character.isLetter(DNI.charAt(i))) {
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

    public static boolean EspacioEnBlanco(String ID) {
        for (int i = 0; i < ID.length(); i++) {
            if (Character.isWhitespace(ID.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneLetra(String ID) {
        for (int i = 0; i < ID.length(); i++) {
            if (Character.isLetter(ID.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private void IDClienteTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDClienteTextFieldKeyReleased
        if (contieneLetra(IDClienteTextField.getText())) {
            JOptionPane.showMessageDialog(this, "No se permiten letras en este campo.", "Error de formato", JOptionPane.WARNING_MESSAGE);
            IDClienteTextField.setText("");
        }
    }//GEN-LAST:event_IDClienteTextFieldKeyReleased

    private void IDClienteTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDClienteTextFieldKeyTyped
        if (IDClienteTextField.getText().length() >= 3) {
            JOptionPane.showMessageDialog(this, "Solo puedes introducir 3 números.", "Error de formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(this, "No puedes dejar espacios en blanco.", "Error en formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_IDClienteTextFieldKeyTyped

    private void IDEmpleadoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDEmpleadoTextFieldKeyReleased
        if (contieneLetra(IDEmpleadoTextField.getText())) {
            JOptionPane.showMessageDialog(this, "No se permiten letras en este campo.", "Error de formato", JOptionPane.WARNING_MESSAGE);
            IDEmpleadoTextField.setText("");
        }
    }//GEN-LAST:event_IDEmpleadoTextFieldKeyReleased

    private void IDEmpleadoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDEmpleadoTextFieldKeyTyped
        if (IDEmpleadoTextField.getText().length() >= 3) {
            JOptionPane.showMessageDialog(this, "Solo puedes introducir 3 números.", "Error de formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(this, "No puedes dejar espacios en blanco.", "Error en formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_IDEmpleadoTextFieldKeyTyped

    private void DNIClienteTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNIClienteTextFieldKeyReleased
        String DNI = DNIClienteTextField.getText();
        String letra;
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        if (contieneLetra(DNIClienteTextField.getText())) {
            JOptionPane.showMessageDialog(this, "No puedes introducir letras en este campo", "Error en DNI", JOptionPane.WARNING_MESSAGE);
            DNIClienteTextField.setText("");
        }
        if (DNI.length() == 8) {
            int casteo = Integer.parseInt(DNI);
            letra = Character.toString(letras[casteo % 23]);
            DNIClienteTextField.setText(DNI + letra);
            DNIClienteTextField.setEnabled(false);
        }
    }//GEN-LAST:event_DNIClienteTextFieldKeyReleased

    private void DNIEmpleadoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNIEmpleadoTextFieldKeyReleased
        String DNI = DNIEmpleadoTextField.getText();
        String letra;
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        if (contieneLetra(DNIEmpleadoTextField.getText())) {
            JOptionPane.showMessageDialog(this, "No puedes introducir letras en este campo.", "Error en DNI", JOptionPane.WARNING_MESSAGE);
            DNIEmpleadoTextField.setText("");
        }
        if (DNI.length() == 8) {
            int casteo = Integer.parseInt(DNI);
            letra = Character.toString(letras[casteo % 23]);
            DNIEmpleadoTextField.setText(DNI + letra);
            DNIEmpleadoTextField.setEnabled(false);
        }
    }//GEN-LAST:event_DNIEmpleadoTextFieldKeyReleased

    private void AgregarVehiculoEmpleadoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVehiculoEmpleadoJButtonActionPerformed
        AñadirVehiculo añadirVehiculoForm = new AñadirVehiculo(this, true);
        añadirVehiculoForm.setVisible(true);
        vEmpleado = añadirVehiculoForm.getVehiculo();
    }//GEN-LAST:event_AgregarVehiculoEmpleadoJButtonActionPerformed

    private void AgregarVehiculoClienteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVehiculoClienteJButtonActionPerformed
        AñadirVehiculo añadirVehiculoForm = new AñadirVehiculo(this, true);
        añadirVehiculoForm.setVisible(true);
        vCliente = añadirVehiculoForm.getVehiculo();
    }//GEN-LAST:event_AgregarVehiculoClienteJButtonActionPerformed

    private boolean primerClickDNICliente = true;
    private boolean primerClickDNIEmpleado = true;

    private void DNIClienteTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DNIClienteTextFieldMouseClicked
        if (primerClickDNICliente) {
            DNIClienteTextField.setText("");
            DNIClienteTextField.setForeground(Color.BLACK);
            primerClickDNICliente = false;
        }

    }//GEN-LAST:event_DNIClienteTextFieldMouseClicked

    private void DNIEmpleadoTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DNIEmpleadoTextFieldMouseClicked
        if (primerClickDNIEmpleado) {
            DNIEmpleadoTextField.setText("");
            DNIEmpleadoTextField.setForeground(Color.BLACK);
            primerClickDNIEmpleado = false;
        }

    }//GEN-LAST:event_DNIEmpleadoTextFieldMouseClicked

    private boolean primerClickNombreCliente = true;
    private boolean primerClickNombreEmpleado = true;

    private void NombreEmpleadoTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreEmpleadoTextFieldMouseClicked
        if (primerClickNombreEmpleado) {
            NombreEmpleadoTextField.setText("");
            NombreEmpleadoTextField.setForeground(Color.BLACK);
            primerClickNombreEmpleado = false;
        }
    }//GEN-LAST:event_NombreEmpleadoTextFieldMouseClicked

    private void NombreClienteTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreClienteTextFieldMouseClicked
        if (primerClickNombreCliente) {
            NombreClienteTextField.setText("");
            NombreClienteTextField.setForeground(Color.BLACK);
            primerClickNombreCliente = false;
        }
    }//GEN-LAST:event_NombreClienteTextFieldMouseClicked

    private boolean primerClickDireccionCliente = true;
    private boolean primerClickDireccionEmpleado = true;

    private void DireccionClienteTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DireccionClienteTextFieldMouseClicked
        if (primerClickDireccionCliente) {
            DireccionClienteTextField.setText("");
            DireccionClienteTextField.setForeground(Color.BLACK);
            primerClickDireccionCliente = false;
        }
    }//GEN-LAST:event_DireccionClienteTextFieldMouseClicked

    private boolean primerClickIDClienteCliente = true;
    private boolean primerClickIDClienteEmpleado = true;

    private void IDClienteTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDClienteTextFieldMouseClicked
        if (primerClickIDClienteCliente) {
            IDClienteTextField.setText("");
            IDClienteTextField.setForeground(Color.BLACK);
            primerClickIDClienteCliente = false;
        }
    }//GEN-LAST:event_IDClienteTextFieldMouseClicked

    private void DireccionEmpleadoTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DireccionEmpleadoTextFieldMouseClicked
        if (primerClickDireccionEmpleado) {
            DireccionEmpleadoTextField.setText("");
            DireccionEmpleadoTextField.setForeground(Color.BLACK);
            primerClickDireccionEmpleado = false;
        }
    }//GEN-LAST:event_DireccionEmpleadoTextFieldMouseClicked

    private void IDEmpleadoTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDEmpleadoTextFieldMouseClicked
        if (primerClickIDClienteEmpleado) {
            IDEmpleadoTextField.setText("");
            IDEmpleadoTextField.setForeground(Color.BLACK);
            primerClickIDClienteEmpleado = false;
        }
    }//GEN-LAST:event_IDEmpleadoTextFieldMouseClicked

    private void NombreEmpleadoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreEmpleadoTextFieldKeyReleased
        if (contieneNumero(NombreEmpleadoTextField.getText())) {
            JOptionPane.showMessageDialog(this, "No puedes introducir números en el nombre.", "Error en nombre", JOptionPane.WARNING_MESSAGE);
            NombreEmpleadoTextField.setText("");
        }
    }//GEN-LAST:event_NombreEmpleadoTextFieldKeyReleased

    private void NombreClienteTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreClienteTextFieldKeyReleased
        if (contieneNumero(NombreClienteTextField.getText())) {
            JOptionPane.showMessageDialog(this, "No puedes introducir números en el nombre.", "Error en nombre", JOptionPane.WARNING_MESSAGE);
            NombreClienteTextField.setText("");
        }
    }//GEN-LAST:event_NombreClienteTextFieldKeyReleased

    private void DNIClienteTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNIClienteTextFieldKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(this, "No puedes dejar espacios en blanco.", "Error en formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_DNIClienteTextFieldKeyTyped

    private void DNIEmpleadoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNIEmpleadoTextFieldKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(this, "No puedes dejar espacios en blanco.", "Error en formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_DNIEmpleadoTextFieldKeyTyped

    private void NombreEmpleadoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreEmpleadoTextFieldKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(this, "No puedes dejar espacios en blanco.", "Error en formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_NombreEmpleadoTextFieldKeyTyped

    private void NombreClienteTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreClienteTextFieldKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(this, "No puedes dejar espacios en blanco.", "Error en formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_NombreClienteTextFieldKeyTyped

    private void DireccionClienteTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DireccionClienteTextFieldKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(this, "No puedes dejar espacios en blanco.", "Error en formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_DireccionClienteTextFieldKeyTyped

    private void DireccionEmpleadoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DireccionEmpleadoTextFieldKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(this, "No puedes dejar espacios en blanco.", "Error en formato", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_DireccionEmpleadoTextFieldKeyTyped

    private void DardeAltaClientekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DardeAltaClientekButtonActionPerformed
        String DNI = DNIClienteTextField.getText();
        String Nombre = NombreClienteTextField.getText();
        String Direccion = DireccionClienteTextField.getText();
        String IDCliente = IDClienteTextField.getText();
        int Edad = (int) EdadClienteJSpinner.getValue();
        char Genero = GeneroClienteJComboBox.getSelectedItem().toString().toUpperCase().charAt(0);
        LocalDate fecharegistro = LocalDate.now();
        boolean VIP = false;
        Vehiculo vehiculo = vCliente;

        if (DNI.isEmpty() || Nombre.isEmpty() || Direccion.isEmpty() || IDCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se puede dejar campos en blanco.", "Datos vacíos", JOptionPane.WARNING_MESSAGE);
        } else {
            if (DNI.length() != 9) {
                JOptionPane.showMessageDialog(this, "El formato del DNI es inválido.", "Error en DNI", JOptionPane.WARNING_MESSAGE);
                DNIClienteTextField.setText("");
            } else if (IDCliente.length() != 3) {
                JOptionPane.showMessageDialog(this, "El formato del identificador del cliente es inválido.", "Error de identificador.", JOptionPane.WARNING_MESSAGE);
                IDClienteTextField.setText("");
            } else {
                // --------------------------------------------------------------
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
                // --------------------------------------------------------------
                int ID;
                try {
                    ID = Integer.parseInt(IDCliente.trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "El ID del cliente debe ser un número válido.", "Error en ID", JOptionPane.WARNING_MESSAGE);
                    IDClienteTextField.setText("");
                    return;
                }

                if (confirm) {
                    Persona p = new Cliente(ID, fecharegistro, VIP, DNI, Nombre, Genero, Edad, Direccion, vehiculo);
                    try {
                        if (vehiculo != null) {
                            p.setV(vehiculo);
                        }
                        darDeAlta(p);
                        JOptionPane.showMessageDialog(this, "Usuario registrado.", "Usuario registrado", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    } catch (PersonaException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error en alta", JOptionPane.ERROR_MESSAGE);
                        DNIClienteTextField.setText("");
                        DNIClienteTextField.setEnabled(true);
                    } catch (SQLPersonasException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error en alta por base de datos.", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_DardeAltaClientekButtonActionPerformed

    private void DardeAltaEmpleadokButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DardeAltaEmpleadokButtonActionPerformed
        String DNI = DNIEmpleadoTextField.getText();
        String Nombre = NombreEmpleadoTextField.getText();
        String Direccion = DireccionEmpleadoTextField.getText();
        String IDEmpleado = IDEmpleadoTextField.getText();
        int Edad = (int) EdadEmpleadoJSpinner.getValue();
        char Genero = GeneroEmpleadoJComboBox.getSelectedItem().toString().toUpperCase().charAt(0);
        double Sueldo = ((Integer) SueldoEmpleadoJSpinner.getValue()).doubleValue();
        Vehiculo vehiculo = vEmpleado;

        if (DNI.isEmpty() || Nombre.isEmpty() || Direccion.isEmpty() || IDEmpleado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se puede dejar campos en blanco.", "Datos vacíos", JOptionPane.WARNING_MESSAGE);
        } else {
            if (DNI.length() != 9) {
                JOptionPane.showMessageDialog(this, "El formato del DNI es inválido.", "Error en DNI", JOptionPane.WARNING_MESSAGE);
                DNIEmpleadoTextField.setText("");
            } else if (IDEmpleado.length() != 3) {
                JOptionPane.showMessageDialog(this, "El formato del identificador del empleado es inválido.", "Error de identificador.", JOptionPane.WARNING_MESSAGE);
                IDEmpleadoTextField.setText("");
            } else {
                // --------------------------------------------------------------
                int ID;
                try {
                    ID = Integer.parseInt(IDEmpleado.trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "El ID del empleado debe ser un número válido.", "Error en ID", JOptionPane.WARNING_MESSAGE);
                    IDEmpleadoTextField.setText("");
                    return;
                }
                // --------------------------------------------------------------
                Persona p = new Empleado(ID, Sueldo, DNI, Nombre, Genero, Edad, Direccion, vehiculo);
                try {
                    if (vehiculo != null) {
                        p.setV(vehiculo);
                    }
                    darDeAlta(p);
                    JOptionPane.showMessageDialog(this, "Usuario registrado.", "Usuario registrado", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } catch (PersonaException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error en alta", JOptionPane.ERROR_MESSAGE);
                    DNIEmpleadoTextField.setText("");
                    DNIEmpleadoTextField.setEnabled(true);
                } catch (SQLPersonasException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error en alta por base de datos.", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_DardeAltaEmpleadokButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AltaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AltaPersona dialog = new AltaPersona(new javax.swing.JFrame(), true);
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
    private Vista.Elementos.MyButton AgregarVehiculoClienteJButton;
    private Vista.Elementos.MyButton AgregarVehiculoEmpleadoJButton;
    private javax.swing.JLabel Cerrar;
    private Vista.ButtonGradient ClienteJButton;
    private Vista.Elementos.TextField DNIClienteTextField;
    private Vista.Elementos.TextField DNIEmpleadoTextField;
    private Vista.Elementos.KButton DardeAltaClientekButton;
    private Vista.Elementos.KButton DardeAltaEmpleadokButton;
    private Vista.Elementos.TextField DireccionClienteTextField;
    private Vista.Elementos.TextField DireccionEmpleadoTextField;
    private javax.swing.JSpinner EdadClienteJSpinner;
    private javax.swing.JSpinner EdadEmpleadoJSpinner;
    private Vista.ButtonGradient EmpresarioJButton;
    private javax.swing.JComboBox<String> GeneroClienteJComboBox;
    private javax.swing.JComboBox<String> GeneroEmpleadoJComboBox;
    private javax.swing.JTextField IDClienteTextField;
    private javax.swing.JTextField IDEmpleadoTextField;
    private Vista.Elementos.TextField NombreClienteTextField;
    private Vista.Elementos.TextField NombreEmpleadoTextField;
    private javax.swing.JSpinner SueldoEmpleadoJSpinner;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private Vista.Elementos.RadioButtonCustom jRadioButton1;
    private Vista.Elementos.RadioButtonCustom jRadioButton2;
    private javax.swing.JTabbedPane jTabbedPanel;
    private keeptoo.KGradientPanel kGradientPanel4;
    // End of variables declaration//GEN-END:variables
}
