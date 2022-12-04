package dev.lobophf.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static Connection connection;

	private ConnectionFactory(Connection connection) {

	}

	public static Connection getConnection() throws SQLException {
		if (connection == null) {
			connection = initConnection();
		}
		return connection;
	}

	private static Connection initConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_store", "store_user", "secret");
	}

}
