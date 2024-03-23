package Taller3;

public class FixedSubwayCard extends SubwayCard{
    private int rides;
    public FixedSubwayCard(SubwayCentral sc,int rides){
        super(sc);
        this.rides=rides;
    }

    @Override
    protected boolean cantRide() {
        return rides <= 0;
    }

    @Override
    public void ride() throws CannotRideException{
        if (cantRide()){
            throw new CannotRideException();
        }
        rides--;
    }
}
