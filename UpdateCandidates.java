package JDBC;
import java.sql.*;
import java.util.Scanner;


class UpdateExample
{
	Connection con;
	PreparedStatement pstm;
	UpdateExample()
	{
		
	}
	void createConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "connection");
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void UpdateCandidatesRecords()
	{
		try
		{
			String sqlUpdate="UPDATE candidates " + "SET first_name=?" + "WHERE id = ?";  
			 
			pstm=con.prepareStatement(sqlUpdate);
			
			Scanner s=new Scanner(System.in);
			
            System.out.println("Enter Employee ID:");
		    int eid=s.nextInt();  //134
		    
			System.out.println("Enter First Name:");
			String firstName= s.next();
			
			pstm.setString(1, firstName);
			pstm.setInt(2, eid);
			
			int rowAffected=pstm.executeUpdate();
			System.out.println("Row Affected" + rowAffected);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}



public class UpdateCandidates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdateExample u=new UpdateExample();
		u.createConnection();
		u.UpdateCandidatesRecords();

	}

}
