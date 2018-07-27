package movieEnterpirse;

public class Main {
/*	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/filmenterprise";
	static final String USER = "root";
	static final String PASS = "password123";	

	static Connection conn = null;
*/
	
	public static void main(String[] args) throws Exception{
		
		 new JDBC().accessDB();
		 
		 new JDBC().addAccount();
		

/*
		 Statement stmt = null;
		 
		 stmt = conn.createStatement();
		// String sql = "INSERT INTO account VALUES (1, 3,'email@gmail.com','password',0,0,'John','Doe',1,'2005-01-01')";
		// stmt.executeUpdate(sql);
		 
		 String sql2= "SELECT AccountID, CustomerID, Email, Password, PurchasedFilms, First_name, Last_name FROM account";
		 ResultSet rs = stmt.executeQuery(sql2);
		  while (rs.next()) {
			  int accID = rs.getInt("AccountID");
			  int custId = rs.getInt("CustomerID");
			  String email = rs.getString("Email");
			  String password = rs.getString("Password");
			  int purchFilm = rs.getInt("PurchasedFilms");
			  String fName = rs.getString("First_name");
			  String lName = rs.getString("Last_name");
			  System.out.println("AccountID " + accID + ", CustomerID " + custId + ", Email" + email + ", Password" + password + ", PurchasedFilms " + purchFilm + ", First_name " + fName + ", Last_name " + lName);
		  }
		  rs.close();
		conn.close();
		}catch(SQLException sqle) {sqle.printStackTrace();
	*/
	
		
	}

}

