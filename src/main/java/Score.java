public class Score {

    public void hasScored(Player player, Player opponent, Game game, Set set) {

        if (player.getPlayerScore().getInTieBreak() && opponent.getPlayerScore().getInTieBreak()) {
            TieBreak.hasWonTieBreak(player, opponent);
            return;
        }

        if (player.getPlayerScore().getCurrentGameScore() == 40 && opponent.getPlayerScore().getCurrentGameScore() == 40) { // Advantage
            if (!player.getPlayerScore().getAdvantage() && !opponent.getPlayerScore().getAdvantage()) {
                player.getPlayerScore().setAdvantage(true);
            } else if (player.getPlayerScore().getAdvantage() && !opponent.getPlayerScore().getAdvantage()) {
                player.getPlayerScore().setCurrentGameScore(0);
                opponent.getPlayerScore().setCurrentGameScore(0);
                player.getPlayerScore().setGame(player.getPlayerScore().getGame() + 1);
            } else if (!player.getPlayerScore().getAdvantage() && opponent.getPlayerScore().getAdvantage()) {
                opponent.getPlayerScore().setAdvantage(false);
            }
        } else {
            switch (player.getPlayerScore().getCurrentGameScore()) {
                case 0:
                    player.getPlayerScore().setCurrentGameScore(15);
                    break;
                case 15:
                    player.getPlayerScore().setCurrentGameScore(30);
                    break;
                case 30:
                    player.getPlayerScore().setCurrentGameScore(40);
                    break;
                case 40: // Win Game
                    player.getPlayerScore().setCurrentGameScore(0);
                    game.hasWonGame(player, opponent, set);
                    break;
            }
        }
    }
}
