public class File {
    public String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }

    public String getName() {
        return fileName;
    }

    public void print() {
        System.out.println(fileName);
    }

}
