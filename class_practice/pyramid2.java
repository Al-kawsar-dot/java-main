public class pyramid2 {
    public static void main(String[] args) {
        int i,j;
        for(i=5;i>=1;i--){
            for(j=5;j>=6-i;j--){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
