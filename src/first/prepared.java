package first;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class prepared {

		// TODO Auto-generated method stub
		private static String sqlQuery = "SELECT emp_id,emp_name,emp_dob,emp_salary,dep_name FROM comp WHERE dep_id = ?";
		
		
		Connection con = data.getConnection();
		PreparedStatement pst = null;
		
		//create method for retrieving employee details
		public List<department> getDepartme(){
			List<department> dept = new ArrayList<>();
			long millisStart = System.currentTimeMillis();
			
			
			try {
				pst = con.prepareStatement(sqlQuery);
				
			} catch (SQLException e1) {
				e1.getMessage();
			}
			try {
				ResultSet rs = pst.executeQuery();
				
				while(rs.next()){
					department departments = new department();
					departments.setCompid(rs.getInt("comp_id"));
					departments.setEmpName(rs.getString("emp_name"));
					departments.setEmpdob(rs.getInt("emp_dob"));
					departments.setSalary(rs.getInt("emp_salary"));
					departments.setDepname((rs.getString("dep_name")));
	             	
	             	dept.add(departments);
	             	
				}
			} catch (SQLException e) {
				e.getMessage();
			}
			long millisEnd = System.currentTimeMillis();
	      	long totaltime = millisEnd-millisStart;
	      	System.out.println("the time for prepared statement = " +totaltime);
			return dept;
			}
	}


