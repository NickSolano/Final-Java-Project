/**
 * Created by Blackcitadelz on 4/23/2016.
 */
public class Game {
    private Team home;
    private Team away;
    private Team teamWithPosession;

    private int gameTime = 50; // Each move takes 5 game time units

    public Game(Team home, Team away) {
        this.home = home;
        this. away = away;

    }

    public Team play() {
        // Tip off
        teamWithPosession = tipOff();
        // Team has the ball interact, until shot
        // Other team has the ball, until shot
        // Repeat
        while(gameTime > 0) {
            // Either return 0, 2, 3 and then gets added to the total score then subtract game time
            int score = teamWithPosession.play();
            teamWithPosession.addScore(score);
            gameTime = gameTime - 5;
            // switch possession if teamwithPosseion == home then switch to away or something like that
            if( teamWithPosession == home){
                teamWithPosession = away;
            }
            else{
                teamWithPosession = home;
            }
        }
        return home.getScore() > away.getScore() ? home : away;
    }

    // Return whether home or away gets the ball initially
    public Team tipOff() {
        return (int)(Math.random() * 100) % 2 == 0 ? home : away;
    }



}
