package RecuPrimerParcial.Rec1_22_02.Ej3;

import java.util.Objects;

public class FootballMatch {
    private final String teamA, teamB;
    public FootballMatch(String teamA, String teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }
    public String getTeamA() {
        return teamA;
    }
    public String getTeamB() {
        return teamB;
    }
    @Override
    public String toString() {
        return String.format("Match %s vs %s", teamA, teamB);
    }
    @Override
    public boolean equals(Object o){
        return this==o || (o instanceof FootballMatch other
                && teamA.equals(other.teamA)
                && teamB.equals(other.teamB));
    }
    @Override
    public int hashCode() {
        return Objects.hash(teamA, teamB);
    }
}
