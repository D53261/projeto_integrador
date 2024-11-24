package com.mycompany.pei;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import objetoacesso.ConfirmaDAO;

public class Pei {

    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.getConexao();
    }
    private static Pei instance;
    private int pontos;
    private ConfirmaDAO confirmaDAO;

    public Pei() {
        this.pontos = 0;
        this.confirmaDAO = new ConfirmaDAO();
    }

    public static Pei getInstance() {
        if (instance == null) {
            instance = new Pei();
        }
        return instance;
    }

    public int getPontos(){
        return pontos;
    }

    public void GastarPontos(int pontosGastos, String email) {
        this.pontos -= pontosGastos;
        atualizarPontuacaoNoBanco(this.pontos, email); // Use o email do usuário aqui
    }

    public void GanharPontos(int pontosGanhos, String email) {
        this.pontos += pontosGanhos; 
        atualizarPontuacaoNoBanco(this.pontos, email); // Atualiza a pontuação no banco com o email do usuário
    }

    public int buscarPontuacaoDoBanco(String email) {
        int pontos = 0;
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "SELECT pontos FROM registros WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email); // Assumindo que você tem o email do usuário
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                pontos = rs.getInt("pontos");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar pontuação do banco: " + e.getMessage());
        }
        return pontos;
    }
    
    public String buscarNomeDoBanco(String email) {
        String nome = "Orquestra do Maestro";
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "SELECT nome FROM registros WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email); // Assumindo que você tem o email do usuário
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                nome = rs.getString("nome");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar nome do banco: " + e.getMessage());
        }
        return nome;
    }

    private void atualizarPontuacaoNoBanco(int novaPontuacao, String email) {
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "UPDATE registros SET pontos = ? WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, novaPontuacao);
            stmt.setString(2, email); // Usa o email do usuário
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar pontuação no banco: " + e.getMessage());
        }
    }
}