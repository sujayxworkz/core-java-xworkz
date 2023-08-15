package teamplayers;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Team {

    Players players;
    private int noOfPlayers;

    public Team(Players player){
        this.players = player;
    }


    public boolean addPlayers() {
        boolean isAdded = false;
        if (noOfPlayers>= 12) {
            System.out.println("The available number of players are sufficient");
            if (players!=null) {
                System.out.println("The players count are sufficient");
                this.players = players;
                this.players.getTheDetails();
                isAdded = true;
                System.out.println("The player count is satisfied");
            } else {
                System.out.println("ohh...boss elli players");
            }
        } else {
            System.out.println("oooh......raja  insufficient players");
        }
        return isAdded;
    }
}


