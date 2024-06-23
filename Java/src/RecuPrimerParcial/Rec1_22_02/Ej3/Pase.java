package RecuPrimerParcial.Rec1_22_02.Ej3;

import java.util.Arrays;

public abstract class Pase {
    int usos=0;
    String dest;
    FootballCentral fc;
    FootballMatch [] visited = new FootballMatch[BLOCK];
    private static int BLOCK= 5;

    Pase(String dest, FootballCentral fc){
        this.dest = dest;
        this.fc=fc;
    }

    private void resize(){
        visited= Arrays.copyOf(visited, visited.length*BLOCK);
    }

    public void visit(FootballMatch match){
        if (fc.belongsIn(match) && !new FootballCentral(visited).belongsIn(match)){
            if (usos == visited.length) {
                resize();
            }
            visited[usos++] = match;
        }
        throw new RuntimeException("Invalid Match");
    }
    @Override
    public String toString(){
        StringBuilder toRet= new StringBuilder("Football Pass for " + dest + " used for " + usos + " matches");
        for (int i=0; i<usos; i++){
            toRet.append("\n").append(visited[i].toString());
        }
        return toRet.toString();
    }
}
