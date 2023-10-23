package ReadAhead_017;

public class NonFiction extends Book implements Categorizable{
    private String subject;

    public NonFiction(String ISBN, String author, String title, String subject) {
        super(ISBN, author, title);
        this.subject = subject;
    }

    @Override
    public void showDetails() {
        System.out.println( "ISBN: "+ getISBN()+"\nAuthor: " +getAuthor() + "\nTitle : "+ getTitle() + "\nStatus : "
                + getStatus() + "\nsubject:" + subject);
    }
    @Override
    public void displayCategoryDetails() {
        System.out.println( "ISBN: "+ getISBN()+"\nAuthor: " +getAuthor() + "\nTitle : "+ getTitle() + "\nStatus : "
                + getStatus() + "\nsubject" + subject);
    }

}
