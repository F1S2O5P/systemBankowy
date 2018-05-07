import java.util.Scanner;
import java.util.regex.Pattern;

public class Operacje {

    public static void menu(){
        System.out.println("Wcisnij przycisk aby: ");
        System.out.println("d - [D]odaj konto uzytkownika");
        System.out.println("u - [U]odaj konto uzytkownika");
        System.out.println("w - [W]plac pieniądze na konto");
        System.out.println("y - W[y]plac pieniadze z konta");
        System.out.println("p - Wykonaj [p]rzelew");
        System.out.println("s - Wy[s]wietl informacje o wszystkich kontach");
        System.out.println("d - Wyswie[t]l informacje o wybranym kliencie");
        System.out.println("z - [Z]akoncz");
    }

    private String wpiszImie(){
        Scanner in = new Scanner(System.in);
        String pobraneImie;
        do{
            System.out.print("Podaj imie uzytkownika");
            pobraneImie=in.nextLine();
        }
        while(Pattern.matches("[A-Z][a-z]+", pobraneImie);
        return pobraneImie;
    }

    private String wpiszNazwisko(){
        Scanner in = new Scanner(System.in);
        String pobraneNazwisko;
        do{
            System.out.print("Podaj nazwisko uzytkownika");
            pobraneNazwisko=in.nextLine();
        }
        while(Pattern.matches("^[A-Z][a-z]+-?([A-Z][a-z]+)?$", pobraneNazwisko);
        return pobraneNazwisko;
    }

    private int wpiszPesel(){
        Scanner in = new Scanner(System.in);
        String pobranyPesel;
        do{
            System.out.print("Podaj PESEL uzytkownika");
            pobranyPesel=in.nextLine();
        }
        while(Pattern.matches("\\d{11}", pobranyPesel);
        return pobranyPesel;
    }

    private double wpiszStanKonta(){
        Scanner in = new Scanner(System.in);
        double pobranyStanKonta;
        while(true) {
            String tmp = in.nextLine();
            try {
                pobranyStanKonta = Double.parseDouble(tmp);
                return pobranyStanKonta;
            } catch(NumberFormatException nfe) {
                System.out.println("Podana wartość nie jest liczbą!");
            }
        }
    }

    public void dodajUzytkownika(){

    }
}
//Założenie konta użytkownika (system przechowuje następujące dane: numer klienta w systemie, imię, nazwisko, pesel, adres, zgromadzone środki)
//Usunięcie konta użytkownika
//Dokonanie wpłaty na konto
//Dokonanie wypłaty z konta
//Transfer pieniędzy pomiędzy kontami
//Wyświetlenie informacji o wszystkich kontach
//Wyświetlenie informacji o wybranych kontach spełniających podane przez użytkownika kryterium. Użytkownik najpierw podaje rodzaj kryterium (numer klienta, imię, nazwisko, pesel lub adres), nas
