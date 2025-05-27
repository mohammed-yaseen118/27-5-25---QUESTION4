

class Book {
    String book, author, publisher, year;
    double price;

    Book(String book, String author, String publisher, String year, double price) {
        this.book = book;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
        System.out.println("Book: " + book + ", Author: " + author + ", Publisher: " + publisher + ", Year: " + year
                + ", Price: " + price);
    }
}
