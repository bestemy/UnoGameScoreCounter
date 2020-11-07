package homework.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnoGame {

    List<Jucator> jucatori;

    public UnoGame() {
        this.jucatori = new ArrayList<>();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            displayHeader();
            option = fillInTheOption(scanner);
            executeOption(scanner, option);
        }
    }

    private void executeOption(Scanner scanner, int chose) {
        switch (chose) {
            case 1 -> {
                insertJucator(jucatori, scanner);
                break;
            }
            case 2 -> {
                int scor;
                System.out.println("Set Scor Jucator Option");
                for (int index = 0; index <= jucatori.size() - 1; index++) {
                    System.out.println(jucatori.get(index).getNume());
                    scor = scanner.nextInt();
                    jucatori.get(index).setScor(jucatori.get(index).getScor() + scor);
                }
                break;
            }
            case 3 -> {
                System.out.println("Not Implemented!!");
                //Tema-ma.

                break;
            }

            case 4 -> {
                displayPlayers();
                break;
            }
        }
    }

    private void displayPlayers() {
        for (Jucator jucator : jucatori) {
            System.out.println(jucator.toString());
        }
    }

    private int fillInTheOption(Scanner scanner) {
        int chose;
        chose = scanner.nextInt();
        scanner.nextLine();
        return chose;
    }

    private void displayHeader() {
        System.out.println("Meniu:");
        System.out.println("1 -> Introdu nume: ");
        System.out.println("2 -> Introdu scor: ");
        System.out.println("3 -> Sterge jucator: ");
        System.out.println("4 -> Afiseaza rezultatele: ");

    }

    public static void insertJucator(List<Jucator> jucatori, Scanner scanner) {
        String nume;
        System.out.println("Nume: ");
        nume = scanner.nextLine();
        Jucator jucator1 = new Jucator(nume);
        jucatori.add(jucator1);
    }

}
