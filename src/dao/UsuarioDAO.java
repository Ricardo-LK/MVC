package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import model.Usuario;

public class UsuarioDAO {
    Connection conexao;

    public UsuarioDAO()
    {
        conexao = ConexaoMySQL.getInstancia().getConexao();
    }

    public void criarUsuario(Usuario u)
    {
        String sql = "INSERT INTO usuario (nome, email, data_hora) VALUES (?, ?, CURRENT_TIMESTAMP())";

        try
        {
            PreparedStatement stat = conexao.prepareStatement(sql);
            stat.setString(1, u.getNome());
            stat.setString(2, u.getEmail());
            stat.executeUpdate();

            ResultSet rs = stat.getResultSet();
            rs.close();
            stat.close();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }

}