package db;

import java.sql.*;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/Moovix";
    private static final String USUARIO = System.getenv("DB_USER");
    private static final String SENHA = System.getenv("DB_PASSWORD");

    public static Connection getConexao() throws SQLException {
        if (USUARIO == null || SENHA == null) {
            System.err.println("Dados inseridos nao correspondem as variaveis de ambiente.");
            throw new SQLException("Credenciais do banco nao definidas.");
        }
        System.out.println("Conectando com usuario: " + USUARIO);
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
