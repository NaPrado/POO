package RecuPrimerParcial.Rec1_22_02.Ej3;

public class FootballCentral {
    private FootballMatch[] footballMatches;
    public FootballCentral(FootballMatch[] footballMatches) {
        setFootballMatches(footballMatches);
    }
    private FootballMatch[] getFootballMatches() {
        return footballMatches;
    }
    public void setFootballMatches(FootballMatch[] footballMatches) {
        this.footballMatches = footballMatches;
    }
    public boolean belongsIn(FootballMatch footballMatch) {
        for (FootballMatch value : getFootballMatches()) {
            if (value.equals(footballMatch)) {
                return true;
            }
        }
        return false;
    }
    public Pase buildAllAccessPass(String dest){
        return new PaseAll(dest,this);
    }
    public Pase buildCountryAccessPass(String dest, String country){
        return new PaseCountry(dest,this,country);
    }
}

