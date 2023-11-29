package ba.etf.unsa.rpr;

public class Predmet implements Predstavljanje {
    private String naziv;
    private String opis;

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public String getOpis() {
        return opis;
    }
    public void setOpis(String opis) {
        this.opis = opis;
    }
    @Override
    public String predstavi() {
        return "Naziv: " + naziv + " opis: " + opis;
    }
    @Override
    public String toString() {
        return predstavi();
    }
}
