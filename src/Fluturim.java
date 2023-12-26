import java.util.Date;

public class Fluturim {
    private static int counter = 0; // To generate unique IDs
    private int id;
    private double cmimi;
    private String kompaniaFluturimit;
    private Date dataNisjes;
    private String oraNisjes;
    private int kohezgjatja; // Duration in minutes
    private String vendiNisjes;
    private String vendiMberritjes;
    private Date dataMberritjes;
    private String oraMberritjes;
    private String klasa;
    private String llojiFluturimit;

    // Constructor
    public Fluturim(
        double cmimi, String kompaniaFluturimit, Date dataNisjes, String oraNisjes,
        int kohezgjatja, String vendiNisjes, String vendiMberritjes, Date dataMberritjes, String oraMberritjes,
        String klasa, String llojiFluturimit
    ) {
        this.id = ++counter; // Generate a unique ID
        this.cmimi = cmimi;
        this.kompaniaFluturimit = kompaniaFluturimit;
        this.dataNisjes = dataNisjes;
        this.oraNisjes = oraNisjes;
        this.kohezgjatja = kohezgjatja;
        this.vendiNisjes = vendiNisjes;
        this.vendiMberritjes = vendiMberritjes;
        this.dataMberritjes = dataMberritjes;
        this.oraMberritjes = oraMberritjes;
        this.klasa = klasa;
        this.llojiFluturimit = llojiFluturimit;
    }

    // Getters for the attributes
    public int getId() {
        return id;
    }

    public double getCmimi() {
        return cmimi;
    }

    public String getKompaniaFluturimit() {
        return kompaniaFluturimit;
    }

    public Date getDataNisjes() {
        return dataNisjes;
    }

    public String getOraNisjes() {
        return oraNisjes;
    }

    public int getKohezgjatja() {
        return kohezgjatja;
    }

    public String getVendiNisjes() {
        return vendiNisjes;
    }
    public String getVendiMberritjes() {
        return vendiMberritjes;
    }

    public Date getDataMberritjes() {
        return dataMberritjes;
    }

    public String getOraMberritjes() {
        return oraMberritjes;
    }

    public String getKlasa() {
        return klasa;
    }

    public String getLlojiFluturimit() {
        return llojiFluturimit;
    }
}

//Te kete atribute si ID, cmimi, kompaniaFluturimit, data nisjes, ora nisjes, kohezgjatja, vendimberritjes, data mberritjes, ora mberritjes.
// klasa, sendilja, lloji i fluturimit
//ID duhet te jete unike, per te krijuar ID te re mund ti referohesh databazes per te marre id e fundit