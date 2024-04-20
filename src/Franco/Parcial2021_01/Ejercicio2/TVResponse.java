package Franco.Parcial2021_01.Ejercicio2;

public class TVResponse{
    private final TVShow tvShow;
    private final Boolean inRange;
    TVResponse(Boolean inRange,TVShow tvShow){
        this.inRange=inRange;
        this.tvShow=tvShow;
    }
    @Override
    public String toString(){
        return ""
    }
}
