package RecuPrimerParcial.Rec1_23_01.Ej2;

import java.util.Comparator;

public class AlphabeticalWordCatalog extends WordCountCatalog{
    @Override
    protected Comparator<WordCount> getComparator() {
        return new Comparator<WordCount>() {
            @Override
            public int compare(WordCount o1, WordCount o2) {
                int ret= o1.getWord().compareTo(o2.getWord());
                if(ret==0){
                    ret=Integer.compare(o1.getCount(),(o2.getCount()));
                }
                return ret;
            }
        };
    }
}
