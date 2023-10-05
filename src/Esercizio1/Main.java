package src.Esercizio1;


import src.Esercizio1.Dipendenti.Dipendente;
import src.Esercizio1.Dipendenti.Enums.Dipartimento;
import src.Esercizio1.Dipendenti.Enums.Livello;

public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente(1221, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(2200.43, 1300, 45.50, Livello.IMPIEGATO, Dipartimento.VENDITE);
        stampaDatiDipendente(dipendente1);
        stampaDatiDipendente(dipendente2);
        dipendente1.promuovi();
        stampaDatiDipendente(dipendente1);
        dipendente1.promuovi();
        stampaDatiDipendente(dipendente1);
        dipendente1.promuovi();
        stampaDatiDipendente(dipendente1);
        dipendente1.promuovi();
        stampaDatiDipendente(dipendente1);
        stampaPaga(dipendente2);
        calcolaPaga(dipendente1, 10);
        calcolaPaga(dipendente1, 12);

    }

    public static void stampaDatiDipendente(Dipendente dipendente) {
        System.out.println(dipendente);
    }

    public static void stampaPaga(Dipendente dipendente) {
        System.out.println(dipendente.getStipendio());
    }

    public static void calcolaPaga(Dipendente dipendente, int oreStraodinario) {
        System.out.println(dipendente.getStipendio() + (dipendente.getImportoOrarioStraordinario() * oreStraodinario));
    }
}

