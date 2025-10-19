public class Car_Main {
   public static void main(String[] args) {
       Car car1=new Car();


       car1.setCompany_Name("BMW");
       car1.setModel_Name("MT-500");
       car1.setYear(2005);
       car1.setMileAge(30);
       
       double mileage=car1.getMileAge();
       System.out.println("Car Information :");
       System.out.println("Mileage :"+mileage);
   }    
}
