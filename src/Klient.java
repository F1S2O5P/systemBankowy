public class Klient {
    private String imie;
    private String nazwisko;
    private int pesel;
    private String adres;
    private int id;
    private double stanKonta;

    Klient(){
        imie = "";
        nazwisko = "";
        pesel = 0;
        adres = "";
        stanKonta = 0.0;
    }

    Klient(String imieKlienta, String nazwiskoKlienta,int peselKlienta, String adresKlienta, int idKlienta, int stanKontaKlienta){
        imie = imieKlienta;
        nazwisko = nazwiskoKlienta;
        pesel = peselKlienta;
        adres = adresKlienta;
        id = idKlienta;
        stanKonta = stanKontaKlienta;
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public String getAdres(){ return adres;    }

    public int getPesel(){
        return pesel;
    }

    public int getId(){
        return id;
    }

    public double getStanKonta() {
        return stanKonta;
    }
}
