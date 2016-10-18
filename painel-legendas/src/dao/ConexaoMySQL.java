package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySQL {
	public Connection conexaoMySQL() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexao = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/painel_legendas","root","");
			return conexao;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
