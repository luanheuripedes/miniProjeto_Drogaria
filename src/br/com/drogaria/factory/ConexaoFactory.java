package br.com.drogaria.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	private static final String USUARIO = "root";
	private static final String SENHA = "123456789";
	private static final String URL = "jdbc:mysql://localhost:3306/drogaria";

	public static Connection conectar() throws SQLException {
		//Se ocorrer error
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			return conexao;
	}
}
