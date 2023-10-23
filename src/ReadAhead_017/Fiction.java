package ReadAhead_017;

public class Fiction extends Book implements Categorizable{

    private String genre;

    public Fiction(String ISBN, String author, String title ,String genre) {
        super(ISBN, author, title);
        this.genre = genre;
    }


    @Override
    public void showDetails() {
        System.out.println( "ISBN: "+ getISBN()+"\nAuthor: " +getAuthor() + "\nTitle : "+ getTitle() + "\nStatus : "
                + getStatus() + "\ngenre" + genre);
    }


    @Override
    public void displayCategoryDetails() {
        System.out.println( "ISBN: "+ getISBN()+"\nAuthor: " +getAuthor() + "\nTitle : "+ getTitle() + "\nStatus : "
                + getStatus() + "\ngenre" + genre);
    }
}
