package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteConnectTest {

	public static void main(String[] args) {
		SQLiteConnectTest app = new SQLiteConnectTest();
		app.selectAll();
	}

	private Connection connect() {
		Connection conn = null;

		try {
			String path = "jdbc:sqlite:C:\\Users\\Owner\\Desktop\\Brogramming\\SQLiteStudio\\Sample";

			conn = DriverManager.getConnection(path);
			System.out.println("Connection to SQLite has been established.");

		} catch (SQLException e) {
			System.out.println("The database requested was not found");
		}
		
		return conn;
	}
	
	public void selectAll() {
		String sql = "SELECT * FROM Stock";
		
		try {
			Connection conn = this.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					System.out.println(rs.getInt("Id") + "\t" +
							rs.getString("Ticker") + "\t" +
							rs.getString("FullName") + "\t\t\t" +
							rs.getString("TradingDay") + "\t" +
							rs.getDouble("Price"));
				}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
