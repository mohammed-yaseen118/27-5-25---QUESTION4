

public class BookSales extends Book {
    String saler;
    double id, sales;

    BookSales(String book, String author, String publisher, String year, double price, String saler, double id,
            double sales) {
        super(book, author, publisher, year, price);
        this.saler = saler;
        this.id = id;
        this.sales = sales;
        System.out.println("Saler: " + saler + ", ID: " + id + ", Sales: " + sales);
    }

    public static void main(String[] args) {
        BookSales book = new BookSales("Harry Potter", "J.K. Rowling", "Bloomsbury", "1997", 29.99, "Alice", 101,
                5000.0);
    }
}
