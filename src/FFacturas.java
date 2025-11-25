
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class FFacturas extends javax.swing.JFrame {

    ImageIcon icono = new ImageIcon(getClass().getResource("/img/FACTURA.png"));

    //---------------------URL para la base de datos--------------------
    String url = "https://pf219682889.webcindario.com/mysql.php";

    //------------------------------------------------------------------
    ConexionHR cnx = new ConexionHR(url);

    //---------------------Consultas--------------------
    String factura = "SELECT idfacturas, cliente, estado, total FROM facturas ORDER BY idfacturas ";
    String estatus = "SELECT DISTINCT estado FROM facturas ORDER BY estado";
    String promedio = "SELECT cliente, AVG(total) AS Promedio_Por_Cliente "
            + "FROM facturas ";
    String grupo = " GROUP BY  cliente ORDER BY Promedio_Por_Cliente DESC;";

    //-------------------------------------------------------
    public FFacturas() {
        initComponents();
        setLocationRelativeTo(this);
        this.setIconImage(icono.getImage());
        TFacturas.setEditable(false);
        cnx.entablar(factura, TConsulta);
        cnx.seleccionar(estatus, CBEstatus);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PTitulo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        BNuevo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        BAgregar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BPdf = new javax.swing.JButton();
        BGrafica = new javax.swing.JButton();
        PFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFacturas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CBEstatus = new javax.swing.JComboBox<>();
        DCFechaEmi = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        DCFechaVen = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        TCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TDireccion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TConsulta = new javax.swing.JTable();
        PFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ABARROTERA Modulo de Facturas");
        setBackground(new java.awt.Color(0, 0, 0));

        PTitulo.setBackground(new java.awt.Color(0, 0, 51));
        PTitulo.setLayout(null);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ABARROTERA");
        PTitulo.add(jLabel11);
        jLabel11.setBounds(150, 8, 190, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Módulo de Facturas");
        PTitulo.add(jLabel9);
        jLabel9.setBounds(150, 50, 170, 20);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shop.png"))); // NOI18N
        PTitulo.add(jLabel8);
        jLabel8.setBounds(19, 7, 90, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoT.png"))); // NOI18N
        PTitulo.add(jLabel10);
        jLabel10.setBounds(0, 0, 783, 90);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoT.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        PTitulo.add(jLabel12);
        jLabel12.setBounds(780, 0, 250, 90);

        jToolBar1.setRollover(true);

        BNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new.png"))); // NOI18N
        BNuevo.setText("NUEVO");
        BNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BNuevo.setMaximumSize(new java.awt.Dimension(100, 70));
        BNuevo.setMinimumSize(new java.awt.Dimension(100, 70));
        BNuevo.setPreferredSize(new java.awt.Dimension(100, 70));
        BNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(BNuevo);
        jToolBar1.add(jSeparator2);

        BAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        BAgregar.setText("AGREGAR");
        BAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BAgregar.setMaximumSize(new java.awt.Dimension(100, 70));
        BAgregar.setMinimumSize(new java.awt.Dimension(100, 70));
        BAgregar.setPreferredSize(new java.awt.Dimension(100, 70));
        BAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(BAgregar);

        BActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        BActualizar.setText("ACTUALIZAR");
        BActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BActualizar.setMaximumSize(new java.awt.Dimension(100, 70));
        BActualizar.setMinimumSize(new java.awt.Dimension(100, 70));
        BActualizar.setPreferredSize(new java.awt.Dimension(100, 70));
        BActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(BActualizar);

        BBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        BBorrar.setText("BORRAR");
        BBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BBorrar.setMaximumSize(new java.awt.Dimension(100, 70));
        BBorrar.setMinimumSize(new java.awt.Dimension(100, 70));
        BBorrar.setPreferredSize(new java.awt.Dimension(100, 70));
        BBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
            }
        });
        jToolBar1.add(BBorrar);
        jToolBar1.add(jSeparator1);

        BPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        BPdf.setText("PDF");
        BPdf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BPdf.setMaximumSize(new java.awt.Dimension(100, 70));
        BPdf.setMinimumSize(new java.awt.Dimension(100, 70));
        BPdf.setPreferredSize(new java.awt.Dimension(100, 70));
        BPdf.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPdfActionPerformed(evt);
            }
        });
        jToolBar1.add(BPdf);

        BGrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Graph.png"))); // NOI18N
        BGrafica.setText("GRAFICA");
        BGrafica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGrafica.setMaximumSize(new java.awt.Dimension(100, 70));
        BGrafica.setMinimumSize(new java.awt.Dimension(100, 70));
        BGrafica.setPreferredSize(new java.awt.Dimension(100, 70));
        BGrafica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGraficaActionPerformed(evt);
            }
        });
        jToolBar1.add(BGrafica);

        PFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Facturas:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 80, 82));
        jLabel1.setText("IDFacturas:");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(78, 80, 82));
        jLabel3.setText("FECHA EMISION:");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(78, 80, 82));
        jLabel4.setText("ESTADO:");

        CBEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pagado", "pendiente", "anulado" }));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(78, 80, 82));
        jLabel5.setText("FECHA VENCIMIENTO:");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 80, 82));
        jLabel2.setText("CLIENTE:");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(78, 80, 82));
        jLabel6.setText("TOTAL:");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(78, 80, 82));
        jLabel7.setText("DIRECCION:");

        javax.swing.GroupLayout PFormularioLayout = new javax.swing.GroupLayout(PFormulario);
        PFormulario.setLayout(PFormularioLayout);
        PFormularioLayout.setHorizontalGroup(
            PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(TFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 129, Short.MAX_VALUE))
                    .addGroup(PFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DCFechaEmi, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(PFormularioLayout.createSequentialGroup()
                        .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PFormularioLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(DCFechaVen, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PFormularioLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PFormularioLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PFormularioLayout.setVerticalGroup(
            PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFormularioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(DCFechaEmi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DCFechaVen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        TConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TConsultaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TConsulta);

        PFondo.setBackground(new java.awt.Color(255, 255, 204));
        PFondo.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(PFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(PFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPdfActionPerformed
        String cliente = TCliente.getText();
        String whereClause = "";

        if (cliente != null && !cliente.trim().isEmpty()) {
            whereClause = "WHERE cliente = '" + cliente.trim() + "'";
        }
        String query = promedio + whereClause + grupo;
        cnx.crearPDF("ABARROTERA", "PROMEDIO DE FACTURACIÓN POR CLIENTE",
                query, new float[]{0.5f, 0.5f}, "promedio_cliente");
        cnx.visualizarPDF("promedio_cliente");
    }//GEN-LAST:event_BPdfActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGraficaActionPerformed
        String cliente = TCliente.getText();
        String whereClause = "";

        if (cliente != null && !cliente.trim().isEmpty()) {
            whereClause = "WHERE cliente = '" + cliente.trim() + "'";
        }
        String query = promedio + whereClause + grupo;

        ArrayList<String> series = new ArrayList();
        ArrayList<ArrayList<String>> datos = new ArrayList();

        datos = cnx.consultar(query);
        series.add(cliente);
        GraficaXY graf = new GraficaXY("Promedio de Facturación por Cliente", "Cliente", "Total Promedio ($)", series, datos);

        PFondo.removeAll();
        PFondo.add(graf.chartPanel);
        PFondo.updateUI();
    }//GEN-LAST:event_BGraficaActionPerformed

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        if (DCFechaEmi.getDate() == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Falta la fecha de emisión de la factura.");
            return;
        }

        this.setTitle("ABARROTERA - Conectando con el servidor...");
        new Thread(() -> {
            java.util.Map<String, String> datosFactura = new java.util.HashMap<>();
            datosFactura.put("accion", "insertFactura");

            // CLAVE: Siempre enviar "null" para que MySQL use el AUTO_INCREMENT
            datosFactura.put("idfacturas", "null");

            datosFactura.put("fecha_emision", cnx.toSQL(DCFechaEmi.getDate()));
            datosFactura.put("fecha_vencimiento", cnx.toSQL(DCFechaVen.getDate()));
            datosFactura.put("estado", CBEstatus.getSelectedItem().toString());
            datosFactura.put("cliente", TCliente.getText());
            datosFactura.put("total", TTotal.getText());
            datosFactura.put("direccion", TDireccion.getText());

            // --- EJECUTAR LA LLAMADA A LA RED ---
            boolean exito = cnx.enviarFormulario(datosFactura);

            // --- VOLVER AL HILO DE LA INTERFAZ (EDT) ---
            javax.swing.SwingUtilities.invokeLater(() -> {

                // 1. Mostrar resultado y actualizar GUI
                if (exito) {
                    javax.swing.JOptionPane.showMessageDialog(this, "¡Factura guardada con éxito!");
                    // Recargar la tabla de facturas (usando la variable 'factura')
                    cnx.entablar(factura, TConsulta);
                    LimpiarCampos();

                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar la factura. Revisa la consola (Output) para el error específico del servidor.");
                }

                this.setTitle("ABARROTERA Modulo de Facturas");
            });

        }).start();

    }//GEN-LAST:event_BAgregarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
// 1. VALIDACIÓN: Asegurarse de que la fecha de emisión no sea nula.
        if (DCFechaEmi.getDate() == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar la fecha de emisión para actualizar la factura.");
            return;
        }

        // El resto del código que genera el arreglo de valores
        String idFactura = TFacturas.getText(); // El campo clave para identificar la factura a actualizar
        String fechaEmision = cnx.toSQL(DCFechaEmi.getDate());
        String fechaVencimiento = cnx.toSQL(DCFechaVen.getDate());
        String estado = CBEstatus.getSelectedItem().toString();
        String cliente = TCliente.getText();
        String total = TTotal.getText();
        String direccion = TDireccion.getText();

        String[] valores = new String[]{idFactura, fechaEmision, fechaVencimiento, estado, cliente, total, direccion};

        // 2. Ejecutar la actualización
        if (cnx.actualizar("facturas", valores) == 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "¡Factura actualizada con éxito!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al actualizar la factura.");
        }

        // 3. Recargar tabla y limpiar
        cnx.entablar(factura, TConsulta);
        LimpiarCampos();

    }//GEN-LAST:event_BActualizarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        String idFactura = TFacturas.getText(); // El campo clave para identificar la factura a actualizar
        String fechaEmision = cnx.toSQL(DCFechaEmi.getDate());
        String fechaVencimiento = cnx.toSQL(DCFechaVen.getDate());
        String estado = CBEstatus.getSelectedItem().toString();
        String cliente = TCliente.getText();
        String total = TTotal.getText();
        String direccion = TDireccion.getText();

        //Mensaje de que se borro exitosamente
        javax.swing.JOptionPane.showMessageDialog(this, "¡Factura actualizada con éxito!");

        String[] valores = new String[]{idFactura, fechaEmision, fechaVencimiento, estado, cliente, total, direccion};
        cnx.borrar("facturas", valores);
        cnx.entablar(factura, TConsulta);

        LimpiarCampos();

    }//GEN-LAST:event_BBorrarActionPerformed

    private void TConsultaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaMousePressed
        DefaultTableModel datos = (DefaultTableModel) TConsulta.getModel();
        int renSel = TConsulta.getSelectedRow();
        if (renSel > -1) {

            String idFactura = datos.getValueAt(renSel, 0).toString();
            String cliente = datos.getValueAt(renSel, 1).toString();
            String estado = datos.getValueAt(renSel, 2).toString();
            String fechaEmision = cnx.obtenerDato("SELECT fecha_emision FROM facturas WHERE idfacturas = '" + idFactura + "'");
            String fechaVencimiento = cnx.obtenerDato("SELECT fecha_vencimiento FROM facturas WHERE idfacturas = '" + idFactura + "'");
            String total = cnx.obtenerDato("SELECT total FROM facturas WHERE idfacturas = '" + idFactura + "'");
            String direccion = cnx.obtenerDato("SELECT direccion FROM facturas WHERE idfacturas = '" + idFactura + "'");

            TFacturas.setText(idFactura);
            TCliente.setText(cliente);
            CBEstatus.setSelectedItem(estado);

            DCFechaEmi.setDate(cnx.toDate(fechaEmision));
            DCFechaVen.setDate(cnx.toDate(fechaVencimiento));

            TTotal.setText(total);
            TDireccion.setText(direccion);

        }

    }//GEN-LAST:event_TConsultaMousePressed
    public void LimpiarCampos() {
        TFacturas.setText("");
        DCFechaEmi.setDate(new Date());
        DCFechaVen.setDate(new Date());
        CBEstatus.setSelectedIndex(0);
        TCliente.setText("");
        TTotal.setText("");
        TDireccion.setText("");
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FFacturas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BGrafica;
    private javax.swing.JButton BNuevo;
    private javax.swing.JButton BPdf;
    private javax.swing.JComboBox<String> CBEstatus;
    private com.toedter.calendar.JDateChooser DCFechaEmi;
    private com.toedter.calendar.JDateChooser DCFechaVen;
    private javax.swing.JPanel PFondo;
    private javax.swing.JPanel PFormulario;
    private javax.swing.JPanel PTitulo;
    private javax.swing.JTextField TCliente;
    private javax.swing.JTable TConsulta;
    private javax.swing.JTextField TDireccion;
    private javax.swing.JTextField TFacturas;
    private javax.swing.JTextField TTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
