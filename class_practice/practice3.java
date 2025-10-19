import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          int reversed=0;
          int n=String.valueOf(num).length();
          int original=num;
          while(num!=0){
            int digit=num%10;
            reversed+=(int)Math.pow(digit,n);
            num=num/10;
          }
          if(reversed==original){
            System.out.println("This is armstrong number.");
          }else{
            System.out.println("This is not armstrong number.");
          }
    }
}

