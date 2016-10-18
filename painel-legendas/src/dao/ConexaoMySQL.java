package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL implements IConexao{

	    static Connection conexao;
	    @Override
	    public synchronized Connection getConexao(String tipoBanco, String endereco, String nomeBanco, String nomeUsuario, String senha) throws SQLException {
	        try {
	            if(conexao == null)
	                conexao = DriverManager.getConnection(tipoBanco + "://" + endereco + "/" + nomeBanco, nomeUsuario, senha);
	                return conexao;
	        }catch (SQLException e) {
	            throw new SQLException("Erro ao tentar conectar o banco de dados");
	        }
	    }
	    
	    public Connection conexaoMySQL() throws SQLException {
	        IConexao banco = new ConexaoMySQL();
	        conexao = banco.getConexao("jdbc:mysql", "localhost", "painel_legendas", "root", "");
	        return ConexaoMySQL.conexao;
	        //return this.conexao;
	    }

}
