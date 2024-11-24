package objetoacesso;

import com.mycompany.pei.Login;
import com.mycompany.pei.Pg1;
import com.mycompany.pei.Pei;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import mapbd.Confirma;

public class ConfirmaDAO {
    private Conexao conexao;
    private Connection conn;
    
    public ConfirmaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Confirma confirma) {
        String sql = "INSERT INTO registros (nome, email, senha, telefone, estado, cpf) VALUES"
                + "(?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, confirma.getNome());
            stmt.setString(2, confirma.getEmail());
            stmt.setString(3, confirma.getSenha());
            stmt.setString(4, confirma.getTelefone());
            stmt.setString(5, confirma.getEstado());
            stmt.setString(6, confirma.getCpf());
            stmt.execute();
        }
        catch(Exception e) {
            System.out.println("Erro ao inserir usuário: " + e.getMessage());
        }
        
    } public int autenticar(Confirma confirma) {
        int pontos = 0;
        String sql = "SELECT pontos FROM registros WHERE email = ? AND senha = ?";
        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, confirma.getEmail());
            stmt.setString(2, confirma.getSenha());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                pontos = rs.getInt("pontos");
                
            } else {
                JOptionPane.showMessageDialog(null, "Email ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao autenticar usuário: " + e.getMessage());
        }
        return pontos;
    }
     public void atualizarPontuacao(String email, int novaPontuacao) {
        String sql = "UPDATE registros SET pontos = ? WHERE email = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, novaPontuacao);
            stmt.setString(2, email); // Substitua pelo email do usuário atual
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar a pontuação: " + e.getMessage());
        }
     }
}
