public class Game {

    public void hasWonGame(Player player, Player opponent, Set set) {

        player.getPlayerScore().setGame(player.getPlayerScore().getGame() + 1);

        if (player.getPlayerScore().getGame() == 6 && opponent.getPlayerScore().getGame() < 5) {
            set.hasWonSet(player, opponent);
        }
        if (player.getPlayerScore().getGame() == 6 && opponent.getPlayerScore().getGame() == 6) {
            player.getPlayerScore().setInTieBreak(true);
            opponent.getPlayerScore().setInTieBreak(true);
        }
    }
}