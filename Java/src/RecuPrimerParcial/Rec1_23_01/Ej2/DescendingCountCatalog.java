package RecuPrimerParcial.Rec1_23_01.Ej2;

import javax.xml.catalog.Catalog;
import java.util.Comparator;

public class DescendingCountCatalog extends WordCountCatalog {
    @Override
    protected Comparator<WordCount> getComparator() {
        return new Comparator<WordCount>() {
            @Override
            public int compare(WordCount o1, WordCount o2) {
                int ret= Integer.compare(o2.getCount(),(o1.getCount()));
                if(ret==0){
                    ret=o2.getWord().compareTo(o1.getWord());
                }
                return ret;
            }
        };
    }
}
