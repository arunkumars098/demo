package first;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


 

public class demo {
	 public static void main(String[] args) {  
		 
		 BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the DepartmentID:");
         
         int departmentId;
         try {
         	departmentId = Integer.parseInt(bs.readLine());
             demo demo2 = new demo();
             List<department> departments = demo2.getDepartment(departmentId);
             Collections.sort( departments);
         
             System.out.println(departments);
             Iterator<department> itr = departments.iterator();
             while(itr.hasNext()){
             System.out.println(itr.next());
             }
             
             
         } catch (NumberFormatException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
         
        // prepared dr = new prepared();
	     //dr.getDepartme();
	     
     }
	 
  
     public ArrayList<department> getDepartment(int departmentId)  {  
    	 long millisStart = System.currentTimeMillis();
         ResultSet rs = null;
         Connection connection = null;
         Statement statement = null; 
          
         
         ArrayList<department> departments=new ArrayList<department>();
         
			 String query = "SELECT * FROM comp WHERE dep_id=" + departmentId;
         try {           
             connection = data.getConnection();
             statement = connection.createStatement();
             rs = statement.executeQuery(query);
            
             while (rs.next()) { 
            	// for(int i =0; i < 10; i++){
             	department department2 = new department();
             	department2.setCompid(rs.getInt("comp_id"));
             	department2.setEmpName(rs.getString("emp_name"));
             	department2.setEmpdob(rs.getInt("emp_dob"));
             	department2.setSalary(rs.getInt("emp_salary"));
             	department2.setDepname((rs.getString("dep_name")));
             	
             	departments.add(department2);
             	
             }
           //  }
         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
             if (connection != null) {
                 try {
                     connection.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
         }long millisEnd = System.currentTimeMillis();
         long totaltime = millisEnd-millisStart;
         System.out.println("the time for simple statement = " +totaltime);	
         return departments;
        
 	}
     
     
}
	    
	    	
		
	

