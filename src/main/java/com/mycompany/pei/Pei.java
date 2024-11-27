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
        atualizarPontuacaoNoBanco(this.pontos, email); 
    }

    public void GanharPontos(int pontosGanhos, String email) {
        this.pontos += pontosGanhos; 
        atualizarPontuacaoNoBanco(this.pontos, email); 
    }

    public int buscarPontuacaoDoBanco(String email) {
        int pontos = 0;
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "SELECT pontos FROM registros WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email); 
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
            stmt.setString(1, email); 
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
            stmt.setString(2, email); 
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar pontuação no banco: " + e.getMessage());
        }
    }
    
    public void atualizarAtividade1NoBanco(String email) {
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "UPDATE atividades SET atividade1 = ? WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "sim");
            stmt.setString(2, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar atividade no banco: " + e.getMessage());
        }
    }
    
    public void atualizarAtividade2NoBanco(String email) {
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "UPDATE atividades SET atividade2 = ? WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "sim");
            stmt.setString(2, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar atividade no banco: " + e.getMessage());
        }
    }
    
    public void atualizarAtividade3NoBanco(String email) {
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "UPDATE atividades SET atividade3 = ? WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "sim");
            stmt.setString(2, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar atividade no banco: " + e.getMessage());
        }
    }
    
    public void atualizarAtividade4NoBanco(String email) {
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "UPDATE atividades SET atividade4 = ? WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "sim");
            stmt.setString(2, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar atividade no banco: " + e.getMessage());
        }
    }
    
    public String buscarAtividade1DoBanco(String email) {
        String valorAtividade = "não";
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "SELECT atividade1 FROM atividades WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email); 
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                valorAtividade = rs.getString("atividade1");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar atividade do banco: " + e.getMessage());
        }
        return valorAtividade;
    }
    
    public String buscarAtividade2DoBanco(String email) {
        String valorAtividade = "não";
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "SELECT atividade2 FROM atividades WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email); 
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                valorAtividade = rs.getString("atividade2");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar atividade do banco: " + e.getMessage());
        }
        return valorAtividade;
    }
    
    public String buscarAtividade3DoBanco(String email) {
        String valorAtividade = "não";
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "SELECT atividade3 FROM atividades WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email); 
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                valorAtividade = rs.getString("atividade3");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar atividade do banco: " + e.getMessage());
        }
        return valorAtividade;
    }
    
    public String buscarAtividade4DoBanco(String email) {
        String valorAtividade = "não";
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "SELECT atividade4 FROM atividades WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email); 
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                valorAtividade = rs.getString("atividade4");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar atividade do banco: " + e.getMessage());
        }
        return valorAtividade;
    }
    
    public void atualizarRecompensa1NoBanco(String email) {
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "UPDATE recompensas SET recompensa1 = ? WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "sim");
            stmt.setString(2, email); 
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar recompensa no banco: " + e.getMessage());
        }
    }
    
    public void atualizarRecompensa2NoBanco(String email) {
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "UPDATE recompensas SET recompensa2 = ? WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "sim");
            stmt.setString(2, email); 
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar recompensa no banco: " + e.getMessage());
        }
    }
    
    public void atualizarRecompensa3NoBanco(String email) {
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "UPDATE recompensas SET recompensa3 = ? WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "sim");
            stmt.setString(2, email); 
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar recompensa no banco: " + e.getMessage());
        }
    }
    
    public void atualizarRecompensa4NoBanco(String email) {
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "UPDATE recompensas SET recompensa4 = ? WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "sim");
            stmt.setString(2, email); 
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar recompensa no banco: " + e.getMessage());
        }
    }
    
    public String buscarRecompensa1DoBanco(String email) {
        String valorRecompensa = "não";
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "SELECT recompensa1 FROM recompensas WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email); 
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                valorRecompensa = rs.getString("recompensa1");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar recompensa do banco: " + e.getMessage());
        }
        return valorRecompensa;
    }
    
    public String buscarRecompensa2DoBanco(String email) {
        String valorRecompensa = "não";
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "SELECT recompensa2 FROM recompensas WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email); 
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                valorRecompensa = rs.getString("recompensa2");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar recompensa do banco: " + e.getMessage());
        }
        return valorRecompensa;
    }
    
    public String buscarRecompensa3DoBanco(String email) {
        String valorRecompensa = "não";
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "SELECT recompensa3 FROM recompensas WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email); 
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                valorRecompensa = rs.getString("recompensa3");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar recompensa do banco: " + e.getMessage());
        }
        return valorRecompensa;
    }
    
    public String buscarRecompensa4DoBanco(String email) {
        String valorRecompensa = "não";
        try (Connection conn = new Conexao().getConexao()) {
            String sql = "SELECT recompensa4 FROM recompensas WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email); 
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                valorRecompensa = rs.getString("recompensa4");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar recompensa do banco: " + e.getMessage());
        }
        return valorRecompensa;
    }
}