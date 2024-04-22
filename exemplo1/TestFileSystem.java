public class TestFileSystem {
    public static void main(String[] args) {
        // Criando um diretório e alguns arquivos
        Directory rootDirectory = new Directory();
        File file1 = new File();
        file1.name = "File1.txt";
        File file2 = new File();
        file2.name = "File2.txt";

        // Adicionando arquivos ao diretório
        rootDirectory.children.add(file1);
        rootDirectory.children.add(file2);

        // Criando o visitante para backup
        BackupVisitor backupVisitor = new BackupVisitor();

        // Visitando os elementos
        rootDirectory.accept(backupVisitor);  // Deve processar o diretório e os arquivos dentro dele
    }
}
