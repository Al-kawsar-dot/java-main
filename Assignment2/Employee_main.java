public class Employee_main {
    public static void main(String[] args) {
        Employee p1=new Employee();

        p1.setEmployee_Id(1133);
        p1.setEmployee_Name("Al Kawsar");
        p1.setEmployee_Salary(70000);
        
        System.out.println("Employee Details :");

        System.out.println("ID :"+p1.getEmployee_Id());
        System.out.println("NAME :"+p1.getEmployee_Name());
        System.out.println("Formatted Salary :"+p1.getFormatted_Salary());
    }
}
