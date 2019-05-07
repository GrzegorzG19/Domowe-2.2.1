public class Main {
    public static void main(String[] args) {

        Drink tequila = new Drink();

        tequila.nazwa = "Blue lagoon";
        tequila.cena = 10;
        tequila.alkohol = true;
        tequila.sklad1.skladnik1 = "gin";
        tequila.sklad2.skladnik1 = "Blue curacao";
        tequila.sklad3.skladnik1 = "lemoniada";
        tequila.sklad1.ilosc1 = 30;
        tequila.sklad2.ilosc1 = 10;
        tequila.sklad3.ilosc1 = 50;

        System.out.printf("drink: %s\n cena: %.2f alkohol %b\n skladniki: %s, %s, %s \n w ilosci: %d ml %d ml %d ml \n razem: %d ml", tequila.nazwa, tequila.cena,
                tequila.alkohol, tequila.sklad1.skladnik1, tequila.sklad2.skladnik1, tequila.sklad3.skladnik1,  tequila.sklad1.ilosc1,
                tequila.sklad2.ilosc1,  tequila.sklad3.ilosc1, tequila.sklad1.ilosc1 + tequila.sklad2.ilosc1 + tequila.sklad3.ilosc1);

    }
}
