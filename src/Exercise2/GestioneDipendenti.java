package src.Exercise2;

import src.Esercizio1.Dipendenti.Dipendente;
import src.Esercizio1.Dipendenti.Enums.Dipartimento;
import src.Esercizio1.Dipendenti.Enums.Livello;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(1111, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(2222, Dipartimento.PRODUZIONE);
        Dipendente dipendente3 = new Dipendente(1200, 3333, 35, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente4 = new Dipendente(1600, 4444, 40, Livello.DIRIGENTE, Dipartimento.VENDITE);

        dipendente2.promuovi();
        dipendente3.promuovi();
        Dipendente[] arrayDipendenti = new Dipendente[4];
        arrayDipendenti[0] = dipendente1;
        arrayDipendenti[1] = dipendente2;
        arrayDipendenti[2] = dipendente3;
        arrayDipendenti[3] = dipendente4;

        stampaDipendenti(arrayDipendenti);
        calcolaStipendiDipendenti(arrayDipendenti, 5);


    }

    public static void stampaDipendenti(Dipendente[] array) {
        for (Dipendente dipendente : array) {
            System.out.println(dipendente);
        }
    }

    public static void calcolaStipendiDipendenti(Dipendente[] array, int oreStraordinario) {
        double sommaStipendi = 0;
        for (Dipendente dipendente : array) {
            double stipendio = dipendente.getStipendio() + (dipendente.getImportoOrarioStraordinario() * oreStraordinario);
            sommaStipendi += stipendio;
        }
        System.out.println(sommaStipendi);
    }


}
