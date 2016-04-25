import java.util.Scanner;


abstract public class Team {

    protected Player[] players;
    protected int score = 0;
    Scanner userinput = new Scanner(System.in);
    private int pickSkill = 0;
    int random = (int) (Math.random() * 5);
    int calcSkill = 0;
    int points;

    protected Player ballHandler;

    public Team(Player[] players) {
        this.players = players;
    }

    public int play() {
        // While not shot yet
        chooseBallhandler();
        chooseSkill();
        return points;
    }

    public void chooseBallhandler() {

        ballHandler = players[(int) (Math.random() * (players.length - 1))];

    }


    public void chooseSkill() {
            resetPoints();
            resetCalcSkill();
            System.out.println(ballHandler.getPlayerName() + " has the ball!");
            System.out.println("1 - Shoot the three ; 2 - Pass Ball ; 3 - Dunk ; 4 - Dribble and Drive");
            pickSkill = userinput.nextInt();

            if (pickSkill == 1) {
                calculateShot();
                if (calcSkill > 20) {
                    System.out.println(ballHandler.getPlayerName() + " shot the 3 and scored!");
                    points =3;
                    System.out.println("");

                } else {
                    System.out.println(ballHandler.getPlayerName() + " missed the 3!");
                    System.out.println("The Bull have the ball now!");
                    System.out.println("");;

                }


            } else if (pickSkill == 2) {
                calculatePass();
                if (calcSkill > 25) {
                    System.out.println(ballHandler.getPlayerName() + " passed the ball!");
                    chooseBallhandler();
                    System.out.println("");
                } else {
                    System.out.println(ballHandler.getPlayerName() + " missed the pass! That's a turn over!");
                    System.out.println("The Bull have the ball now!");
                    System.out.println("");

                }

            } else if (pickSkill == 3) {
                calculateDunk();
                if (calcSkill > 35) {
                    System.out.println(ballHandler.getPlayerName() + " dunked the ball, scored 2 points!");
                    System.out.println("");
                    points =2;
                } else {
                    System.out.println(ballHandler.getPlayerName() + " missed the dunk, that's a turn over!");
                    System.out.println("The Bull have the ball now!");
                    System.out.println("");

                }

            } else if (pickSkill == 4) {
                calculateLayup();
                if (calcSkill > 30) {
                    System.out.println(ballHandler.getPlayerName() + " broke his ankles and got in deep for the 2!");
                    System.out.println("");
                    points =2;

                } else {
                    System.out.println(ballHandler.getPlayerName() + " lost the ball, that's a turn over!");
                    System.out.println("The Bull have the ball now!");
                    System.out.println("");

                }

            }



    }


    public int calculateShot() {
        calcSkill = ballHandler.getSkillRating("shooting") * random;
        return calcSkill;
    }

    public int calculateLayup() {
        calcSkill = ballHandler.getSkillRating("layup") * random;
        return calcSkill;
    }

    public int calculateDunk() {
        calcSkill = ballHandler.getSkillRating("dunk") * random;
        return calcSkill;
    }

    public int calculatePass() {
        calcSkill = ballHandler.getSkillRating("passing") * random;
        return calcSkill;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return score;
    }
    public void resetPoints(){
        points = 0;
    }
    public void resetCalcSkill(){
        calcSkill = 0;
    }
}
