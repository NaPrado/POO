package Franco.colections.ej3;

import java.util.SequencedSet;
import java.util.TreeSet;

public class SharedDrive {
     public static class SharedFile implements Comparable<SharedFile> {
         private String fileName;
         private String category;
         public SharedFile(String fileName, String category){
             this.fileName = fileName;
             this.category = category;
         }

         @Override
         public int compareTo(SharedFile o) {
             int cmp = this.fileName.compareTo(o.fileName);
             if(cmp == 0){
                 return this.category.compareTo(o.category);
             }
             return cmp;
         }

         @Override
         public String toString() {
             return "File %s in work area %s".formatted(fileName,category);
         }
     }
     private SequencedSet<SharedFile> sharedFiles=new TreeSet<>();
     public SharedDrive addFile(String fileName, String category){
         sharedFiles.add(new SharedFile(fileName, category));
         return this;
     }

     public SequencedSet<SharedFile> getAllFiles(){
         return sharedFiles;
     }

    public SequencedSet<SharedFile>getAllFilesReversed(){
         return sharedFiles.reversed();
    }
}
