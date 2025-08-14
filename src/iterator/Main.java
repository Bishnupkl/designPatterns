package iterator;

public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook("book 1");
        bookshelf.addBook("book 2");
        bookshelf.addBook("book 3");
        bookshelf.addBook("book 4");

        Iterator iterator = bookshelf.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
