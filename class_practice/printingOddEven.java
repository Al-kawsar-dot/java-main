public class printingOddEven {
    public static void main(String[] args) {
        int i;
        System.out.println("Even Numbers :");
        for(i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i +"");
            }
        }
        System.out.println("Odd Numbers :");
        for(i=1;i<=10;i++){
            if(i%2!=0){
                System.out.println(i+"");
            }
        }
    }
}
