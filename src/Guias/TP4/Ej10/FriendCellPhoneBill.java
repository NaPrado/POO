package Guias.TP4.Ej10;



public class FriendCellPhoneBill extends CellPhoneBill {
    private String[] friends;
    private int friendsIndex;
    private final int friendLimit;
    private double cost;
    private static final double DEFAULT_FRIEND_COST_PER_SECOND=0;
    FriendCellPhoneBill(String number, int limit){
        super(number);
        this.friendLimit=limit;
        this.friends=new String[limit];
        this.cost=DEFAULT_FRIEND_COST_PER_SECOND;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    private boolean containsFriend(String number){
        if (friends[friendsIndex]==null){
            return false;
        }
        for (String i:friends){
            if (i.equals(number)){
                return true;
            }
        }
        return false;
    }
    public void addFriend(String number) throws AlreadyExistsFriendException ,TooManyFriendsException{
        if(friendsIndex == friendLimit) {
            throw new TooManyFriendsException();
        }
        if (containsFriend(number)){
            throw new AlreadyExistsFriendException();
        }
        friends[friendsIndex++] = number;
    }
    public void removeFriend(String number) throws FriendNotFoundException{
        boolean found = false;
        for(int i = 0; i < friendsIndex && !found; i++) {
            if(friends[i].compareTo(number) == 0) {
                friends[i] = friends[--friendsIndex];
                found = true;
            }
        }
        if (!found) {
            throw new FriendNotFoundException();
        }
    }
    @Override
    public double processBill() {
        double total = 0;
        for (int i = 0; i < callsIndex; i++) {
            boolean friendlyCall = false;
            for(int j = 0; j < friendsIndex && !friendlyCall; j++) {
                if (calls[i].getTo().compareTo(friends[j]) == 0) {
                    friendlyCall = true;
                }
            }
            total += friendlyCall ? calls[i].getCost() * cost : calls[i].getCost();
        }
        return total;
    }


}
