package src.Esercizio1;


import src.Esercizio1.Dipendenti.Dipendente;
import src.Esercizio1.Dipendenti.Enums.Dipartimento;

public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente(1221, Dipartimento.PRODUZIONE);
        System.out.println(dipendente1);


    }

    public static void stampaDatiDipendente(Dipendente dipendente) {
        System.out.println(dipendente);
    }
}
