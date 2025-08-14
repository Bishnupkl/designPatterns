package composite;

public class Main {
    public static void main(String[] args) {
        File file1 = new TextFile("file1.txt");
        File file2 = new ImageFile("file2.img");


        Folder folder = new Folder("My Folder");
        folder.addFile(file1);
        folder.addFile(file2);

        folder.show();

    }
}
