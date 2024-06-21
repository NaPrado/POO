package RecuPrimerParcial.Rec1_23_01.Ej2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class WordCountCatalog implements Iterable<WordCount> {
    private static int BLOCK=10;
    private int addpointer=0;
    WordCount [] palabras = new WordCount[BLOCK];

    protected abstract Comparator<WordCount> getComparator();
    @Override
    public Iterator<WordCount> iterator(){
        WordCount [] pals = Arrays.copyOf(palabras, palabras.length);
        Arrays.sort(pals,getComparator());
        return new Iterator<WordCount>(){
            int index = 0;
            @Override
            public boolean hasNext(){
                return index < pals.length;
            }
            @Override
            public WordCount next(){
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                return pals[index];
            }
        };
    }
    private void resize(){
        palabras = Arrays.copyOf(palabras, palabras.length+BLOCK);
    }
    public WordCountCatalog add(WordCount wordCount){
        if (addpointer == palabras.length) {
            resize();
        }
        palabras[addpointer++]=wordCount;
        return this;
    }
    public WordCount getByIndex(int index){
        if (index<0 || index >= palabras.length){
            throw new RuntimeException();
        }
        return palabras[index];
    }
}
