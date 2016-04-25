import java.util.HashMap;

public class Player {

    private String playerName;
    private HashMap<String, Integer> skills;


    public Player(String playerName, int shootingRating, int passingRating, int layupRating, int dunkRating) {
        this.playerName = playerName;
        this.skills = new HashMap<>();
        skills.put("shooting", shootingRating);
        skills.put("passing", passingRating);
        skills.put("layup", layupRating);
        skills.put("dunk", dunkRating);
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getSkillRating(String skillName) {
        return skills.get(skillName);
    }
    public int getScoredPoints(String skillName){
        return skills.get(skillName);
    }


}
