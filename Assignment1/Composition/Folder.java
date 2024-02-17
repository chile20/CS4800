/*
 * Assignment1_Composition
 * File name: Folder.java
 * Author: Chi Le
 */
 package Composition;
 import java.util.ArrayList;
 import java.util.List;
 
 // Folder class
 public class Folder {
     private String name;
     private List<Folder> subFolders;
     private List<File> files;
 
     /**
      * Constructs a Folder object with the given name.
      * @param name The name of the folder.
      */
     public Folder(String name) {
         this.name = name;
         this.subFolders = new ArrayList<>();
         this.files = new ArrayList<>();
     }
 
     // Getters and setters
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public List<Folder> getSubFolders() {
         return subFolders;
     }
 
     public void setSubFolders(List<Folder> subFolders) {
         this.subFolders = subFolders;
     }
 
     public List<File> getFiles() {
         return files;
     }
 
     public void setFiles(List<File> files) {
         this.files = files;
     }
 
     // Add sub-folder
     public void addSubFolder(Folder folder) {
         subFolders.add(folder);
     }
 
     public void deleteSubFolder(Folder folder) {
        subFolders.remove(folder);
    }

     // Add file
     public void addFile(File file) {
         files.add(file);
     }
 
    // Print function
    public void print(String prefix, boolean isLast) {
        System.out.println(prefix + (isLast ? "└── " : "├── ") + name);
        for (int i = 0; i < subFolders.size(); i++) {
            subFolders.get(i).print(prefix + (isLast ? "    " : "│   "), i == subFolders.size() - 1);
        }
        for (File file : files) {
            System.out.println(prefix + (isLast ? "    " : "│   ") + "├──* " + file.getName());
        }
    }
 }
 