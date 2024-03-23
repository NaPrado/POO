package Taller3;

public abstract class SubwayCard extends Exception{

    protected SubwayCentral subwayCentral;
    SubwayCard(SubwayCentral subwayCentral){
        this.subwayCentral=subwayCentral;
    }
    protected abstract boolean cantRide();
    public abstract void ride() throws CannotRideException;
}
