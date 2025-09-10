public class BookLibrary {
    String bookname;
    String authorname;
    int quantity;
     BookLibrary(String bookname,String authorname,int quantity){
        this.bookname=bookname;
        this.authorname=authorname;
        this.quantity=quantity;
    }
    void issue(){
        if(quantity>0){
            quantity--;
            System.out.println(bookname+":Book issued successfully.");
        }else{
            System.out.println(bookname+"Sorry! This book is not available.");
        }
    }

    void  returnbook(){
        quantity++;
        System.out.println("This is returned successfully.");
    }
    void display(){
        System.out.println("Book Name :"+bookname);
        System.out.println("Author Name :"+authorname);
        System.out.println("Quantity :"+quantity);
        System.out.println("---------------------------------");
    }
    public static void main(String[] args) {
        BookLibrary book1= new BookLibrary("PYTHON","ERIC MATTHES",1);
        BookLibrary book2= new BookLibrary("Biography","Mashudur",1);
        BookLibrary book3= new BookLibrary("Intro to Algorithm","Thomas H.Cormen",1);


        book1.issue();
        book1.returnbook();
        book1.display();

        book2.issue();
        book2.returnbook();
        book2.display();

        book3.issue();
        book3.returnbook();
        book3.display();

    }
}
