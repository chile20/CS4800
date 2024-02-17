/*
 * Assignment1_Composition
 * File name: Main.java
 * Author: Chi Le
 */
package Composition;
public class Main {
    public static void main(String[] args) {
        // Create folders and files
        Folder demo1 = new Folder("demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File indexHtml = new File("index.html");

        // Build folder structure
        demo1.addSubFolder(sourceFiles);
        demo1.addSubFolder(cache);
        demo1.addSubFolder(publicFolder);
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);
        demo1.addFile(htaccess);
        demo1.addFile(htrouter);
        demo1.addFile(indexHtml);

        // Print folder structure
        System.out.println("Original folder structure': ");
        demo1.print("", true);

        // Remove folder "app" and print again 
        System.out.println("\nRemoving folder 'app': ");
        sourceFiles.deleteSubFolder(app);
        demo1.print("", true);
        
        // Remove folder "public" and print again 
        System.out.println("\nRemoving folder 'app': ");
        demo1.deleteSubFolder(publicFolder);
        demo1.print("", true);
    }
}
