
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FProductos extends javax.swing.JFrame {

    ImageIcon icono = new ImageIcon(getClass().getResource("/img/produc.png"));

    //---------------------URLs para la base de datos----------------------------
//    String url = "https://pf219682889.webcindario.com/mysql.php";// Base Cristo miarroba
//    String url = "https://pf220882298.webcindario.com/mysql.php"; // Base Fer miarroba
    //String url = "http://127.0.0.1:9000/mysqlf.php"; // Localhost para pruebas
    String url = "https://lightpink-chicken-700684.hostingersite.com/mysql.php";
    //--------------------------------------------------------------------------
    
    ConexionHR cnx = new ConexionHR(url); // Conexion 

    //---------------------Consultas--------------------------------------------
    String productos = "SELECT idproductos, nombrep, fecha_ingreso, "
            + "cantidad, precio, lote "
            + "FROM productos ORDER BY idproductos ";
    String grupo1 = "DELETE FROM ventas WHERE productos_idproductos = '"; // Para borrar registro
    String grupo2 = "SELECT lote FROM productos WHERE idproductos = '"; // Para el MousePressed de la tabla
    //--------------------------------------------------------------------------
    public FProductos() {
        initComponents();
        TIdProducto.setEnabled(false); // Deshabilitado 
        setLocationRelativeTo(this);
        this.setIconImage(icono.getImage());
        cnx.entablar(productos, TProductos);
        // Ordena elementos de la tabla a la columna seleccionada 
        DefaultTableModel modelo = (DefaultTableModel) TProductos.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        TProductos.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PTitulo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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
        BReestablecerValores = new javax.swing.JButton();
        PFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TNombrep = new javax.swing.JTextField();
        TIdProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TLote = new javax.swing.JTextField();
        DCFecha = new com.toedter.calendar.JDateChooser();
        SCantidad = new javax.swing.JSpinner();
        TBusqueda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TProductos = new javax.swing.JTable();
        PFondo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Abarrotera - Productos");
        setBackground(new java.awt.Color(0, 0, 0));

        PTitulo.setBackground(new java.awt.Color(0, 0, 51));
        PTitulo.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("ABARROTERA EL CONGO ");
        PTitulo.add(jLabel11);
        jLabel11.setBounds(230, 10, 400, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Productos");
        PTitulo.add(jLabel9);
        jLabel9.setBounds(250, 50, 310, 20);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produc.png"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(150, 70));
        jLabel6.setMinimumSize(new java.awt.Dimension(150, 70));
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 70));
        PTitulo.add(jLabel6);
        jLabel6.setBounds(10, 10, 220, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        PTitulo.add(jLabel10);
        jLabel10.setBounds(0, 0, 1200, 90);

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
        BGrafica.setText("GRÁFICA");
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

        BReestablecerValores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New file.png"))); // NOI18N
        BReestablecerValores.setText("REESTABLECER");
        BReestablecerValores.setFocusable(false);
        BReestablecerValores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BReestablecerValores.setMaximumSize(new java.awt.Dimension(110, 70));
        BReestablecerValores.setMinimumSize(new java.awt.Dimension(110, 70));
        BReestablecerValores.setPreferredSize(new java.awt.Dimension(110, 70));
        BReestablecerValores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BReestablecerValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReestablecerValoresActionPerformed(evt);
            }
        });
        jToolBar1.add(BReestablecerValores);

        PFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Producto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 80, 82));
        jLabel1.setText("ID:");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 80, 82));
        jLabel2.setText("NOMBRE PRODUCTO:");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(78, 80, 82));
        jLabel3.setText("FECHA DE INGRESO:");

        TIdProducto.setBackground(new java.awt.Color(255, 255, 255));
        TIdProducto.setForeground(new java.awt.Color(0, 0, 0));
        TIdProducto.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(78, 80, 82));
        jLabel4.setText("CANTIDAD:");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(78, 80, 82));
        jLabel5.setText("PRECIO: $");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(78, 80, 82));
        jLabel7.setText("LOTE:");

        SCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        TBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TBusquedaKeyTyped(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(78, 80, 82));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BUSCAR PRODUCTO:");

        javax.swing.GroupLayout PFormularioLayout = new javax.swing.GroupLayout(PFormulario);
        PFormulario.setLayout(PFormularioLayout);
        PFormularioLayout.setHorizontalGroup(
            PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DCFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addGap(224, 224, 224))
                    .addGroup(PFormularioLayout.createSequentialGroup()
                        .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PFormularioLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TNombrep, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PFormularioLayout.createSequentialGroup()
                                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PFormularioLayout.createSequentialGroup()
                                        .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(7, 7, 7)
                                        .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TLote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PFormularioLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TBusqueda)))
                        .addContainerGap())))
        );
        PFormularioLayout.setVerticalGroup(
            PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFormularioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TNombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DCFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TLote)
                    .addComponent(TBusqueda)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        TProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TProductosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TProductos);

        PFondo.setBackground(new java.awt.Color(255, 255, 255));
        PFondo.setLayout(new java.awt.GridLayout(1, 0));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("GRÁFICA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(PFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPdfActionPerformed
        // Consulta para el reporte: muestra todos los productos.
        // Se usa la misma cadena de consulta definida al inicio de la clase (String productos)
        // para asegurar que el PDF refleje los datos de la tabla.
        String query = "SELECT idproductos, nombrep, fecha_ingreso, cantidad, precio, lote "
                + "FROM productos ORDER BY idproductos ";

        // soporta 6 columnas (id, nombre, fecha, cantidad, precio, lote)
        cnx.crearPDF("Abarrotera El Congo", "Reporte de Inventario de Productos",
                query, new float[]{0.1f, 0.3f, 0.2f, 0.1f, 0.1f, 0.2f}, "reporte_inventario");

        cnx.visualizarPDF("reporte_inventario");

    }//GEN-LAST:event_BPdfActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGraficaActionPerformed
        // Consulta para obtener el nombre del producto y su cantidad
        // Se limita a los primeros 35 productos para una mejor visualización en la gráfica
        String query = "SELECT nombrep, cantidad FROM productos ORDER BY cantidad DESC LIMIT 25";
        ArrayList<String> series = new ArrayList();
        ArrayList<ArrayList<String>> datos = new ArrayList();

        // Se necesita una serie para el conjunto de datos (ej: "Inventario")
        series.add("Inventario");

        // El método consultar(query) de ConexionHR debe devolver los datos (nombrep y cantidad)
        datos = cnx.consultar(query);

        // Si GraficaXY es capaz de dibujar barras con nombres en X y valores en Y:
        GraficaXY graf = new GraficaXY("Inventario de Productos", "Producto",
                "Cantidad", series, datos);

        PFondo.removeAll();
        PFondo.add(graf.chartPanel);
        PFondo.updateUI();
    }//GEN-LAST:event_BGraficaActionPerformed

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        // 1. Validar campos
        if (TNombrep.getText().isEmpty() || DCFecha.getDate() == null
                || TPrecio.getText().isEmpty() || TLote.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Faltan campos obligatorios");
            return;
        }

        int cantidad = (Integer) SCantidad.getValue();
        if (cantidad <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a 0");
            return;
        }

        // 2. EMPAQUETAR LOS DATOS EN UN MAPA
        java.util.Map<String, String> datos = new java.util.HashMap<>();

        // Maneja el ID automáticamente si se pasa un valor vacío o nulo.
        // O se pasa un ID si el campo no es AUTO_INCREMENT.
        datos.put("accion", "insertProducto");

        // Se pasa el ID en blanco o nulo
        datos.put("idproductos", TIdProducto.getText().isEmpty() ? "NULL" : TIdProducto.getText());

        datos.put("nombrep", TNombrep.getText());
        datos.put("fecha_ingreso", cnx.toSQL(DCFecha.getDate()));
        datos.put("cantidad", String.valueOf(cantidad));
        datos.put("precio", TPrecio.getText());
        datos.put("lote", TLote.getText());

        // 3. ENVIAR (Se utiliza el método genérico enviarFormulario)
        if (cnx.enviarFormulario(datos)) {
            javax.swing.JOptionPane.showMessageDialog(this, "¡Producto agregado con éxito!");
            cnx.entablar(productos, TProductos);
            limpiarCampos();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar. Revise la consola para más detalles.");
        }
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        // 1. Validar campos
        if (TIdProducto.getText().isEmpty() || TNombrep.getText().isEmpty()
                || DCFecha.getDate() == null || TPrecio.getText().isEmpty()
                || TLote.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un producto y llenar todos los campos.");
            return;
        }

        // El ID debe ser el PRIMER elemento (valores[0]) ya que ConexionHR lo usa para el WHERE.
        String id = TIdProducto.getText();
        String nom = TNombrep.getText();
        String fing = cnx.toSQL(DCFecha.getDate());
        String cant = SCantidad.getValue().toString();
        String pre = TPrecio.getText();
        String lot = TLote.getText();

        // Arreglo de 6 elementos (coincide con la tabla productos)
        String[] valores = new String[]{id, nom, fing, cant, pre, lot};

        // 2. Llamar al método con SOLO dos argumentos.
        cnx.actualizar("productos", valores);

        cnx.entablar(productos, TProductos);
        limpiarCampos();
    }//GEN-LAST:event_BActualizarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        if (TIdProducto.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un producto para borrar.");
            return;
        }
        String id = TIdProducto.getText();
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea borrar el producto con ID: " + id + "? (Se borrarán sus registros de ventas asociados)",
                "Confirmar borrado CASCADA", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Paso 1: Borrar registros relacionados en la tabla 'ventas'
            String sqlDeleteVentas = grupo1 + id + "'";
            String resultadoVentas = cnx.peticionHttpPost(cnx.url, sqlDeleteVentas); // Uso directo de peticionHttpPost
            if (resultadoVentas != null && resultadoVentas.contains("AFFECTED ROWS")) {
                // Paso 2: Si las ventas se borraron, borrar el producto principal
                String[] valores = new String[]{id};
                if (cnx.borrar("productos", valores) == 1) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Producto borrado.");
                    cnx.entablar(productos, TProductos);
                    limpiarCampos();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Error al borrar el producto.");
                }
            } else {
                // Si se llega aquí, hubo un problema con la primera eliminación o el servidor devolvió un error.
                javax.swing.JOptionPane.showMessageDialog(this, "Error: No se pudieron borrar los registros de ventas asociados. Resultado: " + resultadoVentas);
            }
        }
    }//GEN-LAST:event_BBorrarActionPerformed

    private void TProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TProductosMousePressed

        DefaultTableModel datos = (DefaultTableModel) TProductos.getModel();
        int renSel = TProductos.getSelectedRow();
        if (renSel > -1) {
            // Obtener los datos directamente de la tabla (las 5 primeras columnas están en el SELECT del constructor)
            String id = datos.getValueAt(renSel, 0).toString();
            String nom = datos.getValueAt(renSel, 1).toString();
            String fing = datos.getValueAt(renSel, 2).toString(); // Fecha
            String cant = datos.getValueAt(renSel, 3).toString(); // Cantidad
            String pre = datos.getValueAt(renSel, 4).toString(); // Precio

            // Obtener 'lote' con una consulta adicional (grupo2)
            String lote = cnx.obtenerDato(grupo2 + id + "'");

            TIdProducto.setText(id);
            TNombrep.setText(nom);

            // La fecha debe convertirse de String (formato SQL) a Date
            DCFecha.setDate(cnx.toDate(fing));

            // La cantidad debe convertirse a Integer para el JSpinner
            try {
                SCantidad.setValue(Integer.parseInt(cant));
            } catch (NumberFormatException e) {
                SCantidad.setValue(1); // Valor por defecto si falla la conversión
            }

            TPrecio.setText(pre);
            TLote.setText(lote); // Llenar el campo de lote
        }
    }//GEN-LAST:event_TProductosMousePressed

    private void TBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TBusquedaKeyTyped
        filtrarProductos(TBusqueda.getText());
    }//GEN-LAST:event_TBusquedaKeyTyped

    private void BReestablecerValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReestablecerValoresActionPerformed
        cnx.entablar(productos, TProductos);
        limpiarCampos();
    }//GEN-LAST:event_BReestablecerValoresActionPerformed

    /**
     * @param args the command line arguments
     */
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
                new FProductos().setVisible(true);
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
    private javax.swing.JButton BReestablecerValores;
    private com.toedter.calendar.JDateChooser DCFecha;
    private javax.swing.JPanel PFondo;
    private javax.swing.JPanel PFormulario;
    private javax.swing.JPanel PTitulo;
    private javax.swing.JSpinner SCantidad;
    private javax.swing.JTextField TBusqueda;
    private javax.swing.JTextField TIdProducto;
    private javax.swing.JTextField TLote;
    private javax.swing.JTextField TNombrep;
    private javax.swing.JTextField TPrecio;
    private javax.swing.JTable TProductos;
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
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        TIdProducto.setText("");
        TNombrep.setText("");
        DCFecha.setDate(new Date());
        SCantidad.setValue(1);
        TPrecio.setText("");
        TLote.setText("");
    }

    private void filtrarProductos(String texto) {
        String query;
        String nombreBuscado = texto.trim(); // Limpia espacios

        if (nombreBuscado.isEmpty()) {
            // Si el campo de búsqueda está vacío, usa la consulta original (todos los productos)
            query = "SELECT idproductos, nombrep, fecha_ingreso, cantidad, precio, lote "
                    + "FROM productos ORDER BY idproductos";
        } else {
            // Si hay texto, filtra por el nombre usando LIKE
            // El comodín '%' permite encontrar coincidencias en cualquier parte del nombre.
            query = "SELECT idproductos, nombrep, fecha_ingreso, cantidad, precio, lote "
                    + "FROM productos WHERE nombrep LIKE '%" + nombreBuscado + "%' ORDER BY idproductos";
        }

        // Ejecuta la consulta y actualiza la tabla
        cnx.entablar(query, TProductos);
    }

}
