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

    private int wpiszPesel(){

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
