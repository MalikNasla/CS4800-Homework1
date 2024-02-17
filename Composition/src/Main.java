public class Main {
    public static void main(String[] args) {
        // Create the file system structure
        Folder demo1 = new Folder("php_demo1");
        Folder source = new Folder("Source");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");
        demo1.addSubFolder(source);
        demo1.addSubFolder(includePath);
        demo1.addSubFolder(remoteFiles);

        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder aPublic = new Folder("public");
        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");
        source.addSubFolder(phalcon);
        source.addSubFolder(app);
        source.addSubFolder(cache);
        source.addSubFolder(aPublic);
        source.addFile(htaccess);
        source.addFile(htrouter);
        source.addFile(index);

        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        System.out.println("php_demo1 and subfolders:");
        demo1.print();
        System.out.println();

        System.out.println("Delete app folder:");
        app.delete();
        demo1.print();
        System.out.println();

        System.out.println("Delete public folder:");
        aPublic.delete();
        demo1.print();
    }
}