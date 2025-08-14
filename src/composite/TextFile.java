package composite;

public class TextFile implements File{

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("Textfile: "+name);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Cannot add to Textfile");
    }
}
