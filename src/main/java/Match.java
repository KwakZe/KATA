import java.util.Scanner;

public class Match {

    private static final Scanner scanner = new Scanner(System.in);
    private Score score = new Score();
    private Game game = new Game();
    private Set set = new Set();

    Match() {
        System.out.print("Player 1 name : ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Player 2 name : ");
        Player secondPlayer = new Player(scanner.nextLine());
        this.run(firstPlayer, secondPlayer);
    }

    private void showCommands(Player firstPlayer, Player secondPlayer) {
        System.out.println("COMMANDS :");
        System.out.println("'1' : " + firstPlayer.getName() + " scores a point");
        System.out.println("'2' : " + secondPlayer.getName() + " scores a point");
        System.out.println("'d' : display current scores");
    }

    public void showScores(Player firstPlayer, Player secondPlayer) {
        if (firstPlayer.getPlayerScore().getInTieBreak() && secondPlayer.getPlayerScore().getInTieBreak()) {
            System.out.println("--------------------------------\n");
            System.out.println(String.format("%s:\n\nTIE BREAK SCORE : %d \nGAMES : %d \nSETS : %d\n", firstPlayer.getName(),
                    firstPlayer.getPlayerScore().getTieBreakScore(), firstPlayer.getPlayerScore().getGame(),
                    firstPlayer.getPlayerScore().getSet()));
            System.out.println(String.format("%s:\n\nTIE BREAK SCORE : %d \nGAMES : %d \nSETS : %d", secondPlayer.getName(),
                    secondPlayer.getPlayerScore().getTieBreakScore(), secondPlayer.getPlayerScore().getGame(),
                    secondPlayer.getPlayerScore().getSet()));
            System.out.println("--------------------------------\n");
        } else {
            System.out.println("--------------------------------\n");
            System.out.println(String.format("%s:\n\nSCORE : %d \nGAMES : %d \nSETS : %d\n", firstPlayer.getName(),
                    firstPlayer.getPlayerScore().getCurrentGameScore(), firstPlayer.getPlayerScore().getGame(),
                    firstPlayer.getPlayerScore().getSet()));
            System.out.println(String.format("%s:\n\nSCORE : %d \nGAMES : %d \nSETS : %d", secondPlayer.getName(),
                    secondPlayer.getPlayerScore().getCurrentGameScore(), secondPlayer.getPlayerScore().getGame(),
                    secondPlayer.getPlayerScore().getSet()));
            System.out.println("--------------------------------\n");
        }
    }

    private void run(Player firstPlayer, Player secondPlayer) {
        try {
            showCommands(firstPlayer, secondPlayer);
            while (!set.getIsGameFinished()) {
                System.out.print(">");
                String command = scanner.nextLine();
                switch (command) {
                    case "1":
                        score.hasScored(firstPlayer, secondPlayer, game, set);
                        break;
                    case "2":
                        score.hasScored(secondPlayer, firstPlayer, game, set);
                        break;
                    case "d":
                        showScores(firstPlayer, secondPlayer);
                        break;
                    default:
                        showCommands(firstPlayer, secondPlayer);
                        break;
                }
            }
        } finally {
            scanner.close();
        }
    }
}
