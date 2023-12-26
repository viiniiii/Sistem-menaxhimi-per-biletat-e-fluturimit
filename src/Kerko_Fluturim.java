import java.util.List;

public class Kerko_Fluturim {

    // Function to search for flights based on criteria
    public static List<Fluturim> searchFlights(String criteria) {
        // TODO: Implement logic to search for flights based on the specified criteria
        // You might interact with a database or any other data source to retrieve relevant flights
        // Return a list of Fluturim objects that match the criteria
        return null;
    }

    // Function to display selected attributes of flights
    public static void displayFlights(List<Fluturim> flights) {
        // TODO: Implement logic to display selected attributes of the retrieved flights
        // Iterate through the list of Fluturim objects and display relevant attributes
        if (flights != null) {
            for (Fluturim fluturim : flights) {
                System.out.println("Flight ID: " + fluturim.getId());
                System.out.println("Company: " + fluturim.getKompaniaFluturimit());
                // Display other relevant attributes as needed
                System.out.println("-------------");
            }
        } else {
            System.out.println("No flights found.");
        }
    }
}

//Ne baze te kritereve te kerkimit kthehen objektet Fluturim qe e kane ate atribut dhe afishohen disa nga atributet e atij fluturimi
//te formatuara 