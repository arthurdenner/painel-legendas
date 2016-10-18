package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import model.Usuario;

public class UsuarioDAO {
	 ConexaoMySQL conexao = new ConexaoMySQL();
	    
	 	public int insert(Usuario usuario) throws SQLException {
	        Statement stmt;
	        try {
	            stmt = conexao.conexaoMySQL().createStatement();
	            String exe = "INSERT INTO usuario(nick, email, senha, foto, id_permissao) VALUES (" 
	                    + "'" + usuario.getNick()+ "', " + "'" + usuario.getEmail() + "'," + "'" + usuario.getSenha() + "'," 
	                    + " ')";
	            stmt.executeUpdate(exe);
	            return 1;
	        } catch (SQLException e) {
	            throw new SQLException("Erro: " + e.getMessage());
	        }
	    }       
	    
	    public int updateEmail(Usuario usuario) throws SQLException {
	        Statement stmt;
	        try {
	            stmt = conexao.conexaoMySQL().createStatement();
	            String exe = "UPDATE usuario SET Email = '" + usuario.getEmail() + "'"
	                    + " WHERE id_usu = '" + usuario.getId_Usuario() +"'";
	            stmt.executeUpdate(exe);
	            return 1;
	        } catch (SQLException e) {
	            throw new SQLException("Erro: " + e.getMessage());
	        }
	    }   
	    
	    public int updateSenha(Usuario usuario) throws SQLException {
	        Statement stmt;
	        try {
	            stmt = conexao.conexaoMySQL().createStatement();
	            String exe = "UPDATE usuario SET senha = '" + usuario.getSenha() + "'"
	                    + " WHERE id_usu = '" + usuario.getId_Usuario() +"'";
	            stmt.executeUpdate(exe);
	            return 1;
	        } catch (SQLException e) {
	            throw new SQLException("Erro: " + e.getMessage());
	        }
	    }    
	    
	    public int updateNick(Usuario usuario) throws SQLException {
	        Statement stmt;
	        try {
	            stmt = conexao.conexaoMySQL().createStatement();
	            String exe = "UPDATE usuario SET nick = '" + usuario.getNick() + "'"
	                    + " WHERE id_usu = '" + usuario.getId_Usuario() +"'";
            stmt.executeUpdate(exe);
	            return 1;
	        } catch (SQLException e) {
	            throw new SQLException("Erro: " + e.getMessage());
	        }
	    }    
	   	    
	    public int delete(String nick) throws SQLException {
	        Statement stmt;
	        try {
	            stmt = conexao.conexaoMySQL().createStatement();
	            String exe = "DELETE FROM usuario  WHERE nick = '" + nick +"'";
	            stmt.executeUpdate(exe);
	            return 1;
	        } catch (SQLException e) {
	            throw new SQLException("Erro: " + e.getMessage());
	        }
	    } 
	    public ArrayList<Usuario> listarUsuarios() throws SQLException{
	        ResultSet rs;
	        PreparedStatement pstm;
	        ArrayList<Usuario> usuarios = new ArrayList<>();
	        try {
	            pstm = conexao.conexaoMySQL().prepareStatement("SELECT * FROM usuario");
	            rs = pstm.executeQuery();
	            while (rs.next()) {
	            	Usuario usuario = new Usuario();
	            	usuario.setId(Integer.parseInt(rs.getString("id_usu")));
	            	usuario.setNick(rs.getString("nick"));
	            	usuario.setEmail(rs.getString("email"));
	            	usuarios.add(usuario);
	            }
	            return usuarios;
	        } catch (SQLException e) {
	        	throw new SQLException("Erro: " + e.getMessage());
	        }
	    }
	    
	    public Usuario buscarPorId(int id) throws SQLException{
	        ResultSet rs;
	        PreparedStatement pstm;
	       try {
	            pstm = conexao.conexaoMySQL().prepareStatement("SELECT * FROM usuario where id_usu = " + id);
	            rs = pstm.executeQuery();
	            Usuario usuario = new Usuario();
	            while (rs.next()) {
	            	usuario.setId(Integer.parseInt(rs.getString("id_usu")));
	            	usuario.setNick(rs.getString("nick"));
	            	usuario.setEmail(rs.getString("email"));	            	 
	            }
	            return usuario;
	        } catch (SQLException e) {
	        	throw new SQLException("Erro: " + e.getMessage());
	        }
	    }
	    
	    public boolean isExistePesquisa(String nomeCampo, String pesquisa) throws SQLException {
	        ResultSet rs;
	        try {
	            String exe = "select * FROM usuario WHERE " + nomeCampo + " = '" + pesquisa +"'";
	            PreparedStatement pstm = conexao.conexaoMySQL().prepareStatement(exe);
	            rs = pstm.executeQuery();
	            return rs.next();
	        } catch (SQLException e) {
	            throw new SQLException("Erro: " + e.getMessage());
	        }
	    }
  }
