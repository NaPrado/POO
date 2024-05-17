package Franco.colections.ej4;

import java.util.*;

public class SharedDrive {
    public SequencedMap<String,Set<SharedFile>> mapa = new TreeMap<>(Comparator.reverseOrder());

    SharedDrive addFile(String fileName, String workArea){
        SharedFile newValue = new SharedFile(fileName,workArea);
        if(!mapa.containsKey(workArea)){
            TreeSet<SharedFile> values= new TreeSet<>();
            mapa.put(workArea, values);
        }
        mapa.get(workArea).add(newValue);
        return this;
    }
    public Set<SharedFile> getWorkAreaFiles(String wa){
        return mapa.get(wa);
    }
    public Set<String> getWorkAreas(){
        return mapa.keySet();
    }
    public int filesCount(String wa){
        return getWorkAreaFiles(wa).size();
    }

    public static class SharedFile implements Comparable<SharedFile>{
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

        @Override
        public int hashCode(){
            return Objects.hash(fileName,workArea);
        }
        @Override
        public boolean equals(Object obj){
            return this == obj || (obj instanceof SharedFile s &&
                    s.fileName.equals(fileName) &&
                    s.workArea.equals(workArea));
        }

        @Override
        public int compareTo(SharedFile o) {
            int cmp = this.fileName.compareTo(o.fileName);
            if(cmp == 0){
                return this.workArea.compareTo(o.workArea);
            }
            return cmp;
        }
    }
}
