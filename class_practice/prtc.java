import java.util.scanner;
public class prtc{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                sum+=i;

            }
        }
        System.out.println("Total sum of odd is :"+sum);
    }
}