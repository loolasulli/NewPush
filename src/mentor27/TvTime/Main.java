package mentor27.TvTime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shows show1 = new Shows("Spy", 4.7, Genres.THRILLER, Status.FINISHED);
        Shows show2 = new Shows("Lupin", 4.9, Genres.MYSTERY, Status.UPTODATE);
        Shows show3 = new Shows("OuterBanks", 4.8, Genres.ACTION, Status.WATCHING);
        Shows show4 = new Shows("Constellation", 4.6, Genres.THRILLER, Status.HAVENTSTARTED);
        Shows show6 = new Shows("Chernobyl", 4.9, Genres.HISTORY, Status.FINISHED);
        Shows show7 = new Shows("IntoTheNight", 4.7, Genres.THRILLER, Status.FINISHED);
        Shows show5 = new Shows("Dark", 4.9, Genres.MYSTERY, Status.STOPPED);
        Shows show8 = new Shows("EmilyInParis", 4.7, Genres.COMEDY, Status.UPTODATE);
        Shows show10 = new Shows("TheHead", 4.6, Genres.THRILLER, Status.WATCHING);
        Shows show9 = new Shows("11.22.63", 4.8, Genres.THRILLER, Status.FINISHED);
        Shows show11 = new Shows("TheMarkedHeart", 4.8, Genres.DRAMA, Status.FINISHED);


        Scanner scanner = new Scanner(System.in);
        TvShowManagementSystem ms = new TvShowManagementSystem();

        while (true) {
            System.out.println("\n Tv Time app shows.. Choose an option: \n1.Add Tv Show name: " +
                    "\n2.Display sorted by IMDb: \n3.Find best IMDb: \n4.Exit.. ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Shows[] shows = new Shows[]{show1, show2, show3, show4, show5, show6,
                            show7, show8, show9, show10, show11};
                    for (int i = 0; i < shows.length; i++) {
                        ms.addShow(shows[i]);
                    }
                    System.out.println("Tv Shows added..");
                    break;
                case 2:
                    System.out.println("Tv Shows sorted by IMDb..");
                    ms.displayShowsBySortedImdb();
                    break;
                case 3:
                    ms.findBestImdbShow();
                    break;
                case 4:
                    System.out.println("Exit..");
                    Scanner sc2 = new Scanner(System.in);
                    sc2.close();
                    return;
                default:
                    System.out.println("Invalid option..");
            }
        }
    }
}
