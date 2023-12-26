     /*1.Hapet programi -> SignUp or LogIn
         2.Perdoruesi zgjedh te :
         a)Kerkoje per fluturime
         b)Te shohe fluturimet qe ka per te bere
         c)Te shohe fluturimet qe ka bere
         3.Nese zgjedh b ose c thjesht shfaqen informacione per fluturimet
           Nese zgjedh a duhet te zgjedh kriterin nga do i kerkoje (sipas cmimit, vendit, llojit, etj)
         4.Pasi zgjedh fluturimin dhe e konfirmon krijohet objekt fluturim, njoftohet me email per detajet
         e fluturimit dhe shtohet tek array me fluturimet e perdoruesit
         !!!Kudo qe te ndodhet perdorusit do ti jepet mundesia qe:
         a)Te behet LogOut
         b)Ta heqe programin
         c)Te kete mundesi te kthehet ose ti jepet mundesia te beje gjithmone dicka (Te mos perfundoje ne rruge qorre xD)
         !!!Programi nuk duhet te mbyllet ne asnje menyre tjeter pervec se me inputin e caktuar (tek b)
         !!!Ne cdo hap duhet te fshihen shkrimet para (pra te pastrohet console)
        */
/*
 * Mund te kete 2 databaza(2 tabela ne nje databaze idk mire) nje me fluturimet dhe nje me perdoruesit
 * Do hapet nje email i ri qe do sherbeje per te derguar emaile
 * Secili punon te klasa e vet dhe ndryshimin e ben direkt te klasa
 * Kjo eshte per pjesen pa GUI, me GUI do shtohet pjesa e mbetur e funksionaliteteve dhe do behet design-i
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perdorues currentPerdorues = null;

        while (true) {
            clearConsole();
            System.out.println("1. SignUp");
            System.out.println("2. LogIn");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // SignUp
                    currentPerdorues = signUp();
                    break;
                case 2:
                    // LogIn
                    currentPerdorues = logIn();
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // If a user is logged in
            if (currentPerdorues != null) {
                while (true) {
                    clearConsole();
                    System.out.println("1. Search Flights");
                    System.out.println("2. View Upcoming Flights");
                    System.out.println("3. View Past Flights");
                    System.out.println("4. LogOut");
                    System.out.println("5. Exit");

                    int userChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (userChoice) {
                        case 1:
                            Kerko_Fluturim.searchFlights(null);
                            break;
                        case 2:
                            viewUpcomingFlights(currentPerdorues);
                            break;
                        case 3:
                            viewPastFlights(currentPerdorues);
                            break;
                        case 4:
                            currentPerdorues = null; // LogOut
                            break;
                        case 5:
                            System.out.println("Exiting program. Goodbye!");
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            }
        }
    }

    private static void clearConsole() {
        // TODO: Implement logic to clear the console
    }
}
