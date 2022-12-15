import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] firstTeam = new int[25];
        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i] = random.nextInt(40 - 18) + 18;
            System.out.print(firstTeam[i] + " ");

        }
        System.out.println();
        int[] secondTeam = new int[25];
        for (int i = 0; i < secondTeam.length; i++) {
            secondTeam[i] = random.nextInt(40 - 18) + 18;
            System.out.print(secondTeam[i] + " ");

        }
        System.out.println();
        int middleAgeFirstTeam = 0;
        for (int i = 0; i < firstTeam.length; i++) {
            middleAgeFirstTeam += firstTeam[i];
        }
        int middleAgeSecondTeam = 0;
        for (int i = 0; i < secondTeam.length; i++) {
            middleAgeSecondTeam += secondTeam[i];
                    }
        System.out.println("Середній вік команди: " + (double) middleAgeSecondTeam / secondTeam.length);
        System.out.println("Середній вік команди: " + (double) middleAgeFirstTeam / firstTeam.length);

    }
}
