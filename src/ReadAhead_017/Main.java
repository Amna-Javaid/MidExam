package ReadAhead_017;

public class Main {
    public static void main(String[] args) throws Exception{
      LibraryManager inventory = new LibraryManager(20,25) ;

      Book book1= new Fiction("2422","xttw","Clean Code","Fictional");
      Book book2= new NonFiction("2432","dietel","Cracking the Coding Interview","refrence");
      Book book3= new Fiction("2678","xoiju","Pragmatic programming","Fictional");
     inventory.addBook(book1);
     inventory.addBook(book2);
     inventory.addBook(book3);

       User[] users = new User[25];
        users[0] = new User("Ahmed ali", "hyw28");
        users[1]  = new User("Ali qayoom", "hye3go");

       inventory.generateReport();
       inventory.searchBook("2422");
       inventory.borrowBook(users[0],book1);

       inventory.returnBook(users[0],book1);



    }
}
