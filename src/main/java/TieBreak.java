public class TieBreak {

    public static void hasWonTieBreak(Player player, Player opponent) {
        player.getPlayerScore().setTieBreakScore(player.getPlayerScore().getTieBreakScore() + 1);
        if ((player.getPlayerScore().getTieBreakScore() >= 6) && (opponent.getPlayerScore().getTieBreakScore() <= (player.getPlayerScore().getTieBreakScore() - 2))) {
            player.getPlayerScore().setTieBreakScore(0);
            opponent.getPlayerScore().setTieBreakScore(0);
            player.getPlayerScore().setSet(player.getPlayerScore().getSet() + 1);
            player.getPlayerScore().setHasWon(true);
            System.out.println(String.format("Player %s has won, scores are : \n", player.getName()));
            System.out.println(String.format("%s:\nGAMES : %d \nSETS : %d", player.getName(),
                    player.getPlayerScore().getGame(), player.getPlayerScore().getSet()));
            System.out.println(String.format("%s:\nGAMES : %d \nSETS : %d", opponent.getName(),
                    opponent.getPlayerScore().getGame(), opponent.getPlayerScore().getSet()));
            System.out.println("------------------------------\n");
        }
    }
}
