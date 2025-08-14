package composite;

public class ImageFile implements File{

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("ImageFile: "+name);
    }

    @Override
    public void addFile(File file) {
        System.out.println("adding file");
        throw new UnsupportedOperationException("Cannot add to Imagefile");
    }
}
