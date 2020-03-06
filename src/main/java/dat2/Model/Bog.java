package dat2.Model;

public class Bog {

    private int id;
    private String titel;
    private String forfatter;
    private int udgivelsesaar;

    public Bog(String titel, String forfatter, int udgivelsesaar) {
        id = 0;
        this.titel = titel;
        this.forfatter = forfatter;
        this.udgivelsesaar = udgivelsesaar;
    }

    public Bog(int id, String titel, String forfatter, int udgivelsesaar) {
        this.id = id;
        this.titel = titel;
        this.forfatter = forfatter;
        this.udgivelsesaar = udgivelsesaar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public int getUdgivelsesaar() {
        return udgivelsesaar;
    }

    public void setUdgivelsesaar(int udgivelsesaar) {
        this.udgivelsesaar = udgivelsesaar;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", udgivelsesaar='" + udgivelsesaar + '\'' +
                '}';
    }
}
