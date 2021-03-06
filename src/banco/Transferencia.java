package banco;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ale
 */
public class Transferencia extends javax.swing.JFrame {

    /**
     * Creates new form Transferencia
     */
    private Cliente cliente;
    private Cuenta cuenta;
    private Cuenta cuentaD;
    public Transferencia() {
        initComponents();
    }
    
     public Transferencia(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        llenaCombo(cliente.getCuentas());
        
        
    }
     
    private void llenaCombo(List<Cuenta> cuentas) {
        for (int i = 0; i < cuentas.size() ; i++) {
            lblComboA.addItem(Long.toString(cuentas.get(i).getNumero()));
        }
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblComboA = new javax.swing.JComboBox<>();
        lblCuentaA = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Transferencia");

        lblComboA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        lblComboA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblComboAActionPerformed(evt);
            }
        });

        lblCuentaA.setText("Seleccione su cuenta:");

        lblDestino.setText("Ingrese la cuenta de destino: ");

        txtDestino.setText("jTextField1");

        lblMonto.setText("Ingrese el monto: ");

        txtMonto.setText("jTextField2");

        jButton1.setText("Realizar Tranferencia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblMonto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCuentaA)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblComboA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDestino)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuentaA)
                    .addComponent(lblComboA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestino)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonto)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
        long numCuentaActual = Long.parseLong(lblComboA.getSelectedItem().toString()); 
        long numCuentaDestino = Long.parseLong(txtDestino.getText());
        double cantidad = Double.parseDouble(txtMonto.getText());
        
        for (int i = 0; i < Principal.getCuentas().size() ; i++) {
            if (Principal.getCuentas().get(i).getNumero() == numCuentaDestino) {
                this.cuentaD = Principal.getCuentas().get(i);
            }
        }   
        for (int i = 0; i < cliente.getCuentas().size(); i++) {
            if (cliente.getCuentas().get(i).getNumero() == numCuentaActual) {
                this.cuenta = cliente.getCuentas().get(i);
            }
        }
        if (this.cuenta.transferencia(cuentaD, cantidad)) {
            JOptionPane.showMessageDialog(null, "Transferencia exitosa");
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblComboAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblComboAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblComboAActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transferencia().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> lblComboA;
    private javax.swing.JLabel lblCuentaA;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables

   
}
