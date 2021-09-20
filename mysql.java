import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql {

	public static void main(String[] args)throws Exception {

		String Connect="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(Connect);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//Get the Connection
		String url="jdbc:mysql://localhost:3306/sonu";
		String user="root";
		String password= "Sonu@1998";
		try {
			Connection conn= DriverManager.getConnection(url, user, password);
			String query="select * from student;";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name= rs.getString("studentcol1");
			System.out.println(name);
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
