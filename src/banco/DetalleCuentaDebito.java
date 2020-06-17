package banco;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miriampescadorrojas
 */
public class DetalleCuentaDebito extends javax.swing.JFrame {

    /**
     * Creates new form DetalleCuenta
     */
    public DetalleCuentaDebito() {
        initComponents();
    }
    
    public DetalleCuentaDebito(CuentaDebito c) {
        initComponents();
        MostrarDetalleDebito(c);
    }

    private void MostrarDetalleDebito(CuentaDebito c) {
        SimpleDateFormat formato = new SimpleDateFormat("dd'/'MM'/'yyyy");
        
        lblNumeroCuentaD.setText(String.valueOf(c.getNumero()));
        txtSaldoA.setText(String.valueOf(c.getSaldoActual()));
        txtSaldoM.setText(String.valueOf(c.getSaldoMinimo()));
        
        DefaultTableModel modelo = (new DefaultTableModel(
            null,
            new String [] {
                "Fecha", "Tipo", "Descripcion ", "Saldo Historico"
            }
        ));
        
        Object o[]=null;
        for (int i = 0; i < c.getMovtos().size() ; i++) {
            modelo.addRow(o);
            Movimiento mvto = c.getMovtos().get(i);
            modelo.setValueAt(formato.format(mvto.getFecha().getTime()), i, 0);
            modelo.setValueAt(mvto.getTipo(), i, 1);
            modelo.setValueAt(mvto.getConcepto(), i, 2);
            modelo.setValueAt(mvto.getSaldoHistorico(), i, 3);
            
        }
       
        tablaMvtos.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCuenta = new javax.swing.JLabel();
        lblNumeroCuentaD = new javax.swing.JLabel();
        lblSaldoA = new javax.swing.JLabel();
        lblSaldoM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMvtos = new javax.swing.JTable();
        lblMovtos = new javax.swing.JLabel();
        txtSaldoA = new javax.swing.JTextField();
        txtSaldoM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCuenta.setText("Número de cuenta");

        lblNumeroCuentaD.setText("XXXXXXXX");

        lblSaldoA.setText("Saldo actual");

        lblSaldoM.setText("Saldo minimo");

        tablaMvtos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaMvtos);

        lblMovtos.setText("Movimientos ");

        txtSaldoA.setText("jTextField1");

        txtSaldoM.setText("jTextField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCuenta)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSaldoA)
                        .addGap(18, 18, 18)
                        .addComponent(txtSaldoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSaldoM)
                        .addGap(18, 18, 18)
                        .addComponent(txtSaldoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroCuentaD)
                    .addComponent(lblMovtos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuenta)
                    .addComponent(lblNumeroCuentaD))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSaldoA)
                            .addComponent(lblMovtos)
                            .addComponent(txtSaldoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSaldoM)
                            .addComponent(txtSaldoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblMovtos;
    private javax.swing.JLabel lblNumeroCuentaD;
    private javax.swing.JLabel lblSaldoA;
    private javax.swing.JLabel lblSaldoM;
    private javax.swing.JTable tablaMvtos;
    private javax.swing.JTextField txtSaldoA;
    private javax.swing.JTextField txtSaldoM;
    // End of variables declaration//GEN-END:variables

    
}
