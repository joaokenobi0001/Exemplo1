public class BackupVisitor implements FileSystemVisitor {
    public void visit(File file) {
        System.out.println("Backing up file: " + file.name);
    }

    public void visit(Directory directory) {
        System.out.println("Backing up directory and contents");
    }
}
