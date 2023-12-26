import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Perdorues {
    private static int counter = 0; // To generate unique IDs
    private int id;
    private String emer;
    private String mbiemer;
    private String fjaleKalim;
    private String email;
    private Date dataKrijimit; // Using java.util.Date for date and time
    private List<Fluturim> fluturimet; // Dynamic array with flight objects

    // Constructor
    public Perdorues(String emer, String mbiemer, String fjaleKalim, String email) {
        this.id = ++counter; // Generate a unique ID
        this.emer = emer;
        this.mbiemer = mbiemer;
        this.fjaleKalim = fjaleKalim;
        this.email = email;
        this.dataKrijimit = new Date();
        this.fluturimet = new ArrayList<>(); // Initialize the list
    }

    // Method to add a booked flight to the user's array
    public void shtoFluturim(Fluturim fluturim) {
        fluturimet.add(fluturim);
    }

    // Getters for the attributes
    public int getId() {
        return id;
    }

    public String getEmer() {
        return emer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public String getFjaleKalim() {
        return fjaleKalim;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataKrijimit() {
        return dataKrijimit;
    }

    public List<Fluturim> getFluturimet() {
        return fluturimet;
    }
}


//Te kete atribute si ID, Emer, Mbiemer, fjaleKalim, email, DataKrijimit, 
// fluturimet(array dinamik me objekte fluturim).
//ID duhet te jete unike, per te krijuar ID te re mund ti referohesh databazes per te marre id e fundit
