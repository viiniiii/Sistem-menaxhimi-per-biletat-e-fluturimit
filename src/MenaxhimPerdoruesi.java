import java.util.Scanner;
public class MenaxhimPerdoruesi {
    public static Perdorues LogIn(String emri, String fjaleKalimi) {
       /*if(emri not in databaze){
            System.out.println("Perdoruesi me emer " + emri + " nuk ekziston.");
            System.out.println("Provo te identifikohesh me nje emer tjeter ose te krijosh nje llogari te re.");
            return null;
       }else if(fjaleKalimi != fjaleKalimiReal){
            System.out.println("Fjalekalim i gabuar. Vendosni nje fjalekalim tjeter.");
            return null;
       }else{
            return ObjektPerdorues;
       } */
    
        return null; 
    }
    public static Perdorues SignUp(String emri, String mbiemri, String fjaleKalimi1, String fjaleKalimi2, String email) {
        if(fjaleKalimi1 != fjaleKalimi2){
            System.out.println("Ju keni vendosur dy fjakalime te ndryshme. Ju lutem vendosni dy fjalekalime te njejta.");
        }
        int kodiDerguar = Njoftime.sendConfirmationCode(email);
        System.out.println("Vendosni kodin e konfigurimit te derguar ne email.");
        long kohaDergimit = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int kodi = input.nextInt();
        input.close();
        if(kodi != kodiDerguar){
            System.out.println("Kodi i vendosur nuk eshte i sakte.");
        }else if(System.currentTimeMillis() - kohaDergimit > 120){
            System.out.println("Kodi ka skaduar");
        }else{
            Perdorues perdorues = new Perdorues(emri, mbiemri, fjaleKalimi1, email);
            //Perdoruesi futet ne databaze ....
            return perdorues;
        }
        return null; 
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
