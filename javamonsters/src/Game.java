import java.util.Scanner;

public class Game {
    private static final String[] monstersAvailable = {
            "Charmander",
            "Bulbasaur",
            "Squirtle"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice = mainMenu(scanner);
        processChoice(choice, scanner);
    }

    private static String mainMenu(Scanner scanner) {
        System.out.println("(J)ogar\n" +
                "(S)air");

        return scanner.nextLine().toUpperCase();
    }

    private static void processChoice(String choice, Scanner scanner) {
        switch (choice) {
            case "J":
                gameLoop();
                break;
            case "S":
                System.exit(0);
                break;
        }
    }

    private static void gameLoop() {
        JavaMon hero = new JavaMon();
        JavaMon enemy = new JavaMon();

        while (true) {
            String monsterName = promptLine("Escolha seus monstros:\n");
            if (isAvailable(monsterName)) {
                if (!hero.addMonster(monsterName)) break;
            } else {
                System.out.println("Monstro indisponível! Tente novamente.\n");
            }
        }
        enemy.addMonster("Squirtle");

        String heroChosen = promptLine("Escolha seu primeiro monstro: ");
        String enemyChosen = "Squirtle";

        while (true) {
            System.out.println("Seu monstro:\n" +
                                hero.showMonster(heroChosen));
            System.out.println("Seu oponente:\n" +
                                enemy.showMonster(enemyChosen));
            String option = promptLine("Ataque: ");
        }
    }

    private static String promptLine(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);

        return scanner.nextLine();
    }

    private static boolean isAvailable(String name) {
        for (String s : monstersAvailable) {
            if (name.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
