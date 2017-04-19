package first;

public class department implements Comparable<department>{
	private int dep_id;
    private String emp_name;
    private int emp_dob;
    private int emp_salary;
    private String dep_name;
    private int comp_id;
     
    public int getDepId() {
        return dep_id;
    }
    public void setDepId(int dep_id) {
        this.dep_id = dep_id;
    }
    public String getEmpName() {
        return emp_name;
    }
    public void setEmpName(String emp_name) {
        this.emp_name = emp_name;
    }
    public int getEmpdob() {
        return emp_dob;
    }
    public void setEmpdob(int emp_dob) {
        this.emp_dob = emp_dob;
    }
    public int getSalary() {
        return emp_salary;
    }
    public void setSalary(int emp_salary) {
        this.emp_salary = emp_salary;
    }
    public void setDepname(String dep_name) {
        this.dep_name = dep_name;
    }
    public String getDepname() {
        return dep_name;
    }
    public void setCompid(int comp_id) {
        this.comp_id = comp_id;
    }
    public int getEmpid() {
        return comp_id;
    }
     
    //toString()
    @Override
    public String toString() {
        return "Employee [compId=" + comp_id + ", empName=" + emp_name + ", dob="
                + emp_dob + ", salary=" + emp_salary + ", depname=" + dep_name + "]";
    }       
    public int compareTo(department otherdepartment) {
    	int result = getEmpName().compareToIgnoreCase(otherdepartment.getEmpName());
        if(result==0) {
            return Integer.valueOf(getSalary()).compareTo(otherdepartment.getSalary());
        }
        else {
            return result;
        }
        //return this.getEmpName().compareTo(otherdepartment.getEmpName());
    }
}
