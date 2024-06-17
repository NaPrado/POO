package Segundos_Parciales.Par2_23_02.Ej2;

public class PlayerScore<S extends Comparable<? super S>> implements Comparable <PlayerScore<S>>{
    private final String player;
    private final S score;


    public PlayerScore(String player, S score) {
        this.player = player;
        this.score = score;
    }


    @Override
    public String toString() {
        return "Player %s scored %s".formatted(player, score);
    }
    @Override
    public int compareTo(PlayerScore<S> o){
    	return o.score.compareTo(this.score);
    }
}

