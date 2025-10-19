public class j{
    int id;
    String name;
    String address;
    j(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void BIO(){
        System.out.println("Name :"+name);
        System.out.println("ID :"+id);
        System.out.println("Address :"+address);
    }

    public static void main(String[] arg){
        j b1=new j(1133,"Al Kawsar","Rajibpur");
        b1.BIO();
    }
}