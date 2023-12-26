import java.util.Scanner;
public class MenaxhimPerdoruesi {
    public static Boolean LogIn(String emri, String fjaleKalimi) {
        Scanner inputi = new Scanner(System.in);

        // TODO: Implement the login logic
        // Validate the inputs, check against the database, etc.

        inputi.close();
        return true; // Placeholder, return the appropriate value based on the login result
    }
    public static Boolean SignUp(String emri, String fjaleKalimi1, String fjaleKalimi2, String email) {
        Scanner inputi = new Scanner(System.in);

        // TODO: Implement the signup logic
        // Validate the inputs, check against the database, send confirmation email, etc.

        inputi.close();
        return true; // Placeholder, return the appropriate value based on the signup result
    }
    public static void LogOut() {
        // TODO: Implement the logout logic
        // In a real application, you might clear session data, reset authentication status, etc.
        System.out.println("Logged out successfully.");
    }
}

/*Merren inputet dhe kontrollohen nese jane te vlefshme, nese nuk jane njoftohet perdoruesi
dhe duhet ti vendose perseri (mund te implementohet ne menyre te tille qe perdoruesi ta nderroje nese ka qene duke u 
bere LogIn te behet SignUp ose anasjelltas), kur inputet jane te vlefshme behet LogIn tek rasti i pare ose dergohet 
email konfirmimi per rastin e dyte, perdoruesi ka kohe 60 sekonda ta konfirmoje, kur behet konfirmimi krijohet nje objekt perdorues
dhe ruhet ne databaze dhe perdoruesi i ri behet log in automatikisht.
*/