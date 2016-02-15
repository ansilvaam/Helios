package gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Habitacion extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    private TableRowSorter trsfiltro;

    public Habitacion() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Numero");
        modelo.addColumn("Piso");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Caracteristicas");
        modelo.addColumn("Precio");
        modelo.addColumn("Estado");
        modelo.addColumn("Tipo de Habitacion");
        this.jTableHabitacion.setModel(modelo);
        lecturaDeDatos();
        modelo.removeRow(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        lblPiso = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblCaracteristicas = new javax.swing.JLabel();
        lblPrecioDiario = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        cbxPiso = new javax.swing.JComboBox<>();
        txtNumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCaracteristicas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescr = new javax.swing.JTextArea();
        cbxHabitacion = new javax.swing.JComboBox<>();
        cbxEstado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableHabitacion = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(248, 202, 156));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Habitacion");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Habitacion");

        jPanel1.setBackground(new java.awt.Color(95, 175, 249));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 67, 67), 2, true));

        lblNumero.setText("Numero:");

        lblPiso.setText("Piso: ");

        lblDescripcion.setText("Descripcion:");

        lblCaracteristicas.setText("Caracteristicas:");

        lblPrecioDiario.setText("Precio Diario:");

        lblEstado.setText("Estado:");

        lblTipo.setText("Tipo de Habitacion:");

        cbxPiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..","Piso 1", "Piso 2", "Piso 3", "Piso 4" }));

        txtCaracteristicas.setColumns(20);
        txtCaracteristicas.setRows(5);
        jScrollPane1.setViewportView(txtCaracteristicas);

        txtDescr.setColumns(20);
        txtDescr.setRows(5);
        jScrollPane2.setViewportView(txtDescr);

        cbxHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..","Sencilla", "Doble", "Suite Jr", "Suite Familiar" }));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..","Disponible", "Ocupado", "Reservado", "No Disponible" }));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Registro de Habitaciones");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero)
                            .addComponent(lblPiso)
                            .addComponent(lblCaracteristicas)
                            .addComponent(lblDescripcion)
                            .addComponent(lblPrecioDiario)
                            .addComponent(lblEstado)
                            .addComponent(lblTipo))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtPrecio)
                            .addComponent(txtNumero)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPiso)
                    .addComponent(cbxPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCaracteristicas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioDiario))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cbxHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar))
                .addGap(245, 245, 245))
        );

        jPanel2.setBackground(new java.awt.Color(101, 215, 181));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTableHabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHabitacionMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableHabitacion);

        btnSalir.setText("Salir");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblBuscar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblBuscar.setText("Buscar");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por..", "Numero", "Piso","Descripcion" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnEliminar)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Object[] row = (Object[]) getDatos();
        modelo.addRow(row);
        limpiarDatos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int filaSel = jTableHabitacion.getSelectedRow();
        int[] filasSel = jTableHabitacion.getSelectedRows();
        int eliminar = 1;

        if (!isSelected(filaSel)) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una fila.");
        } else {
            int seleccion = JOptionPane.showOptionDialog(null, "Realmente deseas eliminar lo(s) seleccionado(s).",
                    "Eliminar", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"No", "Si"}, "opcion 1");

            if (seleccion == 1) {

                for (int j = 0; j < filasSel.length; j++) {
                    modelo.removeRow(filasSel[j]);
                    if (j < filasSel.length - 1) {
                        filasSel[j + 1] = filasSel[j + 1] - eliminar;
                        eliminar = eliminar + 1;
                    } else if (seleccion == 2) {

                    }
                }
            }
        }

        limpiarDatos();
        jTableHabitacion.clearSelection();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTableHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHabitacionMouseClicked

        int i = jTableHabitacion.getSelectedRow();
        int indexPiso = getIndexPiso(i);
        int indexEstado = getIndexEstado(i);
        int indexTipo = getIndexTipo(i);

        txtNumero.setText(modelo.getValueAt(i, 0).toString());
        cbxPiso.setSelectedIndex(indexPiso);
        txtDescr.setText(modelo.getValueAt(i, 2).toString());
        txtCaracteristicas.setText(modelo.getValueAt(i, 3).toString());
        txtPrecio.setText(modelo.getValueAt(i, 4).toString());
        cbxEstado.setSelectedIndex(indexEstado);
        cbxHabitacion.setSelectedIndex(indexTipo);
    }//GEN-LAST:event_jTableHabitacionMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        int filaSel = jTableHabitacion.getSelectedRow();
        Object[] row = (Object[]) getDatos();

        if (!isSelected(filaSel)) {
            JOptionPane.showMessageDialog(null, "Vaya, parece que olvidaste seleccionar la fila!", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int seleccion = JOptionPane.showOptionDialog(null, "Deseas proceder a guardar los cambios hechos a la fila seleccionada.",
                    "Modificar Registro", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"No", "Si"}, "opcion 1");

            if (seleccion == 1) {

                modelo.setValueAt(row[0], filaSel, 0);
                modelo.setValueAt(row[1], filaSel, 1);
                modelo.setValueAt(row[2], filaSel, 2);
                modelo.setValueAt(row[3], filaSel, 3);
                modelo.setValueAt(row[4], filaSel, 4);
                modelo.setValueAt(row[5], filaSel, 5);
                modelo.setValueAt(row[6], filaSel, 6);
                limpiarDatos();
                jTableHabitacion.clearSelection();
            } else {
                jTableHabitacion.clearSelection();
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        try {
            exportarjTable();
        } catch (IOException ex) {
            Logger.getLogger(Habitacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        txtBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscar.getText());
                txtBuscar.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsfiltro = new TableRowSorter(jTableHabitacion.getModel());
        jTableHabitacion.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxHabitacion;
    private javax.swing.JComboBox<String> cbxPiso;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableHabitacion;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCaracteristicas;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblPrecioDiario;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtCaracteristicas;
    private javax.swing.JTextArea txtDescr;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    public int getIndexPiso(int i) {

        int index = 0;

        ComboBoxModel<String> valor = cbxPiso.getModel();
        System.out.println(valor.getElementAt(1));
        if (valor.getElementAt(1).equals(modelo.getValueAt(i, 1))) {
            index = 1;
        } else if (valor.getElementAt(2).equals(modelo.getValueAt(i, 1))) {
            index = 2;
        } else if (valor.getElementAt(3).equals(modelo.getValueAt(i, 1))) {
            index = 3;
        } else if (valor.getElementAt(4).equals(modelo.getValueAt(i, 1))) {
            index = 4;
        } else {

        }

        return index;

    }

    public int getIndexEstado(int i) {

        int index = 0;

        ComboBoxModel<String> valor = cbxEstado.getModel();
        System.out.println(valor.getElementAt(1));
        if (valor.getElementAt(1).equals(modelo.getValueAt(i, 5))) {
            index = 1;
        } else if (valor.getElementAt(2).equals(modelo.getValueAt(i, 5))) {
            index = 2;
        } else if (valor.getElementAt(3).equals(modelo.getValueAt(i, 5))) {
            index = 3;
        } else if (valor.getElementAt(4).equals(modelo.getValueAt(i, 5))) {
            index = 4;
        } else {

        }

        return index;

    }

    public int getIndexTipo(int i) {

        int index = 0;

        ComboBoxModel<String> valor = cbxHabitacion.getModel();
        System.out.println(valor.getElementAt(1));
        if (valor.getElementAt(1).equals(modelo.getValueAt(i, 6))) {
            index = 1;
        } else if (valor.getElementAt(2).equals(modelo.getValueAt(i, 6))) {
            index = 2;
        } else if (valor.getElementAt(3).equals(modelo.getValueAt(i, 6))) {
            index = 3;
        } else if (valor.getElementAt(4).equals(modelo.getValueAt(i, 6))) {
            index = 4;
        } else {

        }

        return index;

    }

    public Object getDatos() {

        Object[] row = new Object[7];
        row[0] = txtNumero.getText();
        row[1] = cbxPiso.getSelectedItem();
        row[2] = txtDescr.getText();
        row[3] = txtCaracteristicas.getText();
        row[4] = txtPrecio.getText();
        row[5] = cbxEstado.getSelectedItem();
        row[6] = cbxHabitacion.getSelectedItem();

        return row;
    }

    public void limpiarDatos() {

        txtNumero.setText(null);
        cbxPiso.setSelectedIndex(0);
        txtDescr.setText(null);
        txtCaracteristicas.setText(null);
        txtPrecio.setText(null);
        cbxEstado.setSelectedIndex(0);
        cbxHabitacion.setSelectedIndex(0);
    }

    public boolean isSelected(int fila) {

        if (fila < 0) {
            return false;
        } else {
            return true;
        }

    }

    public void lecturaDeDatos() {
        File archivo = null;
        archivo = new File("archivo.ods");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(archivo));
            String line = br.readLine();

            while (line != null) {
                String[] rowfields = line.split("\t");
                modelo.addRow(rowfields);
                line = br.readLine();
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void exportarjTable() throws IOException {
        
        File ficheroODS = null;
        ficheroODS = new File("archivo.ods");
        FileWriter fichero = new FileWriter(ficheroODS);

        for (int i = 0; i < modelo.getColumnCount(); i++) {
            fichero.write(modelo.getColumnName(i) + "\t");
        }
        fichero.write("\n");
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                fichero.write(modelo.getValueAt(i, j).toString() + "\t");
            }
            fichero.write("\n");
        }
        fichero.close();
    }
    
    public void filtro() {
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 0));
    }
}
