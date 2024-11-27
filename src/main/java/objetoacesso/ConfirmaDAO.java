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
        String sql1 = "INSERT INTO registros (nome, email, senha, telefone, estado, cpf) VALUES"
                + "(?, ?, ?, ?, ?, ?)";
        String sql2 = "INSERT INTO atividades (email) VALUES"
                + "(?)";
        String sql3 = "INSERT INTO recompensas (email) VALUES"
                + "(?)";
        try{
            PreparedStatement stmt1 = this.conn.prepareStatement(sql1);
            stmt1.setString(1, confirma.getNome());
            stmt1.setString(2, confirma.getEmail());
            stmt1.setString(3, confirma.getSenha());
            stmt1.setString(4, confirma.getTelefone());
            stmt1.setString(5, confirma.getEstado());
            stmt1.setString(6, confirma.getCpf());
            stmt1.execute();
            
            PreparedStatement stmt2 = this.conn.prepareStatement(sql2);
            stmt2.setString(1, confirma.getEmail());
            stmt2.execute();
            
            PreparedStatement stmt3 = this.conn.prepareStatement(sql3);
            stmt3.setString(1, confirma.getEmail());
            stmt3.execute();
        }
        catch(Exception e) {
            System.out.println("Erro ao inserir usuário: " + e.getMessage());
        }
        
    } public int autenticar(Confirma confirma, String email) {
        int pontos = 0;
        Login login = new Login();
        String sql = "SELECT pontos FROM registros WHERE email = ? AND senha = ?";
        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, confirma.getEmail());
            stmt.setString(2, confirma.getSenha());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                pontos = rs.getInt("pontos");
                Pg1 pg1 = new Pg1(email);
                pg1.setVisible(true);
                login.dispose();
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
            stmt.setString(2, email); 
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar a pontuação: " + e.getMessage());
        }
     }
}
