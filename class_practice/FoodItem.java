public class FoodItem {
    double price;
    String name;
    FoodItem() {
        System.out.println("Food Items :1.pizza\n2.chicken tunduri\n3.Rice with egg");
    }

    FoodItem(double price, String name) {
        this.price=price;
        this.name=name;

    }
    void showDetails(){
        System.out.println("Shop Name :Onno rokom test");
        System.out.println("Location :Mirpur 2,beside the Abashik mor");
        System.out.println("Open :8 AM -- 8 PM");
    }

    
}
    class pizza extends FoodItem {
    String size;
    public pizza() {
        System.out.println("This is our very special pizza made by the very pizza specialist");

    }

    public pizza(String size, double price, String name) {
        super(price, name);
        this.size = size;
    }
    void showDetails(){
        System.out.println("Shop Name :Onno rokom test");
        System.out.println("Location :Mirpur 2,beside the Abashik mor");
        System.out.println("Open :8 AM -- 8 PM");
        System.err.println("--------------------------------------------------------");
        System.out.println("Name :"+name);
        System.out.println("Size :"+size);
        System.out.println("Price :"+price);
    }
       
}

class Burger extends FoodItem{
    int nmofpatt;
    public Burger() {
        System.out.println("Welcome to the burger world...");
    }
    public Burger(int nmofpatt, double price, String name){
        super(price,name);
        this.nmofpatt=nmofpatt;
    }
        void showDetails(){
        System.out.println("Shop Name :Onno rokom test");
        System.out.println("Location :Mirpur 2,beside the Abashik mor");
        System.out.println("Open :8 AM -- 8 PM");
        System.err.println("--------------------------------------------------------");
        System.out.println("Name :"+name);
        System.out.println("Number of patties :"+nmofpatt);
        System.out.println("Price :"+price);
    }

     
}


