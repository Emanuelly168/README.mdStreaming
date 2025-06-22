package db;
import java.sql.*;

public class ClienteDAO {

    public boolean cadastrarCliente(Cliente cliente){
        String sql = "INSERT INTO CLIENTE (nome, email, senha, telefone) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1, cliente.getNome());
                stmt.setString(2, cliente.getEmail());
                stmt.setString(3, cliente.getSenha());
                stmt.setInt(4, cliente.getTelefone());
                stmt.executeUpdate();
                return true;
            } catch (SQLException e){
                System.err.println("Erro ao cadastrar usuario:" + e.getMessage());
                return false;
            }
    }

    public boolean loginCliente(String email, String senha){
        String sql = "SELECT * FROM CLIENTE WHERE email = ? AND senha = ?";
        try (Connection conn = Conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1, email);
                stmt.setString(2, senha);
                ResultSet rs = stmt.executeQuery();
                return rs.next();
            } catch(SQLException e){
                System.err.println("Erro ao fazer login:" + e.getMessage());
                return false;
            }
    }



}
