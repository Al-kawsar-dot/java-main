public class Main {
    public static void main(String[] args) {
        Person p=new Person();
        
        p.setName("Al kawsar");
        p.setAge(22);
        p.setCountry("Bangladesh");
        
       String Name=p.getName();
       int Age=p.getAge();
       String Country=p.getCountry();

       System.out.println("Name  :"+Name);
       System.out.println("Age :"+Age);
       System.out.println("Country :"+Country);
    }
}
