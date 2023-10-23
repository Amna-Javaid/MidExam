package ReadAhead_017;

public class LibraryManager {
    Book [] libraryInventory ;
    User [] users ;
    int maxBooks;
    int maxUsers;
    int bookCount;

     LibraryManager(int maxBooks,int maxUsers){
         this.maxBooks=maxBooks;
         this.maxUsers=maxUsers;
         this.bookCount=0;
         libraryInventory =new Book[maxBooks];
         users = new User[maxUsers];

     }

     public void borrowBook( User user ,Book book){
        user.borrowBook(book);
     }
     public void addBook(Book book)
     {
        if (bookCount<libraryInventory.length) {
            libraryInventory[bookCount]= book;
            bookCount++;
            System.out.println(book.getTitle() + " added successfully");

        }
        else {
            System.out.println("limit is full!!");
        }
     }

     public void searchBook(String ISBN)
     {
        boolean found = false;
        for ( int i =0; i< bookCount;i++)
        {
            if ( libraryInventory[i].getISBN().equals(ISBN))
            {
                System.out.println("BOOK found\n " + libraryInventory[i]);
                found = true;
            }

        }
        if(!found) {
         System.out.println("Book not found");
     }
     }

     public void generateReport(){
         for (int i =0; i<libraryInventory.length; i++) {
             if (libraryInventory[i] != null) {
                libraryInventory[i].showDetails();
                 System.out.println();
             }
         }



     }

     public void returnBook(User user , Book book)
     {
       user.returnBook(book);
     }







}
