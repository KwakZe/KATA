import java.util.Objects;

public class Player {
    private String name;
    private PlayerScore playerScore;

    public Player(String name) {
        this.name = Objects.requireNonNull(name, "Player name cannnot be null");
        this.playerScore = new PlayerScore();
    }

    public String getName() {
        return this.name;
    }


    public PlayerScore getPlayerScore() {
        return playerScore;
    }

}
