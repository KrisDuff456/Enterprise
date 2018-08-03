package test;
import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import enterprise.JDBC;

public class TestJDBC {
	Connection connection;
	Statement stmt;
	
	@Test
	public void testConn() throws SQLException{
	    new JDBC();
	    assertNull("did not find connection",JDBC.conn);
	}
	
	@Test
	public void testAccess() throws Exception {
		JDBC test = new JDBC();
		test.accessDB();
		String DB_URL = "jdbc:mysql://127.0.0.1:3306/filmenterprise";
		String USER = "root";
		String PASS = "password";	
		connection = DriverManager.getConnection(DB_URL,USER,PASS);
		connection.close(); 
	}
    @Test
    public void test() throws Exception {
    	JDBC test = new JDBC();
    	String name ="John";
    	String email = "Customer@mail.com";
    	SqlCommandresponse = test.selectAccount();
    	test.addAccount((name,email));
    }
    	

}
