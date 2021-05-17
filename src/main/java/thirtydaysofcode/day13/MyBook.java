package thirtydaysofcode.day13;

public class MyBook extends Book{

    private int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    String display() {
        return String.format("""
                Title: %s
                Author: %s
                Price: %d""", title, author, price);
    }
}
