package Franco.Parcial2022_02.Ejercicio1;

import java.util.Arrays;
import java.util.Comparator;

public class TVSeason{
    TVEpisode[] array;
    TVSeason(TVEpisode[] tvEpisodes){
        array=tvEpisodes;
    }
    public TVEpisode[] getCustomOrderCopy(Comparator<TVEpisode> cmp){
        TVEpisode[] aux =Arrays.copyOf(array,array.length);
        Arrays.sort(aux,cmp);
        return aux;
    }
    // Orden 1: Orden descendente por fecha de emisión
    //          y luego desempata ascendente por identificador
    public TVEpisode[] getDateOrderCopy() {
        Comparator<TVEpisode> orden1= new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode o1, TVEpisode o2) {
                int cmp=o2.getAiredDate().compareTo(o1.getAiredDate());
                if (cmp!=0){
                    return cmp;
                }
                return o1.compareTo(o2);
            }
        };
        return getCustomOrderCopy(orden1);
    }

    public TVEpisode[] getNameOrderCopy(){
        // Orden 2: Orden alfabético por nombre
        //          y luego desempata ascendente por identificador
        Comparator<TVEpisode> orden2= new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode o1, TVEpisode o2) {
                int cmp=o1.getTitle().compareTo(o2.getTitle());
                if (cmp!=0){
                    return cmp;
                }
                return o1.compareTo(o2);
            }
        };
        return getCustomOrderCopy(orden2);
    }
    public TVEpisode[] getRatingOrderCopy(){
        // Orden 3: Orden descendente por rating
        //          y luego desempata ascendente por identificador
        Comparator<TVEpisode> orden3= new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode o1, TVEpisode o2) {
                int cmp=Double.compare(o2.getRating(),o1.getRating());
                if (cmp!=0){
                    return cmp;
                }
                return o1.compareTo(o2);
            }
        };
        return getCustomOrderCopy(orden3);
    }
}
