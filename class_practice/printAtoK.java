public class printAtoK {
    public static void main(String[] args) {
        //using while loop.
        char ch='a';
        while(ch<='z'){
            if(ch=='k'){
            break;
            }
        System.out.print(ch+ " ");
        ch++;
        }

        
        //using do while loop
        char al='a';
        do{
            System.out.print(al+ " ");
            if(al=='k'){
                break;
            }
            al++;
        }while(al<='z');
    }


       //using for loop
        
}
