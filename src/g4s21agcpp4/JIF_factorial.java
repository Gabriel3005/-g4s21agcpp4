/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21agcpp4;

/**
 *
 * @author alexg
 */
public class JIF_factorial extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIF_factorial
     */
    public JIF_factorial() {
        initComponents();
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
        txtnum1 = new javax.swing.JTextField();
        btnFactorial = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Ingresa el numero ");

        btnFactorial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFactorial.setText("Factorial ");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnFactorial))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(btnFactorial)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        // TODO add your handling code here:
       Operaciones.OperacionesAvanzadas objOperacionesAvanzadas = new  Operaciones.OperacionesAvanzadas();
        jLabel4.setText("El resultado de la factorial es " + String.valueOf(objOperacionesAvanzadas.Factorial(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnFactorialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFactorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtnum1;
    // End of variables declaration//GEN-END:variables
}
