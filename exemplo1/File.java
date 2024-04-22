public class File implements FileSystemElement {
    String name;

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
