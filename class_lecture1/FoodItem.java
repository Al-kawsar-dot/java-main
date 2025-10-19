public class FoodItem {
    double price;
    String name;
    FoodItem() {
        System.out.println("Food Items :1.pizza\n2.chicken tunduri\n3.Rice with egg");
    }

    FoodItem(double price, String name) {
           System.out.println("Name :"+name+    "----"+price);

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
    public pizza(String name, double size, String size){
        
    }
}

