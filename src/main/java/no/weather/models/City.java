package no.weather.models;

public class City {
    private String byNavn;
    private int postnummer;
    private String url;

    public City() {
    }

    public City(String byNavn, int postnummer, String url) {
        this.byNavn = byNavn;
        this.postnummer = postnummer;
        this.url = url;
    }

    public String getByNavn() {
        return byNavn;
    }

    public void setByNavn(String byNavn) {
        this.byNavn = byNavn;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
