/**
 * Created by Blackcitadelz on 4/23/2016.
 */
 public class MvpTeam extends Team {

    public static MvpTeam getTeam() {
        Player stephCurry = new Player("Stephen Curry", 1, 1, 1, 1);
        Player kd = new Player("Kevin Durant", 2, 2, 2, 2);
        Player kobe = new Player("Kobe Bryant", 2, 2, 2, 2);
        Player lebron = new Player(" Lebron James", 2,2,2,2);
        Player mcgee =  new Player(" Javal McGee", 1,1,1,1);
        Player[] players = new Player[]{stephCurry, kd, kobe,lebron,mcgee };
        return new MvpTeam(players);
    }

    private MvpTeam(Player[] players) {
        super(players);
    }
}
