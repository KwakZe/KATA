public class Set {

    private Boolean isGameFinished;

    Set() {
        this.isGameFinished = false;
    }

    public Boolean getIsGameFinished() {
        return this.isGameFinished;
    }


    public void hasWonSet(Player player, Player opponent) {
        player.getPlayerScore().setSet(player.getPlayerScore().getSet() + 1);
        System.out.println(String.format("Player %s has won, scores are : \n", player.getName()));
        System.out.println(String.format("%s:\nSCORE : %d \nGAMES : %d \nSETS : %d", player.getName(),
                player.getPlayerScore().getCurrentGameScore(), player.getPlayerScore().getGame(),
                player.getPlayerScore().getSet()));
        System.out.println(String.format("%s:\nSCORE : %d \nGAMES : %d \nSETS : %d", opponent.getName(),
                opponent.getPlayerScore().getCurrentGameScore(), opponent.getPlayerScore().getGame(),
                opponent.getPlayerScore().getSet()));
        System.out.println("------------------------------\n");
        this.isGameFinished = true;
    }
}
