/**
 * Created by Blackcitadelz on 4/23/2016.
 */
public class Main {

    public static void main(String args[]){
        Game match = new Game(MvpTeam.getTeam(),NinetySixBulls.getTeam());
        match.play();
    }

}
