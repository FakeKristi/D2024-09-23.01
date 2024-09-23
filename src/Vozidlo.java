public class Vozidlo {
    private String spz;
    private String vyrobce;
    private String model;
    private int rokVyroby;

    public Vozidlo(String spz, String vyrobce, String model, int rokVyroby) {
        this.spz = spz;
        this.vyrobce = vyrobce;
        this.model = model;
        this.rokVyroby = rokVyroby;
    }

    public String getSpz() {
        return spz;
    }

    public String getVyrobce() {
        return vyrobce;
    }

    public String getModel() {
        return model;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }

    @Override
    public String toString() {
        return "SPZ: ["+spz+"], Výrobce: ["+vyrobce+"], Model: ["+model+"], Rok výroby: ["+rokVyroby+"]";
    }
}
