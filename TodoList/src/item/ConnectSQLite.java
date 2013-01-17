package item;

import java.sql.*;

public class ConnectSQLite {
	private static Connection con;
	static ResultSet res;  
    static Statement statement;
    PreparedStatement prep;
    
    /*
     * executeQuery()---for getting the data from database 
	 * executeUpdate()---for insert,update,delete 
	 * execute()-any kind of operations
     */
   
	public void connect(){
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        try {
			con = DriverManager.
					getConnection("jdbc:sqlite://C:/Users/macbookpro/Desktop/workspace/Todo-List-RMI/TodoList/database.db");
			statement = con.createStatement();
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
	}
	public void insert(){
		// inserting data
		  
		try {
			prep = con.prepareStatement("insert into toDoItem values(?,?,?,?,?,?,?);");
		      prep.setInt(2, 3);
			  prep.setInt(3,3);
			  prep.setString(4,"2013-01-09");
			  prep.setString(5,"2013-01-20");
			  prep.setString(6, "buying");
			  prep.setString(7, "buy watch");
			  prep.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}
	public void update(String str,int id){
	
		String query = "update toDoItem set object = '"+ str + "' where id = '"+id+ "'";
		try {
			statement.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		  
	}
	public void selectAll(){
		try 
	     {  
	         res = statement.executeQuery("SELECT * FROM toDoItem");  
	         while (res.next()) 
	         {  
	        	 System.out.println(res.getInt("id") + " " + res.getInt("version") + 
	   	    		  " " + res.getInt("priority") + " " + res.getString("lastUpdate")
	   	              + " " + res.getString("deadline") + " " + res.getString("title") + 
	   	              " " + res.getString("object"));
	         }  
	     } 
	     catch (Exception e) 
	     {  
	         e.printStackTrace();  
	     }
	     finally 
	     {  
	         try 
	         {  
	             res.close();  
	             statement.close();  
	             con.close();  
	         } 
	         catch (Exception e) 
	         {  
	             e.printStackTrace();  
	         }  
	     }  
	}
	public static void main(String[] args){
		ConnectSQLite cs = new ConnectSQLite();
	      cs.connect();
	      cs.insert();
//	      cs.update("buy flowers",2);
	      cs.selectAll();  
	}
	
}
