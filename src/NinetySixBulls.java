
public class NinetySixBulls extends Team {

    private NinetySixBulls(Player[] players){
        super(players);
    }
    public static NinetySixBulls getTeam() {
        Player Jordan = new Player("Michale Jordan", 5, 7, 9, 10);
        Player Kerr = new Player("Kevin Kerr", 4, 7, 2, 2);
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

        int points = random > 55 ? 3 : random > 33 ? 2 : 0;
        System.out.println("The Bulls are going in for their attack!");
        System.out.println(randomPlayer.getPlayerName() + (points > 0 ? " has scored " + points + " points" :
        " has missed!"));
        System.out.println("");
        return points;
    }
}