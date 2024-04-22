import java.util.List;
import java.util.ArrayList;

public class Directory implements FileSystemElement {
    List<FileSystemElement> children = new ArrayList<>();

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        for (FileSystemElement child : children) {
            child.accept(visitor);
        }
    }
}

