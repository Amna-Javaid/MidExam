package ReadAhead_017;

import java.util.Objects;

public abstract class Book {
    private String ISBN;
    private String author;
    private String title;
    Status status;

    public Book(String ISBN, String author, String title) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.status = Status.AVAILABLE;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }
    public abstract void showDetails();



    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getISBN().equals(book.getISBN());
    }


}
