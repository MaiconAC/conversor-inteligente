public class Conversor extends javax.swing.JFrame {
    
    int operacao;
    float resultado, curRealDolar=4.5f, curRealEuro=5, curRealLibra=6;
    float curDolarEuro=1.08f, curDolarLibra=1.30f;
    float curEuroLibra=1.20f;

    public Conversor() {
        initComponents();
        cmbFinal.setSelectedIndex(-1);
        cmbInicial.setSelectedIndex(-1);
    }
    
    public void tratarConversãoMoeda(){
        
        //Valor Real
        if (cmbInicial.getSelectedItem().equals("Reais (R$)")){
            if (cmbFinal.getSelectedItem().equals("Dólares (USD)")){
                resultado = Float.parseFloat(txtValor.getText()) / curRealDolar;
            } else {
                if (cmbFinal.getSelectedItem().equals("Euros (€)")){
                    resultado = Float.parseFloat(txtValor.getText()) / curRealEuro;
                } else {
                    if (cmbFinal.getSelectedItem().equals("Libra esterlina (£)")) {
                        resultado = Float.parseFloat(txtValor.getText()) / curRealLibra;
                    }
                }
            }
        }
        
        //Valor Dólar
        if (cmbInicial.getSelectedItem().equals("Dólares (USD)")){
            if (cmbFinal.getSelectedItem().equals("Reais (R$)")){
                resultado = Float.parseFloat(txtValor.getText()) * curRealDolar;
            } else {
                if (cmbFinal.getSelectedItem().equals("Euros (€)")){
                    resultado = Float.parseFloat(txtValor.getText()) / curDolarEuro;
                } else {
                    if (cmbFinal.getSelectedItem().equals("Libra esterlina (£)")) {
                        resultado = Float.parseFloat(txtValor.getText()) / curDolarLibra;
                    }
                }
            }
        }
        
        //Valor Euro
        if (cmbInicial.getSelectedItem().equals("Euros (€)")){
            if (cmbFinal.getSelectedItem().equals("Reais (R$)")){
                resultado = Float.parseFloat(txtValor.getText()) * curRealEuro;
            } else {
                if (cmbFinal.getSelectedItem().equals("Dólares (USD)")){
                    resultado = Float.parseFloat(txtValor.getText()) * curDolarEuro;
                } else {
                    if (cmbFinal.getSelectedItem().equals("Libra esterlina (£)")) {
                        resultado = Float.parseFloat(txtValor.getText()) / curEuroLibra;
                    }
                }
            }
        }
        
        //Valor Libra
        if (cmbInicial.getSelectedItem().equals("Libra esterlina (£)")){
            if (cmbFinal.getSelectedItem().equals("Reais (R$)")){
                resultado = Float.parseFloat(txtValor.getText()) * curRealLibra;
            } else {
                if (cmbFinal.getSelectedItem().equals("Dólares (USD)")){
                    resultado = Float.parseFloat(txtValor.getText()) * curDolarLibra;
                } else {
                    if (cmbFinal.getSelectedItem().equals("Euros (€)")) {
                        resultado = Float.parseFloat(txtValor.getText()) * curEuroLibra;
                    }
                }
            }
        }
            

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cmbFinal = new javax.swing.JComboBox<>();
        cmbInicial = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnConverter = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reais (R$)", "Dólares (USD)", "Euros (€)", "Libra esterlina (£)" }));

        cmbInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reais (R$)", "Dólares (USD)", "Euros (€)", "Libra esterlina (£)" }));

        jLabel2.setText("Converter de");

        jLabel3.setText("Para");

        txtResultado.setEditable(false);

        jLabel4.setText("Valor: ");

        jLabel5.setText("Resultado da Conversão ");

        btnConverter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConverter.setText("Converter");
        btnConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cmbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnConverter)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnConverter)
                .addGap(27, 27, 27))
        );

        jTabbedPane2.addTab("Moeda", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Unidades de Medida", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterActionPerformed
        tratarConversãoMoeda();
        txtResultado.setText(Float.toString(resultado));
    }//GEN-LAST:event_btnConverterActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConverter;
    private javax.swing.JComboBox<String> cmbFinal;
    private javax.swing.JComboBox<String> cmbInicial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
