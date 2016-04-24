/**
 * Created by Blackcitadelz on 4/23/2016.
 */
public class NinetySixBulls extends Team {

    private NinetySixBulls(Player[] players){
        super(players);
    }
    public static NinetySixBulls getTeam() {
        Player Jordan = new Player("Michale Jordan", 1, 1, 1, 1);
        Player Kerr = new Player("Kevin Kerr", 2, 2, 2, 2);
        Player Rodman = new Player("Dennis Rodman", 2, 2, 2, 2);
        Player Longley = new Player("Luc Longley", 2,2,2,2);
        Player Pippen =  new Player(" Scottie Pippen", 1,1,1,1);
        Player[] players = new Player[]{Jordan, Kerr, Rodman,Longley,Pippen };
        return new NinetySixBulls(players);
    }

    @Override
    public int play() {
        // Do different logic here because it's AI
        int random = (int)(Math.random() * 100);

        // Don't know if this works
        Player randomPlayer = players[(int)(Math.random() * (players.length - 1))];

        int points = random > 75 ? 3 : random > 50 ? 2 : 0;
        System.out.println(randomPlayer.getPlayerName() + (points > 0 ? " has scored " + points + " points" :
        " has missed!"));
        return points;
    }
}