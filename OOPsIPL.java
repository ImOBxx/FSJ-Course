import java.util.ArrayList;
import java.util.Scanner;

class Players {
    String name;
    String team;
    String nation;

    ArrayList<Players> PlayersList = new ArrayList<>();
    ArrayList<Players> PlayersFirstList = new ArrayList<>();

    public Players(String name, String team, String nation) {
        this.name = name;
        this.team = team;
        this.nation = nation;
    }

    void add() {
        Scanner in = new Scanner(System.in);
        char choice;
        while (true) {
            System.out.println("Enter Player's Name: ");
            name = in.next();
            System.out.println("Enter Player's Team: ");
            team = in.next();
            System.out.println("Enter Player's Nationality: ");
            nation = in.next();
            PlayersList.add(new Players(name, team, nation));
            System.out.println("Do you want to add more players? (Y/N): ");
            choice = in.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                continue;
            } else if (choice == 'N' || choice == 'n') {
                break;
            } else {
                System.out.println("Wrong choice, please enter Y or N.");
            }
        }
    }

    void show() {
        System.out.println("All IPL Players Details: ");
        for (Players pl : PlayersList) {
            System.out.println("Player's Name: " + pl.name);
            System.out.println("Player's Team: " + pl.team);
            System.out.println("Player's Nationality: " + pl.nation);
        }

        System.out.println("\nForeign IPL Players Details: ");
        for (Players pl : PlayersFirstList) {
            System.out.println("Player's Name: " + pl.name);
            System.out.println("Player's Team: " + pl.team);
            System.out.println("Player's Nationality: " + pl.nation);
        }
    }

    void call() {
        for (Players pl : PlayersList) {
            if (!pl.nation.equals("IND")) {
                PlayersFirstList.add(new Players(pl.name, pl.team, pl.nation));
            }
        }
    }
}

public class OOPsIPL {

    public static void main(String[] args) {
        Players obj = new Players("", "", "");
        obj.add();
        obj.call();
        obj.show();
    }
}
