
public class Njoftime {

    // Function to generate a random 6-digit code
    private static int generateRandomCode() {
        
        int code = (int) Math.random() * 1000000 ; // Generates a random 6-digit number
        return code;
    }

    // Function to send a confirmation code to the user's email
    public static int sendConfirmationCode(String userEmail) {
        // TODO: Implement logic to send an email with the generated confirmation code
        int confirmationCode = generateRandomCode();
        System.out.println("Confirmation code sent to " + userEmail + ": " + confirmationCode);
        return confirmationCode;
    }

    // Function to send flight information to the user
    public static void sendFlightInformation(Fluturim fluturim, String userEmail) {
        // TODO: Implement logic to send flight information to the user's email
        System.out.println("Flight information sent to " + userEmail + ":\n" + fluturim.toString());
    }
}

//1.Do kete funksion qe merr si input emailin e perdoruesit dhe info te tjera dhe i dergon nje kod random generated 6 digits
// qe perdoruesi duhet ta vendosi si input per te konfirmuar adresen
//2.Funksion qe merr si input klasen fluturim dhe i dergon perdoruesit informacion mbi fluturimin
