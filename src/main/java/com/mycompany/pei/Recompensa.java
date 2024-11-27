/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pei;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author uept42-user
 */
public class Recompensa extends javax.swing.JFrame {
    Pei pei = Pei.getInstance(); // Usando a instância única
    private static String foiClicado_1 = "";
    private static String foiClicado_2 = "";
    private static String foiClicado_3 = "";
    private static String foiClicado_4 = "";
    private int pontuacao;
    private String emailUsuario;
    private String nome;

    /**
     * Creates new form Recompensa
     */
    public Recompensa(String email) {
        initComponents();
        this.emailUsuario = email;
        this.pontuacao = pei.buscarPontuacaoDoBanco(email); // Busca a pontuação do banco
        pontos.setText(String.valueOf(this.pontuacao));
        this.nome = pei.buscarNomeDoBanco(email);
        nomeperfil.setText(String.valueOf(this.nome));
        foiClicado_1 = pei.buscarRecompensa1DoBanco(email);
        foiClicado_2 = pei.buscarRecompensa2DoBanco(email);
        foiClicado_3 = pei.buscarRecompensa3DoBanco(email);
        foiClicado_4 = pei.buscarRecompensa4DoBanco(email);
        if("sim".equals(String.valueOf(foiClicado_1))) {
            circulo1.setIcon(new ImageIcon(getClass().getResource("/images/Circulo verde.png")));
            texto1.setText("Resgatado");
            texto1.setForeground(new Color(0,178,128));
            recompensa1.setEnabled(false);
        }
        if("sim".equals(String.valueOf(foiClicado_2))) {
            circulo2.setIcon(new ImageIcon(getClass().getResource("/images/Circulo verde.png")));
            texto2.setText("Resgatado");
            texto2.setForeground(new Color(0,178,128));
            recompensa2.setEnabled(false);
        }
        if("sim".equals(String.valueOf(foiClicado_3))) {
            circulo3.setIcon(new ImageIcon(getClass().getResource("/images/Circulo verde.png")));
            texto3.setText("Resgatado");
            texto3.setForeground(new Color(0,178,128));
            recompensa3.setEnabled(false);
        }
        if("sim".equals(String.valueOf(foiClicado_4))) {
            circulo4.setIcon(new ImageIcon(getClass().getResource("/images/Circulo verde.png")));
            texto4.setText("Resgatado");
            texto4.setForeground(new Color(0,178,128));
            recompensa4.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        circulo4 = new javax.swing.JLabel();
        circulo3 = new javax.swing.JLabel();
        circulo2 = new javax.swing.JLabel();
        circulo1 = new javax.swing.JLabel();
        recompensa2 = new javax.swing.JButton();
        recompensa3 = new javax.swing.JButton();
        recompensa4 = new javax.swing.JButton();
        recompensa1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nomeperfil = new javax.swing.JLabel();
        pontos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pontostxt = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("<html><center>Voucher de R$ 20,00 para a<br> Super pet center</center></html>");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 150, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cachorro.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 100, 60));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("<html><center>Pontos necessários: 30</center></html>");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 120, 20));

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("<html><center>Expira em: 20/12</center></html>");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 90, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pão.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 80, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mecanico.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 80, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sacola.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 90, 80));

        texto3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        texto3.setForeground(new java.awt.Color(0, 178, 128));
        texto3.setText("<html><center>Resgatar</center></html>");
        texto3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 50, 20));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("<html><center>Voucher de R$ 15,00 para a<br> mercado super preção</center></html>");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 150, 40));

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("<html><center>Voucher de R$ 50,00 para a<br> Mecânica do suco</center></html>");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 150, 40));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("<html><center>Pontos necessários: 40</center></html>");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 120, 20));

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("<html><center>Expira em: 20/12</center></html>");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 90, 20));

        texto4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        texto4.setForeground(new java.awt.Color(0, 178, 128));
        texto4.setText("<html><center>Resgatar</center></html>");
        texto4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 50, 20));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("<html><center>Pontos necessários: 25</center></html>");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 120, 20));

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("<html><center>Expira em: 20/12</center></html>");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 90, 20));

        texto2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        texto2.setForeground(new java.awt.Color(0, 178, 128));
        texto2.setText("<html><center>Resgatar</center></html>");
        texto2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 50, 20));

        texto1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        texto1.setForeground(new java.awt.Color(0, 178, 128));
        texto1.setText("<html><center>Resgatar</center></html>");
        texto1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 50, 20));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("<html><center>Expira em: 20/12</center></html>");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 90, 20));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("<html><center>Pontos necessários: 30</center></html>");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 120, 20));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("<html><center>Voucher de R$ 20,00 para a<br> padaria pão gostoso</center></html>");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 182, 150, 40));

        circulo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Circulo.png"))); // NOI18N
        jPanel1.add(circulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 100, 100));

        circulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Circulo.png"))); // NOI18N
        jPanel1.add(circulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 100, 100));

        circulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Circulo.png"))); // NOI18N
        jPanel1.add(circulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 100, 100));

        circulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Circulo.png"))); // NOI18N
        jPanel1.add(circulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, 100));

        recompensa2.setBackground(new java.awt.Color(255, 255, 255));
        recompensa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recompensa2ActionPerformed(evt);
            }
        });
        jPanel1.add(recompensa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 190, 230));

        recompensa3.setBackground(new java.awt.Color(255, 255, 255));
        recompensa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recompensa3ActionPerformed(evt);
            }
        });
        jPanel1.add(recompensa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 230));

        recompensa4.setBackground(new java.awt.Color(255, 255, 255));
        recompensa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recompensa4ActionPerformed(evt);
            }
        });
        jPanel1.add(recompensa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 190, 230));

        recompensa1.setBackground(new java.awt.Color(255, 255, 255));
        recompensa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recompensa1ActionPerformed(evt);
            }
        });
        jPanel1.add(recompensa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 450, 650));

        jPanel2.setBackground(new java.awt.Color(0, 178, 128));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeperfil.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        nomeperfil.setForeground(new java.awt.Color(255, 255, 255));
        nomeperfil.setText("Orquestra do Maestro");
        jPanel2.add(nomeperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 21, -1, -1));

        pontos.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        pontos.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(pontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, 40));

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

        pontostxt.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        pontostxt.setForeground(new java.awt.Color(255, 255, 255));
        pontostxt.setText("Pontos:");
        jPanel2.add(pontostxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, 40));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 120));

        jButton6.setBackground(new java.awt.Color(0, 178, 128));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 150, 70));

        jButton7.setBackground(new java.awt.Color(0, 178, 128));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plantinha.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 770, 150, 70));

        jButton8.setBackground(new java.awt.Color(0, 158, 128));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reciclagem pequena.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 770, 150, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarLabelsPontos() {
        String pontosAtualizados = String.valueOf(pei.getPontos());
        pontos.setText(pontosAtualizados);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Perfil perfil = new Perfil(this.emailUsuario);
        perfil.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Pg1 pg1 = new Pg1(this.emailUsuario);
        pg1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Atividades atividades = new Atividades(this.emailUsuario);
        atividades.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Recompensa recompensa = new Recompensa(this.emailUsuario);
        recompensa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void recompensa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recompensa1ActionPerformed
        if("não".equals(String.valueOf(foiClicado_1))) {
            int pontos_gastos = 30;
            if(this.pontuacao >= pontos_gastos) {
                pei.GastarPontos(pontos_gastos, this.emailUsuario); // Passa o email do usuário
                atualizarLabelsPontos();
                circulo1.setIcon(new ImageIcon(getClass().getResource("/images/Circulo verde.png")));
                texto1.setText("Resgatado");
                texto1.setForeground(new Color(0, 178, 128));
                recompensa1.setEnabled(false);
                pei.atualizarRecompensa1NoBanco(this.emailUsuario);
            }else{
                JOptionPane.showMessageDialog(null, "Não tem pontos o suficiente");
            }
        } 
    }//GEN-LAST:event_recompensa1ActionPerformed

    private void recompensa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recompensa2ActionPerformed
        if("não".equals(String.valueOf(foiClicado_2))) {
            int pontos_gastos = 25;
            if(this.pontuacao >= pontos_gastos) {
                pei.GastarPontos(pontos_gastos, this.emailUsuario); // Passa o email do usuário
                atualizarLabelsPontos();
                circulo2.setIcon(new ImageIcon(getClass().getResource("/images/Circulo verde.png")));
                texto2.setText("Resgatado");
                texto2.setForeground(new Color(0, 178, 128));
                recompensa2.setEnabled(false);
                pei.atualizarRecompensa2NoBanco(this.emailUsuario);
            }else{
                JOptionPane.showMessageDialog(null, "Não tem pontos o suficiente");
            }
        }
    }//GEN-LAST:event_recompensa2ActionPerformed

    private void recompensa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recompensa3ActionPerformed
        if("não".equals(String.valueOf(foiClicado_3))) {
            int pontos_gastos = 30;
            if(this.pontuacao >= pontos_gastos) {
                pei.GastarPontos(pontos_gastos, this.emailUsuario); // Passa o email do usuário
                atualizarLabelsPontos();
                circulo3.setIcon(new ImageIcon(getClass().getResource("/images/Circulo verde.png")));
                texto3.setText("Resgatado");
                texto3.setForeground(new Color(0, 178, 128));
                recompensa3.setEnabled(false);
                pei.atualizarRecompensa3NoBanco(this.emailUsuario);
            }else{
                JOptionPane.showMessageDialog(null, "Não tem pontos o suficiente");
            }
        }
    }//GEN-LAST:event_recompensa3ActionPerformed

    private void recompensa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recompensa4ActionPerformed
        if("não".equals(String.valueOf(foiClicado_4))) {
            int pontos_gastos = 40;
            if(this.pontuacao >= pontos_gastos) {
                pei.GastarPontos(pontos_gastos, this.emailUsuario); // Passa o email do usuário
                atualizarLabelsPontos();
                circulo4.setIcon(new ImageIcon(getClass().getResource("/images/Circulo verde.png")));
                texto4.setText("Resgatado");
                texto4.setForeground(new Color(0, 178, 128));
                recompensa4.setEnabled(false);
                pei.atualizarRecompensa4NoBanco(this.emailUsuario);
            }else{
                JOptionPane.showMessageDialog(null, "Não tem pontos o suficiente");
            }
        }
    }//GEN-LAST:event_recompensa4ActionPerformed

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
            java.util.logging.Logger.getLogger(Recompensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recompensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recompensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recompensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private int pontuacao;
            public void run() {
                new Recompensa("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel circulo1;
    private javax.swing.JLabel circulo2;
    private javax.swing.JLabel circulo3;
    private javax.swing.JLabel circulo4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nomeperfil;
    public javax.swing.JLabel pontos;
    private javax.swing.JLabel pontostxt;
    private javax.swing.JButton recompensa1;
    private javax.swing.JButton recompensa2;
    private javax.swing.JButton recompensa3;
    private javax.swing.JButton recompensa4;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    // End of variables declaration//GEN-END:variables
}