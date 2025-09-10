public class practice {
    public static int a=2;
    public static int count(){
     return a++;
    }
    public static void main(String[] args) {
        int sum= count() + count();
        sum=sum++;
        System.out.println("Sum: "+sum);
    }
}
