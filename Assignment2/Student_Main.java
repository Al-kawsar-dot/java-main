public class Student_Main {
    public static void main(String[] args) {
        Student s1=new Student();

        s1.setStudent_ID(1133);
        s1.setStudent_Name("Al Kawsar");
        s1.setStudent_Grade(3.61);
       double ultimate=s1.addGrade(0.15);
        System.out.println("Student Portal :");
        System.out.println("ID :"+s1.getStudent_ID());
        System.out.println("Name :"+s1.getStudent_Name());
        System.out.println("Grade :"+s1.getStudent_Grade());
        System.out.println("After Extra Activities...............");
        System.out.println("Total Grades :"+ultimate);
    }
}
