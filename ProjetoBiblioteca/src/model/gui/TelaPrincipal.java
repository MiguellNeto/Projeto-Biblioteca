/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.gui;

/**
 * @author GUSTAVO
 *
 * @author JHONATHAN
 *
 * @author MIGUEL
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
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

        jButtonColaborador = new javax.swing.JButton();
        jButtonEmprestimoDoLivro = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonCadastroDoLivro = new javax.swing.JButton();
        jButtonReservaDoLivro = new javax.swing.JButton();
        jButtonSobre = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonExemplar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIBLIOTECH");
        setMaximumSize(new java.awt.Dimension(1077, 720));
        setMinimumSize(new java.awt.Dimension(1077, 720));
        setPreferredSize(new java.awt.Dimension(1077, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonColaborador.setFont(new java.awt.Font("Oriya Sangam MN", 0, 18)); // NOI18N
        jButtonColaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/imagem/32employee.png"))); // NOI18N
        jButtonColaborador.setText(" Cadastro de Colaboradador");
        jButtonColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColaboradorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonColaborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 470, 70));

        jButtonEmprestimoDoLivro.setFont(new java.awt.Font("Oriya Sangam MN", 0, 18)); // NOI18N
        jButtonEmprestimoDoLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/imagem/32register.png"))); // NOI18N
        jButtonEmprestimoDoLivro.setText(" Empr??stimo/Devolu????o do Livro");
        jButtonEmprestimoDoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmprestimoDoLivroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEmprestimoDoLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 470, 70));

        jButtonSair.setFont(new java.awt.Font("Oriya Sangam MN", 0, 18)); // NOI18N
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/imagem/logout.png"))); // NOI18N
        jButtonSair.setText(" Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 470, 70));

        jButtonCadastroDoLivro.setFont(new java.awt.Font("Oriya Sangam MN", 0, 18)); // NOI18N
        jButtonCadastroDoLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/imagem/32book.png"))); // NOI18N
        jButtonCadastroDoLivro.setText(" Cadastro do Livro");
        jButtonCadastroDoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroDoLivroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastroDoLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 470, 70));

        jButtonReservaDoLivro.setFont(new java.awt.Font("Oriya Sangam MN", 0, 18)); // NOI18N
        jButtonReservaDoLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/imagem/32calendar.png"))); // NOI18N
        jButtonReservaDoLivro.setText(" Reserva do Livro");
        jButtonReservaDoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservaDoLivroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReservaDoLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 470, 70));

        jButtonSobre.setFont(new java.awt.Font("Oriya Sangam MN", 0, 18)); // NOI18N
        jButtonSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/imagem/32info.png"))); // NOI18N
        jButtonSobre.setText("  Sobre");
        jButtonSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobreActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 470, 70));

        jLabel10.setText(" ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 726, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText(" t e c h");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 610, -1, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel15.setText("B i b l i o ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, -1, 30));

        jLabel4.setText("___________");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 620, 80, 30));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("_______________");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 620, 180, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("F A T E S G ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 650, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel17.setText("B i b l i o ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, -1, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("P r o j e t o");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 590, -1, -1));

        jButtonExemplar.setFont(new java.awt.Font("Oriya Sangam MN", 0, 18)); // NOI18N
        jButtonExemplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/imagem/32bookmark.png"))); // NOI18N
        jButtonExemplar.setText(" Cadastro do Exemplar do Livro");
        jButtonExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExemplarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 470, 70));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/imagem/Pincipal corte.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColaboradorActionPerformed

        TelaColaborador colaborador = new TelaColaborador();
        colaborador.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonColaboradorActionPerformed

    private void jButtonReservaDoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservaDoLivroActionPerformed

        TelaReserva reserva = new TelaReserva();
        reserva.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonReservaDoLivroActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

     System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCadastroDoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroDoLivroActionPerformed

        TelaLivro livro = new TelaLivro();
        livro.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastroDoLivroActionPerformed

    private void jButtonEmprestimoDoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmprestimoDoLivroActionPerformed

        TelaEmprestimo emprestimo = new TelaEmprestimo();
        emprestimo.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEmprestimoDoLivroActionPerformed

    private void jButtonExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExemplarActionPerformed

        TelaExemplar exemplar = new TelaExemplar();
        exemplar.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExemplarActionPerformed

    private void jButtonSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobreActionPerformed

        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSobreActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroDoLivro;
    private javax.swing.JButton jButtonColaborador;
    private javax.swing.JButton jButtonEmprestimoDoLivro;
    private javax.swing.JButton jButtonExemplar;
    private javax.swing.JButton jButtonReservaDoLivro;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
