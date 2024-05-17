package Franco.colections.ej1;

import java.util.ArrayList;
import java.util.SequencedCollection;
import java.util.function.Predicate;

public class SharedDrive{
    private final SequencedCollection<SharedFile> sharedFiles = new ArrayList<>();

    public SharedDrive addFile(String fileName, String workArea) {
        sharedFiles.add(new SharedFile(fileName, workArea));
        return this;
    }
    public SequencedCollection<SharedFile> getAllFiles() {
        return sharedFiles;
    }
    public SharedFile getFirstFile(Predicate<SharedFile> predicate) {
        for(SharedFile sharedFile : sharedFiles) {
            if(predicate.test(sharedFile)) {
                return sharedFile;
            }
        }
        throw new IllegalArgumentException();
    }
    public SharedFile getLastFile() {
        return sharedFiles.getLast();
    }
    public static class SharedFile {
        private final String fileName, workArea;

        public SharedFile(String fileName, String workArea) {
            this.fileName = fileName;
            this.workArea = workArea;
        }

        public String getFileName() {
            return fileName;
        }

        @Override
        public String toString() {
            return "File %s in work area %s".formatted(fileName, workArea);
        }
    }
}
