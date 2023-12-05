/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;

import Modelo.ModeloJFrame1;

/**
 *
 * @author Matheus
 */
public class JFrame3 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame3
     */
    public JFrame3() {
        initComponents();
    }
    public void exportarNome2(ModeloJFrame1 model){
        lblNome2.setText(model.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(51, 255, 0));
        lblNome2.setText("Nome");
        jPanel1.add(lblNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 160, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1366, 1768, 270, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Morpheus.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 80, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("Morpheus");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("Regras");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 255, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("\nÉ  um nome bonito mas.. na Matrix nada importa! Você foi escolhido para entrar na matriz\ne terar que sobreviver a ela oque é algo bem simples. Você irá passar por 3 fases:\n\nPrimeira fase: Você deve escolher uma das 2 pílulas para entrar em uma matrix se não escolher \nficará preso(a) no limbo até escolher!\n\nSegunda fase: Depois de escolher uma pílula você será transportado(a) para uma matrix no qual\nvocê precisa responder 5 questões  de um determinado assunto.. A matrix que escolhe! Oque \ndescobrimos  é que ela sempre escolhe assuntos de cálculos e Códigos! espero que saiba algo, \npois SE ERRAR UMA QUESTÃO VOCÊ MORRE!\n\nTerceira fase:  Depois que acertar as 5 questões estará livre da Matrix e poderá retornar ao mundo\nreal. A matrix é perigosa! Não aceita vencedores então para que ela não ache você na vida real \niremos mudar sua identidade e sua caracteristica fisiológicas através de um chip cerebral antes da\nmatrix scannear você.\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jTextArea1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTextArea1ComponentShown(evt);
            }
        });
        jTextArea1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextArea1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 710, 300));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Morpheus.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 90, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setText("Morpheus");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(25, 25, 25));
        jToggleButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 255, 0));
        jToggleButton1.setText("Sim");
        jToggleButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, 70, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 0));
        jLabel8.setText("Chega de conversa! Vamos direto ao ponto. Está preparado?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));

        jToggleButton2.setBackground(new java.awt.Color(25, 25, 25));
        jToggleButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(51, 255, 0));
        jToggleButton2.setText("Não");
        jToggleButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        jTextArea1.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void jTextArea1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextArea1PropertyChange

    }//GEN-LAST:event_jTextArea1PropertyChange

    private void jTextArea1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTextArea1ComponentShown

    }//GEN-LAST:event_jTextArea1ComponentShown

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        ModeloJFrame1 model = new ModeloJFrame1();
        JFrame2 frm2 = new JFrame2();
        frm2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        ModeloJFrame1 model = new ModeloJFrame1();
        model.setNome(lblNome2.getText());
        JFrame1 frm1 = new JFrame1();
        frm1.exportarNome3(model);
        frm1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lblNome2;
    // End of variables declaration//GEN-END:variables
}