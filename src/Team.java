import java.util.Scanner;

/**
 * Created by Blackcitadelz on 4/23/2016.
 */
abstract public class Team  {

    protected Player[] players;
    protected int score = 0;
    Scanner userinput  = new Scanner(System.in);
    private int pickSkill = 0;
    boolean flagtrue  = true;
    boolean flagfalse =false;

    protected Player ballHandler;

    public Team(Player[] players){
        this.players = players;
    }

    public int play() {
        // While not shot yet
      chooseBallhandler();
      chooseSkill();

        // If shot success return 2 or 3 else return 0
        // Ask for user input, if pass -> select who to pass to
        // if action successful -> add point unless it was a pass
        // if not -> turnover return 0
        return 0;


    }
    public void chooseBallhandler(){
        Player ballHandler = players[(int)(Math.random() * (players.length - 1))];
    }
    public void chooseSkill(){
        System.out.println(ballHandler + " has the ball!");
        System.out.println("1 - Shoot Ball ; 2 - Pass Ball ; 3 - Dunk ; 4 - Dribble and Drive");
        pickSkill = userinput.nextInt();
        while( flagtrue){
            if ( pickSkill == 1){
                if(ballHandler.shoot() == true){
                    addScore(3);
                }
            }
            else if (pickSkill == 2){
                if(ballHandler.pass() == true){

                }
            }
            else if (pickSkill == 3){
                if(ballHandler.dunk() == true) {
                    addScore(2);
                }
            }
            else if (pickSkill == 4){
                if(ballHandler.layup() == true){
                    addScore(2);
                }
            }
        }
    }

    public void addScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return score;
    }
}
