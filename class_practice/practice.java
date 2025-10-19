public class  practice{
    String name;
    double id;
    double mark1,mark2,mark3;
    double total_mark;

    practice(String name,double id,double mark1,double mark2,double mark3){
        this.name=name;
        this.id=id;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;

    }
    double Total(){
          return mark1+mark2+mark3;
    }
    double average(){
        return Total()/3;
    }
    void details(){
        System.out.println("Student Name :"+name);
        System.out.println("Student ID :"+id);
        System.out.println("Marks :"+mark1+"," +mark2+","+mark3);
        System.out.println("Total Marks :"+Total());
        System.out.println("Average Marks :"+average());
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        practice stdn1= new practice("Al Kawsar",1133,80,86,90);
        practice stdn2=new practice("Rakib", 1123,75,87,74 );

        stdn1.details();
        stdn2.details();
    }
}