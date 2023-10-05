package src.Esercizio1;


import src.Esercizio1.Dipendenti.Dipendente;
import src.Esercizio1.Dipendenti.Enums.Dipartimento;
import src.Esercizio1.Dipendenti.Enums.Livello;

public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente(1221, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(2200.43, 1300, 45.50, Livello.IMPIEGATO, Dipartimento.VENDITE);
        Dipendente.stampaDatiDipendente(dipendente1);
        Dipendente.stampaDatiDipendente(dipendente2);
        dipendente1.promuovi();
        Dipendente.stampaDatiDipendente(dipendente1);
        dipendente1.promuovi();
        Dipendente.stampaDatiDipendente(dipendente1);
        dipendente1.promuovi();
        Dipendente.stampaDatiDipendente(dipendente1);
        dipendente1.promuovi();
        Dipendente.stampaDatiDipendente(dipendente1);
        Dipendente.stampaPaga(dipendente2);
        Dipendente.calcolaPaga(dipendente1, 10);
        Dipendente.calcolaPaga(dipendente1, 12);


    }


}

