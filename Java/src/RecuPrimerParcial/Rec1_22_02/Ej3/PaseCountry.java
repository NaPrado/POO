package RecuPrimerParcial.Rec1_22_02.Ej3;

public class PaseCountry extends Pase{
    String pais;
    PaseCountry(String dest,FootballCentral fc,String pais){
        super(dest,fc);
        this.pais=pais;
    }

    @Override
    public void visit(FootballMatch match) {
        if (match.getTeamA().equals(pais) || match.getTeamB().equals(pais)) {
            super.visit(match);
            return;
        }
        throw new RuntimeException("Invalid Match");
    }
}
