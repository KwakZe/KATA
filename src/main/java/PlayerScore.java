public class PlayerScore {

    private Integer game;
    private Integer currentGameScore;
    private Boolean advantage;
    private Integer set;
    private Boolean hasWon;
    private Boolean isInTieBreak;
    private Integer tieBreakScore;

    PlayerScore() {
        this.setGame(0);
        this.setCurrentGameScore(0);
        this.setAdvantage(false);
        this.setSet(0);
        this.setHasWon(false);
        this.setInTieBreak(false);
        this.setTieBreakScore(0);
    }

    public Integer getGame() {
        return game;
    }

    public void setGame(Integer game) {
        this.game = game;
    }

    public Integer getCurrentGameScore() {
        return currentGameScore;
    }

    public void setCurrentGameScore(Integer currentGameScore) {
        this.currentGameScore = currentGameScore;
    }

    public Boolean getAdvantage() {
        return advantage;
    }

    public void setAdvantage(Boolean advantage) {
        this.advantage = advantage;
    }

    public Integer getSet() {
        return set;
    }

    public void setSet(Integer set) {
        this.set = set;
    }

    public Boolean getHasWon() {
        return hasWon;
    }

    public void setHasWon(Boolean hasWon) {
        this.hasWon = hasWon;
    }

    public Boolean getInTieBreak() {
        return isInTieBreak;
    }

    public void setInTieBreak(Boolean inTieBreak) {
        this.isInTieBreak = inTieBreak;
    }

    public Integer getTieBreakScore() {
        return tieBreakScore;
    }

    public void setTieBreakScore(Integer tieBreakScore) {
        this.tieBreakScore = tieBreakScore;
    }
}
