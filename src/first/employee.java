package first;

import java.sql.Date;

public class employee {
	
	     
	    private int empId;
	    private String empName;
	    private int dob;
	    private int salary;
	    private String adress;
	     
	    public int getEmpId() {
	        return empId;
	    }
	    public void setEmpId(int empId) {
	        this.empId = empId;
	    }
	    public String getEmpName() {
	        return empName;
	    }
	    public void setEmpName(String empName) {
	        this.empName = empName;
	    }
	    public int getDob() {
	        return dob;
	    }
	    public void setDob(int dob) {
	        this.dob = dob;
	    }
	    public int getSalary() {
	        return salary;
	    }
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }
	    public void setAdress(String adress) {
	        this.adress = adress;
	    }
	    public String getAdress() {
	        return adress;
	    }
	     
	    //toString()
	    @Override
	    public String toString() {
	        return "Employee [empId=" + empId + ", empName=" + empName + ", dob="
	                + dob + ", salary=" + salary + ", adress=" + adress + "]";
	    }       
	}


