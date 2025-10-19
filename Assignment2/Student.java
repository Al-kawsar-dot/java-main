public class Student {
    private int student_id;
    private String student_name;
    private double student_grade;

    public int getStudent_ID(){
        return student_id;
    }
    public void setStudent_ID(int student_id){
        this.student_id=student_id;
    }
    public String getStudent_Name(){
        return  student_name;
    }
    public void setStudent_Name(String student_name){
        this.student_name=student_name;
    }
    public double getStudent_Grade(){
        return student_grade;
    }
    public void setStudent_Grade(double student_grade){
        this.student_grade=student_grade;
    }

    public double addGrade(double extra_grade){
        double total=student_grade+extra_grade;
        return total;
    }
}
