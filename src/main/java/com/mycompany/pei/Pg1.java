/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pei;

import javax.swing.ImageIcon;
import javax.swing.*;

/**
 *
 * @author uept42-user
 */
public class Pg1 extends javax.swing.JFrame {
    Pei pei = Pei.getInstance(); // Usando a instância única
    private static boolean foiClicado_1 = false;
    private static boolean foiClicado_2 = false;

    /**
     * Creates new form Pg1
     */
    public Pg1() {
        initComponents();
        String ponto = String.valueOf(pei.getPontos());
        pontos.setText(ponto);
        if(foiClicado_1) {
            ImageIcon novo_icone = new ImageIcon(getClass().getResource("/images/euodeionetbeans.png"));
            curtida2.setIcon(novo_icone);
        }
        if(foiClicado_2) {
            ImageIcon novo_icone = new ImageIcon(getClass().getResource("/images/euodeionetbeans.png"));
            curtida.setIcon(novo_icone);
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

        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        curtida = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        curtida2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nomeperfil = new javax.swing.JLabel();
        pontos = new javax.swing.JLabel();
        pontostxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(0, 178, 128));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reciclagem pequena.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 770, 150, 70));

        jButton5.setBackground(new java.awt.Color(0, 158, 128));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 150, 70));

        jButton6.setBackground(new java.awt.Color(0, 178, 128));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plantinha.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 770, 140, 70));

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(100, 100, 100));
        jLabel20.setText("Arte de rua com reciclagelm");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, -1, -1));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(100, 100, 100));
        jLabel21.setText("ONG Anti-Poluição");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/perfil.png"))); // NOI18N
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixo.png"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 860, 20, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compartilhar.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 860, -1, 30));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(100, 100, 100));
        jLabel17.setText("<html>\"Unidos, fazemos a diferença que o mundo precisa! 🍃🐢<br> Contribua com seus tecidos e participe da nossa missão<br> de reciclar e espalhar amor. #TransformeComAmor\"</html>");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 790, -1, 60));

        curtida.setBackground(new java.awt.Color(255, 255, 255));
        curtida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N
        curtida.setBorder(null);
        curtida.setBorderPainted(false);
        curtida.setContentAreaFilled(false);
        curtida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curtidaActionPerformed(evt);
            }
        });
        jPanel3.add(curtida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 860, -1, 30));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(100, 100, 100));
        jLabel18.setText("58 min");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 770, -1, 20));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/postagem 2.png"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retangulo_vazio.png"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 320, 480));

        curtida2.setBackground(new java.awt.Color(255, 255, 255));
        curtida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N
        curtida2.setBorder(null);
        curtida2.setBorderPainted(false);
        curtida2.setContentAreaFilled(false);
        curtida2.setDoubleBuffered(true);
        curtida2.setFocusPainted(false);
        curtida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curtida2ActionPerformed(evt);
            }
        });
        jPanel3.add(curtida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fixo.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compartilhar.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(100, 100, 100));
        jLabel11.setText("<html>\"Juntos, somos a mudança que o mundo precisa! 🌱🪴<br> Traga seus tecidos e junte-se a nós na missão de<br> reciclar e aquecer corações. #Sustentabilidade\"</html>");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 290, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(100, 100, 100));
        jLabel10.setText("32 min.");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/postagem 1.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(100, 100, 100));
        jLabel7.setText("Ideia para reutilizar garrafas pet");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/perfil.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(100, 100, 100));
        jLabel8.setText("ONG Rede");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retangulo_vazio.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 320, -1));

        jScrollPane1.setViewportView(jPanel3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 440, 650));

        jPanel2.setBackground(new java.awt.Color(0, 178, 128));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeperfil.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        nomeperfil.setForeground(new java.awt.Color(255, 255, 255));
        nomeperfil.setText("Orquestra do Maestro");
        jPanel2.add(nomeperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 21, -1, -1));

        pontos.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        pontos.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(pontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, 40));

        pontostxt.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        pontostxt.setForeground(new java.awt.Color(255, 255, 255));
        pontostxt.setText("Pontos:");
        jPanel2.add(pontostxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estrela.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 43));

        jButton1.setBackground(new java.awt.Color(0, 178, 128));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/perfil config.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDoubleBuffered(true);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, 60));

        jButton2.setBackground(new java.awt.Color(0, 178, 128));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log_menor_2.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Perfil perfil = new Perfil();
        perfil.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Pg1 pg1 = new Pg1();
        pg1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void curtida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curtida2ActionPerformed
        ImageIcon icone_inicial = new ImageIcon(getClass().getResource("/images/heart.png"));
        ImageIcon novo_icone = new ImageIcon(getClass().getResource("/images/euodeionetbeans.png"));
        
        if(!foiClicado_1) {
            foiClicado_1 = true;
            curtida2.setIcon(novo_icone);
        } else {
            foiClicado_1 = false;
            curtida2.setIcon(icone_inicial);
        }
    }//GEN-LAST:event_curtida2ActionPerformed

    private void curtidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curtidaActionPerformed
        ImageIcon icone_inicial = new ImageIcon(getClass().getResource("/images/heart.png"));
        ImageIcon novo_icone = new ImageIcon(getClass().getResource("/images/euodeionetbeans.png"));
        
        if(!foiClicado_2) {
            foiClicado_2 = true;
            curtida.setIcon(novo_icone);
        } else {
            foiClicado_2 = false;
            curtida.setIcon(icone_inicial); 
        }
    }//GEN-LAST:event_curtidaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Atividades atividades = new Atividades();
        atividades.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Recompensa recompensa = new Recompensa();
        recompensa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pg1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton curtida;
    private javax.swing.JButton curtida2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeperfil;
    public javax.swing.JLabel pontos;
    private javax.swing.JLabel pontostxt;
    // End of variables declaration//GEN-END:variables
}
