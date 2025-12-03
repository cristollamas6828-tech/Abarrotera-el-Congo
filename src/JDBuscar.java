
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class JDBuscar extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JDBuscar.class.getName());

    // --- VARIABLES DE LÓGICA ---
    ConexionHR cnx;
    String idSeleccionado = "";
    DefaultTableModel modelo;
    TableRowSorter<DefaultTableModel> sorter;

    // --- CONSTRUCTOR ---
    public JDBuscar(java.awt.Frame parent, String titulo, String consultaSql, ConexionHR conexion) {
        super(parent, true); 
        initComponents();   
        this.setTitle(titulo);
        this.cnx = conexion;
        cargarDatos(consultaSql);
        setLocationRelativeTo(parent);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        BSeleccionar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(153, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar1.setRollover(true);

        BSeleccionar.setText("SELECCIONAR");
        BSeleccionar.setFocusable(false);
        BSeleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BSeleccionar.setMaximumSize(new java.awt.Dimension(100, 70));
        BSeleccionar.setMinimumSize(new java.awt.Dimension(100, 70));
        BSeleccionar.setPreferredSize(new java.awt.Dimension(100, 70));
        BSeleccionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSeleccionarActionPerformed(evt);
            }
        });
        jToolBar1.add(BSeleccionar);

        BCancelar.setText("CANCELAR");
        BCancelar.setFocusable(false);
        BCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BCancelar.setMaximumSize(new java.awt.Dimension(100, 70));
        BCancelar.setMinimumSize(new java.awt.Dimension(100, 70));
        BCancelar.setPreferredSize(new java.awt.Dimension(100, 70));
        BCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(BCancelar);

        jLabel1.setText("BUSCAR:");

        TBuscar.setEditable(false);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSeleccionarActionPerformed
        seleccionarYCerar();
    }//GEN-LAST:event_BSeleccionarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BCancelarActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        DefaultTableModel datos = (DefaultTableModel) tabla.getModel();
        int renSel = tabla.getSelectedRow();

        if (renSel > -1) {
            //  Obtener el ID de la factura de la primera columna (índice 0)
            String idFactura = datos.getValueAt(renSel, 0).toString();

            // Poner el ID en el campo de texto TBuscar
            TBuscar.setText(idFactura);
        }
    }//GEN-LAST:event_tablaMousePressed

    /**
     * @param args the command line arguments
     */
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BSeleccionar;
    private javax.swing.JTextField TBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(String sql) {
        cnx.entablar(sql, tabla);

        modelo = (javax.swing.table.DefaultTableModel) tabla.getModel();
        sorter = new javax.swing.table.TableRowSorter<>(modelo);
        tabla.setRowSorter(sorter);
    }

    private void seleccionarYCerar() {
        int fila = tabla.getSelectedRow();
        if (fila != -1) {
            int modelRow = tabla.convertRowIndexToModel(fila);
            Object valor = tabla.getModel().getValueAt(modelRow, 0);
            if (valor != null) {
                idSeleccionado = valor.toString();
            }
            dispose();
        }
    }

    public String getIdSeleccionado() {
        return idSeleccionado;
    }
}
