/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.classes.Colaborador;
import model.classesExtras.EnumArquivoTxt;
import model.classesExtras.TipoDeStatus;
import model.controle.ColaboradorControle;
import model.controle.EmprestimoControle;

/**
 * @author GUSTAVO
 *
 * @author JHONATHAN
 *
 * @author MIGUEL
 */
public class TelaMulta extends javax.swing.JFrame {
    
     EmprestimoControle controleEmprestimo = null;
     ColaboradorControle controleColaborador = null;
     Colaborador ColaboradorAtual = null;
     Colaborador ColaboradorAntigo = null;
     TelaEmprestimo ChamaTelaEmprestimo = null;
     float valorDaMulta = 0;
    /**
     * Creates new form TelaMulta
     */
    public TelaMulta() {
             initComponents();
         try {
             
             controleEmprestimo = new EmprestimoControle(EnumArquivoTxt.EMPRESTIMO.getNomeDoArquivo());
             controleColaborador = new ColaboradorControle(EnumArquivoTxt.COLABORADOR.getNomeDoArquivo());
             
           
             
             
         } catch (Exception ex) {
             Logger.getLogger(TelaMulta.class.getName()).log(Level.SEVERE, null, ex);
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

        jButton_SIM = new javax.swing.JButton();
        jButton_NÃO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtext_DADOSMULTA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multa/Pagamento do Exemplar do Livro Emprestado");
        setMinimumSize(new java.awt.Dimension(1077, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_SIM.setText("SIM");
        jButton_SIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SIMActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_SIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 90, 50));

        jButton_NÃO.setText("NÃO");
        jButton_NÃO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NÃOActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_NÃO, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 90, 50));

        Jtext_DADOSMULTA.setColumns(20);
        Jtext_DADOSMULTA.setRows(5);
        jScrollPane1.setViewportView(Jtext_DADOSMULTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 720, 200));

        jLabel1.setText("Efetuar o Pagamento da Multa?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        jLabel17.setText("_ _ _ _ _ _ _ ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 70, 20));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        jLabel13.setText("F A T E S G ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, 20));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel18.setText("B i b l i o ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 100, 40));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("_ _ _ _ _ _ _ _ _ ");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 90, 30));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        jLabel14.setText("P r o j e t o");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 20));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText(" t e c h");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/imagem/blur corte tela principal.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SIMActionPerformed
        
         try {
             ColaboradorAtual = ColaboradorAntigo;
             ColaboradorAtual.setMulta(0);
             ColaboradorAtual.setTipoStatus(TipoDeStatus.ATIVO);
             controleColaborador.alterar(ColaboradorAntigo, ColaboradorAtual);
             
            
             ChamaTelaEmprestimo.setVisible(true);
             dispose();
         } catch (Exception ex) {
             Logger.getLogger(TelaMulta.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton_SIMActionPerformed

    private void jButton_NÃOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NÃOActionPerformed
         try {
             ColaboradorAtual = ColaboradorAntigo;
             ColaboradorAtual.setMulta(valorDaMulta);
             ColaboradorAtual.setTipoStatus(TipoDeStatus.PENDENTE);
             controleColaborador.alterar(ColaboradorAntigo, ColaboradorAtual);
             
             
             ChamaTelaEmprestimo.setVisible(true);
             dispose();
         } catch (Exception ex) {
             Logger.getLogger(TelaMulta.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton_NÃOActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMulta().setVisible(true);
               
            }
        });
    }
      public void recebendo( String nome, String DataEmprestimo, String DiaQueDevolveu, TelaEmprestimo telaEmprestimo){

         try {
             
              try {
                 ColaboradorAntigo = controleColaborador.recuperar(nome);// Colaborador antigo e igual o colaborador que recuperei pela String nome passada por parametro
                 ChamaTelaEmprestimo = telaEmprestimo;
             } catch (Exception ex) {
                 Logger.getLogger(TelaMulta.class.getName()).log(Level.SEVERE, null, ex);
             }
              
             String Date1 = DiaQueDevolveu; // pega os dados digitados da devolução e joga na String
             
             Date dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(Date1);  // Converte as Strings em Date
             Date dataFormatada2 = new SimpleDateFormat("dd/MM/yyyy").parse(DataEmprestimo);
             
             DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
             LocalDate data = LocalDate.parse(DataEmprestimo, parser);    //Converte Dete pra LocalDate para acrecentar diaas
             LocalDate diaSeguinte = data.plusDays(7);
             
             Date dataQueDeveDevolver = Date.from(diaSeguinte.atStartOfDay(ZoneId.systemDefault()).toInstant());// converte de LocalDatePara Datepara comparar
             
             long diferencaMS = dataFormatada.getTime() - dataQueDeveDevolver.getTime();  // PARA COMPARAR QUANTOS DIAS DE ATRAAZO TEVE
             long diferencaSegundos = diferencaMS / 1000;
             long diferencaMinutos = diferencaSegundos / 60;
             long diferencaHoras = diferencaMinutos / 60;
             long diferencaDias = diferencaHoras / 24;

                 Jtext_DADOSMULTA.setText(ColaboradorAntigo.getNome()+" o(a) senhor(a) utrapassou do prazo de entrega"
                         + "\nSe o(a) senhor(a) não efetuar o pagamento, ficará pendente com a Biblioteca"
                         + "\nNão podendo solicitar futuros emprestimos ou reservas"
                         + "\nNossa multa é estipulada no valor de R$ 2,00 por dia de atraso"
                         + "\nO(a) senhor(a) utrapassou " + diferencaDias + " do prazo de entrega"
                         + "\nValor total da multa = R$ " + diferencaDias * 2);

                 //Variaveis que serão usadas para setar a multa no colaborador correto
                 valorDaMulta = diferencaDias*2;
            
                
             
         } catch (ParseException ex) {
             Logger.getLogger(TelaMulta.class.getName()).log(Level.SEVERE, null, ex);
         }
          
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Jtext_DADOSMULTA;
    private javax.swing.JButton jButton_NÃO;
    private javax.swing.JButton jButton_SIM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}