class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

  public int getEmployee_Id(){
    return employee_id;
  }
  public void setEmployee_Id(int employee_id){
    this.employee_id=employee_id;
  }
  public String getEmployee_Name(){
    return employee_name;
  }
  public void setEmployee_Name(String employee_name){
    this.employee_name=employee_name;
  }
  public double getEmployee_Salary(){
    return employee_salary;
  }
  public void setEmployee_Salary(double employee_salary){
    this.employee_salary=employee_salary;
  }
  public String getFormatted_Salary(){
    return String.format("$%.2f", employee_salary);
  }



}
