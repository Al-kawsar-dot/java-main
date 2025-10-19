class Circle {
    private double radius;

    public double  getRadius(){
        return radius;
    }
    public void setRadius(double  radius){
        this.radius=radius;
    }

    public double CalculateArea(){
        return Math.PI*radius*radius;
    }
    public double CalculatePerimeter(){
        return Math.PI*radius;
    }
}

class Circle_Main extends Circle{
   public static void main(String[] args) {
       Circle_Main result1=new Circle_Main();

       result1.setRadius(7.2);
       System.out.println("Circle Radius :"+result1.getRadius());
       System.out.println("Circle Area :"+result1.CalculateArea());
       System.out.println("Circle Perimeter :"+result1.CalculatePerimeter());
   }
}