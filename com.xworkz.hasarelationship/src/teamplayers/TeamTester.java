package teamplayers;

public class TeamTester {
    public static void main(String[] args) {
        Players player = new Players("INDIA","Hyderabad",35000);
        Team team = new Team(player);

        team.setNoOfPlayers(1);
        System.out.println(team.getNoOfPlayers());


        team.addPlayers();
    }
}
