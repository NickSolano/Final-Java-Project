public class Game {
    private Team home;
    private Team away;
    private Team teamWithPosession;
    private int winner;

    private int gameTime = 200; // Each move takes 5 game time units

    public Game(Team home, Team away) {
        this.home = home;
        this.away = away;

    }

    public Team play() {
        // Tip off
        teamWithPosession = tipOff();
        // Team has the ball interact, until shot
        // Other team has the ball, until shot
        // Repeat
        System.out.println("Team MVP  vs 96 Chicago Bulls!!");
        System.out.println("The ball has been tipped off! The game is underway!");
        System.out.println("-----------------------------------------------------------------------------------------------");
        while (gameTime > 150) {
            System.out.println("-- First Quarter --");
            // Either return 0, 2, 3 and then gets added to the total score then subtract game time
            System.out.println("Team MVP " + home.score + " - " + away.score + " Chicago Bulls");
            int score = teamWithPosession.play();
            teamWithPosession.addScore(score);
            gameTime = gameTime - 5;

            // switch possession if teamwithPosseion == home then switch to away or something like that
            if (teamWithPosession == home) {
                teamWithPosession = away;
            } else {
                teamWithPosession = home;
            }
            if (gameTime == 55) {
                System.out.println(" It's almost the end of the first quarter!");
            }
        }
        while (gameTime > 100) {
            System.out.println("-- Second Quarter --");
            // Either return 0, 2, 3 and then gets added to the total score then subtract game time
            System.out.println("Team MVP " + home.score + " - " + away.score + " Chicago Bulls");
            int score = teamWithPosession.play();
            teamWithPosession.addScore(score);
            gameTime = gameTime - 5;
            // switch possession if teamwithPosseion == home then switch to away or something like that
            if (teamWithPosession == home) {
                teamWithPosession = away;
            } else {
                teamWithPosession = home;
            }
        }
        while (gameTime > 50) {
            System.out.println("-- Third Quarter --");
            // Either return 0, 2, 3 and then gets added to the total score then subtract game time
            System.out.println("Team MVP " + home.score + " - " + away.score + " Chicago Bulls");
            int score = teamWithPosession.play();
            teamWithPosession.addScore(score);
            gameTime = gameTime - 5;
            // switch possession if teamwithPosseion == home then switch to away or something like that
            if (teamWithPosession == home) {
                teamWithPosession = away;
            } else {
                teamWithPosession = home;
            }
        }
        while (gameTime > 0) {
            System.out.println("-- Final Quarter! --");
            // Either return 0, 2, 3 and then gets added to the total score then subtract game time
            System.out.println("Team MVP " + home.score + " - " + away.score + " Chicago Bulls");
            int score = teamWithPosession.play();
            teamWithPosession.addScore(score);
            gameTime = gameTime - 5;
            // switch possession if teamwithPosseion == home then switch to away or something like that
            if (teamWithPosession == home) {
                teamWithPosession = away;
            } else {
                teamWithPosession = home;
            }
        }
        System.out.println("That concludes the game folks!");
        if (home.score > away.score) {
            winner = home.score - away.score;
            System.out.println("Team MVP have won the game by: " + winner + " points!");

        } else if( home.score == away.score){
            System.out.println(" It's a tie! ");
        }
        else{
            winner = away.score - home.score;
            System.out.println("Chicago Bulls have won the game by: " + winner + " points!");
        }

        return home.getScore() > away.getScore() ? home : away;
    }

    // Return whether home or away gets the ball initially
    public Team tipOff() {
        return (int)(Math.random() * 100) % 2 == 0 ? home : away;
    }



}
