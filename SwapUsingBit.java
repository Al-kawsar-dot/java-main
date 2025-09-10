public class SwapUsingBit {
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=20;
        System.err.println("Before Swap :");
        System.err.println("a="+a+"\nb="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.err.println("After Swap :");
        System.err.println("a="+a);
        System.err.println("b="+b);

    }
}
