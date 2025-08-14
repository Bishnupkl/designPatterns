package iterator;

public class BookShelfIterator implements  Iterator {

    private Bookshelf bookshelf;
    private  int index;

    public BookShelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookshelf.getBooks().size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return bookshelf.getBooks().get(index++);
        }
        return null;
    }
}
