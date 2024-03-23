package TP2.Ej7;

public class Histograma {
    private int [] vecApariciones;
    private void loadNewVal(int val){
        if (val<=100) {
            vecApariciones[val / 10]++;
        }
    }
    public Histograma(int [] vec) {
        vecApariciones=new int[100];
        for (int j : vec) {
            loadNewVal(j);
        }
    }
    private int max(){
        int max=vecApariciones[0];
        for (int i = 1; i < vecApariciones.length; i++) {
            max=Math.max(max,vecApariciones[i]);
        }
        return max;
    }
    public StringBuilder getHistogramaString(){
        String pipe = "|";
        String space = "   ";
        String ast = " * ";
        String ln = "\n";
        StringBuilder histo = new StringBuilder();
        int max=-1;
        while (max!=0) {
            max=max();
            histo.append(pipe);
            for (int j=0 ; j < 10; j++){
                if (vecApariciones[j] == max){
                    histo.append(ast).append(pipe);
                    vecApariciones[j]--;
                }
                else{
                    histo.append(space).append(pipe);
                }
            }
            histo.append(ln);
        }
        histo.append("+---+---+---+---+---+---+---+---+---+---+\n" +
                "0   10  20  30  40  50  60  70  80  90  100");
        return histo;
    }
}
