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
        Perdorues Perdoruesi = null;

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
                    System.out.print("Vendosni emrin: ");
                    String emri = scanner.nextLine();
                    System.out.print("\nVendosni mbiemrin: ");
                    String mbiemri = scanner.nextLine();
                    System.out.print("\nVendosni fjalekalimin: ");
                    String fjaleKalimi1 = scanner.nextLine();
                    System.out.print("\nVendosni perseri fjalekalimin: ");
                    String fjaleKalimi2 = scanner.nextLine();
                    System.out.print("\nVendosni emailin: ");
                    String email = scanner.nextLine();
                    Perdoruesi = MenaxhimPerdoruesi.SignUp(emri, mbiemri, fjaleKalimi1, fjaleKalimi2, email);
                    break;
                case 2:
                    // LogIn
                    System.out.print("Vendosni emrin: ");
                    String emriPerdoruesit = scanner.nextLine();
                    System.out.print("\nVendosni fjalekalimin: ");
                    String fjaleKalimi = scanner.nextLine();
                    Perdoruesi = MenaxhimPerdoruesi.LogIn(emriPerdoruesit,fjaleKalimi);
                    break;
                case 3:
                    System.out.println("Ju zgjodhet te hiqni programin.");
                    System.exit(0);
                default:
                    System.out.println("Input i gabuar provo perseri.");
            }

            // If a user is logged in
            if (Perdoruesi != null) {
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
                            //viewUpcomingFlights(Perdoruesi);
                            break;
                        case 3:
                            //viewPastFlights(Perdoruesi);
                            break;
                        case 4:
                            MenaxhimPerdoruesi.LogOut(); // LogOut
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
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
}
