package com.jlcindia.bookstore.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.commons.dbcp.BasicDataSource;

public class DataSourceUtil {

	public static Connection getConnection() {
		Connection con = null;
		try {
			org.apache.tomcat.dbcp.dbcp2.BasicDataSource myds = new org.apache.tomcat.dbcp.dbcp2.BasicDataSource();
			myds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			myds.setUrl("jdbc:mysql://localhost:3306/myjlcbsDB");
			myds.setUsername("root");
			myds.setPassword("param");
			myds.setInitialSize(10);
			myds.setMaxTotal(100);

			con = myds.getConnection();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}

	public static void cleanUp(Statement st, Connection con) {

		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void cleanUp(ResultSet rs, Statement st, Connection con) {

		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}