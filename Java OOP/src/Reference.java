class bookShelf{
    String title;
    String author;

    bookShelf(String title, String author){
        this.title = title;
        this.author = author;

    }

    void display(){
    System.out.println("\nTitle\t: " + title);
    System.out.println("Author\t: " + author);
    }
}

public class Reference {
    public static void main(String[] args) {
        bookShelf book1 = new bookShelf("Fish in the sea", "Mr. Fish");
        book1.display();

        // showing address
        String addres1 = Integer.toHexString(System.identityHashCode(book1));
        System.out.println(addres1);
        
        // assignment object
        bookShelf book2 = book1;
        book2.display();
        String addres2 = Integer.toHexString(System.identityHashCode(book1));
        System.out.println(addres2);

        // because book1 and book2 in the same address or same reference
        book1.title = "Fish in the Aquarium";
        book1.display();
        book2.display();

        // we adding object in method
        func(book2);
        book1.display();
        book2.display();
    }

    public static void func(bookShelf bookData){
        String addresBook = Integer.toHexString(System.identityHashCode(bookData));
        System.out.println(addresBook);
        bookData.author = "Mr. Sea";
    }
}
