/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadegestão;

/**
 *
 * @author rober
 */
public class Principalproject extends javax.swing.JFrame {

    /**
     * Creates new form Principal2
     */
    public Principalproject() {
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
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        disciplina = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        pec = new javax.swing.JCheckBox();
        professoronline = new javax.swing.JCheckBox();
        pad = new javax.swing.JCheckBox();
        resultadonome = new javax.swing.JLabel();
        resultadodisciplina = new javax.swing.JLabel();
        resultadopec = new javax.swing.JLabel();
        resultadopad = new javax.swing.JLabel();
        resultadoprofessoronline = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome do Professor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Disciplina");

        disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplinaActionPerformed(evt);
            }
        });

        salvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salvar.setText("SALVAR");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        pec.setText("PEC");
        pec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pecActionPerformed(evt);
            }
        });

        professoronline.setText("PROFESSOR ONLINE");

        pad.setText("PAD");
        pad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                padActionPerformed(evt);
            }
        });

        resultadonome.setText("Nome do Professor");

        resultadodisciplina.setText("Disciplina");

        resultadopec.setText("PEC");

        resultadopad.setText("PAD");

        resultadoprofessoronline.setText("PROFESSOR ONLINE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(professoronline)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pec)
                            .addComponent(pad)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nome)
                                .addComponent(disciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultadonome)
                            .addComponent(resultadodisciplina)
                            .addComponent(resultadopec))
                        .addGap(106, 106, 106)
                        .addComponent(resultadopad)
                        .addGap(134, 134, 134)
                        .addComponent(resultadoprofessoronline)))
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(salvar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(professoronline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar)
                .addGap(28, 28, 28)
                .addComponent(resultadonome)
                .addGap(18, 18, 18)
                .addComponent(resultadodisciplina)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadopec)
                    .addComponent(resultadopad)
                    .addComponent(resultadoprofessoronline))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pecActionPerformed

    private void padActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_padActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_padActionPerformed

    private void disciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disciplinaActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

        String n = nome.getText();
        String d = disciplina.getText();
        String pecR = "";
        String padR = "";
        String professoronlineR = "";
        if (pec.isSelected()) {
            pecR = "PEC OK";

        }

        if (pad.isSelected()) {
            padR = "PAD OK";

// TODO add your handling code here:
    }//GEN-LAST:event_salvarActionPerformed

        if (professoronline.isSelected()) {
            professoronlineR = "PROFESSOR ONLINE OK";

        }
        resultadonome.setText(n);
        resultadodisciplina.setText(d);
        resultadopec.setText(pecR);
        resultadopad.setText(padR);
        resultadoprofessoronline.setText(professoronlineR);

    }

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
            java.util.logging.Logger.getLogger(Principalproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principalproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principalproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principalproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principalproject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField disciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nome;
    private javax.swing.JCheckBox pad;
    private javax.swing.JCheckBox pec;
    private javax.swing.JCheckBox professoronline;
    private javax.swing.JLabel resultadodisciplina;
    private javax.swing.JLabel resultadonome;
    private javax.swing.JLabel resultadopad;
    private javax.swing.JLabel resultadopec;
    private javax.swing.JLabel resultadoprofessoronline;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
