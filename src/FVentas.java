
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FVentas extends javax.swing.JFrame {

    ImageIcon icono = new ImageIcon(getClass().getResource("/img/shop.png"));

    String url = "https://lightpink-chicken-700684.hostingersite.com/mysql.php";

    String ventas = "SELECT facturas_idfacturas AS IDFacturas, productos_idproductos AS IDProductos, inventario, pago AS Pagos  FROM ventas";
    String pagos = "SELECT pago FROM ventas";
    String promedio = "SELECT pago , AVG(inventario) AS Promedio_Cantidad "
            + "FROM ventas";
    String grupo = " GROUP BY pago";
    String consultaBase = "SELECT f.cliente AS Cliente, COUNT(v.facturas_idfacturas) AS Cantidad_Compras "
            + "FROM ventas v "
            + "JOIN facturas f ON v.facturas_idfacturas = f.idfacturas";
    String orIdFactura = "SELECT facturas_idfacturas AS IDFacturas, productos_idproductos AS IDProductos, inventario, pago AS Pagos FROM ventas ";
    String OrIdProd = "SELECT facturas_idfacturas AS IDFacturas, productos_idproductos AS IDProductos, inventario, pago AS Pagos FROM ventas ";
    //------------------------------------------------------------------
    ConexionHR cnx = new ConexionHR(url);

    public FVentas() {
        initComponents();
        setLocationRelativeTo(this);
        this.setIconImage(icono.getImage());
        //----------Deshabilitar campos-----------
        TIdFactura.setEnabled(false);
        TIdProductos.setEnabled(false);

        cnx.entablar(ventas, TConsultas);
        cnx.seleccionar(pagos, CBPagos);

        // Ordena elementos de la tabla a la columna seleccionada 
        DefaultTableModel modelo = (DefaultTableModel) TConsultas.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        TConsultas.setRowSorter(sorter);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PTitulo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        BNuevo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        BAgregar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BPdf = new javax.swing.JButton();
        BGrafica = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jLabel13 = new javax.swing.JLabel();
        TBuscarIDFac = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TBuscarIDProd = new javax.swing.JTextField();
        PFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TIdFactura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TIdProductos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CBPagos = new javax.swing.JComboBox<>();
        TInventario = new javax.swing.JTextField();
        BBuscarF = new javax.swing.JButton();
        BBuscarP = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BOrden = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TConsultas = new javax.swing.JTable();
        PFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ABARROTERA - Módulo de Ventas");
        setBackground(new java.awt.Color(0, 0, 0));

        PTitulo.setBackground(new java.awt.Color(0, 0, 51));
        PTitulo.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("VENTAS");
        PTitulo.add(jLabel11);
        jLabel11.setBounds(150, 8, 190, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Módulo de Ventas");
        PTitulo.add(jLabel9);
        jLabel9.setBounds(150, 50, 190, 20);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sales.png"))); // NOI18N
        PTitulo.add(jLabel8);
        jLabel8.setBounds(19, 17, 64, 60);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        jLabel10.setOpaque(true);
        PTitulo.add(jLabel10);
        jLabel10.setBounds(0, 0, 890, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        PTitulo.add(jLabel3);
        jLabel3.setBounds(880, 0, 140, 90);

        jToolBar1.setRollover(true);

        BNuevo.setBackground(new java.awt.Color(153, 255, 255));
        BNuevo.setForeground(new java.awt.Color(0, 0, 0));
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

        BAgregar.setBackground(new java.awt.Color(153, 255, 255));
        BAgregar.setForeground(new java.awt.Color(0, 0, 0));
        BAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        BAgregar.setText("AGREGAR");
        BAgregar.setFocusable(false);
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

        BActualizar.setBackground(new java.awt.Color(153, 255, 255));
        BActualizar.setForeground(new java.awt.Color(51, 51, 51));
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

        BBorrar.setBackground(new java.awt.Color(153, 255, 255));
        BBorrar.setForeground(new java.awt.Color(0, 0, 0));
        BBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        BBorrar.setText("BORRAR");
        BBorrar.setFocusable(false);
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

        BPdf.setBackground(new java.awt.Color(153, 255, 255));
        BPdf.setForeground(new java.awt.Color(0, 0, 0));
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

        BGrafica.setBackground(new java.awt.Color(153, 255, 255));
        BGrafica.setForeground(new java.awt.Color(0, 0, 0));
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
        jToolBar1.add(jSeparator3);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("BUSCAR IDFactura:");
        jLabel13.setMaximumSize(new java.awt.Dimension(100, 90));
        jLabel13.setMinimumSize(new java.awt.Dimension(100, 90));
        jLabel13.setOpaque(true);
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 90));
        jToolBar1.add(jLabel13);

        TBuscarIDFac.setForeground(new java.awt.Color(0, 0, 0));
        TBuscarIDFac.setMaximumSize(new java.awt.Dimension(100, 50));
        TBuscarIDFac.setMinimumSize(new java.awt.Dimension(100, 50));
        TBuscarIDFac.setPreferredSize(new java.awt.Dimension(100, 50));
        TBuscarIDFac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TBuscarIDFacKeyReleased(evt);
            }
        });
        jToolBar1.add(TBuscarIDFac);

        jLabel6.setText("Buscar IdProducto:");
        jToolBar1.add(jLabel6);

        TBuscarIDProd.setMaximumSize(new java.awt.Dimension(100, 50));
        TBuscarIDProd.setMinimumSize(new java.awt.Dimension(100, 50));
        TBuscarIDProd.setPreferredSize(new java.awt.Dimension(100, 50));
        TBuscarIDProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TBuscarIDProdKeyReleased(evt);
            }
        });
        jToolBar1.add(TBuscarIDProd);

        PFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Paciente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 80, 82));
        jLabel1.setText("IDFactura:");

        TIdFactura.setEditable(false);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(78, 80, 82));
        jLabel4.setText("Inventario:");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 80, 82));
        jLabel2.setText("IDProductos:");

        TIdProductos.setEditable(false);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(78, 80, 82));
        jLabel5.setText("PAGOS:");

        CBPagos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "Credito" }));

        BBuscarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        BBuscarF.setText("...");
        BBuscarF.setMaximumSize(new java.awt.Dimension(50, 20));
        BBuscarF.setMinimumSize(new java.awt.Dimension(50, 20));
        BBuscarF.setPreferredSize(new java.awt.Dimension(70, 35));
        BBuscarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarFActionPerformed(evt);
            }
        });

        BBuscarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        BBuscarP.setText("...");
        BBuscarP.setMaximumSize(new java.awt.Dimension(50, 20));
        BBuscarP.setMinimumSize(new java.awt.Dimension(50, 20));
        BBuscarP.setPreferredSize(new java.awt.Dimension(70, 35));
        BBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarPActionPerformed(evt);
            }
        });

        BOrden.setText("Orden Pago");
        BOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOrdenActionPerformed(evt);
            }
        });

        jButton1.setText("Orden Inventario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("TODO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOrden)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout PFormularioLayout = new javax.swing.GroupLayout(PFormulario);
        PFormulario.setLayout(PFormularioLayout);
        PFormularioLayout.setHorizontalGroup(
            PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PFormularioLayout.createSequentialGroup()
                        .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFormularioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36))
                            .addGroup(PFormularioLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TIdFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(TIdProductos))
                        .addGap(33, 33, 33)
                        .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBuscarF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 100, Short.MAX_VALUE))
                    .addGroup(PFormularioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addGroup(PFormularioLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        PFormularioLayout.setVerticalGroup(
            PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFormularioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TIdProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(CBPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TConsultas.setModel(new javax.swing.table.DefaultTableModel(
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
        TConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TConsultasMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TConsultas);

        PFondo.setBackground(new java.awt.Color(255, 255, 255));
        PFondo.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addComponent(PFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPdfActionPerformed
        String pagoSel = CBPagos.getSelectedItem().toString();

        String donde = " WHERE v.pago = '" + pagoSel + "'";
        String grupo = " GROUP BY f.cliente";
        String orden = " ORDER BY Cantidad_Compras DESC";
        String query = consultaBase + donde + grupo + orden;

        cnx.crearPDF(
                "ABARROTERA",
                "TOP CLIENTES - PAGO: " + pagoSel,
                query,
                new float[]{0.7f, 0.3f},
                "reporte_clientes_pago"
        );

        cnx.visualizarPDF("reporte_clientes_pago");
    }//GEN-LAST:event_BPdfActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        LimpiarCampos();
        BAgregar.setEnabled(true);
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGraficaActionPerformed
        String pago = CBPagos.getSelectedItem().toString();
        String where = " WHERE v.pago = '" + pago + "'";
        String grupo = " GROUP BY f.cliente";
        String orden = " ORDER BY Cantidad_Compras DESC";

        String queryFinal = consultaBase + where + grupo + orden;

        ArrayList<String> series = new ArrayList<>();
        ArrayList<ArrayList<String>> datos = new ArrayList<>();

        datos = cnx.consultar(queryFinal);
        series.add(pago);
        GraficaXY graf = new GraficaXY("Top Clientes por compras con " + pago, "Cliente", "Cantidad de Compras", series, datos);

        PFondo.removeAll();
        PFondo.add(graf.chartPanel);
        PFondo.updateUI();
    }//GEN-LAST:event_BGraficaActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        String factura = TIdFactura.getText();
        String producto = TIdProductos.getText();
        String inv = TInventario.getText();
        String pagos = CBPagos.getSelectedItem().toString();

        String[] valores = new String[]{factura, producto, inv, pagos};

        if (cnx.actualizar("ventas", valores) == 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "¡Factura actualizada con éxito!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al actualizar la factura.");
        }

        cnx.entablar(ventas, TConsultas);
        BAgregar.setEnabled(true);
        LimpiarCampos();

    }//GEN-LAST:event_BActualizarActionPerformed

    private void TConsultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultasMousePressed
        BAgregar.setEnabled(false);
        DefaultTableModel datos = (DefaultTableModel) TConsultas.getModel();
        int renSel = TConsultas.getSelectedRow();

        if (renSel > -1) {
            String idFactura = datos.getValueAt(renSel, 0).toString();
            String idProducto = datos.getValueAt(renSel, 1).toString();
            String inventario = cnx.obtenerDato("SELECT inventario FROM ventas WHERE facturas_idfacturas = '" + idFactura + "' AND productos_idproductos = '" + idProducto + "'");
            String pago = cnx.obtenerDato("SELECT pago FROM ventas WHERE facturas_idfacturas = '" + idFactura + "' AND productos_idproductos = '" + idProducto + "'");
            TIdFactura.setText(idFactura);
            TIdProductos.setText(idProducto);
            TInventario.setText(inventario);
            CBPagos.setSelectedItem(pago);
        }

    }//GEN-LAST:event_TConsultasMousePressed

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        String[] datos = {
            TIdFactura.getText(),
            TIdProductos.getText(),
            TInventario.getText(),
            CBPagos.getSelectedItem().toString()
        };

        if (cnx.insertar("ventas", datos) == 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Venta Agregada");
            buscarVentas("");
            LimpiarCampos();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al agregar");
        }
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        String sql = "DELETE FROM ventas WHERE facturas_idfacturas = '" + TIdFactura.getText() + "' "
                + "AND productos_idproductos = '" + TIdProductos.getText() + "'";

        // Ejecutar directo
        cnx.peticionHttpPost(cnx.url, sql);

        javax.swing.JOptionPane.showMessageDialog(this, "Venta eliminada");
        buscarVentas("");
        LimpiarCampos();

    }//GEN-LAST:event_BBorrarActionPerformed

    private void BBuscarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarFActionPerformed
        String sql = "SELECT idfacturas, cliente, estado, total FROM facturas ORDER BY cliente";
        JDBuscar buscador = new JDBuscar(this, "Buscador de Productos", sql, cnx);
        buscador.setVisible(true);

        String id = buscador.getIdSeleccionado();
        TIdFactura.setText(id);

    }//GEN-LAST:event_BBuscarFActionPerformed

    private void BBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarPActionPerformed
        // Botón para buscar PRODUCTO
        String sql = "SELECT idproductos, nombrep, precio, lote FROM productos ORDER BY nombrep";
        JDBuscar buscador = new JDBuscar(this, "Buscador de Productos", sql, cnx);
        buscador.setVisible(true); // Se pausa aquí hasta que cierres la ventana

        String id = buscador.getIdSeleccionado();
        if (!id.isEmpty()) {
            TIdProductos.setText(id);
        }
    }//GEN-LAST:event_BBuscarPActionPerformed

    private void TBuscarIDFacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TBuscarIDFacKeyReleased
        buscarIDFactura(TBuscarIDFac.getText());
    }//GEN-LAST:event_TBuscarIDFacKeyReleased

    private void TBuscarIDProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TBuscarIDProdKeyReleased
        buscarIDProductos(TBuscarIDProd.getText());
    }//GEN-LAST:event_TBuscarIDProdKeyReleased

    private void BOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOrdenActionPerformed
        String OrPago = "SELECT * FROM ventas ORDER BY pago ASC";
        cnx.entablar(OrPago, TConsultas);

    }//GEN-LAST:event_BOrdenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String inventario = "SELECT * FROM ventas ORDER BY inventario ASC";
       cnx.entablar(inventario, TConsultas);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       cnx.entablar(ventas, TConsultas);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void LimpiarCampos() {
        TIdFactura.setText("");
        TIdProductos.setText("");
        TInventario.setText("");
        CBPagos.setSelectedIndex(0);

    }

    public void buscarVentas(String texto) {
        String sql = "";

        // Consulta base
        String select = "SELECT facturas_idfacturas AS IDFacturas, productos_idproductos AS IDProductos, inventario, pago AS Pagos FROM ventas ";

        // Si no hay texto, muestra todo. Si hay texto, filtra.
        if (texto.trim().isEmpty()) {
            sql = select + " ORDER BY facturas_idfacturas";
        } else {
            sql = select
                    + "WHERE pago LIKE '%" + texto.trim() + "%' "
                    + "OR facturas_idfacturas LIKE '%" + texto.trim() + "%' "
                    + "ORDER BY facturas_idfacturas";
        }

        // Llenar la tabla TConsultasº
        cnx.entablar(sql, TConsultas);
    }

    public void buscarIDProductos(String texto) {
        String sql = "";

        // Consulta base
        sql = OrIdProd
                + "WHERE productos_idproductos LIKE '%" + texto.trim() + "%' " // Filtro cambiado a IDProductos
                + "ORDER BY productos_idproductos"; // Orden cambiado a IDProductos

        // Llenar la tabla TConsultas
        cnx.entablar(sql, TConsultas);
    }

    public void buscarIDFactura(String texto) {
        String sql = "";

        if (texto.trim().isEmpty()) {
            sql = orIdFactura + " ORDER BY facturas_idfacturas";
        } else {
            sql = orIdFactura
                    + "WHERE pago LIKE '%" + texto.trim() + "%' "
                    + "OR facturas_idfacturas LIKE '%" + texto.trim() + "%' "
                    + "ORDER BY facturas_idfacturas";
        }

        // Llenar la tabla TConsultas
        cnx.entablar(sql, TConsultas);
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
                new FVentas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BBuscarF;
    private javax.swing.JButton BBuscarP;
    private javax.swing.JButton BGrafica;
    private javax.swing.JButton BNuevo;
    private javax.swing.JButton BOrden;
    private javax.swing.JButton BPdf;
    private javax.swing.JComboBox<String> CBPagos;
    private javax.swing.JPanel PFondo;
    private javax.swing.JPanel PFormulario;
    private javax.swing.JPanel PTitulo;
    private javax.swing.JTextField TBuscarIDFac;
    private javax.swing.JTextField TBuscarIDProd;
    private javax.swing.JTable TConsultas;
    private javax.swing.JTextField TIdFactura;
    private javax.swing.JTextField TIdProductos;
    private javax.swing.JTextField TInventario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
