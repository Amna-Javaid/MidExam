package ReadAhead_017;

public class User {
    private String userName;
    private String password;
    Book[] borrowedBooks;
    int borrowCount;
     Status borrowStatus;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.borrowCount=0;
        this.borrowStatus = Status.AVAILABLE;
        borrowedBooks= new Book[100];
    }
    public void borrowBook( Book book){

         if (book.getStatus()==Status.AVAILABLE) {
             if (borrowCount < borrowedBooks.length) {
                 borrowedBooks[borrowCount] = book;
                 borrowCount++;
                 book.status = Status.BORROWED;
                 System.out.println(book.getTitle() + "is borrowed");
             } else {
                 System.out.println("Borrow limit is full");
             }
         }
    }
    public void returnBook(Book book){
        for (int i=0;i<borrowCount;i++){
           if (book.getStatus()==Status.BORROWED) {
               borrowStatus = Status.AVAILABLE;
               for (int j=i;j<borrowCount-1;j++)
               {
                   borrowedBooks[j]=borrowedBooks[j+1];
               }
               borrowCount--;
               System.out.println("book returned successfully");
           }
        }

    }

    public void printBorrowedBooks(){
        if (borrowCount == 0) {
            System.out.println(userName + " has not borrowed any books.");
        } else {
            System.out.println(userName + " has borrowed the following books:");
            for (int i = 0; i < borrowCount; i++) {
                System.out.println(borrowedBooks[i].getTitle());
            }
        }
    }



}
