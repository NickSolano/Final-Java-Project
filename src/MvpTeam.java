
 public class MvpTeam extends Team {

    public static MvpTeam getTeam() {
        Player stephCurry = new Player("Stephen Curry", 22, 15, 12,8 );
        Player kd = new Player("Kevin Durant", 14, 12, 17, 12);
        Player kobe = new Player("Kobe Bryant", 15, 15, 15, 15);
        Player lebron = new Player(" Lebron James", 9, 12, 17, 20);
        Player mcgee = new Player(" Javal McGee", 10, 2, 7, 10);
        Player[] players = new Player[]{stephCurry, kd, kobe, lebron, mcgee};
        return new MvpTeam(players);
    }

    private MvpTeam(Player[] players) {
        super(players);
    }
}
