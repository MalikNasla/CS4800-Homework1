import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<Folder> subFolders;
    private ArrayList<File> files;

    public Folder(String name) {
        this.name = name;
        subFolders = new ArrayList<>();
        files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void print() {
        print(this, 0);
    }

    private void print(Folder folder, int depth) {
        if (folder.getName() == null) {
            return;
        }

        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }

        System.out.println(indent + folder.getName());

        for (int i = 0; i < folder.subFolders.size(); i++) {
            Folder subFolder = folder.subFolders.get(i);
            print(subFolder, depth + 1);
        }

        for (int i = 0; i < folder.files.size(); i++) {
            File file = folder.files.get(i);
            System.out.println(indent + file.getName());
        }
    }


    public void delete() {
        for (Folder subFolder : subFolders) {
            subFolder.delete();
        }
        subFolders.clear();
        files.clear();
        this.name = null;
    }
}
